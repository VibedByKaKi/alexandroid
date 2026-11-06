package com.amazon.identity.auth.device;

import android.util.Log;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ye {

    /* renamed from: a, reason: collision with root package name */
    public final List f1090a;
    public final boolean b;

    public ye(List list, boolean z) {
        this.f1090a = list;
        this.b = z;
    }

    public final List a() {
        if (g8.a(this.f1090a)) {
            Log.i(yf.a("MAPCookieManager"), "Cached cookies are empty");
        }
        return this.f1090a;
    }
}
