package com.amazon.alexa.handsfree.protocols.utils;

import androidx.annotation.Nullable;
import java.util.Locale;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z, @Nullable String str) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(str);
    }

    public static void checkInRange(int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            Single$$ExternalSyntheticBUOutline0.m$3(String.format(Locale.getDefault(), "Expected a value between %d and %d", Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    public static void checkValidRange(int i, int i2) {
        if (i < i2) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(String.format(Locale.getDefault(), "%d should be < %d", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void checkArgument(boolean z) {
        checkArgument(z, null);
    }
}
