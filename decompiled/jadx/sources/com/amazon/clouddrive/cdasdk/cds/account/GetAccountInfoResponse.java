package com.amazon.clouddrive.cdasdk.cds.account;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetAccountInfoResponse {

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("termsOfUse")
    @Expose
    private String termsOfUse;

    @Generated
    public GetAccountInfoResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GetAccountInfoResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAccountInfoResponse)) {
            return false;
        }
        GetAccountInfoResponse getAccountInfoResponse = (GetAccountInfoResponse) obj;
        if (!getAccountInfoResponse.canEqual(this)) {
            return false;
        }
        String status = getStatus();
        String status2 = getAccountInfoResponse.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        String termsOfUse = getTermsOfUse();
        String termsOfUse2 = getAccountInfoResponse.getTermsOfUse();
        return termsOfUse != null ? termsOfUse.equals(termsOfUse2) : termsOfUse2 == null;
    }

    @Generated
    public String getStatus() {
        return this.status;
    }

    @Generated
    public String getTermsOfUse() {
        return this.termsOfUse;
    }

    @Generated
    public int hashCode() {
        String status = getStatus();
        int hashCode = status == null ? 43 : status.hashCode();
        String termsOfUse = getTermsOfUse();
        return ((hashCode + 59) * 59) + (termsOfUse != null ? termsOfUse.hashCode() : 43);
    }

    @Generated
    public void setStatus(String str) {
        this.status = str;
    }

    @Generated
    public void setTermsOfUse(String str) {
        this.termsOfUse = str;
    }

    @Generated
    public String toString() {
        return "GetAccountInfoResponse(status=" + getStatus() + ", termsOfUse=" + getTermsOfUse() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
