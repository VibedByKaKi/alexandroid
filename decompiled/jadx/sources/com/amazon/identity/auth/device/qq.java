package com.amazon.identity.auth.device;

import android.os.Bundle;
import android.util.Log;
import com.amazon.identity.auth.device.api.MAPCallbackErrorException;
import com.amazon.identity.auth.device.api.MAPFuture;
import com.amazon.identity.auth.device.api.TypedCallback;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class qq implements MAPFuture, TypedCallback {
    public TypedCallback b;
    public Object d;
    public Bundle e;

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f907a = new CountDownLatch(1);
    public int c = 0;

    public qq(TypedCallback typedCallback) {
        this.b = typedCallback;
    }

    @Override // com.amazon.identity.auth.device.api.MAPFuture
    public final Object get(long j, TimeUnit timeUnit) {
        Object obj;
        if (fp.b()) {
            Single$$ExternalSyntheticBUOutline0.m$2("Cannot call get on the main thread, unless you want ANRs");
            return null;
        }
        if (!this.f907a.await(j, timeUnit)) {
            Log.e(yf.a("TypedCallbackFuture"), "Timed out waiting for result!");
            throw new TimeoutException("Timed out waiting for result!");
        }
        synchronized (this) {
            try {
                int i = this.c;
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException();
                    }
                    throw new MAPCallbackErrorException(this.e);
                }
                obj = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.amazon.identity.auth.device.api.TypedCallback
    public final void onError(Bundle bundle) {
        synchronized (this) {
            try {
                if (this.c != 0) {
                    Log.w(yf.a("TypedCallbackFuture"), "Callback was called twice", new IllegalStateException());
                    return;
                }
                this.e = bundle;
                this.c = 2;
                TypedCallback typedCallback = this.b;
                this.b = null;
                this.f907a.countDown();
                if (typedCallback != null) {
                    typedCallback.onError(bundle);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.identity.auth.device.api.TypedCallback
    public final void onSuccess(Object obj) {
        synchronized (this) {
            try {
                if (this.c != 0) {
                    Log.w(yf.a("TypedCallbackFuture"), "Callback was called twice", new IllegalStateException());
                    return;
                }
                this.d = obj;
                this.c = 1;
                TypedCallback typedCallback = this.b;
                this.b = null;
                this.f907a.countDown();
                if (typedCallback != null) {
                    typedCallback.onSuccess(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.identity.auth.device.api.MAPFuture
    public final Object get() {
        Object obj;
        if (!fp.b()) {
            this.f907a.await();
            synchronized (this) {
                try {
                    int i = this.c;
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException();
                        }
                        throw new MAPCallbackErrorException(this.e);
                    }
                    obj = this.d;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return obj;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Cannot call get on the main thread, unless you want ANRs");
        return null;
    }
}
