package com.amazon.clouddrive.cdasdk.cds.account;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetQuotaRequest extends CloudDriveRequest {

    @SerializedName("includeFamilyBenefit")
    @Expose
    private Boolean includeFamilyBenefit;

    @Generated
    public GetQuotaRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GetQuotaRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetQuotaRequest)) {
            return false;
        }
        GetQuotaRequest getQuotaRequest = (GetQuotaRequest) obj;
        if (!getQuotaRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Boolean includeFamilyBenefit = getIncludeFamilyBenefit();
        Boolean includeFamilyBenefit2 = getQuotaRequest.getIncludeFamilyBenefit();
        return includeFamilyBenefit != null ? includeFamilyBenefit.equals(includeFamilyBenefit2) : includeFamilyBenefit2 == null;
    }

    @Generated
    public Boolean getIncludeFamilyBenefit() {
        return this.includeFamilyBenefit;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Boolean includeFamilyBenefit = getIncludeFamilyBenefit();
        return (hashCode * 59) + (includeFamilyBenefit == null ? 43 : includeFamilyBenefit.hashCode());
    }

    @Generated
    public void setIncludeFamilyBenefit(Boolean bool) {
        this.includeFamilyBenefit = bool;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public String toString() {
        return "GetQuotaRequest(includeFamilyBenefit=" + getIncludeFamilyBenefit() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
