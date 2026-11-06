package com.amazon.identity.auth.device.callback;

import android.os.Bundle;
import com.amazon.identity.auth.device.api.Callback;
import com.amazon.identity.auth.device.callback.IRemoteCallback;
import com.amazon.identity.auth.device.fp;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class d extends IRemoteCallback.Stub {

    /* renamed from: a, reason: collision with root package name */
    public final Callback f559a;

    public d(Callback callback) {
        this.f559a = callback;
    }

    @Override // com.amazon.identity.auth.device.callback.IRemoteCallback
    public final void onError(Bundle bundle) {
        if (this.f559a != null) {
            fp.a(new c(this, bundle));
        }
    }

    @Override // com.amazon.identity.auth.device.callback.IRemoteCallback
    public final void onSuccess(Bundle bundle) {
        if (this.f559a != null) {
            fp.a(new b(this, bundle));
        }
    }
}
