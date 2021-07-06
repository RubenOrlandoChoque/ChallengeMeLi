package com.rubenorlandochoque.models.sellerresult;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
    private String id;
    private String siteID;
    private String title;
    private ResultSeller seller;
    private double price;
    private Prices prices;
    private Object salePrice;
    private String currencyID;
    private long availableQuantity;
    private long soldQuantity;
    private String buyingMode;
    private String listingTypeID;
    private Date stopTime;
    private String condition;
    private String permalink;
    private String thumbnail;
    private String thumbnailID;
    private boolean acceptsMercadopago;
    private Installments installments;
    private Address address;
    private Shipping shipping;
    private SellerAddress sellerAddress;
    private List<Attribute> attributes;
    private double originalPrice;
    private String categoryID;
    private Object officialStoreID;
    private String domainID;
    private String catalogProductID;
    private List<String> tags;
    private boolean catalogListing;
    private boolean useThumbnailID;
    private long orderBackend;
    private DifferentialPricing differentialPricing;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("site_id")
    public String getSiteID() { return siteID; }
    @JsonProperty("site_id")
    public void setSiteID(String value) { this.siteID = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("seller")
    public ResultSeller getSeller() { return seller; }
    @JsonProperty("seller")
    public void setSeller(ResultSeller value) { this.seller = value; }

    @JsonProperty("price")
    public double getPrice() { return price; }
    @JsonProperty("price")
    public void setPrice(double value) { this.price = value; }

    @JsonProperty("prices")
    public Prices getPrices() { return prices; }
    @JsonProperty("prices")
    public void setPrices(Prices value) { this.prices = value; }

    @JsonProperty("sale_price")
    public Object getSalePrice() { return salePrice; }
    @JsonProperty("sale_price")
    public void setSalePrice(Object value) { this.salePrice = value; }

    @JsonProperty("currency_id")
    public String getCurrencyID() { return currencyID; }
    @JsonProperty("currency_id")
    public void setCurrencyID(String value) { this.currencyID = value; }

    @JsonProperty("available_quantity")
    public long getAvailableQuantity() { return availableQuantity; }
    @JsonProperty("available_quantity")
    public void setAvailableQuantity(long value) { this.availableQuantity = value; }

    @JsonProperty("sold_quantity")
    public long getSoldQuantity() { return soldQuantity; }
    @JsonProperty("sold_quantity")
    public void setSoldQuantity(long value) { this.soldQuantity = value; }

    @JsonProperty("buying_mode")
    public String getBuyingMode() { return buyingMode; }
    @JsonProperty("buying_mode")
    public void setBuyingMode(String value) { this.buyingMode = value; }

    @JsonProperty("listing_type_id")
    public String getListingTypeID() { return listingTypeID; }
    @JsonProperty("listing_type_id")
    public void setListingTypeID(String value) { this.listingTypeID = value; }

    @JsonProperty("stop_time")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "UTC")
    public Date getStopTime() { return stopTime; }
    @JsonProperty("stop_time")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "UTC")
    public void setStopTime(Date value) { this.stopTime = value; }

    @JsonProperty("condition")
    public String getCondition() { return condition; }
    @JsonProperty("condition")
    public void setCondition(String value) { this.condition = value; }

    @JsonProperty("permalink")
    public String getPermalink() { return permalink; }
    @JsonProperty("permalink")
    public void setPermalink(String value) { this.permalink = value; }

    @JsonProperty("thumbnail")
    public String getThumbnail() { return thumbnail; }
    @JsonProperty("thumbnail")
    public void setThumbnail(String value) { this.thumbnail = value; }

    @JsonProperty("thumbnail_id")
    public String getThumbnailID() { return thumbnailID; }
    @JsonProperty("thumbnail_id")
    public void setThumbnailID(String value) { this.thumbnailID = value; }

    @JsonProperty("accepts_mercadopago")
    public boolean getAcceptsMercadopago() { return acceptsMercadopago; }
    @JsonProperty("accepts_mercadopago")
    public void setAcceptsMercadopago(boolean value) { this.acceptsMercadopago = value; }

    @JsonProperty("installments")
    public Installments getInstallments() { return installments; }
    @JsonProperty("installments")
    public void setInstallments(Installments value) { this.installments = value; }

    @JsonProperty("address")
    public Address getAddress() { return address; }
    @JsonProperty("address")
    public void setAddress(Address value) { this.address = value; }

    @JsonProperty("shipping")
    public Shipping getShipping() { return shipping; }
    @JsonProperty("shipping")
    public void setShipping(Shipping value) { this.shipping = value; }

    @JsonProperty("seller_address")
    public SellerAddress getSellerAddress() { return sellerAddress; }
    @JsonProperty("seller_address")
    public void setSellerAddress(SellerAddress value) { this.sellerAddress = value; }

    @JsonProperty("attributes")
    public List<Attribute> getAttributes() { return attributes; }
    @JsonProperty("attributes")
    public void setAttributes(List<Attribute> value) { this.attributes = value; }

    @JsonProperty("original_price")
    public double getOriginalPrice() { return originalPrice; }
    @JsonProperty("original_price")
    public void setOriginalPrice(double value) { this.originalPrice = value; }

    @JsonProperty("category_id")
    public String getCategoryID() { return categoryID; }
    @JsonProperty("category_id")
    public void setCategoryID(String value) { this.categoryID = value; }

    @JsonProperty("official_store_id")
    public Object getOfficialStoreID() { return officialStoreID; }
    @JsonProperty("official_store_id")
    public void setOfficialStoreID(Object value) { this.officialStoreID = value; }

    @JsonProperty("domain_id")
    public String getDomainID() { return domainID; }
    @JsonProperty("domain_id")
    public void setDomainID(String value) { this.domainID = value; }

    @JsonProperty("catalog_product_id")
    public String getCatalogProductID() { return catalogProductID; }
    @JsonProperty("catalog_product_id")
    public void setCatalogProductID(String value) { this.catalogProductID = value; }

    @JsonProperty("tags")
    public List<String> getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(List<String> value) { this.tags = value; }

    @JsonProperty("catalog_listing")
    public boolean getCatalogListing() { return catalogListing; }
    @JsonProperty("catalog_listing")
    public void setCatalogListing(boolean value) { this.catalogListing = value; }

    @JsonProperty("use_thumbnail_id")
    public boolean getUseThumbnailID() { return useThumbnailID; }
    @JsonProperty("use_thumbnail_id")
    public void setUseThumbnailID(boolean value) { this.useThumbnailID = value; }

    @JsonProperty("order_backend")
    public long getOrderBackend() { return orderBackend; }
    @JsonProperty("order_backend")
    public void setOrderBackend(long value) { this.orderBackend = value; }

    @JsonProperty("differential_pricing")
    public DifferentialPricing getDifferentialPricing() { return differentialPricing; }
    @JsonProperty("differential_pricing")
    public void setDifferentialPricing(DifferentialPricing value) { this.differentialPricing = value; }
}
