package com.amazon.clouddrive.cdasdk.cdus;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CompleteMultipartResponse {

    @SerializedName("completeMultipartUploadExpirationTime")
    @Expose
    private String completeMultipartUploadExpirationTime;

    @SerializedName("completeMultipartUploadStartTime")
    @Expose
    private String completeMultipartUploadStartTime;

    @SerializedName("status")
    @Expose
    private String status;

    @Generated
    public CompleteMultipartResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CompleteMultipartResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CompleteMultipartResponse)) {
            return false;
        }
        CompleteMultipartResponse completeMultipartResponse = (CompleteMultipartResponse) obj;
        if (!completeMultipartResponse.canEqual(this)) {
            return false;
        }
        String status = getStatus();
        String status2 = completeMultipartResponse.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        String completeMultipartUploadStartTime = getCompleteMultipartUploadStartTime();
        String completeMultipartUploadStartTime2 = completeMultipartResponse.getCompleteMultipartUploadStartTime();
        if (completeMultipartUploadStartTime != null ? !completeMultipartUploadStartTime.equals(completeMultipartUploadStartTime2) : completeMultipartUploadStartTime2 != null) {
            return false;
        }
        String completeMultipartUploadExpirationTime = getCompleteMultipartUploadExpirationTime();
        String completeMultipartUploadExpirationTime2 = completeMultipartResponse.getCompleteMultipartUploadExpirationTime();
        return completeMultipartUploadExpirationTime != null ? completeMultipartUploadExpirationTime.equals(completeMultipartUploadExpirationTime2) : completeMultipartUploadExpirationTime2 == null;
    }

    @Generated
    public String getCompleteMultipartUploadExpirationTime() {
        return this.completeMultipartUploadExpirationTime;
    }

    @Generated
    public String getCompleteMultipartUploadStartTime() {
        return this.completeMultipartUploadStartTime;
    }

    @Generated
    public String getStatus() {
        return this.status;
    }

    @Generated
    public int hashCode() {
        String status = getStatus();
        int hashCode = status == null ? 43 : status.hashCode();
        String completeMultipartUploadStartTime = getCompleteMultipartUploadStartTime();
        int i = (hashCode + 59) * 59;
        int hashCode2 = completeMultipartUploadStartTime == null ? 43 : completeMultipartUploadStartTime.hashCode();
        String completeMultipartUploadExpirationTime = getCompleteMultipartUploadExpirationTime();
        return ((i + hashCode2) * 59) + (completeMultipartUploadExpirationTime != null ? completeMultipartUploadExpirationTime.hashCode() : 43);
    }

    @Generated
    public void setCompleteMultipartUploadExpirationTime(String str) {
        this.completeMultipartUploadExpirationTime = str;
    }

    @Generated
    public void setCompleteMultipartUploadStartTime(String str) {
        this.completeMultipartUploadStartTime = str;
    }

    @Generated
    public void setStatus(String str) {
        this.status = str;
    }

    @Generated
    public String toString() {
        return "CompleteMultipartResponse(status=" + getStatus() + ", completeMultipartUploadStartTime=" + getCompleteMultipartUploadStartTime() + ", completeMultipartUploadExpirationTime=" + getCompleteMultipartUploadExpirationTime() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
