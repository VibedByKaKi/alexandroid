package com.amazon.clouddrive.cdasdk.cds.account;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest;
import com.amazon.clouddrive.cdasdk.cds.common.PreferenceKey;
import com.dee.app.contacts.common.network.gateway.PreferenceServiceGateway;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SetPersonalPreferenceRequest extends CloudDriveRequest {

    @SerializedName(PreferenceServiceGateway.PREFERENCE_KEY)
    @Expose
    private PreferenceKey preferenceKey;

    @SerializedName(PreferenceServiceGateway.PREFERENCE_VALUE)
    @Expose
    private String preferenceValue;

    @Generated
    public SetPersonalPreferenceRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof SetPersonalPreferenceRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetPersonalPreferenceRequest)) {
            return false;
        }
        SetPersonalPreferenceRequest setPersonalPreferenceRequest = (SetPersonalPreferenceRequest) obj;
        if (!setPersonalPreferenceRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        PreferenceKey preferenceKey = getPreferenceKey();
        PreferenceKey preferenceKey2 = setPersonalPreferenceRequest.getPreferenceKey();
        if (preferenceKey != null ? !preferenceKey.equals(preferenceKey2) : preferenceKey2 != null) {
            return false;
        }
        String preferenceValue = getPreferenceValue();
        String preferenceValue2 = setPersonalPreferenceRequest.getPreferenceValue();
        return preferenceValue != null ? preferenceValue.equals(preferenceValue2) : preferenceValue2 == null;
    }

    @Generated
    public PreferenceKey getPreferenceKey() {
        return this.preferenceKey;
    }

    @Generated
    public String getPreferenceValue() {
        return this.preferenceValue;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        PreferenceKey preferenceKey = getPreferenceKey();
        int i = hashCode * 59;
        int hashCode2 = preferenceKey == null ? 43 : preferenceKey.hashCode();
        String preferenceValue = getPreferenceValue();
        return ((i + hashCode2) * 59) + (preferenceValue != null ? preferenceValue.hashCode() : 43);
    }

    @Generated
    public void setPreferenceKey(PreferenceKey preferenceKey) {
        this.preferenceKey = preferenceKey;
    }

    @Generated
    public void setPreferenceValue(String str) {
        this.preferenceValue = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public String toString() {
        return "SetPersonalPreferenceRequest(preferenceKey=" + getPreferenceKey() + ", preferenceValue=" + getPreferenceValue() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
