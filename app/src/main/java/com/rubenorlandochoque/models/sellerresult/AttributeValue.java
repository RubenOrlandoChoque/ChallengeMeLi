package com.rubenorlandochoque.models.sellerresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeValue {
    private String id;
    private String name;
    private Struct struct;
    private long source;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("struct")
    public Struct getStruct() { return struct; }
    @JsonProperty("struct")
    public void setStruct(Struct value) { this.struct = value; }

    @JsonProperty("source")
    public long getSource() { return source; }
    @JsonProperty("source")
    public void setSource(long value) { this.source = value; }
}
