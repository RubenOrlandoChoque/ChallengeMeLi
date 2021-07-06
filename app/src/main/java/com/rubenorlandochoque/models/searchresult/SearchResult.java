package com.rubenorlandochoque.models.searchresult;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResult {
    private String siteID;
    private String query;
    private Paging paging;
    private List<Result> results;
    private List<Object> secondaryResults;
    private List<Object> relatedResults;
    private Sort sort;
    private List<Sort> availableSorts;
    private List<Filter> filters;
    private List<AvailableFilter> availableFilters;

    @JsonProperty("site_id")
    public String getSiteID() { return siteID; }
    @JsonProperty("site_id")
    public void setSiteID(String value) { this.siteID = value; }

    @JsonProperty("query")
    public String getQuery() { return query; }
    @JsonProperty("query")
    public void setQuery(String value) { this.query = value; }

    @JsonProperty("paging")
    public Paging getPaging() { return paging; }
    @JsonProperty("paging")
    public void setPaging(Paging value) { this.paging = value; }

    @JsonProperty("results")
    public List<Result> getResults() { return results; }
    @JsonProperty("results")
    public void setResults(List<Result> value) { this.results = value; }

    @JsonProperty("secondary_results")
    public List<Object> getSecondaryResults() { return secondaryResults; }
    @JsonProperty("secondary_results")
    public void setSecondaryResults(List<Object> value) { this.secondaryResults = value; }

    @JsonProperty("related_results")
    public List<Object> getRelatedResults() { return relatedResults; }
    @JsonProperty("related_results")
    public void setRelatedResults(List<Object> value) { this.relatedResults = value; }

    @JsonProperty("sort")
    public Sort getSort() { return sort; }
    @JsonProperty("sort")
    public void setSort(Sort value) { this.sort = value; }

    @JsonProperty("available_sorts")
    public List<Sort> getAvailableSorts() { return availableSorts; }
    @JsonProperty("available_sorts")
    public void setAvailableSorts(List<Sort> value) { this.availableSorts = value; }

    @JsonProperty("filters")
    public List<Filter> getFilters() { return filters; }
    @JsonProperty("filters")
    public void setFilters(List<Filter> value) { this.filters = value; }

    @JsonProperty("available_filters")
    public List<AvailableFilter> getAvailableFilters() { return availableFilters; }
    @JsonProperty("available_filters")
    public void setAvailableFilters(List<AvailableFilter> value) { this.availableFilters = value; }
}
