import { PrismaClient } from "@prisma/client";
import { NextFunction, Request, Response } from "express";
import {
  GetAuctionsRequest,
  getAuctions,
  getAuctionsRequestSchema,
} from "../interactors/getAuctionsInteractor";

const prisma = new PrismaClient({ log: ["query"] });

export const getAuctionsController = async (
  req: Request<{}, {}, {}, GetAuctionsRequest>,
  res: Response,
) => {
  const request = await getAuctionsRequestSchema.parseAsync(req.query);
  const auctions = getAuctions(request);

  res.send(auctions);
};
