package com.amazon.alexa.feature.consumer.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum Treatment {
    C,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9;

    @Nullable
    public static Treatment fromString(@Nullable String str) {
        if (str != null && !str.isEmpty()) {
            try {
                return valueOf(str.toUpperCase());
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public boolean isInExperiment() {
        return this != C;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return name();
    }
}
