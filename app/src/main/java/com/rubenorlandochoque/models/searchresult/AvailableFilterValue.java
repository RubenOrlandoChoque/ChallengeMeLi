package com.rubenorlandochoque.models.searchresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AvailableFilterValue {
    private String id;
    private String name;
    private long results;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("results")
    public long getResults() { return results; }
    @JsonProperty("results")
    public void setResults(long value) { this.results = value; }
}
