package com.rubenorlandochoque.models.searchresult;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AvailableFilter {
    private String id;
    private String name;
    private String type;
    private List<AvailableFilterValue> values;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("values")
    public List<AvailableFilterValue> getValues() { return values; }
    @JsonProperty("values")
    public void setValues(List<AvailableFilterValue> value) { this.values = value; }
}
