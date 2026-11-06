package com.amazon.alexa.utils.validation;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class Preconditions {
    private Preconditions() {
        throw new UnsupportedOperationException();
    }

    public static void isFalse(boolean z, String str) {
        if (z) {
            Single$$ExternalSyntheticBUOutline0.m$3(str);
        }
    }

    public static void notNull(Object obj, String str) {
        isFalse(obj == null, str);
    }
}
