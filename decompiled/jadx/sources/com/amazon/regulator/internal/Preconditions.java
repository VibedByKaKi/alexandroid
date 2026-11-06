package com.amazon.regulator.internal;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class Preconditions {
    private Preconditions() {
        throw new UnsupportedOperationException("No instances!");
    }

    public static void nonNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(str);
    }
}
