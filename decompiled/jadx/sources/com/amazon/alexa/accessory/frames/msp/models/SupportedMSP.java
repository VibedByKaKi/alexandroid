package com.amazon.alexa.accessory.frames.msp.models;

import androidx.annotation.Nullable;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public enum SupportedMSP {
    AMAZON_MUSIC("Amazon Music", "amzm"),
    APPLE_MUSIC("Apple Music", "appl"),
    PANDORA("Pandora", "pand"),
    SPOTIFY("Spotify", "spot"),
    FALLBACK("Fallback", "fallback");

    public String metricId;
    public String name;

    SupportedMSP(String str, String str2) {
        this.name = str;
        this.metricId = str2;
    }

    @Nullable
    public static SupportedMSP fromString(String str) {
        for (SupportedMSP supportedMSP : values()) {
            if (supportedMSP.name.equals(str)) {
                return supportedMSP;
            }
        }
        return FALLBACK;
    }

    public String getMetricId() {
        return this.metricId;
    }

    public String getMetricName() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder(), this.metricId, "_msp");
    }

    public String getName() {
        return this.name;
    }
}
