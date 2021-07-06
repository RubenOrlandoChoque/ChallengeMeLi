package com.rubenorlandochoque.models.productresult;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Shipping {
    private String mode;
    private List<FreeMethod> freeMethods;
    private List<String> tags;
    private Object dimensions;
    private boolean localPickUp;
    private boolean freeShipping;
    private String logisticType;
    private boolean storePickUp;

    @JsonProperty("mode")
    public String getMode() { return mode; }
    @JsonProperty("mode")
    public void setMode(String value) { this.mode = value; }

    @JsonProperty("free_methods")
    public List<FreeMethod> getFreeMethods() { return freeMethods; }
    @JsonProperty("free_methods")
    public void setFreeMethods(List<FreeMethod> value) { this.freeMethods = value; }

    @JsonProperty("tags")
    public List<String> getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(List<String> value) { this.tags = value; }

    @JsonProperty("dimensions")
    public Object getDimensions() { return dimensions; }
    @JsonProperty("dimensions")
    public void setDimensions(Object value) { this.dimensions = value; }

    @JsonProperty("local_pick_up")
    public boolean getLocalPickUp() { return localPickUp; }
    @JsonProperty("local_pick_up")
    public void setLocalPickUp(boolean value) { this.localPickUp = value; }

    @JsonProperty("free_shipping")
    public boolean getFreeShipping() { return freeShipping; }
    @JsonProperty("free_shipping")
    public void setFreeShipping(boolean value) { this.freeShipping = value; }

    @JsonProperty("logistic_type")
    public String getLogisticType() { return logisticType; }
    @JsonProperty("logistic_type")
    public void setLogisticType(String value) { this.logisticType = value; }

    @JsonProperty("store_pick_up")
    public boolean getStorePickUp() { return storePickUp; }
    @JsonProperty("store_pick_up")
    public void setStorePickUp(boolean value) { this.storePickUp = value; }
}
