package com.rubenorlandochoque.models.sellerresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SellerAddress {
    private String id;
    private String comment;
    private String addressLine;
    private String zipCode;
    private Sort country;
    private Sort state;
    private Sort city;
    private String latitude;
    private String longitude;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("comment")
    public String getComment() { return comment; }
    @JsonProperty("comment")
    public void setComment(String value) { this.comment = value; }

    @JsonProperty("address_line")
    public String getAddressLine() { return addressLine; }
    @JsonProperty("address_line")
    public void setAddressLine(String value) { this.addressLine = value; }

    @JsonProperty("zip_code")
    public String getZipCode() { return zipCode; }
    @JsonProperty("zip_code")
    public void setZipCode(String value) { this.zipCode = value; }

    @JsonProperty("country")
    public Sort getCountry() { return country; }
    @JsonProperty("country")
    public void setCountry(Sort value) { this.country = value; }

    @JsonProperty("state")
    public Sort getState() { return state; }
    @JsonProperty("state")
    public void setState(Sort value) { this.state = value; }

    @JsonProperty("city")
    public Sort getCity() { return city; }
    @JsonProperty("city")
    public void setCity(Sort value) { this.city = value; }

    @JsonProperty("latitude")
    public String getLatitude() { return latitude; }
    @JsonProperty("latitude")
    public void setLatitude(String value) { this.latitude = value; }

    @JsonProperty("longitude")
    public String getLongitude() { return longitude; }
    @JsonProperty("longitude")
    public void setLongitude(String value) { this.longitude = value; }
}
