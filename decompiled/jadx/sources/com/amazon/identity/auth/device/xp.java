package com.amazon.identity.auth.device;

import android.util.Log;
import com.amazon.identity.auth.device.api.Callback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class xp {

    /* renamed from: a, reason: collision with root package name */
    public final Callback f1077a;
    public final yp b;
    public final /* synthetic */ zp c;

    public xp(zp zpVar, yp ypVar, Callback callback) {
        this.c = zpVar;
        this.f1077a = callback;
        this.b = ypVar;
    }

    public void a() {
        Log.i(yf.a("TokenJobQueue"), a0.a("Finish executing task ", this.b.a(), "."));
    }

    public abstract void b();
}
