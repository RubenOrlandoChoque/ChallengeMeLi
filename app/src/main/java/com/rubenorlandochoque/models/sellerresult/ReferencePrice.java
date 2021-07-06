package com.rubenorlandochoque.models.sellerresult;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReferencePrice {
    private String id;
    private String type;
    private Conditions conditions;
    private double amount;
    private String currencyID;
    private String exchangeRateContext;
    private List<Object> tags;
    private Date lastUpdated;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("conditions")
    public Conditions getConditions() { return conditions; }
    @JsonProperty("conditions")
    public void setConditions(Conditions value) { this.conditions = value; }

    @JsonProperty("amount")
    public double getAmount() { return amount; }
    @JsonProperty("amount")
    public void setAmount(double value) { this.amount = value; }

    @JsonProperty("currency_id")
    public String getCurrencyID() { return currencyID; }
    @JsonProperty("currency_id")
    public void setCurrencyID(String value) { this.currencyID = value; }

    @JsonProperty("exchange_rate_context")
    public String getExchangeRateContext() { return exchangeRateContext; }
    @JsonProperty("exchange_rate_context")
    public void setExchangeRateContext(String value) { this.exchangeRateContext = value; }

    @JsonProperty("tags")
    public List<Object> getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(List<Object> value) { this.tags = value; }

    @JsonProperty("last_updated")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "UTC")
    public Date getLastUpdated() { return lastUpdated; }
    @JsonProperty("last_updated")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "UTC")
    public void setLastUpdated(Date value) { this.lastUpdated = value; }
}
