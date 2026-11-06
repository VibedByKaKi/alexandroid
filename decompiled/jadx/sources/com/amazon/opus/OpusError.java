package com.amazon.opus;

import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class OpusError extends RuntimeException {
    public OpusError() {
    }

    public static int throwIfError(int i) {
        if (i >= 0) {
            return i;
        }
        throw new OpusError(a$$ExternalSyntheticOutline0.m(i, "Error from codec: "));
    }

    public OpusError(String str) {
        super(str);
    }
}
