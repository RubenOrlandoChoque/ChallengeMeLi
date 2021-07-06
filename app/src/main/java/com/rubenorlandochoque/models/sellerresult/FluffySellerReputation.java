package com.rubenorlandochoque.models.sellerresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FluffySellerReputation {
    private String levelID;
    private String powerSellerStatus;
    private Transactions transactions;
    private FluffyMetrics metrics;

    @JsonProperty("level_id")
    public String getLevelID() { return levelID; }
    @JsonProperty("level_id")
    public void setLevelID(String value) { this.levelID = value; }

    @JsonProperty("power_seller_status")
    public String getPowerSellerStatus() { return powerSellerStatus; }
    @JsonProperty("power_seller_status")
    public void setPowerSellerStatus(String value) { this.powerSellerStatus = value; }

    @JsonProperty("transactions")
    public Transactions getTransactions() { return transactions; }
    @JsonProperty("transactions")
    public void setTransactions(Transactions value) { this.transactions = value; }

    @JsonProperty("metrics")
    public FluffyMetrics getMetrics() { return metrics; }
    @JsonProperty("metrics")
    public void setMetrics(FluffyMetrics value) { this.metrics = value; }
}
