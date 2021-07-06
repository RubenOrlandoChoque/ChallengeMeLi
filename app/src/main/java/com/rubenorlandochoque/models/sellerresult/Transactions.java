package com.rubenorlandochoque.models.sellerresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Transactions {
    private long total;
    private long canceled;
    private String period;
    private Ratings ratings;
    private long completed;

    @JsonProperty("total")
    public long getTotal() { return total; }
    @JsonProperty("total")
    public void setTotal(long value) { this.total = value; }

    @JsonProperty("canceled")
    public long getCanceled() { return canceled; }
    @JsonProperty("canceled")
    public void setCanceled(long value) { this.canceled = value; }

    @JsonProperty("period")
    public String getPeriod() { return period; }
    @JsonProperty("period")
    public void setPeriod(String value) { this.period = value; }

    @JsonProperty("ratings")
    public Ratings getRatings() { return ratings; }
    @JsonProperty("ratings")
    public void setRatings(Ratings value) { this.ratings = value; }

    @JsonProperty("completed")
    public long getCompleted() { return completed; }
    @JsonProperty("completed")
    public void setCompleted(long value) { this.completed = value; }
}
