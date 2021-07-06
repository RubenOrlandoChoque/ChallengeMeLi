package com.rubenorlandochoque.models.sellerresult;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Attribute {
    private String valueName;
    private String attributeGroupID;
    private String attributeGroupName;
    private long source;
    private String id;
    private String name;
    private String valueID;
    private Struct valueStruct;
    private List<AttributeValue> values;

    @JsonProperty("value_name")
    public String getValueName() { return valueName; }
    @JsonProperty("value_name")
    public void setValueName(String value) { this.valueName = value; }

    @JsonProperty("attribute_group_id")
    public String getAttributeGroupID() { return attributeGroupID; }
    @JsonProperty("attribute_group_id")
    public void setAttributeGroupID(String value) { this.attributeGroupID = value; }

    @JsonProperty("attribute_group_name")
    public String getAttributeGroupName() { return attributeGroupName; }
    @JsonProperty("attribute_group_name")
    public void setAttributeGroupName(String value) { this.attributeGroupName = value; }

    @JsonProperty("source")
    public long getSource() { return source; }
    @JsonProperty("source")
    public void setSource(long value) { this.source = value; }

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("value_id")
    public String getValueID() { return valueID; }
    @JsonProperty("value_id")
    public void setValueID(String value) { this.valueID = value; }

    @JsonProperty("value_struct")
    public Struct getValueStruct() { return valueStruct; }
    @JsonProperty("value_struct")
    public void setValueStruct(Struct value) { this.valueStruct = value; }

    @JsonProperty("values")
    public List<AttributeValue> getValues() { return values; }
    @JsonProperty("values")
    public void setValues(List<AttributeValue> value) { this.values = value; }
}
