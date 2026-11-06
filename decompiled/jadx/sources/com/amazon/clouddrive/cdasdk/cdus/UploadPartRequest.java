package com.amazon.clouddrive.cdasdk.cdus;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UploadPartRequest extends ServiceRequest {

    @SerializedName("partSize")
    @Expose
    private Long partSize;

    @SerializedName("uploadId")
    @Expose
    private String uploadId;

    public UploadPartRequest(String str, Long l) {
        this.uploadId = str;
        this.partSize = l;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof UploadPartRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UploadPartRequest)) {
            return false;
        }
        UploadPartRequest uploadPartRequest = (UploadPartRequest) obj;
        if (!uploadPartRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Long partSize = getPartSize();
        Long partSize2 = uploadPartRequest.getPartSize();
        if (partSize != null ? !partSize.equals(partSize2) : partSize2 != null) {
            return false;
        }
        String uploadId = getUploadId();
        String uploadId2 = uploadPartRequest.getUploadId();
        return uploadId != null ? uploadId.equals(uploadId2) : uploadId2 == null;
    }

    @Generated
    public Long getPartSize() {
        return this.partSize;
    }

    @Generated
    public String getUploadId() {
        return this.uploadId;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Long partSize = getPartSize();
        int i = hashCode * 59;
        int hashCode2 = partSize == null ? 43 : partSize.hashCode();
        String uploadId = getUploadId();
        return ((i + hashCode2) * 59) + (uploadId != null ? uploadId.hashCode() : 43);
    }

    @Generated
    public void setPartSize(Long l) {
        this.partSize = l;
    }

    @Generated
    public void setUploadId(String str) {
        this.uploadId = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdus.ServiceRequest
    @Generated
    public String toString() {
        return "UploadPartRequest(uploadId=" + getUploadId() + ", partSize=" + getPartSize() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
