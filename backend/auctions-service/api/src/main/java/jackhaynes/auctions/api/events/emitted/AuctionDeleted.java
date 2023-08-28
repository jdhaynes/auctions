package jackhaynes.auctions.api.events.emitted;

import java.util.UUID;

public class AuctionDeleted {
    private UUID id;

    public AuctionDeleted() { }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
