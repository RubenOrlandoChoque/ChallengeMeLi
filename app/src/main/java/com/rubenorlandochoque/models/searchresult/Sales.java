package com.rubenorlandochoque.models.searchresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sales {
    private String period;
    private long completed;

    @JsonProperty("period")
    public String getPeriod() { return period; }
    @JsonProperty("period")
    public void setPeriod(String value) { this.period = value; }

    @JsonProperty("completed")
    public long getCompleted() { return completed; }
    @JsonProperty("completed")
    public void setCompleted(long value) { this.completed = value; }
}
