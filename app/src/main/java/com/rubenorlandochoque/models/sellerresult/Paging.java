package com.rubenorlandochoque.models.sellerresult;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Paging {
    private long total;
    private long primaryResults;
    private long offset;
    private long limit;

    @JsonProperty("total")
    public long getTotal() { return total; }
    @JsonProperty("total")
    public void setTotal(long value) { this.total = value; }

    @JsonProperty("primary_results")
    public long getPrimaryResults() { return primaryResults; }
    @JsonProperty("primary_results")
    public void setPrimaryResults(long value) { this.primaryResults = value; }

    @JsonProperty("offset")
    public long getOffset() { return offset; }
    @JsonProperty("offset")
    public void setOffset(long value) { this.offset = value; }

    @JsonProperty("limit")
    public long getLimit() { return limit; }
    @JsonProperty("limit")
    public void setLimit(long value) { this.limit = value; }
}
