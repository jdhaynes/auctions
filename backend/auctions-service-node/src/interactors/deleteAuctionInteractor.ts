import { z } from "zod";
import { Interactor } from ".";
import { PrismaClient } from "@prisma/client";

export const deleteAuctionRequestSchema = z.object({
  auctionId: z.string().uuid(),
});

export type DeleteAuctionRequest = z.infer<typeof deleteAuctionRequestSchema>;

export const deleteAuction: Interactor<DeleteAuctionRequest, void> = async (
  request: DeleteAuctionRequest
) => {
  const prisma = new PrismaClient();
  await prisma.auction.delete({ where: { id: request.auctionId } });
};
