package com.rubenorlandochoque.models.searchresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Metrics {
    private Cancellations claims;
    private Cancellations delayedHandlingTime;
    private Sales sales;
    private Cancellations cancellations;

    @JsonProperty("claims")
    public Cancellations getClaims() { return claims; }
    @JsonProperty("claims")
    public void setClaims(Cancellations value) { this.claims = value; }

    @JsonProperty("delayed_handling_time")
    public Cancellations getDelayedHandlingTime() { return delayedHandlingTime; }
    @JsonProperty("delayed_handling_time")
    public void setDelayedHandlingTime(Cancellations value) { this.delayedHandlingTime = value; }

    @JsonProperty("sales")
    public Sales getSales() { return sales; }
    @JsonProperty("sales")
    public void setSales(Sales value) { this.sales = value; }

    @JsonProperty("cancellations")
    public Cancellations getCancellations() { return cancellations; }
    @JsonProperty("cancellations")
    public void setCancellations(Cancellations value) { this.cancellations = value; }
}
