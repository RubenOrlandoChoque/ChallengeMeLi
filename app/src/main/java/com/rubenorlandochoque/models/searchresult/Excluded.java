package com.rubenorlandochoque.models.searchresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Excluded {
    private double realRate;
    private long realValue;

    @JsonProperty("real_rate")
    public double getRealRate() { return realRate; }
    @JsonProperty("real_rate")
    public void setRealRate(double value) { this.realRate = value; }

    @JsonProperty("real_value")
    public long getRealValue() { return realValue; }
    @JsonProperty("real_value")
    public void setRealValue(long value) { this.realValue = value; }
}
