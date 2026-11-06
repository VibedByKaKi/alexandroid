package com.amazon.identity.auth.device;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class mq {

    /* renamed from: a, reason: collision with root package name */
    public static mq f818a;

    public static synchronized mq a() {
        mq mqVar;
        synchronized (mq.class) {
            try {
                if (f818a == null) {
                    f818a = new mq();
                }
                mqVar = f818a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mqVar;
    }
}
