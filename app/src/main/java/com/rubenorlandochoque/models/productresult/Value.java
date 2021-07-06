package com.rubenorlandochoque.models.productresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
    private String id;
    private String name;
    private Struct struct;

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
}
