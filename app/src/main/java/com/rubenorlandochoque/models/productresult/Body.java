package com.rubenorlandochoque.models.productresult;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Body {
    private String id;
    private String siteID;
    private String title;
    private Object subtitle;
    private long sellerID;
    private String categoryID;
    private Object officialStoreID;
    private double price;
    private long basePrice;
    private double originalPrice;
    private String currencyID;
    private long initialQuantity;
    private long availableQuantity;
    private long soldQuantity;
    private List<Attribute> saleTerms;
    private String buyingMode;
    private String listingTypeID;
    private Date startTime;
    private Date stopTime;
    private String condition;
    private String permalink;
    private String thumbnailID;
    private String thumbnail;
    private String secureThumbnail;
    private List<Picture> pictures;
    private Object videoID;
    private List<Description> descriptions;
    private boolean acceptsMercadopago;
    private List<Object> nonMercadoPagoPaymentMethods;
    private Shipping shipping;
    private String internationalDeliveryMode;
    private SellerAddress sellerAddress;
    private Object sellerContact;
    private Location location;
    private List<Object> coverageAreas;
    private List<Attribute> attributes;
    private List<Object> warnings;
    private String listingSource;
    private List<Object> variations;
    private String status;
    private List<Object> subStatus;
    private List<String> tags;
    private String warranty;
    private String catalogProductID;
    private String domainID;
    private Object parentItemID;
    private Object differentialPricing;
    private List<String> dealIDS;
    private boolean automaticRelist;
    private Date dateCreated;
    private Date lastUpdated;
    private Object health;
    private boolean catalogListing;
    private List<String> channels;

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

    @JsonProperty("subtitle")
    public Object getSubtitle() { return subtitle; }
    @JsonProperty("subtitle")
    public void setSubtitle(Object value) { this.subtitle = value; }

    @JsonProperty("seller_id")
    public long getSellerID() { return sellerID; }
    @JsonProperty("seller_id")
    public void setSellerID(long value) { this.sellerID = value; }

    @JsonProperty("category_id")
    public String getCategoryID() { return categoryID; }
    @JsonProperty("category_id")
    public void setCategoryID(String value) { this.categoryID = value; }

    @JsonProperty("official_store_id")
    public Object getOfficialStoreID() { return officialStoreID; }
    @JsonProperty("official_store_id")
    public void setOfficialStoreID(Object value) { this.officialStoreID = value; }

    @JsonProperty("price")
    public double getPrice() { return price; }
    @JsonProperty("price")
    public void setPrice(double value) { this.price = value; }

    @JsonProperty("base_price")
    public long getBasePrice() { return basePrice; }
    @JsonProperty("base_price")
    public void setBasePrice(long value) { this.basePrice = value; }

    @JsonProperty("original_price")
    public double getOriginalPrice() { return originalPrice; }
    @JsonProperty("original_price")
    public void setOriginalPrice(double value) { this.originalPrice = value; }

    @JsonProperty("currency_id")
    public String getCurrencyID() { return currencyID; }
    @JsonProperty("currency_id")
    public void setCurrencyID(String value) { this.currencyID = value; }

    @JsonProperty("initial_quantity")
    public long getInitialQuantity() { return initialQuantity; }
    @JsonProperty("initial_quantity")
    public void setInitialQuantity(long value) { this.initialQuantity = value; }

    @JsonProperty("available_quantity")
    public long getAvailableQuantity() { return availableQuantity; }
    @JsonProperty("available_quantity")
    public void setAvailableQuantity(long value) { this.availableQuantity = value; }

    @JsonProperty("sold_quantity")
    public long getSoldQuantity() { return soldQuantity; }
    @JsonProperty("sold_quantity")
    public void setSoldQuantity(long value) { this.soldQuantity = value; }

    @JsonProperty("sale_terms")
    public List<Attribute> getSaleTerms() { return saleTerms; }
    @JsonProperty("sale_terms")
    public void setSaleTerms(List<Attribute> value) { this.saleTerms = value; }

    @JsonProperty("buying_mode")
    public String getBuyingMode() { return buyingMode; }
    @JsonProperty("buying_mode")
    public void setBuyingMode(String value) { this.buyingMode = value; }

    @JsonProperty("listing_type_id")
    public String getListingTypeID() { return listingTypeID; }
    @JsonProperty("listing_type_id")
    public void setListingTypeID(String value) { this.listingTypeID = value; }

    @JsonProperty("start_time")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "UTC")
    public Date getStartTime() { return startTime; }
    @JsonProperty("start_time")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "UTC")
    public void setStartTime(Date value) { this.startTime = value; }

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

    @JsonProperty("thumbnail_id")
    public String getThumbnailID() { return thumbnailID; }
    @JsonProperty("thumbnail_id")
    public void setThumbnailID(String value) { this.thumbnailID = value; }

    @JsonProperty("thumbnail")
    public String getThumbnail() { return thumbnail; }
    @JsonProperty("thumbnail")
    public void setThumbnail(String value) { this.thumbnail = value; }

    @JsonProperty("secure_thumbnail")
    public String getSecureThumbnail() { return secureThumbnail; }
    @JsonProperty("secure_thumbnail")
    public void setSecureThumbnail(String value) { this.secureThumbnail = value; }

    @JsonProperty("pictures")
    public List<Picture> getPictures() { return pictures; }
    @JsonProperty("pictures")
    public void setPictures(List<Picture> value) { this.pictures = value; }

    @JsonProperty("video_id")
    public Object getVideoID() { return videoID; }
    @JsonProperty("video_id")
    public void setVideoID(Object value) { this.videoID = value; }

    @JsonProperty("descriptions")
    public List<Description> getDescriptions() { return descriptions; }
    @JsonProperty("descriptions")
    public void setDescriptions(List<Description> value) { this.descriptions = value; }

    @JsonProperty("accepts_mercadopago")
    public boolean getAcceptsMercadopago() { return acceptsMercadopago; }
    @JsonProperty("accepts_mercadopago")
    public void setAcceptsMercadopago(boolean value) { this.acceptsMercadopago = value; }

    @JsonProperty("non_mercado_pago_payment_methods")
    public List<Object> getNonMercadoPagoPaymentMethods() { return nonMercadoPagoPaymentMethods; }
    @JsonProperty("non_mercado_pago_payment_methods")
    public void setNonMercadoPagoPaymentMethods(List<Object> value) { this.nonMercadoPagoPaymentMethods = value; }

    @JsonProperty("shipping")
    public Shipping getShipping() { return shipping; }
    @JsonProperty("shipping")
    public void setShipping(Shipping value) { this.shipping = value; }

    @JsonProperty("international_delivery_mode")
    public String getInternationalDeliveryMode() { return internationalDeliveryMode; }
    @JsonProperty("international_delivery_mode")
    public void setInternationalDeliveryMode(String value) { this.internationalDeliveryMode = value; }

    @JsonProperty("seller_address")
    public SellerAddress getSellerAddress() { return sellerAddress; }
    @JsonProperty("seller_address")
    public void setSellerAddress(SellerAddress value) { this.sellerAddress = value; }

    @JsonProperty("seller_contact")
    public Object getSellerContact() { return sellerContact; }
    @JsonProperty("seller_contact")
    public void setSellerContact(Object value) { this.sellerContact = value; }

    @JsonProperty("location")
    public Location getLocation() { return location; }
    @JsonProperty("location")
    public void setLocation(Location value) { this.location = value; }

    @JsonProperty("coverage_areas")
    public List<Object> getCoverageAreas() { return coverageAreas; }
    @JsonProperty("coverage_areas")
    public void setCoverageAreas(List<Object> value) { this.coverageAreas = value; }

    @JsonProperty("attributes")
    public List<Attribute> getAttributes() { return attributes; }
    @JsonProperty("attributes")
    public void setAttributes(List<Attribute> value) { this.attributes = value; }

    @JsonProperty("warnings")
    public List<Object> getWarnings() { return warnings; }
    @JsonProperty("warnings")
    public void setWarnings(List<Object> value) { this.warnings = value; }

    @JsonProperty("listing_source")
    public String getListingSource() { return listingSource; }
    @JsonProperty("listing_source")
    public void setListingSource(String value) { this.listingSource = value; }

    @JsonProperty("variations")
    public List<Object> getVariations() { return variations; }
    @JsonProperty("variations")
    public void setVariations(List<Object> value) { this.variations = value; }

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }

    @JsonProperty("sub_status")
    public List<Object> getSubStatus() { return subStatus; }
    @JsonProperty("sub_status")
    public void setSubStatus(List<Object> value) { this.subStatus = value; }

    @JsonProperty("tags")
    public List<String> getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(List<String> value) { this.tags = value; }

    @JsonProperty("warranty")
    public String getWarranty() { return warranty; }
    @JsonProperty("warranty")
    public void setWarranty(String value) { this.warranty = value; }

    @JsonProperty("catalog_product_id")
    public String getCatalogProductID() { return catalogProductID; }
    @JsonProperty("catalog_product_id")
    public void setCatalogProductID(String value) { this.catalogProductID = value; }

    @JsonProperty("domain_id")
    public String getDomainID() { return domainID; }
    @JsonProperty("domain_id")
    public void setDomainID(String value) { this.domainID = value; }

    @JsonProperty("parent_item_id")
    public Object getParentItemID() { return parentItemID; }
    @JsonProperty("parent_item_id")
    public void setParentItemID(Object value) { this.parentItemID = value; }

    @JsonProperty("differential_pricing")
    public Object getDifferentialPricing() { return differentialPricing; }
    @JsonProperty("differential_pricing")
    public void setDifferentialPricing(Object value) { this.differentialPricing = value; }

    @JsonProperty("deal_ids")
    public List<String> getDealIDS() { return dealIDS; }
    @JsonProperty("deal_ids")
    public void setDealIDS(List<String> value) { this.dealIDS = value; }

    @JsonProperty("automatic_relist")
    public boolean getAutomaticRelist() { return automaticRelist; }
    @JsonProperty("automatic_relist")
    public void setAutomaticRelist(boolean value) { this.automaticRelist = value; }

    @JsonProperty("date_created")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "UTC")
    public Date getDateCreated() { return dateCreated; }
    @JsonProperty("date_created")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "UTC")
    public void setDateCreated(Date value) { this.dateCreated = value; }

    @JsonProperty("last_updated")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "UTC")
    public Date getLastUpdated() { return lastUpdated; }
    @JsonProperty("last_updated")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "UTC")
    public void setLastUpdated(Date value) { this.lastUpdated = value; }

    @JsonProperty("health")
    public Object getHealth() { return health; }
    @JsonProperty("health")
    public void setHealth(Object value) { this.health = value; }

    @JsonProperty("catalog_listing")
    public boolean getCatalogListing() { return catalogListing; }
    @JsonProperty("catalog_listing")
    public void setCatalogListing(boolean value) { this.catalogListing = value; }

    @JsonProperty("channels")
    public List<String> getChannels() { return channels; }
    @JsonProperty("channels")
    public void setChannels(List<String> value) { this.channels = value; }
}
