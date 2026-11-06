package com.amazon.identity.auth.device;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class c7 {
    private static final long g = 3000;

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f555a = new Object[0];
    private final Context b;
    private final Intent c;
    private final int d;
    private a7 e;
    private boolean f;

    public c7(Context context, Intent intent) {
        if (context == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        this.b = context;
        this.c = intent;
        this.f = false;
        this.e = new a7(this);
        this.d = 21;
    }

    public final boolean call() {
        boolean bindService;
        synchronized (this.f555a) {
            a7 a7Var = this.e;
            if (a7Var == null) {
                throw new IllegalStateException("Attempted to reuse a BoundServiceCaller.  Call method can only be executed once.");
            }
            bindService = this.b.bindService(this.c, a7Var, this.d);
        }
        if (bindService) {
            new Handler(Looper.getMainLooper()).postDelayed(new b7(this), g);
            return bindService;
        }
        Log.e(yf.a("BoundServiceCaller"), "Failed to bind to service.");
        return false;
    }

    public void unbind() {
        synchronized (this.f555a) {
            a7 a7Var = this.e;
            if (a7Var != null) {
                try {
                    this.b.unbindService(a7Var);
                } catch (IllegalArgumentException unused) {
                    Log.w(yf.a("BoundServiceCaller"), a0.a("IllegalArgumentException is received during unbinding from ", this.c.getComponent().getPackageName(), ". Ignored."));
                }
                this.e = null;
            }
        }
    }

    public void useService(ComponentName componentName, IBinder iBinder) throws RemoteException {
        useService(iBinder);
    }

    public abstract void useService(IBinder iBinder);

    public void serviceDisconnected() {
    }

    public void serviceTimedOut() {
    }
}
