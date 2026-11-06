package com.amazon.clouddrive.cdasdk.cds.search;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AggregationResponse extends CloudDriveResponse {

    @SerializedName("aggregations")
    @Expose
    private List<AggregationMatch> aggregations;

    @SerializedName("category")
    @Expose
    private String category;

    @Generated
    public AggregationResponse() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof AggregationResponse;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AggregationResponse)) {
            return false;
        }
        AggregationResponse aggregationResponse = (AggregationResponse) obj;
        if (!aggregationResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String category = getCategory();
        String category2 = aggregationResponse.getCategory();
        if (category != null ? !category.equals(category2) : category2 != null) {
            return false;
        }
        List<AggregationMatch> aggregations = getAggregations();
        List<AggregationMatch> aggregations2 = aggregationResponse.getAggregations();
        return aggregations != null ? aggregations.equals(aggregations2) : aggregations2 == null;
    }

    @Generated
    public List<AggregationMatch> getAggregations() {
        return this.aggregations;
    }

    @Generated
    public String getCategory() {
        return this.category;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String category = getCategory();
        int i = hashCode * 59;
        int hashCode2 = category == null ? 43 : category.hashCode();
        List<AggregationMatch> aggregations = getAggregations();
        return ((i + hashCode2) * 59) + (aggregations != null ? aggregations.hashCode() : 43);
    }

    @Generated
    public void setAggregations(List<AggregationMatch> list) {
        this.aggregations = list;
    }

    @Generated
    public void setCategory(String str) {
        this.category = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public String toString() {
        return "AggregationResponse(category=" + getCategory() + ", aggregations=" + getAggregations() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
