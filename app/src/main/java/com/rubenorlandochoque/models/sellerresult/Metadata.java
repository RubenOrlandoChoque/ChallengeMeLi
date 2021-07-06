package com.rubenorlandochoque.models.sellerresult;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Metadata {
    private String campaignID;
    private String promotionID;
    private String promotionType;
    private Double discountMeliAmount;
    private Long campaignDiscountPercentage;
    private Date campaignEndDate;
    private Double orderItemPrice;

    @JsonProperty("campaign_id")
    public String getCampaignID() { return campaignID; }
    @JsonProperty("campaign_id")
    public void setCampaignID(String value) { this.campaignID = value; }

    @JsonProperty("promotion_id")
    public String getPromotionID() { return promotionID; }
    @JsonProperty("promotion_id")
    public void setPromotionID(String value) { this.promotionID = value; }

    @JsonProperty("promotion_type")
    public String getPromotionType() { return promotionType; }
    @JsonProperty("promotion_type")
    public void setPromotionType(String value) { this.promotionType = value; }

    @JsonProperty("discount_meli_amount")
    public Double getDiscountMeliAmount() { return discountMeliAmount; }
    @JsonProperty("discount_meli_amount")
    public void setDiscountMeliAmount(Double value) { this.discountMeliAmount = value; }

    @JsonProperty("campaign_discount_percentage")
    public Long getCampaignDiscountPercentage() { return campaignDiscountPercentage; }
    @JsonProperty("campaign_discount_percentage")
    public void setCampaignDiscountPercentage(Long value) { this.campaignDiscountPercentage = value; }

    @JsonProperty("campaign_end_date")
    public Date getCampaignEndDate() { return campaignEndDate; }
    @JsonProperty("campaign_end_date")
    public void setCampaignEndDate(Date value) { this.campaignEndDate = value; }

    @JsonProperty("order_item_price")
    public Double getOrderItemPrice() { return orderItemPrice; }
    @JsonProperty("order_item_price")
    public void setOrderItemPrice(Double value) { this.orderItemPrice = value; }
}
