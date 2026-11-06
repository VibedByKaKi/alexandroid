package com.amazon.identity.auth.device;

import android.os.Bundle;
import com.amazon.identity.auth.device.api.Callback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class h1 implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vh f691a;

    public h1(vh vhVar) {
        this.f691a = vhVar;
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onError(Bundle bundle) {
        this.f691a.onAccountMigrationComplete(bundle);
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onSuccess(Bundle bundle) {
        this.f691a.onAccountMigrationComplete(bundle);
    }
}
