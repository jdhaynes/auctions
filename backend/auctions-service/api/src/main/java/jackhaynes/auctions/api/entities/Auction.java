package jackhaynes.auctions.api.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "Auction")
@Table(name = "auction")
public class Auction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false)
    private UUID id;

    @Column(name = "reserve_price", nullable = false)
    private int reservePrice;

    @Column(name = "seller", nullable = false)
    private String seller;

    @Column(name = "winner", nullable = false)
    private String winner;

    @Column(name = "sold_amount", nullable = true)
    private int soldAmount;

    @Column(name = "current_high_bid", nullable = true)
    private int currentHighBid;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "auction_end", nullable = false)
    private LocalDateTime auctionEnd;

    @Column(name = "status", nullable = false)
    private AuctionStatus status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id", referencedColumnName = "id")
    private Item item;

    public Auction() { }

    public Auction(UUID id, int reservePrice, String seller, String winner, int soldAmount, int currentHighBid,
                   LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime auctionEnd, AuctionStatus status,
                   Item item) {
        this.id = id;
        this.reservePrice = reservePrice;
        this.seller = seller;
        this.winner = winner;
        this.soldAmount = soldAmount;
        this.currentHighBid = currentHighBid;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.auctionEnd = auctionEnd;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getReservePrice() {
        return reservePrice;
    }

    public void setReservePrice(int reservePrice) {
        this.reservePrice = reservePrice;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public int getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(int soldAmount) {
        this.soldAmount = soldAmount;
    }

    public int getCurrentHighBid() {
        return currentHighBid;
    }

    public void setCurrentHighBid(int currentHighBid) {
        this.currentHighBid = currentHighBid;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getAuctionEnd() {
        return auctionEnd;
    }

    public void setAuctionEnd(LocalDateTime auctionEnd) {
        this.auctionEnd = auctionEnd;
    }

    public AuctionStatus getStatus() {
        return status;
    }

    public void setStatus(AuctionStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Auction{" + "id=" + id + ", reservePrice=" + reservePrice + ", seller='" + seller + '\'' + ", winner" +
            "='" + winner + '\'' + ", soldAmount=" + soldAmount + ", currentHighBid=" + currentHighBid + ", createdAt" +
            "=" + createdAt + ", updatedAt=" + updatedAt + ", auctionEnd=" + auctionEnd + ", status=" + status + ", " +
            '}';
    }
}