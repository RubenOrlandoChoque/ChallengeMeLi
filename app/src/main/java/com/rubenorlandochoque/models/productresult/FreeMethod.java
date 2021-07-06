package com.rubenorlandochoque.models.productresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FreeMethod {
    private long id;
    private Rule rule;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("rule")
    public Rule getRule() { return rule; }
    @JsonProperty("rule")
    public void setRule(Rule value) { this.rule = value; }
}
