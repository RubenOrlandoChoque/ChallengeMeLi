package com.rubenorlandochoque.models.searchresult;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Conditions {
    private List<Object> contextRestrictions;
    private Object startTime;
    private Object endTime;
    private boolean eligible;

    @JsonProperty("context_restrictions")
    public List<Object> getContextRestrictions() { return contextRestrictions; }
    @JsonProperty("context_restrictions")
    public void setContextRestrictions(List<Object> value) { this.contextRestrictions = value; }

    @JsonProperty("start_time")
    public Object getStartTime() { return startTime; }
    @JsonProperty("start_time")
    public void setStartTime(Object value) { this.startTime = value; }

    @JsonProperty("end_time")
    public Object getEndTime() { return endTime; }
    @JsonProperty("end_time")
    public void setEndTime(Object value) { this.endTime = value; }

    @JsonProperty("eligible")
    public boolean getEligible() { return eligible; }
    @JsonProperty("eligible")
    public void setEligible(boolean value) { this.eligible = value; }
}
