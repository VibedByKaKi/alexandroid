package com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model;

import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.AutoValue_DeviceIdentifier;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.auto.value.AutoValue;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@JsonDeserialize(builder = AutoValue_DeviceIdentifier.Builder.class)
@JsonSerialize(as = DeviceIdentifier.class)
/* loaded from: classes16.dex */
public abstract class DeviceIdentifier {
    private static final String DEVICE_SERIAL_NUMBER_KEY = "deviceSerialNumber";
    private static final String DEVICE_TYPE_KEY = "deviceType";
    public static final Factory FACTORY = new Factory();
    public static final String REFERENCE = "@ref";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract DeviceIdentifier build();

        @JsonProperty("deviceSerialNumber")
        public abstract Builder setDeviceSerialNumber(String str);

        @JsonProperty("deviceType")
        public abstract Builder setDeviceType(String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Factory implements JsonObjectSerializable.Factory<DeviceIdentifier> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable.Factory
        public DeviceIdentifier create(JSONObject jSONObject) throws JSONException {
            Preconditions.notNull(jSONObject, "jsonObject");
            return DeviceIdentifier.builder().setDeviceSerialNumber(jSONObject.getString("deviceSerialNumber")).setDeviceType(jSONObject.getString("deviceType")).build();
        }
    }

    public static Builder builder() {
        return new AutoValue_DeviceIdentifier.Builder();
    }

    @JsonProperty("deviceSerialNumber")
    public abstract String getDeviceSerialNumber();

    @JsonProperty("deviceType")
    public abstract String getDeviceType();
}
