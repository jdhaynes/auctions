package jackhaynes.auctions.api.dtos;

import jackhaynes.auctions.api.entities.AuctionStatus;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.UUID;

public class AuctionDto {
    private UUID id;
    @Min(1)
    private int reservePrice;
    @NotNull
    @NotEmpty
    private String seller;
    @NotNull
    @NotEmpty
    private String winner;
    private Integer soldAmount;
    private Integer currentHighBid;
    @NotNull
    private LocalDateTime createdAt;
    @NotNull
    private LocalDateTime updatedAt;
    @NotNull
    private LocalDateTime auctionEnd;
    @NotNull
    private AuctionStatus status;
    @NotNull
    private ItemDto item;

    public AuctionDto() {};

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

    public Integer getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(Integer soldAmount) {
        this.soldAmount = soldAmount;
    }

    public Integer getCurrentHighBid() {
        return currentHighBid;
    }

    public void setCurrentHighBid(Integer currentHighBid) {
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

    public ItemDto getItem() {
        return item;
    }

    public void setItem(ItemDto item) {
        this.item = item;
    }
}
