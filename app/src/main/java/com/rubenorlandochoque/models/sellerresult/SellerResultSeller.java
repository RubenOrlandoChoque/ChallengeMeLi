package com.rubenorlandochoque.models.sellerresult;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SellerResultSeller {
    private long id;
    private String nickname;
    private String permalink;
    private Date registrationDate;
    private FluffySellerReputation sellerReputation;
    private boolean realEstateAgency;
    private boolean carDealer;
    private List<String> tags;
    private Eshop eshop;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("nickname")
    public String getNickname() { return nickname; }
    @JsonProperty("nickname")
    public void setNickname(String value) { this.nickname = value; }

    @JsonProperty("permalink")
    public String getPermalink() { return permalink; }
    @JsonProperty("permalink")
    public void setPermalink(String value) { this.permalink = value; }

    @JsonProperty("registration_date")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "UTC")
    public Date getRegistrationDate() { return registrationDate; }
    @JsonProperty("registration_date")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "UTC")
    public void setRegistrationDate(Date value) { this.registrationDate = value; }

    @JsonProperty("seller_reputation")
    public FluffySellerReputation getSellerReputation() { return sellerReputation; }
    @JsonProperty("seller_reputation")
    public void setSellerReputation(FluffySellerReputation value) { this.sellerReputation = value; }

    @JsonProperty("real_estate_agency")
    public boolean getRealEstateAgency() { return realEstateAgency; }
    @JsonProperty("real_estate_agency")
    public void setRealEstateAgency(boolean value) { this.realEstateAgency = value; }

    @JsonProperty("car_dealer")
    public boolean getCarDealer() { return carDealer; }
    @JsonProperty("car_dealer")
    public void setCarDealer(boolean value) { this.carDealer = value; }

    @JsonProperty("tags")
    public List<String> getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(List<String> value) { this.tags = value; }

    @JsonProperty("eshop")
    public Eshop getEshop() { return eshop; }
    @JsonProperty("eshop")
    public void setEshop(Eshop value) { this.eshop = value; }
}
