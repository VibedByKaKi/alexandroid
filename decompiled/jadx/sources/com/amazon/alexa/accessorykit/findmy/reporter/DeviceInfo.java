package com.amazon.alexa.accessorykit.findmy.reporter;

import com.amazon.alexa.accessorykit.findmy.reporter.AutoValue_DeviceInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@JsonDeserialize(builder = AutoValue_DeviceInfo.Builder.class)
@JsonSerialize(as = DeviceInfo.class)
/* loaded from: classes16.dex */
public abstract class DeviceInfo {
    private static final String DEVICE_TYPE_KEY = "deviceType";
    private static final String DSN_KEY = "deviceSerialNumber";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract DeviceInfo build();

        @JsonProperty("deviceSerialNumber")
        public abstract Builder setDeviceSerialNumber(String str);

        @JsonProperty("deviceType")
        public abstract Builder setDeviceType(String str);
    }

    public static Builder builder() {
        return new AutoValue_DeviceInfo.Builder();
    }

    @JsonProperty("deviceSerialNumber")
    public abstract String getDeviceSerialNumber();

    @JsonProperty("deviceType")
    public abstract String getDeviceType();
}
