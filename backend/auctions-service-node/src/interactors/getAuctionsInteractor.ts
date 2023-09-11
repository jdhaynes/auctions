import { PrismaClient } from "@prisma/client";
import { Interactor } from ".";
import { z } from "zod";

export const getAuctionsRequestSchema = z.object({
  date: z.coerce.date().nullable(),
  pageNumber: z.number().int().gt(0).optional(),
  pageSize: z.number().int().gt(0).lte(100).optional(),
});

export type GetAuctionsRequest = z.infer<typeof getAuctionsRequestSchema>;

export const getAuctions: Interactor<GetAuctionsRequest, any> = async (
  request: GetAuctionsRequest
) => {
  const createdAtFilter = request.date ? { gt: request.date } : {};
  const takeFilter =
    request.pageNumber && request.pageSize ? request.pageSize : undefined;
  const skipFilter =
    request.pageNumber && request.pageSize
      ? request.pageNumber * request.pageSize
      : undefined;

  const prisma = new PrismaClient();
  const auctions = await prisma.auction.findMany({
    include: { item: true },
    where: { createdAt: createdAtFilter },
    skip: skipFilter,
    take: takeFilter,
  });

  return auctions;
};
