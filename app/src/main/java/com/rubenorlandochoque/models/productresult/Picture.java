package com.rubenorlandochoque.models.productresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Picture {
    private String id;
    private String url;
    private String secureURL;
    private String size;
    private String maxSize;
    private String quality;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("secure_url")
    public String getSecureURL() { return secureURL; }
    @JsonProperty("secure_url")
    public void setSecureURL(String value) { this.secureURL = value; }

    @JsonProperty("size")
    public String getSize() { return size; }
    @JsonProperty("size")
    public void setSize(String value) { this.size = value; }

    @JsonProperty("max_size")
    public String getMaxSize() { return maxSize; }
    @JsonProperty("max_size")
    public void setMaxSize(String value) { this.maxSize = value; }

    @JsonProperty("quality")
    public String getQuality() { return quality; }
    @JsonProperty("quality")
    public void setQuality(String value) { this.quality = value; }
}
