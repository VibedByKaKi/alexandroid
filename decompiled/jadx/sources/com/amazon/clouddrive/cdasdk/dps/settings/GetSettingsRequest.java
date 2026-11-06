package com.amazon.clouddrive.cdasdk.dps.settings;

import com.amazon.alexa.cam.client.CamServiceClient;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.dps.common.DPSRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetSettingsRequest extends DPSRequest {

    @SerializedName(CamServiceClient.QUERY_PRINCIPAL_ID)
    @Expose
    private String principalId;

    @SerializedName("principalType")
    @Expose
    private String principalType;

    @Generated
    public GetSettingsRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GetSettingsRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetSettingsRequest)) {
            return false;
        }
        GetSettingsRequest getSettingsRequest = (GetSettingsRequest) obj;
        if (!getSettingsRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String principalType = getPrincipalType();
        String principalType2 = getSettingsRequest.getPrincipalType();
        if (principalType != null ? !principalType.equals(principalType2) : principalType2 != null) {
            return false;
        }
        String principalId = getPrincipalId();
        String principalId2 = getSettingsRequest.getPrincipalId();
        return principalId != null ? principalId.equals(principalId2) : principalId2 == null;
    }

    @Generated
    public String getPrincipalId() {
        return this.principalId;
    }

    @Generated
    public String getPrincipalType() {
        return this.principalType;
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String principalType = getPrincipalType();
        int i = hashCode * 59;
        int hashCode2 = principalType == null ? 43 : principalType.hashCode();
        String principalId = getPrincipalId();
        return ((i + hashCode2) * 59) + (principalId != null ? principalId.hashCode() : 43);
    }

    @Generated
    public void setPrincipalId(String str) {
        this.principalId = str;
    }

    @Generated
    public void setPrincipalType(String str) {
        this.principalType = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.dps.common.DPSRequest
    @Generated
    public String toString() {
        return "GetSettingsRequest(principalType=" + getPrincipalType() + ", principalId=" + getPrincipalId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
