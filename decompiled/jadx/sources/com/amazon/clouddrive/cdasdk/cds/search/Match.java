package com.amazon.clouddrive.cdasdk.cds.search;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Match {

    @SerializedName("count")
    @Expose
    private Long count;

    @SerializedName("match")
    @Expose
    private String match;

    @SerializedName("searchData")
    @Expose
    private SearchData searchData;

    @Generated
    public Match() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof Match;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Match)) {
            return false;
        }
        Match match = (Match) obj;
        if (!match.canEqual(this)) {
            return false;
        }
        Long count = getCount();
        Long count2 = match.getCount();
        if (count != null ? !count.equals(count2) : count2 != null) {
            return false;
        }
        String match2 = getMatch();
        String match3 = match.getMatch();
        if (match2 != null ? !match2.equals(match3) : match3 != null) {
            return false;
        }
        SearchData searchData = getSearchData();
        SearchData searchData2 = match.getSearchData();
        return searchData != null ? searchData.equals(searchData2) : searchData2 == null;
    }

    @Generated
    public Long getCount() {
        return this.count;
    }

    @Generated
    public String getMatch() {
        return this.match;
    }

    @Generated
    public SearchData getSearchData() {
        return this.searchData;
    }

    @Generated
    public int hashCode() {
        Long count = getCount();
        int hashCode = count == null ? 43 : count.hashCode();
        String match = getMatch();
        int i = (hashCode + 59) * 59;
        int hashCode2 = match == null ? 43 : match.hashCode();
        SearchData searchData = getSearchData();
        return ((i + hashCode2) * 59) + (searchData != null ? searchData.hashCode() : 43);
    }

    @Generated
    public void setCount(Long l) {
        this.count = l;
    }

    @Generated
    public void setMatch(String str) {
        this.match = str;
    }

    @Generated
    public void setSearchData(SearchData searchData) {
        this.searchData = searchData;
    }

    @Generated
    public String toString() {
        return "Match(match=" + getMatch() + ", count=" + getCount() + ", searchData=" + getSearchData() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
