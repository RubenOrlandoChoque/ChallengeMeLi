package com.rubenorlandochoque.models.searchresult;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Price {
    private String id;
    private String type;
    private Conditions conditions;
    private long amount;
    private Object regularAmount;
    private String currencyID;
    private String exchangeRateContext;
    private Metadata metadata;
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
    public long getAmount() { return amount; }
    @JsonProperty("amount")
    public void setAmount(long value) { this.amount = value; }

    @JsonProperty("regular_amount")
    public Object getRegularAmount() { return regularAmount; }
    @JsonProperty("regular_amount")
    public void setRegularAmount(Object value) { this.regularAmount = value; }

    @JsonProperty("currency_id")
    public String getCurrencyID() { return currencyID; }
    @JsonProperty("currency_id")
    public void setCurrencyID(String value) { this.currencyID = value; }

    @JsonProperty("exchange_rate_context")
    public String getExchangeRateContext() { return exchangeRateContext; }
    @JsonProperty("exchange_rate_context")
    public void setExchangeRateContext(String value) { this.exchangeRateContext = value; }

    @JsonProperty("metadata")
    public Metadata getMetadata() { return metadata; }
    @JsonProperty("metadata")
    public void setMetadata(Metadata value) { this.metadata = value; }

    @JsonProperty("last_updated")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "UTC")
    public Date getLastUpdated() { return lastUpdated; }
    @JsonProperty("last_updated")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "UTC")
    public void setLastUpdated(Date value) { this.lastUpdated = value; }
}
