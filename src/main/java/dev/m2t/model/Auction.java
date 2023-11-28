package dev.m2t.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import java.time.Duration;

public class Auction extends PanacheEntity {
    private Long itemId;
    private Double currentBid;
    private String currentBidder;
    private Boolean sold;
    private Long auctionEnd;
    private Duration auctionDuration;
    private String soldTo;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Double getCurrentBid() {
        return currentBid;
    }

    public void setCurrentBid(Double currentBid) {
        this.currentBid = currentBid;
    }

    public String getCurrentBidder() {
        return currentBidder;
    }

    public void setCurrentBidder(String currentBidder) {
        this.currentBidder = currentBidder;
    }

    public Boolean getSold() {
        return sold;
    }

    public void setSold(Boolean sold) {
        this.sold = sold;
    }

    public Long getAuctionEnd() {
        return auctionEnd;
    }

    public void setAuctionEnd(Long auctionEnd) {
        this.auctionEnd = auctionEnd;
    }

    public Duration getAuctionDuration() {
        return auctionDuration;
    }

    public void setAuctionDuration(Duration auctionDuration) {
        this.auctionDuration = auctionDuration;
    }

    public String getSoldTo() {
        return soldTo;
    }

    public void setSoldTo(String soldTo) {
        this.soldTo = soldTo;
    }
}