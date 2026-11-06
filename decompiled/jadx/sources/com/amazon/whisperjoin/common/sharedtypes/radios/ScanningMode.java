package com.amazon.whisperjoin.common.sharedtypes.radios;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum ScanningMode {
    PROHIBITED(0),
    LOW_POWER_HIGH_LATENCY(1),
    BALANCED(2),
    HIGH_POWER_LOW_LATENCY(3);

    private final int mValue;

    ScanningMode(int i) {
        this.mValue = i;
    }

    public static ScanningMode getFromValue(int i) {
        for (ScanningMode scanningMode : values()) {
            if (scanningMode.mValue == i) {
                return scanningMode;
            }
        }
        return null;
    }
}
