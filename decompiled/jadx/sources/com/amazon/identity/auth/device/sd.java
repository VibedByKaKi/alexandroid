package com.amazon.identity.auth.device;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.amazon.identity.mobi.lwasso.api.LWASSOPlugin;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class sd {

    /* renamed from: a, reason: collision with root package name */
    public static volatile Boolean f937a;
    public static sd b;

    public sd(Context context) {
    }

    public static synchronized boolean b() {
        synchronized (sd.class) {
            if (f937a != null) {
                return f937a.booleanValue();
            }
            try {
                Class.forName("com.amazon.identity.mobi.lwasso.api.LWASSOPlugin");
                yf.a("LWASSOPluginHelper");
                "user".equalsIgnoreCase(Build.TYPE);
                f937a = Boolean.TRUE;
                return true;
            } catch (ClassNotFoundException unused) {
                f937a = Boolean.FALSE;
                return false;
            }
        }
    }

    public final synchronized void a() {
        if (b()) {
            LWASSOPlugin.init(new rd());
            Log.i(yf.a("LWASSOPluginHelper"), "LWASSOPluginHelper initialized successfully with dependency injection");
        }
    }

    public static synchronized sd a(Context context) {
        sd sdVar;
        synchronized (sd.class) {
            try {
                if (b == null) {
                    b = new sd(context.getApplicationContext());
                }
                sdVar = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sdVar;
    }
}
