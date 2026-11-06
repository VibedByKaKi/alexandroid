package com.amazon.identity.auth.device;

import android.content.ComponentName;
import android.os.IBinder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class xo implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComponentName f1076a;
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ yo c;

    public xo(yo yoVar, ComponentName componentName, IBinder iBinder) {
        this.c = yoVar;
        this.f1076a = componentName;
        this.b = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.h.useService(this.f1076a, this.b);
    }
}
