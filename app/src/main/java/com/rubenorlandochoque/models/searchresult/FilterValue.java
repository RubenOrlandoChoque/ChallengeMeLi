package com.rubenorlandochoque.models.searchresult;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FilterValue {
    private String id;
    private String name;
    private List<Sort> pathFromRoot;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("path_from_root")
    public List<Sort> getPathFromRoot() { return pathFromRoot; }
    @JsonProperty("path_from_root")
    public void setPathFromRoot(List<Sort> value) { this.pathFromRoot = value; }
}
