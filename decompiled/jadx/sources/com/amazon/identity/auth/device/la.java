package com.amazon.identity.auth.device;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class la {
    public static volatile la b;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f786a = new ConcurrentHashMap();

    public static synchronized la a() {
        la laVar;
        synchronized (la.class) {
            try {
                if (b == null) {
                    b = new la();
                }
                laVar = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return laVar;
    }
}
