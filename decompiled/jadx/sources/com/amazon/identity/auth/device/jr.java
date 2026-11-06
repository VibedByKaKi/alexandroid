package com.amazon.identity.auth.device;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class jr {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f758a = new AtomicBoolean(false);

    public static void a(Context context, String str, String[] strArr) {
        a(context);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        for (String str2 : strArr) {
            cookieManager.setCookie(str, str2);
        }
        CookieSyncManager.getInstance().sync();
    }

    public static void a(Context context) {
        if (f758a.compareAndSet(false, true)) {
            CookieSyncManager.createInstance(context.getApplicationContext());
        }
        CookieSyncManager.getInstance().sync();
    }
}
