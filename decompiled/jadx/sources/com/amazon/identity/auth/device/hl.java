package com.amazon.identity.auth.device;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class hl {

    /* renamed from: a, reason: collision with root package name */
    public final Context f707a;

    public hl(Context context) {
        this.f707a = context;
    }

    public final boolean a() {
        return Build.VERSION.SDK_INT >= 30 && gl.i(this.f707a);
    }

    public final boolean b() {
        if (!gl.i(this.f707a)) {
            return false;
        }
        UserManager userManager = (UserManager) this.f707a.getSystemService("user");
        if (userManager == null) {
            Log.e(yf.a("PlatformWrapper"), "Cannot get UserManager while the OS supports direct boot!");
            return false;
        }
        boolean z = !userManager.isUserUnlocked();
        yf.a("PlatformWrapper");
        "user".equalsIgnoreCase(Build.TYPE);
        return z;
    }
}
