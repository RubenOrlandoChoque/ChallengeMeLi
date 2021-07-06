package com.rubenorlandochoque.models.searchresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ratings {
    private double negative;
    private double positive;
    private double neutral;

    @JsonProperty("negative")
    public double getNegative() { return negative; }
    @JsonProperty("negative")
    public void setNegative(double value) { this.negative = value; }

    @JsonProperty("positive")
    public double getPositive() { return positive; }
    @JsonProperty("positive")
    public void setPositive(double value) { this.positive = value; }

    @JsonProperty("neutral")
    public double getNeutral() { return neutral; }
    @JsonProperty("neutral")
    public void setNeutral(double value) { this.neutral = value; }
}
