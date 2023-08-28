package jackhaynes.auctions.api;

import jackhaynes.auctions.api.mappers.AuctionDtoMapper;
import jackhaynes.auctions.api.repositories.AuctionRepository;
import jackhaynes.auctions.api.services.AuctionService;
import jackhaynes.auctions.api.services.AuctionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public AuctionService auctionService(@Autowired AuctionDtoMapper auctionDtoMapper,
                                         @Autowired AuctionRepository auctionRepository) {
        return new AuctionServiceImpl(auctionDtoMapper, auctionRepository);
    }
}
