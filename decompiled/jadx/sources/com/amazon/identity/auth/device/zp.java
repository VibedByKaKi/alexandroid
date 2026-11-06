package com.amazon.identity.auth.device;

import android.os.Build;
import android.util.Log;
import com.amazon.identity.auth.device.api.Callback;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class zp {
    public static final long e = 120000;
    public static zp f;
    public xp c;
    public final AtomicLong d = new AtomicLong(0);
    public final fh b = new fh("MAPTokenOperationThreadPool");

    /* renamed from: a, reason: collision with root package name */
    public final Queue f1114a = new ArrayDeque();

    public final synchronized void a() {
        try {
            yf.a("TokenJobQueue");
            String str = Build.TYPE;
            "user".equalsIgnoreCase(str);
            xp xpVar = (xp) ((ArrayDeque) this.f1114a).poll();
            this.c = xpVar;
            if (xpVar != null) {
                xpVar.b.a();
                yf.a("TokenJobQueue");
                "user".equalsIgnoreCase(str);
                xp xpVar2 = this.c;
                Log.i(yf.a("TokenJobQueue"), "Begin executing task " + xpVar2.b.a());
                vp vpVar = new vp(xpVar2);
                try {
                    hp.b.get();
                    xpVar2.c.b.execute(new wp(xpVar2, vpVar));
                    yf.a("TokenJobQueue");
                    "user".equalsIgnoreCase(str);
                    xpVar2.b();
                } catch (Throwable th) {
                    yf.a("TokenJobQueue");
                    "user".equalsIgnoreCase(Build.TYPE);
                    xpVar2.b();
                    throw th;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(yp ypVar, Callback callback) {
        xp upVar;
        try {
            ypVar.a();
            yf.a("TokenJobQueue");
            String str = Build.TYPE;
            "user".equalsIgnoreCase(str);
            Queue queue = this.f1114a;
            if (ypVar.b()) {
                upVar = new tp(this, ypVar, callback);
            } else {
                upVar = new up(this, ypVar, callback);
            }
            ((ArrayDeque) queue).offer(upVar);
            ((ArrayDeque) this.f1114a).size();
            yf.a("TokenJobQueue");
            "user".equalsIgnoreCase(str);
            if (this.c == null) {
                yf.a("TokenJobQueue");
                "user".equalsIgnoreCase(str);
                a();
            }
        } catch (Throwable th) {
            if (this.c == null) {
                yf.a("TokenJobQueue");
                "user".equalsIgnoreCase(Build.TYPE);
                a();
            }
            throw th;
        }
    }
}
