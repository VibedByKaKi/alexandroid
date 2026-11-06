package com.amazon.alexa.accessorykit.findmy.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_SettingRequest extends SettingRequest {
    private final String accountId;
    private final String deviceType;

    public AutoValue_SettingRequest(String str, String str2) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null accountId");
            throw null;
        }
        this.accountId = str;
        if (str2 != null) {
            this.deviceType = str2;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null deviceType");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SettingRequest) {
            SettingRequest settingRequest = (SettingRequest) obj;
            if (this.accountId.equals(settingRequest.getAccountId()) && this.deviceType.equals(settingRequest.getDeviceType())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.setting.SettingRequest
    @JsonProperty("accountId")
    public String getAccountId() {
        return this.accountId;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.setting.SettingRequest
    @JsonProperty("deviceType")
    public String getDeviceType() {
        return this.deviceType;
    }

    public int hashCode() {
        return this.deviceType.hashCode() ^ ((this.accountId.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SettingRequest{accountId=");
        sb.append(this.accountId);
        sb.append(", deviceType=");
        return a$$ExternalSyntheticOutline0.m(sb, this.deviceType, StringSubstitutor.DEFAULT_VAR_END);
    }
}
