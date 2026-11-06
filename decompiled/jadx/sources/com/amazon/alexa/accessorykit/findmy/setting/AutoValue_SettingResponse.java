package com.amazon.alexa.accessorykit.findmy.setting;

import com.amazon.alexa.accessorykit.findmy.setting.SettingResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_SettingResponse extends SettingResponse {
    private final SettingResponse.Enablement settingValue;

    public AutoValue_SettingResponse(SettingResponse.Enablement enablement) {
        if (enablement != null) {
            this.settingValue = enablement;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null settingValue");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SettingResponse) {
            return this.settingValue.equals(((SettingResponse) obj).getSettingValue());
        }
        return false;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.setting.SettingResponse
    @JsonProperty("settingValue")
    public SettingResponse.Enablement getSettingValue() {
        return this.settingValue;
    }

    public int hashCode() {
        return this.settingValue.hashCode() ^ 1000003;
    }

    public String toString() {
        return "SettingResponse{settingValue=" + this.settingValue + StringSubstitutor.DEFAULT_VAR_END;
    }
}
