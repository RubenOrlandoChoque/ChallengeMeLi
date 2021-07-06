package com.rubenorlandochoque.models.sellerresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    private String stateID;
    private String stateName;
    private Object cityID;
    private String cityName;

    @JsonProperty("state_id")
    public String getStateID() { return stateID; }
    @JsonProperty("state_id")
    public void setStateID(String value) { this.stateID = value; }

    @JsonProperty("state_name")
    public String getStateName() { return stateName; }
    @JsonProperty("state_name")
    public void setStateName(String value) { this.stateName = value; }

    @JsonProperty("city_id")
    public Object getCityID() { return cityID; }
    @JsonProperty("city_id")
    public void setCityID(Object value) { this.cityID = value; }

    @JsonProperty("city_name")
    public String getCityName() { return cityName; }
    @JsonProperty("city_name")
    public void setCityName(String value) { this.cityName = value; }
}
