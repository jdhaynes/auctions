package jackhaynes.auctions.api.mappers;

import jackhaynes.auctions.api.dtos.AuctionDto;
import jackhaynes.auctions.api.entities.Auction;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = ItemMapper.class)
public interface AuctionDtoMapper {
    public AuctionDto toDto(Auction auction);
    public Auction fromDto(AuctionDto auctionDto);

    public List<AuctionDto> toDto(List<Auction> auctions);
    public List<Auction> fromDto(List<AuctionDto> auctionDtos);
}
