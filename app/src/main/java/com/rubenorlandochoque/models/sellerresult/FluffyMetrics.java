package com.rubenorlandochoque.models.sellerresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FluffyMetrics {
    private Sales sales;

    @JsonProperty("sales")
    public Sales getSales() { return sales; }
    @JsonProperty("sales")
    public void setSales(Sales value) { this.sales = value; }
}
