package jackhaynes.auctions.api.repositories;

import jackhaynes.auctions.api.entities.Auction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public interface AuctionRepository extends JpaRepository<Auction, UUID> {
    List<Auction> findByAuctionEndAfter(LocalDateTime date);
}
