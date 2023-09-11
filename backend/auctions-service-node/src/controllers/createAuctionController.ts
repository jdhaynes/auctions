import { createAuction } from "../interactors/createAuctionInteractor";
import { z } from "zod";
import { NextFunction, Response } from "express";
import { RequestSchema, ValidatedRequest } from "../middleware/validation";

export const requestSchema = {
  body: z.object({
    reservePrice: z.number().int().gte(0),
    seller: z.string().trim().min(1),
    auctionEnd: z.coerce.date(),
    make: z.string().trim().min(1),
    model: z.string().trim().min(1),
    year: z.number().int().gte(0),
    colour: z.string().trim().min(1),
    mileage: z.number().int().gte(0),
    imageUrl: z.string().url(),
  }),
  params: z.object({}),
  query: z.object({}),
};

export const createAuctionController = (
  req: ValidatedRequest<typeof requestSchema>,
  res: Response,
  next: NextFunction,
) => {
  try {
    createAuction(req);

    res.status(200).send();
  } catch (e) {
    next(e);
  }
};
