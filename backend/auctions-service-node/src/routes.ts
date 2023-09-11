import express from "express";
import {
  createAuctionController,
  requestSchema,
} from "./controllers/createAuctionController";
import { getAuctionsController } from "./controllers/getAuctionsController";
import { validateRequest } from "./middleware/validation";

const router = express.Router();

router.get("/", getAuctionsController);

router.post("/", validateRequest(requestSchema), createAuctionController);

export default router;
