package com.amazon.identity.auth.device;

import android.os.Build;
import java.util.TimerTask;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class sp extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tp f947a;

    public sp(tp tpVar) {
        this.f947a = tpVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        bp bpVar = this.f947a.d;
        synchronized (bpVar) {
            bpVar.c = true;
        }
        yf.a("TokenJobQueue");
        "user".equalsIgnoreCase(Build.TYPE);
        this.f947a.e.a();
    }
}
