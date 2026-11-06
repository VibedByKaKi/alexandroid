package com.amazon.alexa.seamlessswitching.capability.model;

import com.amazon.alexa.seamlessswitching.capability.model.StronglyTypedString;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes19.dex */
public abstract class DeviceSerialNumber implements StronglyTypedString {
    public static DeviceSerialNumber create(String str) {
        return new AutoValue_DeviceSerialNumber(str);
    }

    public static StronglyTypedString.StronglyTypedStringAdapter<DeviceSerialNumber> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<DeviceSerialNumber>() { // from class: com.amazon.alexa.seamlessswitching.capability.model.DeviceSerialNumber.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.seamlessswitching.capability.model.StronglyTypedString.StronglyTypedStringAdapter
            public DeviceSerialNumber instantiate(String str) {
                return DeviceSerialNumber.create(str);
            }
        };
    }
}
