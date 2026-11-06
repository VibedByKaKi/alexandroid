package com.amazon.identity.auth.device;

import android.os.Bundle;
import com.amazon.identity.auth.device.api.Callback;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class lc implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f788a = new CountDownLatch(1);
    public Bundle b;

    public final Bundle a(long j, TimeUnit timeUnit) {
        if (this.f788a.await(3000L, timeUnit)) {
            return this.b;
        }
        throw new TimeoutException();
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onError(Bundle bundle) {
        this.b = bundle;
        this.f788a.countDown();
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onSuccess(Bundle bundle) {
        this.b = bundle;
        this.f788a.countDown();
    }
}
