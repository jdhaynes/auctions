import { z } from "zod";
import { CreateAuctionInteractor, Interactor } from "./index";
import { Prisma, PrismaClient } from "@prisma/client";

const prisma = new PrismaClient({ log: ["query"] });

export const createAuction: CreateAuctionInteractor = async (
  request: CreateAuctionRequest,
) => {
  const newAuction: Prisma.AuctionCreateInput = {
    reservePrice: request.reservePrice,
    seller: request.seller,
    winner: null,
    soldAmount: null,
    currentHighBid: null,
    createdAt: new Date(),
    updatedAt: new Date(),
    auctionEnd: request.auctionEnd,
    status: "OPEN",
    item: {
      create: {
        make: request.make,
        model: request.model,
        colour: request.colour,
        mileage: request.mileage,
        year: request.year,
        imageUrl: request.imageUrl,
      },
    },
  };
};
