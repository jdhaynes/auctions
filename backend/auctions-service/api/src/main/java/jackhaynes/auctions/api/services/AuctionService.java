package jackhaynes.auctions.api.services;

import jackhaynes.auctions.api.dtos.AuctionDto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public interface AuctionService {
    List<AuctionDto> getAuctions(LocalDateTime date);
    AuctionDto getAuction(UUID id);
    void createAuction(AuctionDto auction);

    void updateAuction(AuctionDto auction);

    void deleteAuction(UUID auctionId);
}
