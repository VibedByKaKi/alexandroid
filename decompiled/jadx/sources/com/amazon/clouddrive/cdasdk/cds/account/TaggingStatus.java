package com.amazon.clouddrive.cdasdk.cds.account;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TaggingStatus {

    @SerializedName("status")
    @Expose
    private String status;

    @Generated
    public TaggingStatus() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof TaggingStatus;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TaggingStatus)) {
            return false;
        }
        TaggingStatus taggingStatus = (TaggingStatus) obj;
        if (!taggingStatus.canEqual(this)) {
            return false;
        }
        String status = getStatus();
        String status2 = taggingStatus.getStatus();
        return status != null ? status.equals(status2) : status2 == null;
    }

    @Generated
    public String getStatus() {
        return this.status;
    }

    @Generated
    public int hashCode() {
        String status = getStatus();
        return 59 + (status == null ? 43 : status.hashCode());
    }

    @Generated
    public void setStatus(String str) {
        this.status = str;
    }

    @Generated
    public String toString() {
        return "TaggingStatus(status=" + getStatus() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
