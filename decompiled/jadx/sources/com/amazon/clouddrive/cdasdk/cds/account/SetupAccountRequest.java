package com.amazon.clouddrive.cdasdk.cds.account;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SetupAccountRequest extends CloudDriveRequest {

    @SerializedName("overrideMarketplaceId")
    @Expose
    private String overrideMarketplaceId;

    @SerializedName("termsOfUse")
    @Expose
    private String termsOfUse;

    @Generated
    public SetupAccountRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof SetupAccountRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetupAccountRequest)) {
            return false;
        }
        SetupAccountRequest setupAccountRequest = (SetupAccountRequest) obj;
        if (!setupAccountRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String termsOfUse = getTermsOfUse();
        String termsOfUse2 = setupAccountRequest.getTermsOfUse();
        if (termsOfUse != null ? !termsOfUse.equals(termsOfUse2) : termsOfUse2 != null) {
            return false;
        }
        String overrideMarketplaceId = getOverrideMarketplaceId();
        String overrideMarketplaceId2 = setupAccountRequest.getOverrideMarketplaceId();
        return overrideMarketplaceId != null ? overrideMarketplaceId.equals(overrideMarketplaceId2) : overrideMarketplaceId2 == null;
    }

    @Generated
    public String getOverrideMarketplaceId() {
        return this.overrideMarketplaceId;
    }

    @Generated
    public String getTermsOfUse() {
        return this.termsOfUse;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String termsOfUse = getTermsOfUse();
        int i = hashCode * 59;
        int hashCode2 = termsOfUse == null ? 43 : termsOfUse.hashCode();
        String overrideMarketplaceId = getOverrideMarketplaceId();
        return ((i + hashCode2) * 59) + (overrideMarketplaceId != null ? overrideMarketplaceId.hashCode() : 43);
    }

    @Generated
    public void setOverrideMarketplaceId(String str) {
        this.overrideMarketplaceId = str;
    }

    @Generated
    public void setTermsOfUse(String str) {
        this.termsOfUse = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public String toString() {
        return "SetupAccountRequest(termsOfUse=" + getTermsOfUse() + ", overrideMarketplaceId=" + getOverrideMarketplaceId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
