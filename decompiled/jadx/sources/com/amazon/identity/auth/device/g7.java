package com.amazon.identity.auth.device;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.amazon.identity.auth.device.callback.IGenericIPC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class g7 implements ServiceConnection {
    public static final long j = 3000;

    /* renamed from: a, reason: collision with root package name */
    public final Context f674a;
    public final fh b;
    public ComponentName f;
    public IGenericIPC g;
    public ArrayList h;
    public boolean i;
    public final String d = "com.amazon.identity.framework.GenericIPCService";
    public final LinkedList e = new LinkedList();
    public final Handler c = new Handler(Looper.getMainLooper());

    public g7(Context context, fh fhVar) {
        this.f674a = context.getApplicationContext();
        this.b = fhVar;
    }

    public final synchronized ComponentName a() {
        try {
            ComponentName componentName = this.f;
            if (componentName != null) {
                return componentName;
            }
            ComponentName a2 = y5.a(this.f674a, this.d);
            this.f = a2;
            if (a2 == null) {
                Log.e(yf.a("BoundServiceManager"), "Couldn't find " + this.d);
            } else {
                Objects.toString(a2);
                yf.a("BoundServiceManager");
                "user".equalsIgnoreCase(Build.TYPE);
            }
            return this.f;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean b() {
        if (this.g != null) {
            Objects.toString(this.f);
            yf.a("BoundServiceManager");
            "user".equalsIgnoreCase(Build.TYPE);
            return true;
        }
        if (this.i) {
            Objects.toString(this.f);
            yf.a("BoundServiceManager");
            "user".equalsIgnoreCase(Build.TYPE);
            return true;
        }
        ComponentName a2 = a();
        if (a2 == null) {
            return false;
        }
        Intent intent = new Intent();
        intent.setComponent(a2);
        try {
            if (this.f674a.bindService(intent, this, 21)) {
                Objects.toString(this.f);
                yf.a("BoundServiceManager");
                "user".equalsIgnoreCase(Build.TYPE);
                this.i = true;
                return true;
            }
            jg.a("BindFailed");
            Log.w(yf.a("BoundServiceManager"), "bind failed: " + this.f);
            return false;
        } catch (SecurityException e) {
            jg.a("BindFailed");
            Log.w(yf.a("BoundServiceManager"), "bind failed: " + this.f, e);
            return false;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ArrayList arrayList;
        synchronized (this) {
            Objects.toString(this.f);
            yf.a("BoundServiceManager");
            "user".equalsIgnoreCase(Build.TYPE);
            this.g = IGenericIPC.Stub.asInterface(iBinder);
            arrayList = this.h;
            this.h = null;
        }
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.b.execute((e7) it2.next());
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        try {
            Objects.toString(this.f);
            yf.a("BoundServiceManager");
            "user".equalsIgnoreCase(Build.TYPE);
            this.g = null;
            Iterator it2 = this.e.iterator();
            while (it2.hasNext()) {
                this.b.execute(new f7((e7) it2.next()));
            }
            this.e.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(kc kcVar) {
        this.e.remove(kcVar);
    }

    public final synchronized void a(e7 e7Var) {
        try {
            if (this.g == null) {
                if (this.h == null) {
                    this.h = new ArrayList();
                    this.c.postDelayed(new d7(this), j);
                }
                this.h.add(e7Var);
            } else {
                this.b.execute(e7Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
