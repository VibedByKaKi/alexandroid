package com.amazon.identity.auth.device;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class a7 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c7 f416a;

    public a7(c7 c7Var) {
        this.f416a = c7Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        componentName.toString();
        yf.a("BoundServiceCaller");
        "user".equalsIgnoreCase(Build.TYPE);
        c7 c7Var = this.f416a;
        c7Var.f = true;
        try {
            c7Var.useService(componentName, iBinder);
        } catch (RemoteException unused) {
            Log.e(yf.a("BoundServiceCaller"), "Service died: " + componentName);
            this.f416a.unbind();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object[] objArr;
        c7 c7Var;
        objArr = this.f416a.f555a;
        synchronized (objArr) {
            c7Var = this.f416a;
            c7Var.e = null;
        }
        c7Var.serviceDisconnected();
        componentName.toString();
        yf.a("BoundServiceCaller");
        "user".equalsIgnoreCase(Build.TYPE);
    }
}
