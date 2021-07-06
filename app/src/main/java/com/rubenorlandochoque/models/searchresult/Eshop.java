package com.rubenorlandochoque.models.searchresult;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Eshop {
    private String nickName;
    private Object eshopRubro;
    private long eshopID;
    private List<Object> eshopLocations;
    private String siteID;
    private String eshopLogoURL;
    private long eshopStatusID;
    private long seller;
    private long eshopExperience;

    @JsonProperty("nick_name")
    public String getNickName() { return nickName; }
    @JsonProperty("nick_name")
    public void setNickName(String value) { this.nickName = value; }

    @JsonProperty("eshop_rubro")
    public Object getEshopRubro() { return eshopRubro; }
    @JsonProperty("eshop_rubro")
    public void setEshopRubro(Object value) { this.eshopRubro = value; }

    @JsonProperty("eshop_id")
    public long getEshopID() { return eshopID; }
    @JsonProperty("eshop_id")
    public void setEshopID(long value) { this.eshopID = value; }

    @JsonProperty("eshop_locations")
    public List<Object> getEshopLocations() { return eshopLocations; }
    @JsonProperty("eshop_locations")
    public void setEshopLocations(List<Object> value) { this.eshopLocations = value; }

    @JsonProperty("site_id")
    public String getSiteID() { return siteID; }
    @JsonProperty("site_id")
    public void setSiteID(String value) { this.siteID = value; }

    @JsonProperty("eshop_logo_url")
    public String getEshopLogoURL() { return eshopLogoURL; }
    @JsonProperty("eshop_logo_url")
    public void setEshopLogoURL(String value) { this.eshopLogoURL = value; }

    @JsonProperty("eshop_status_id")
    public long getEshopStatusID() { return eshopStatusID; }
    @JsonProperty("eshop_status_id")
    public void setEshopStatusID(long value) { this.eshopStatusID = value; }

    @JsonProperty("seller")
    public long getSeller() { return seller; }
    @JsonProperty("seller")
    public void setSeller(long value) { this.seller = value; }

    @JsonProperty("eshop_experience")
    public long getEshopExperience() { return eshopExperience; }
    @JsonProperty("eshop_experience")
    public void setEshopExperience(long value) { this.eshopExperience = value; }
}
