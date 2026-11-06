package com.amazon.alexa.accessorykit.findmy.setting;

import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.auto.value.AutoValue;
import defpackage.a$$ExternalSyntheticOutline0;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@JsonSerialize(as = SettingResponse.class)
/* loaded from: classes16.dex */
public abstract class SettingResponse {
    public static final Factory FACTORY = new Factory();
    private static final String SETTING_VALUE_KEY = "settingValue";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Enablement {
        ENABLED("\"ENABLED\""),
        DISABLED("\"DISABLED\"");

        private String value;

        Enablement(String str) {
            this.value = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Enablement fromString(String str) {
            Preconditions.notEmpty(str, "value");
            for (Enablement enablement : values()) {
                if (enablement.value.equalsIgnoreCase(str)) {
                    return enablement;
                }
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Invalid Enablement value. No Enablement value found for:", str));
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Factory implements JsonObjectSerializable.Factory<SettingResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable.Factory
        public SettingResponse create(JSONObject jSONObject) throws JSONException {
            return SettingResponse.create(Enablement.fromString(jSONObject.getString("value")));
        }
    }

    @JsonCreator
    public static SettingResponse create(Enablement enablement) {
        return new AutoValue_SettingResponse(enablement);
    }

    @JsonProperty(SETTING_VALUE_KEY)
    public abstract Enablement getSettingValue();
}
