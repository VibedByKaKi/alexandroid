package com.amazon.alexa.accessory.speech.events.model;

import com.amazon.alexa.accessory.speech.events.model.AutoValue_DeviceInfo;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes16.dex */
public abstract class DeviceInfo {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract DeviceInfo build();

        public abstract Builder setDeviceSerialNumber(String str);

        public abstract Builder setDeviceType(String str);
    }

    public static Builder builder() {
        return new AutoValue_DeviceInfo.Builder();
    }

    public abstract String getDeviceSerialNumber();

    public abstract String getDeviceType();
}
