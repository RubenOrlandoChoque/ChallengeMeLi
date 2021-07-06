package com.rubenorlandochoque.models.searchresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cancellations {
    private double rate;
    private Excluded excluded;
    private long value;
    private String period;

    @JsonProperty("rate")
    public double getRate() { return rate; }
    @JsonProperty("rate")
    public void setRate(double value) { this.rate = value; }

    @JsonProperty("excluded")
    public Excluded getExcluded() { return excluded; }
    @JsonProperty("excluded")
    public void setExcluded(Excluded value) { this.excluded = value; }

    @JsonProperty("value")
    public long getValue() { return value; }
    @JsonProperty("value")
    public void setValue(long value) { this.value = value; }

    @JsonProperty("period")
    public String getPeriod() { return period; }
    @JsonProperty("period")
    public void setPeriod(String value) { this.period = value; }
}
