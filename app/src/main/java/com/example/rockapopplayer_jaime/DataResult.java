package com.example.rockapopplayer_jaime;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class DataResult {

    @SerializedName("resultCount")
    @Expose
    private Integer resultCount;
    @SerializedName("results")
    @Expose
    private List<RockMusic> results = null;

    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    public List<RockMusic> getResults() {
        return results;
    }

    public void setResults(List<RockMusic> results) {
        this.results = results;
    }

}