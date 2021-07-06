package com.rubenorlandochoque.models.sellerresult;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Conditions {
    private List<Object> contextRestrictions;
    private Date startTime;
    private Date endTime;
    private boolean eligible;

    @JsonProperty("context_restrictions")
    public List<Object> getContextRestrictions() { return contextRestrictions; }
    @JsonProperty("context_restrictions")
    public void setContextRestrictions(List<Object> value) { this.contextRestrictions = value; }

    @JsonProperty("start_time")
    public Date getStartTime() { return startTime; }
    @JsonProperty("start_time")
    public void setStartTime(Date value) { this.startTime = value; }

    @JsonProperty("end_time")
    public Date getEndTime() { return endTime; }
    @JsonProperty("end_time")
    public void setEndTime(Date value) { this.endTime = value; }

    @JsonProperty("eligible")
    public boolean getEligible() { return eligible; }
    @JsonProperty("eligible")
    public void setEligible(boolean value) { this.eligible = value; }
}
