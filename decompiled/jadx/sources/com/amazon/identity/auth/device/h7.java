package com.amazon.identity.auth.device;

import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class h7 {
    public static h7 b;

    /* renamed from: a, reason: collision with root package name */
    public final int f696a = 130050002;

    public static synchronized h7 a() {
        synchronized (h7.class) {
            h7 h7Var = b;
            if (h7Var != null) {
                return h7Var;
            }
            h7 h7Var2 = new h7();
            b = h7Var2;
            return h7Var2;
        }
    }

    public final String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder(), this.f696a, " / MAPAndroidLib-1.1.380301.0");
    }
}
