package com.amazon.identity.auth.device;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.amazon.identity.auth.device.callback.IGenericIPC;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class e7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ic f594a;

    public e7(ic icVar) {
        this.f594a = icVar;
    }

    public abstract void a(IGenericIPC iGenericIPC);

    @Override // java.lang.Runnable
    public final void run() {
        IGenericIPC iGenericIPC;
        ic icVar = this.f594a;
        synchronized (icVar) {
            iGenericIPC = icVar.g;
        }
        if (iGenericIPC == null) {
            Log.w(yf.a("BoundServiceManager"), "Service was disconnected before task could execute; re-enqueuing task to run after service re-connects.");
            icVar.a(this);
            return;
        }
        try {
            a(iGenericIPC);
        } catch (RemoteException unused) {
            Uri uri = mc.h;
            Bundle bundle = new Bundle();
            bundle.putInt("ipc_error_code_key", 500);
            bundle.putString("ipc_error_code_message", "Got an error while calling Generic IPC central store.");
            ((kc) this).onError(bundle);
        }
    }
}
