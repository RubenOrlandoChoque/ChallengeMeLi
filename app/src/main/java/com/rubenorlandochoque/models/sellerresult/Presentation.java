package com.rubenorlandochoque.models.sellerresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Presentation {
    private String displayCurrency;

    @JsonProperty("display_currency")
    public String getDisplayCurrency() { return displayCurrency; }
    @JsonProperty("display_currency")
    public void setDisplayCurrency(String value) { this.displayCurrency = value; }
}
