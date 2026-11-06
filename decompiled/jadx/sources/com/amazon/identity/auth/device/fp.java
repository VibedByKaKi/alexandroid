package com.amazon.identity.auth.device;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class fp {

    /* renamed from: a, reason: collision with root package name */
    public static final fh f623a = new fh("MAPCommonThreadPool");
    public static final Object[] b = new Object[0];
    public static Handler c;

    public static Handler a() {
        synchronized (b) {
            try {
                Handler handler = c;
                if (handler != null) {
                    return handler;
                }
                new ep().start();
                return c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean b() {
        return Looper.getMainLooper() != null && Looper.getMainLooper() == Looper.myLooper();
    }

    public static void b(Runnable runnable) {
        hp.b.get();
        f623a.execute(new dp(runnable));
    }

    public static void a(Runnable runnable) {
        if (!b()) {
            runnable.run();
        } else {
            b(runnable);
        }
    }
}
