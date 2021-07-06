package com.rubenorlandochoque.models.searchresult;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Prices {
    private String id;
    private List<Price> prices;
    private Presentation presentation;
    private List<Object> paymentMethodPrices;
    private List<Object> referencePrices;
    private List<Object> purchaseDiscounts;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("prices")
    public List<Price> getPrices() { return prices; }
    @JsonProperty("prices")
    public void setPrices(List<Price> value) { this.prices = value; }

    @JsonProperty("presentation")
    public Presentation getPresentation() { return presentation; }
    @JsonProperty("presentation")
    public void setPresentation(Presentation value) { this.presentation = value; }

    @JsonProperty("payment_method_prices")
    public List<Object> getPaymentMethodPrices() { return paymentMethodPrices; }
    @JsonProperty("payment_method_prices")
    public void setPaymentMethodPrices(List<Object> value) { this.paymentMethodPrices = value; }

    @JsonProperty("reference_prices")
    public List<Object> getReferencePrices() { return referencePrices; }
    @JsonProperty("reference_prices")
    public void setReferencePrices(List<Object> value) { this.referencePrices = value; }

    @JsonProperty("purchase_discounts")
    public List<Object> getPurchaseDiscounts() { return purchaseDiscounts; }
    @JsonProperty("purchase_discounts")
    public void setPurchaseDiscounts(List<Object> value) { this.purchaseDiscounts = value; }
}
