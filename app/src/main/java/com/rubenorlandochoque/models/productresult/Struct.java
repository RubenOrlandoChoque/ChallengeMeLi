package com.rubenorlandochoque.models.productresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Struct {
    private double number;
    private String unit;

    @JsonProperty("number")
    public double getNumber() { return number; }
    @JsonProperty("number")
    public void setNumber(double value) { this.number = value; }

    @JsonProperty("unit")
    public String getUnit() { return unit; }
    @JsonProperty("unit")
    public void setUnit(String value) { this.unit = value; }
}
