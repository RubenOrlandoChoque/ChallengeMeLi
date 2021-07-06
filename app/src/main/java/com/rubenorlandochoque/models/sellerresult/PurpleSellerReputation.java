package com.rubenorlandochoque.models.sellerresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PurpleSellerReputation {
    private Transactions transactions;
    private String powerSellerStatus;
    private PurpleMetrics metrics;
    private String levelID;

    @JsonProperty("transactions")
    public Transactions getTransactions() { return transactions; }
    @JsonProperty("transactions")
    public void setTransactions(Transactions value) { this.transactions = value; }

    @JsonProperty("power_seller_status")
    public String getPowerSellerStatus() { return powerSellerStatus; }
    @JsonProperty("power_seller_status")
    public void setPowerSellerStatus(String value) { this.powerSellerStatus = value; }

    @JsonProperty("metrics")
    public PurpleMetrics getMetrics() { return metrics; }
    @JsonProperty("metrics")
    public void setMetrics(PurpleMetrics value) { this.metrics = value; }

    @JsonProperty("level_id")
    public String getLevelID() { return levelID; }
    @JsonProperty("level_id")
    public void setLevelID(String value) { this.levelID = value; }
}
