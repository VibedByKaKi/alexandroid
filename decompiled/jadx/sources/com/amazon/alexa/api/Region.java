package com.amazon.alexa.api;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum Region {
    UNKNOWN,
    EU,
    FE,
    NA,
    CN;

    public static Region fromString(@Nullable String str) {
        for (Region region : values()) {
            if (region.name().equals(str)) {
                return region;
            }
        }
        return UNKNOWN;
    }
}
