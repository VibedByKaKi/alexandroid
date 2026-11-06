package com.amazon.alexa.seamlessswitching.capability.model;

import androidx.annotation.Nullable;
import com.amazon.alexa.seamlessswitching.capability.model.AutoValue_AlexaDevice;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes19.dex */
public abstract class AlexaDevice {
    public static AlexaDevice create(DeviceType deviceType, DeviceSerialNumber deviceSerialNumber) {
        return new AutoValue_AlexaDevice(null, DeviceInfo.create(deviceType, deviceSerialNumber));
    }

    public static TypeAdapter<AlexaDevice> typeAdapter(Gson gson) {
        return new AutoValue_AlexaDevice.GsonTypeAdapter(gson);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AlexaDevice) {
            return getDeviceInfo().equals(((AlexaDevice) obj).getDeviceInfo());
        }
        return false;
    }

    public abstract DeviceInfo getDeviceInfo();

    @Nullable
    public abstract FriendlyName getFriendlyName();

    public int hashCode() {
        return getDeviceInfo().hashCode() ^ 1000003;
    }

    public static AlexaDevice create(FriendlyName friendlyName, DeviceInfo deviceInfo) {
        return new AutoValue_AlexaDevice(friendlyName, deviceInfo);
    }
}
