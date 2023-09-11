import {CreateAuctionRequest} from "../interactors/createAuctionInteractor";
import {CreateAuctionInteractor} from "../interactors";
import {NextFunction} from "express";

export interface Controller<TRequest, TResponse> {
  (request: Request, response: Response, next: NextFunction): Promise<TResponse> | TResponse;
}
