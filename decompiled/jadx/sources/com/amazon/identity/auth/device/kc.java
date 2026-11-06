package com.amazon.identity.auth.device;

import android.os.Bundle;
import com.amazon.identity.auth.device.api.Callback;
import com.amazon.identity.auth.device.callback.IGenericIPC;
import com.amazon.identity.auth.device.callback.IRemoteCallback;
import com.amazon.identity.auth.device.callback.RemoteCallbackWrapper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class kc extends e7 implements Callback {
    public final Callback b;
    public final Bundle c;
    public final Class d;
    public boolean e;

    public kc(Callback callback, Bundle bundle, Class cls, ic icVar) {
        super(icVar);
        this.b = callback;
        this.c = bundle;
        this.d = cls;
        this.e = false;
    }

    @Override // com.amazon.identity.auth.device.e7
    public final void a(IGenericIPC iGenericIPC) {
        IRemoteCallback remoteCallback = RemoteCallbackWrapper.toRemoteCallback(this);
        ic icVar = this.f594a;
        synchronized (icVar) {
            icVar.e.add(this);
        }
        iGenericIPC.call(this.d.getName(), this.c, remoteCallback);
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onError(Bundle bundle) {
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                this.e = true;
                this.f594a.a(this);
                this.b.onError(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onSuccess(Bundle bundle) {
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                this.e = true;
                this.f594a.a(this);
                this.b.onSuccess(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
