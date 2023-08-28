package jackhaynes.auctions.api.events.consumed;

import java.util.UUID;

public class BidPlaced {
    private UUID auctionId;

    public BidPlaced() { }

    public UUID getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(UUID auctionId) {
        this.auctionId = auctionId;
    }
}
