import {CreateAuctionRequest} from "./createAuctionInteractor";

export interface Interactor<TRequest, TResponse> {
    (request: TRequest): Promise<TResponse> | TResponse;
}

export interface CreateAuctionInteractor extends Interactor<CreateAuctionRequest, void> {
}
