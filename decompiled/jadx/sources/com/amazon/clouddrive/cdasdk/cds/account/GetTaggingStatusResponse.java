package com.amazon.clouddrive.cdasdk.cds.account;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetTaggingStatusResponse extends CloudDriveResponse {

    @SerializedName("taggingStatuses")
    @Expose
    private Map<String, TaggingStatus> taggingStatuses;

    @Generated
    public GetTaggingStatusResponse() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GetTaggingStatusResponse;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetTaggingStatusResponse)) {
            return false;
        }
        GetTaggingStatusResponse getTaggingStatusResponse = (GetTaggingStatusResponse) obj;
        if (!getTaggingStatusResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Map<String, TaggingStatus> taggingStatuses = getTaggingStatuses();
        Map<String, TaggingStatus> taggingStatuses2 = getTaggingStatusResponse.getTaggingStatuses();
        return taggingStatuses != null ? taggingStatuses.equals(taggingStatuses2) : taggingStatuses2 == null;
    }

    @Generated
    public Map<String, TaggingStatus> getTaggingStatuses() {
        return this.taggingStatuses;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Map<String, TaggingStatus> taggingStatuses = getTaggingStatuses();
        return (hashCode * 59) + (taggingStatuses == null ? 43 : taggingStatuses.hashCode());
    }

    @Generated
    public void setTaggingStatuses(Map<String, TaggingStatus> map) {
        this.taggingStatuses = map;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public String toString() {
        return "GetTaggingStatusResponse(taggingStatuses=" + getTaggingStatuses() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
