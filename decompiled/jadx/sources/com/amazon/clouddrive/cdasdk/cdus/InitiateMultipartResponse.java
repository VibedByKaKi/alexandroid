package com.amazon.clouddrive.cdasdk.cdus;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class InitiateMultipartResponse {

    @SerializedName("multipartUploadExpirationTime")
    @Expose
    private String multipartUploadExpirationTime;

    @SerializedName("multipartUploadStartTime")
    @Expose
    private String multipartUploadStartTime;

    @SerializedName(AlexaDeviceBackgroundImageBridge.KEY_NODE_ID)
    @Expose
    private String nodeId;

    @SerializedName("partSize")
    @Expose
    private Long partSize;

    @SerializedName("totalNumberOfParts")
    @Expose
    private Long totalNumberOfParts;

    @SerializedName("uploadId")
    @Expose
    private String uploadId;

    @Generated
    public InitiateMultipartResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof InitiateMultipartResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiateMultipartResponse)) {
            return false;
        }
        InitiateMultipartResponse initiateMultipartResponse = (InitiateMultipartResponse) obj;
        if (!initiateMultipartResponse.canEqual(this)) {
            return false;
        }
        Long partSize = getPartSize();
        Long partSize2 = initiateMultipartResponse.getPartSize();
        if (partSize != null ? !partSize.equals(partSize2) : partSize2 != null) {
            return false;
        }
        Long totalNumberOfParts = getTotalNumberOfParts();
        Long totalNumberOfParts2 = initiateMultipartResponse.getTotalNumberOfParts();
        if (totalNumberOfParts != null ? !totalNumberOfParts.equals(totalNumberOfParts2) : totalNumberOfParts2 != null) {
            return false;
        }
        String nodeId = getNodeId();
        String nodeId2 = initiateMultipartResponse.getNodeId();
        if (nodeId != null ? !nodeId.equals(nodeId2) : nodeId2 != null) {
            return false;
        }
        String uploadId = getUploadId();
        String uploadId2 = initiateMultipartResponse.getUploadId();
        if (uploadId != null ? !uploadId.equals(uploadId2) : uploadId2 != null) {
            return false;
        }
        String multipartUploadStartTime = getMultipartUploadStartTime();
        String multipartUploadStartTime2 = initiateMultipartResponse.getMultipartUploadStartTime();
        if (multipartUploadStartTime != null ? !multipartUploadStartTime.equals(multipartUploadStartTime2) : multipartUploadStartTime2 != null) {
            return false;
        }
        String multipartUploadExpirationTime = getMultipartUploadExpirationTime();
        String multipartUploadExpirationTime2 = initiateMultipartResponse.getMultipartUploadExpirationTime();
        return multipartUploadExpirationTime != null ? multipartUploadExpirationTime.equals(multipartUploadExpirationTime2) : multipartUploadExpirationTime2 == null;
    }

    @Generated
    public String getMultipartUploadExpirationTime() {
        return this.multipartUploadExpirationTime;
    }

    @Generated
    public String getMultipartUploadStartTime() {
        return this.multipartUploadStartTime;
    }

    @Generated
    public String getNodeId() {
        return this.nodeId;
    }

    @Generated
    public Long getPartSize() {
        return this.partSize;
    }

    @Generated
    public Long getTotalNumberOfParts() {
        return this.totalNumberOfParts;
    }

    @Generated
    public String getUploadId() {
        return this.uploadId;
    }

    @Generated
    public int hashCode() {
        Long partSize = getPartSize();
        int hashCode = partSize == null ? 43 : partSize.hashCode();
        Long totalNumberOfParts = getTotalNumberOfParts();
        int hashCode2 = ((hashCode + 59) * 59) + (totalNumberOfParts == null ? 43 : totalNumberOfParts.hashCode());
        String nodeId = getNodeId();
        int hashCode3 = (hashCode2 * 59) + (nodeId == null ? 43 : nodeId.hashCode());
        String uploadId = getUploadId();
        int hashCode4 = (hashCode3 * 59) + (uploadId == null ? 43 : uploadId.hashCode());
        String multipartUploadStartTime = getMultipartUploadStartTime();
        int i = hashCode4 * 59;
        int hashCode5 = multipartUploadStartTime == null ? 43 : multipartUploadStartTime.hashCode();
        String multipartUploadExpirationTime = getMultipartUploadExpirationTime();
        return ((i + hashCode5) * 59) + (multipartUploadExpirationTime != null ? multipartUploadExpirationTime.hashCode() : 43);
    }

    @Generated
    public void setMultipartUploadExpirationTime(String str) {
        this.multipartUploadExpirationTime = str;
    }

    @Generated
    public void setMultipartUploadStartTime(String str) {
        this.multipartUploadStartTime = str;
    }

    @Generated
    public void setNodeId(String str) {
        this.nodeId = str;
    }

    @Generated
    public void setPartSize(Long l) {
        this.partSize = l;
    }

    @Generated
    public void setTotalNumberOfParts(Long l) {
        this.totalNumberOfParts = l;
    }

    @Generated
    public void setUploadId(String str) {
        this.uploadId = str;
    }

    @Generated
    public String toString() {
        return "InitiateMultipartResponse(nodeId=" + getNodeId() + ", uploadId=" + getUploadId() + ", partSize=" + getPartSize() + ", totalNumberOfParts=" + getTotalNumberOfParts() + ", multipartUploadStartTime=" + getMultipartUploadStartTime() + ", multipartUploadExpirationTime=" + getMultipartUploadExpirationTime() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
