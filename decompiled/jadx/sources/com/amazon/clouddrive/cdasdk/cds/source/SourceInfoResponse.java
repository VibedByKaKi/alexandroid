package com.amazon.clouddrive.cdasdk.cds.source;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SourceInfoResponse extends SourceInfo {

    @SerializedName("statusCode")
    @Expose
    private Integer statusCode;

    @Generated
    public SourceInfoResponse() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.source.SourceInfo, com.amazon.clouddrive.cdasdk.cds.source.BaseSourceInfo
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof SourceInfoResponse;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.source.SourceInfo, com.amazon.clouddrive.cdasdk.cds.source.BaseSourceInfo
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SourceInfoResponse)) {
            return false;
        }
        SourceInfoResponse sourceInfoResponse = (SourceInfoResponse) obj;
        if (!sourceInfoResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Integer statusCode = getStatusCode();
        Integer statusCode2 = sourceInfoResponse.getStatusCode();
        return statusCode != null ? statusCode.equals(statusCode2) : statusCode2 == null;
    }

    @Generated
    public Integer getStatusCode() {
        return this.statusCode;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.source.SourceInfo, com.amazon.clouddrive.cdasdk.cds.source.BaseSourceInfo
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Integer statusCode = getStatusCode();
        return (hashCode * 59) + (statusCode == null ? 43 : statusCode.hashCode());
    }

    @Generated
    public void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.source.SourceInfo, com.amazon.clouddrive.cdasdk.cds.source.BaseSourceInfo
    @Generated
    public String toString() {
        return "SourceInfoResponse(statusCode=" + getStatusCode() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
