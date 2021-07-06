package com.rubenorlandochoque.models.productresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchLocation {
    private Country neighborhood;
    private Country city;
    private Country state;

    @JsonProperty("neighborhood")
    public Country getNeighborhood() { return neighborhood; }
    @JsonProperty("neighborhood")
    public void setNeighborhood(Country value) { this.neighborhood = value; }

    @JsonProperty("city")
    public Country getCity() { return city; }
    @JsonProperty("city")
    public void setCity(Country value) { this.city = value; }

    @JsonProperty("state")
    public Country getState() { return state; }
    @JsonProperty("state")
    public void setState(Country value) { this.state = value; }
}
