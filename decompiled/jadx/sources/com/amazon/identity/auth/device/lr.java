package com.amazon.identity.auth.device;

import android.content.Context;
import android.util.Log;
import com.amazon.identity.mobi.whatsappautoread.api.WhatsAppAutoreadPlugin;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class lr {

    /* renamed from: a, reason: collision with root package name */
    public static final List f797a = Arrays.asList("in.amazon.mShop.android.shopping", "com.amazon.mShop.android.shopping");
    public static boolean b;
    public static lr c;

    public static synchronized boolean b(Context context) {
        synchronized (lr.class) {
            if (f797a.contains(context.getPackageName())) {
                b = true;
                return true;
            }
            Log.w(yf.a("WhatsAppAutoreadPluginHelper"), "WhatsAppAutoreadPlugin is not supported for this package: " + context.getPackageName());
            b = false;
            return false;
        }
    }

    public final synchronized void a(Context context) {
        if (b(context.getApplicationContext())) {
            if (WhatsAppAutoreadPlugin.getInstance() != null) {
                Log.i(yf.a("WhatsAppAutoreadPluginHelper"), "WhatsApp Autoread Plugin has already been initialized.");
                return;
            }
            kr krVar = new kr();
            Log.i(yf.a("WhatsAppAutoreadPluginHelper"), "Initializing WhatsApp Autoread Plugin");
            WhatsAppAutoreadPlugin.init(krVar);
        }
    }

    public static synchronized lr a() {
        lr lrVar;
        synchronized (lr.class) {
            try {
                if (c == null) {
                    c = new lr();
                }
                lrVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lrVar;
    }
}
