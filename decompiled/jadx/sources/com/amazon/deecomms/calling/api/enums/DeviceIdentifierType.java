package com.amazon.deecomms.calling.api.enums;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum DeviceIdentifierType {
    DeviceGruu("devicegruu");

    private final String value;

    DeviceIdentifierType(String str) {
        this.value = str;
    }

    public static boolean isValidEnum(@NonNull String str) {
        for (DeviceIdentifierType deviceIdentifierType : (DeviceIdentifierType[]) DeviceIdentifierType.class.getEnumConstants()) {
            if (deviceIdentifierType.toString().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.value;
    }
}
