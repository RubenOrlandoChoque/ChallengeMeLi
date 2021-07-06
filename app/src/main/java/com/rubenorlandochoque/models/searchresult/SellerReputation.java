package com.rubenorlandochoque.models.searchresult;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SellerReputation {
    private Transactions transactions;
    private String powerSellerStatus;
    private Metrics metrics;
    private Date protectionEndDate;
    private String realLevel;
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
    public Metrics getMetrics() { return metrics; }
    @JsonProperty("metrics")
    public void setMetrics(Metrics value) { this.metrics = value; }

    @JsonProperty("protection_end_date")
    public Date getProtectionEndDate() { return protectionEndDate; }
    @JsonProperty("protection_end_date")
    public void setProtectionEndDate(Date value) { this.protectionEndDate = value; }

    @JsonProperty("real_level")
    public String getRealLevel() { return realLevel; }
    @JsonProperty("real_level")
    public void setRealLevel(String value) { this.realLevel = value; }

    @JsonProperty("level_id")
    public String getLevelID() { return levelID; }
    @JsonProperty("level_id")
    public void setLevelID(String value) { this.levelID = value; }
}
