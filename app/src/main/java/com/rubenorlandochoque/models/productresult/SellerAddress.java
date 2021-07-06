package com.rubenorlandochoque.models.productresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SellerAddress {
    private City city;
    private Country state;
    private Country country;
    private SearchLocation searchLocation;
    private long id;

    @JsonProperty("city")
    public City getCity() { return city; }
    @JsonProperty("city")
    public void setCity(City value) { this.city = value; }

    @JsonProperty("state")
    public Country getState() { return state; }
    @JsonProperty("state")
    public void setState(Country value) { this.state = value; }

    @JsonProperty("country")
    public Country getCountry() { return country; }
    @JsonProperty("country")
    public void setCountry(Country value) { this.country = value; }

    @JsonProperty("search_location")
    public SearchLocation getSearchLocation() { return searchLocation; }
    @JsonProperty("search_location")
    public void setSearchLocation(SearchLocation value) { this.searchLocation = value; }

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }
}
