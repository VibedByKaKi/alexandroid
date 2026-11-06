package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class CloudDriveRequest {

    @SerializedName("eTag")
    @Expose
    private String eTag;

    @Generated
    public CloudDriveRequest() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CloudDriveRequest;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CloudDriveRequest)) {
            return false;
        }
        CloudDriveRequest cloudDriveRequest = (CloudDriveRequest) obj;
        if (!cloudDriveRequest.canEqual(this)) {
            return false;
        }
        String eTag = getETag();
        String eTag2 = cloudDriveRequest.getETag();
        return eTag != null ? eTag.equals(eTag2) : eTag2 == null;
    }

    @Generated
    public String getETag() {
        return this.eTag;
    }

    @Generated
    public int hashCode() {
        String eTag = getETag();
        return 59 + (eTag == null ? 43 : eTag.hashCode());
    }

    @Generated
    public void setETag(String str) {
        this.eTag = str;
    }

    @Generated
    public String toString() {
        return "CloudDriveRequest(eTag=" + getETag() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
