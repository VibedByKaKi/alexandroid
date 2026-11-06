package com.amazon.clouddrive.cdasdk.cds.search;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest;
import com.amazon.clouddrive.cdasdk.cds.common.DedupeContext;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AggregationRequest extends CloudDriveRequest {

    @SerializedName("aggregationContext")
    @Expose
    private AggregationContext aggregationContext;

    @SerializedName("category")
    @Expose
    private String category;

    @SerializedName("dedupeContext")
    @Expose
    private DedupeContext dedupeContext;

    @SerializedName("groupBy")
    @Expose
    private String groupBy;

    @SerializedName("language")
    @Expose
    private String language;

    @SerializedName("limit")
    @Expose
    private Integer limit;

    @Generated
    public AggregationRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof AggregationRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AggregationRequest)) {
            return false;
        }
        AggregationRequest aggregationRequest = (AggregationRequest) obj;
        if (!aggregationRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Integer limit = getLimit();
        Integer limit2 = aggregationRequest.getLimit();
        if (limit != null ? !limit.equals(limit2) : limit2 != null) {
            return false;
        }
        String category = getCategory();
        String category2 = aggregationRequest.getCategory();
        if (category != null ? !category.equals(category2) : category2 != null) {
            return false;
        }
        DedupeContext dedupeContext = getDedupeContext();
        DedupeContext dedupeContext2 = aggregationRequest.getDedupeContext();
        if (dedupeContext != null ? !dedupeContext.equals(dedupeContext2) : dedupeContext2 != null) {
            return false;
        }
        String language = getLanguage();
        String language2 = aggregationRequest.getLanguage();
        if (language != null ? !language.equals(language2) : language2 != null) {
            return false;
        }
        String groupBy = getGroupBy();
        String groupBy2 = aggregationRequest.getGroupBy();
        if (groupBy != null ? !groupBy.equals(groupBy2) : groupBy2 != null) {
            return false;
        }
        AggregationContext aggregationContext = getAggregationContext();
        AggregationContext aggregationContext2 = aggregationRequest.getAggregationContext();
        return aggregationContext != null ? aggregationContext.equals(aggregationContext2) : aggregationContext2 == null;
    }

    @Generated
    public AggregationContext getAggregationContext() {
        return this.aggregationContext;
    }

    @Generated
    public String getCategory() {
        return this.category;
    }

    @Generated
    public DedupeContext getDedupeContext() {
        return this.dedupeContext;
    }

    @Generated
    public String getGroupBy() {
        return this.groupBy;
    }

    @Generated
    public String getLanguage() {
        return this.language;
    }

    @Generated
    public Integer getLimit() {
        return this.limit;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Integer limit = getLimit();
        int hashCode2 = (hashCode * 59) + (limit == null ? 43 : limit.hashCode());
        String category = getCategory();
        int hashCode3 = (hashCode2 * 59) + (category == null ? 43 : category.hashCode());
        DedupeContext dedupeContext = getDedupeContext();
        int hashCode4 = (hashCode3 * 59) + (dedupeContext == null ? 43 : dedupeContext.hashCode());
        String language = getLanguage();
        int hashCode5 = (hashCode4 * 59) + (language == null ? 43 : language.hashCode());
        String groupBy = getGroupBy();
        int i = hashCode5 * 59;
        int hashCode6 = groupBy == null ? 43 : groupBy.hashCode();
        AggregationContext aggregationContext = getAggregationContext();
        return ((i + hashCode6) * 59) + (aggregationContext != null ? aggregationContext.hashCode() : 43);
    }

    @Generated
    public void setAggregationContext(AggregationContext aggregationContext) {
        this.aggregationContext = aggregationContext;
    }

    @Generated
    public void setCategory(String str) {
        this.category = str;
    }

    @Generated
    public void setDedupeContext(DedupeContext dedupeContext) {
        this.dedupeContext = dedupeContext;
    }

    @Generated
    public void setGroupBy(String str) {
        this.groupBy = str;
    }

    @Generated
    public void setLanguage(String str) {
        this.language = str;
    }

    @Generated
    public void setLimit(Integer num) {
        this.limit = num;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public String toString() {
        return "AggregationRequest(category=" + getCategory() + ", limit=" + getLimit() + ", dedupeContext=" + getDedupeContext() + ", language=" + getLanguage() + ", groupBy=" + getGroupBy() + ", aggregationContext=" + getAggregationContext() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
