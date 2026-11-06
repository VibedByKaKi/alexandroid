package com.amazon.clouddrive.cdasdk.cds.account;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest;
import com.amazon.clouddrive.cdasdk.cds.common.Context;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetTaggingStatusRequest extends CloudDriveRequest {

    @SerializedName("context")
    @Expose
    private Context context;

    @Generated
    public GetTaggingStatusRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GetTaggingStatusRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetTaggingStatusRequest)) {
            return false;
        }
        GetTaggingStatusRequest getTaggingStatusRequest = (GetTaggingStatusRequest) obj;
        if (!getTaggingStatusRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Context context = getContext();
        Context context2 = getTaggingStatusRequest.getContext();
        return context != null ? context.equals(context2) : context2 == null;
    }

    @Generated
    public Context getContext() {
        return this.context;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Context context = getContext();
        return (hashCode * 59) + (context == null ? 43 : context.hashCode());
    }

    @Generated
    public void setContext(Context context) {
        this.context = context;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public String toString() {
        return "GetTaggingStatusRequest(context=" + getContext() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
