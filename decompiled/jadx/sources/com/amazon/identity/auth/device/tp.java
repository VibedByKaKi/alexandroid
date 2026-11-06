package com.amazon.identity.auth.device;

import android.os.Build;
import android.util.Log;
import com.amazon.identity.auth.device.api.Callback;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class tp extends xp {
    public final bp d;
    public final /* synthetic */ zp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp(zp zpVar, yp ypVar, Callback callback) {
        super(zpVar, ypVar, callback);
        bp bpVar = new bp();
        this.e = zpVar;
        this.d = bpVar;
        zpVar.d.set(new Date().getTime());
    }

    @Override // com.amazon.identity.auth.device.xp
    public final void a() {
        super.a();
        yf.a("TokenJobQueue");
        String str = Build.TYPE;
        "user".equalsIgnoreCase(str);
        bp bpVar = this.d;
        synchronized (bpVar) {
            bpVar.f547a.cancel();
            bpVar.b = true;
        }
        if (this.d.a()) {
            return;
        }
        this.d.b();
        this.b.a();
        yf.a("TokenJobQueue");
        "user".equalsIgnoreCase(str);
        this.e.a();
    }

    @Override // com.amazon.identity.auth.device.xp
    public final void b() {
        this.b.a();
        yf.a("TokenJobQueue");
        "user".equalsIgnoreCase(Build.TYPE);
        bp bpVar = this.d;
        sp spVar = new sp(this);
        long j = zp.e;
        synchronized (bpVar) {
            Log.i(yf.a("TaskScheduler"), "Schedule a delayed task");
            if (bpVar.b) {
                Log.i(yf.a("TaskScheduler"), "The timer has been canceled, skip scheduling");
            } else {
                bpVar.f547a.schedule(spVar, j);
            }
        }
    }
}
