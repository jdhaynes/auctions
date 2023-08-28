package jackhaynes.auctions.api.services;

import jackhaynes.auctions.api.repositories.AuctionRepository;
import jackhaynes.auctions.api.dtos.AuctionDto;
import jackhaynes.auctions.api.entities.Auction;
import jackhaynes.auctions.api.mappers.AuctionDtoMapper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AuctionServiceImpl implements AuctionService {
    private final AuctionDtoMapper auctionDtoMapper;
    private final AuctionRepository auctionRepository;

    public AuctionServiceImpl(AuctionDtoMapper auctionDtoMapper, AuctionRepository auctionRepository) {
        this.auctionDtoMapper = auctionDtoMapper;
        this.auctionRepository = auctionRepository;
    }

    @Override
    public List<AuctionDto> getAuctions(LocalDateTime date) {
        List<Auction> auctions = new ArrayList<>();

        if(date != null) {
            auctions = auctionRepository.findByAuctionEndAfter(date);
        } else {
            auctions = auctionRepository.findAll();
        }

        return auctionDtoMapper.toDto(auctions);
    }

    @Override
    public AuctionDto getAuction(UUID id) {
        Auction auction = auctionRepository.getReferenceById(id);
        return auctionDtoMapper.toDto(auction);
    }

    @Override
    public void createAuction(AuctionDto auction) {
        Auction auctionEntity = auctionDtoMapper.fromDto(auction);
        auctionRepository.save(auctionEntity);
    }

    @Override
    public void updateAuction(AuctionDto auction) {
        Auction auctionEntity = auctionDtoMapper.fromDto(auction);
        auctionRepository.save(auctionEntity);
    }

    @Override
    public void deleteAuction(UUID auctionId) {
        Auction auctionEntity = auctionRepository.getReferenceById(auctionId);
        auctionRepository.deleteById(auctionId);
    }
}
