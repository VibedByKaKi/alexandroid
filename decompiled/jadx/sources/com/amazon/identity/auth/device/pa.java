package com.amazon.identity.auth.device;

import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class pa {

    /* renamed from: a, reason: collision with root package name */
    public static u3 f875a;

    public static synchronized u3 a(Context context) {
        u3 u3Var;
        synchronized (pa.class) {
            try {
                if (f875a == null) {
                    f875a = na.a(context).f829a;
                }
                u3Var = f875a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return u3Var;
    }
}
