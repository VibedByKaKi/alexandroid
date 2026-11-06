package com.amazonaws.mobileconnectors.remoteconfiguration.internal.gear;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class Checks {
    private Checks() {
    }

    public static void checkArgument(boolean z, String str) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(str);
    }

    public static void checkNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(str);
    }
}
