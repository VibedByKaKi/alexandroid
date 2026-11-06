package com.amazon.clouddrive.cdasdk.cds.search;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AggregationMatch {

    @SerializedName("count")
    @Expose
    private Long count;

    @SerializedName(AlexaDeviceBackgroundImageBridge.KEY_NODE_ID)
    @Expose
    private String nodeId;

    @SerializedName("searchData")
    @Expose
    private SearchData searchData;

    @SerializedName("value")
    @Expose
    private String value;

    @Generated
    public AggregationMatch() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof AggregationMatch;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AggregationMatch)) {
            return false;
        }
        AggregationMatch aggregationMatch = (AggregationMatch) obj;
        if (!aggregationMatch.canEqual(this)) {
            return false;
        }
        Long count = getCount();
        Long count2 = aggregationMatch.getCount();
        if (count != null ? !count.equals(count2) : count2 != null) {
            return false;
        }
        String value = getValue();
        String value2 = aggregationMatch.getValue();
        if (value != null ? !value.equals(value2) : value2 != null) {
            return false;
        }
        String nodeId = getNodeId();
        String nodeId2 = aggregationMatch.getNodeId();
        if (nodeId != null ? !nodeId.equals(nodeId2) : nodeId2 != null) {
            return false;
        }
        SearchData searchData = getSearchData();
        SearchData searchData2 = aggregationMatch.getSearchData();
        return searchData != null ? searchData.equals(searchData2) : searchData2 == null;
    }

    @Generated
    public Long getCount() {
        return this.count;
    }

    @Generated
    public String getNodeId() {
        return this.nodeId;
    }

    @Generated
    public SearchData getSearchData() {
        return this.searchData;
    }

    @Generated
    public String getValue() {
        return this.value;
    }

    @Generated
    public int hashCode() {
        Long count = getCount();
        int hashCode = count == null ? 43 : count.hashCode();
        String value = getValue();
        int hashCode2 = ((hashCode + 59) * 59) + (value == null ? 43 : value.hashCode());
        String nodeId = getNodeId();
        int i = hashCode2 * 59;
        int hashCode3 = nodeId == null ? 43 : nodeId.hashCode();
        SearchData searchData = getSearchData();
        return ((i + hashCode3) * 59) + (searchData != null ? searchData.hashCode() : 43);
    }

    @Generated
    public void setCount(Long l) {
        this.count = l;
    }

    @Generated
    public void setNodeId(String str) {
        this.nodeId = str;
    }

    @Generated
    public void setSearchData(SearchData searchData) {
        this.searchData = searchData;
    }

    @Generated
    public void setValue(String str) {
        this.value = str;
    }

    @Generated
    public String toString() {
        return "AggregationMatch(value=" + getValue() + ", count=" + getCount() + ", nodeId=" + getNodeId() + ", searchData=" + getSearchData() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
