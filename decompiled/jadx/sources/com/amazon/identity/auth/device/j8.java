package com.amazon.identity.auth.device;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.amazon.identity.auth.device.framework.RemoteMAPException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class j8 {
    public static final long e = 15000;
    public static j8 f;

    /* renamed from: a, reason: collision with root package name */
    public final tn f743a;
    public final v9 b;
    public final CountDownLatch c;
    public final AtomicBoolean d;

    public j8(Context context) {
        tn a2 = tn.a(context);
        this.f743a = a2;
        this.b = ((x9) a2.getSystemService("dcp_data_storage_factory")).a();
        this.c = new CountDownLatch(1);
        this.d = new AtomicBoolean(false);
    }

    public final void a() {
        int i;
        Integer num;
        if (u7.b(this.f743a)) {
            h8.b(this.f743a).a();
            Locale locale = Locale.US;
            Log.i(yf.a("CommonInfoGetter"), "Central model has no race conditions in terms of common info and hence can be generated locally. Generated version 1");
            return;
        }
        String c = this.b.c("dcp.third.party.device.state", "info.version");
        yf.a("CommonInfoGenerator");
        "user".equalsIgnoreCase(Build.TYPE);
        try {
            i = Integer.parseInt(c);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        if (i >= 1) {
            Locale locale2 = Locale.US;
            yf.a("CommonInfoGetter");
            "user".equalsIgnoreCase(Build.TYPE);
            return;
        }
        this.f743a.getPackageName();
        yf.a("CommonInfoGetter");
        "user".equalsIgnoreCase(Build.TYPE);
        Iterator it2 = pe.a(this.f743a).b().iterator();
        while (true) {
            if (!it2.hasNext()) {
                Log.e(yf.a("CommonInfoGetter"), "Cannot find other package to generate common info from.");
                num = null;
                break;
            }
            qm qmVar = (qm) it2.next();
            yf.a("Calling Package %s to generate common info", qmVar.b);
            try {
                qmVar.toString();
                yf.a("CommonInfoGetter");
                "user".equalsIgnoreCase(Build.TYPE);
                num = Integer.valueOf(qmVar.b());
                break;
            } catch (RemoteMAPException e2) {
                Log.w(yf.a("CommonInfoGetter"), "Failed to initialize common info from " + qmVar.b, e2);
                pe.a(this.f743a).c();
            }
        }
        if (num == null || num.intValue() < 1) {
            Locale locale3 = Locale.US;
            Log.e(yf.a("CommonInfoGetter"), a0.a("The main MAP app cannot generate version high enough to function properly. We need version 1 or higher, but got ", num != null ? Integer.toString(num.intValue()) : "<Not Found>", "."));
        }
    }

    public final void b() {
        if (this.d.getAndSet(true)) {
            Log.i(yf.a("CommonInfoGetter"), "Common Data has already been initialized");
            return;
        }
        tn tnVar = this.f743a;
        if (!u7.b(tnVar) || u7.d(tnVar)) {
            yf.a("CommonInfoGetter");
            "user".equalsIgnoreCase(Build.TYPE);
            fp.b(new i8(this));
        } else {
            yf.a("CommonInfoGetter");
            String str = Build.TYPE;
            "user".equalsIgnoreCase(str);
            yf.a("CommonInfoGetter");
            "user".equalsIgnoreCase(str);
        }
    }

    public final void c() {
        if (!this.d.get()) {
            Log.i(yf.a("CommonInfoGetter"), "Common Info Generator not initialized yet, starting init");
            b();
        }
        try {
            if (this.c.await(e, TimeUnit.MILLISECONDS)) {
                return;
            }
            Log.e(yf.a("CommonInfoGetter"), "We timed out waiting for common info to be generated");
        } catch (InterruptedException e2) {
            Log.e(yf.a("CommonInfoGetter"), "We were interrupted waiting for common info to be generated", e2);
        }
    }

    public static synchronized j8 b(Context context) {
        j8 j8Var;
        synchronized (j8.class) {
            try {
                if (f == null) {
                    f = new j8(context.getApplicationContext());
                }
                j8Var = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j8Var;
    }

    public static synchronized void a(Context context) {
        synchronized (j8.class) {
            f = new j8(context.getApplicationContext());
        }
    }
}
