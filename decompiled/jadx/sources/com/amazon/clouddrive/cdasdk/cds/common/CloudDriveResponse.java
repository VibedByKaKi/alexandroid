package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CloudDriveResponse {

    @SerializedName("statusCode")
    @Expose
    private Integer statusCode;

    @Generated
    public CloudDriveResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CloudDriveResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CloudDriveResponse)) {
            return false;
        }
        CloudDriveResponse cloudDriveResponse = (CloudDriveResponse) obj;
        if (!cloudDriveResponse.canEqual(this)) {
            return false;
        }
        Integer statusCode = getStatusCode();
        Integer statusCode2 = cloudDriveResponse.getStatusCode();
        return statusCode != null ? statusCode.equals(statusCode2) : statusCode2 == null;
    }

    @Generated
    public Integer getStatusCode() {
        return this.statusCode;
    }

    @Generated
    public int hashCode() {
        Integer statusCode = getStatusCode();
        return 59 + (statusCode == null ? 43 : statusCode.hashCode());
    }

    @Generated
    public void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    @Generated
    public String toString() {
        return "CloudDriveResponse(statusCode=" + getStatusCode() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
