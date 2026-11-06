package com.amazon.deecomms.calling.enums;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum AudioRoutes {
    EARPIECE("Earpiece"),
    SPEAKER("Speaker"),
    WIREDHEADSET("Wired Headset"),
    BLUETOOTH("Bluetooth");

    public static final String WIRED_HEADSET = "WIRED_HEADSET";
    private String name;

    AudioRoutes(@NonNull String str) {
        this.name = str;
    }

    public static boolean isValidEnum(@NonNull String str) {
        for (AudioRoutes audioRoutes : (AudioRoutes[]) AudioRoutes.class.getEnumConstants()) {
            if (audioRoutes.toString().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.name;
    }
}
