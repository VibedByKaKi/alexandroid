package com.amazon.identity.auth.device;

import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class na {
    public static volatile na c;

    /* renamed from: a, reason: collision with root package name */
    public final u3 f829a;
    public final ma b;

    public na(Context context) {
        c cVar;
        boolean a2 = gl.a(context, ia.d);
        if (a2 && gl.a(u7.a(context))) {
            this.f829a = new u3(context);
            this.b = new oa(new ia(tn.a(context)), context);
            return;
        }
        if (gl.g(context) || !u7.b(context)) {
            if (gl.a(context, ra.f915a)) {
                this.f829a = new w3(context);
                this.b = ka.a(context);
                return;
            } else {
                this.f829a = new u3(context);
                this.b = ka.a(context);
                return;
            }
        }
        synchronized (c.class) {
            try {
                if (c.i == null) {
                    c.i = new c(context.getApplicationContext(), a2);
                }
                cVar = c.i;
            } catch (Throwable th) {
                throw th;
            }
        }
        cVar.getClass();
        this.f829a = new d(cVar.e, cVar.g);
        this.b = cVar;
    }

    public static na a(Context context) {
        if (c == null) {
            synchronized (na.class) {
                try {
                    if (c == null) {
                        c = new na(context);
                    }
                } finally {
                }
            }
        }
        return c;
    }
}
