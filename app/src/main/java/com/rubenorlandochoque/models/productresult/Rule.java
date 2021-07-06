package com.rubenorlandochoque.models.productresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rule {
    private boolean ruleDefault;
    private String freeMode;
    private boolean freeShippingFlag;
    private Object value;

    @JsonProperty("default")
    public boolean getRuleDefault() { return ruleDefault; }
    @JsonProperty("default")
    public void setRuleDefault(boolean value) { this.ruleDefault = value; }

    @JsonProperty("free_mode")
    public String getFreeMode() { return freeMode; }
    @JsonProperty("free_mode")
    public void setFreeMode(String value) { this.freeMode = value; }

    @JsonProperty("free_shipping_flag")
    public boolean getFreeShippingFlag() { return freeShippingFlag; }
    @JsonProperty("free_shipping_flag")
    public void setFreeShippingFlag(boolean value) { this.freeShippingFlag = value; }

    @JsonProperty("value")
    public Object getValue() { return value; }
    @JsonProperty("value")
    public void setValue(Object value) { this.value = value; }
}
