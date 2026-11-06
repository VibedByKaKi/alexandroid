package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaConversationsPaginationContextBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PaginatedCloudDriveResponse extends CloudDriveResponse {

    @SerializedName("count")
    @Expose
    private Long count;

    @SerializedName(AlexaConversationsPaginationContextBundleKeys.NEXT_TOKEN)
    @Expose
    private String nextToken;

    @Generated
    public PaginatedCloudDriveResponse() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof PaginatedCloudDriveResponse;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaginatedCloudDriveResponse)) {
            return false;
        }
        PaginatedCloudDriveResponse paginatedCloudDriveResponse = (PaginatedCloudDriveResponse) obj;
        if (!paginatedCloudDriveResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Long count = getCount();
        Long count2 = paginatedCloudDriveResponse.getCount();
        if (count != null ? !count.equals(count2) : count2 != null) {
            return false;
        }
        String nextToken = getNextToken();
        String nextToken2 = paginatedCloudDriveResponse.getNextToken();
        return nextToken != null ? nextToken.equals(nextToken2) : nextToken2 == null;
    }

    @Generated
    public Long getCount() {
        return this.count;
    }

    @Generated
    public String getNextToken() {
        return this.nextToken;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Long count = getCount();
        int i = hashCode * 59;
        int hashCode2 = count == null ? 43 : count.hashCode();
        String nextToken = getNextToken();
        return ((i + hashCode2) * 59) + (nextToken != null ? nextToken.hashCode() : 43);
    }

    @Generated
    public void setCount(Long l) {
        this.count = l;
    }

    @Generated
    public void setNextToken(String str) {
        this.nextToken = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public String toString() {
        return "PaginatedCloudDriveResponse(count=" + getCount() + ", nextToken=" + getNextToken() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
