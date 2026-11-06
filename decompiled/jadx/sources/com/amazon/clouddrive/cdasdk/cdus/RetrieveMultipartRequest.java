package com.amazon.clouddrive.cdasdk.cdus;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RetrieveMultipartRequest extends ServiceRequest {

    @SerializedName("uploadId")
    @Expose
    private String uploadId;

    public RetrieveMultipartRequest(@NonNull String str) {
        this.uploadId = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof RetrieveMultipartRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RetrieveMultipartRequest)) {
            return false;
        }
        RetrieveMultipartRequest retrieveMultipartRequest = (RetrieveMultipartRequest) obj;
        if (!retrieveMultipartRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String uploadId = getUploadId();
        String uploadId2 = retrieveMultipartRequest.getUploadId();
        return uploadId != null ? uploadId.equals(uploadId2) : uploadId2 == null;
    }

    @Generated
    public String getUploadId() {
        return this.uploadId;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String uploadId = getUploadId();
        return (hashCode * 59) + (uploadId == null ? 43 : uploadId.hashCode());
    }

    @Generated
    public void setUploadId(String str) {
        this.uploadId = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public String toString() {
        return "RetrieveMultipartRequest(uploadId=" + getUploadId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
