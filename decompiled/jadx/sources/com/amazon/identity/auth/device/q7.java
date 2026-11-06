package com.amazon.identity.auth.device;

import android.os.Bundle;
import android.util.Log;
import com.amazon.identity.auth.device.api.Callback;
import com.amazon.identity.auth.device.api.DefaultCallback;
import com.amazon.identity.auth.device.api.MAPCallbackErrorException;
import com.amazon.identity.auth.device.api.MAPFuture;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class q7 implements MAPFuture, Callback {
    public Callback b;
    public Bundle d;

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f894a = new CountDownLatch(1);
    public int c = 0;

    public q7(Callback callback) {
        this.b = DefaultCallback.nullToDefault(callback);
    }

    public static void b() {
        if (fp.b()) {
            Single$$ExternalSyntheticBUOutline0.m$2("Cannot call get on the main thread, unless you want ANRs");
        }
    }

    public final void a(int i, Bundle bundle) {
        synchronized (this) {
            try {
                if (this.c != 0) {
                    Log.w(yf.a("CallbackFuture"), "Callback was called twice", new IllegalStateException());
                    return;
                }
                this.d = bundle;
                this.c = i;
                Callback callback = this.b;
                this.b = null;
                this.f894a.countDown();
                if (callback == null) {
                    return;
                }
                if (i == 1) {
                    callback.onSuccess(bundle);
                } else if (i == 2) {
                    callback.onError(bundle);
                } else {
                    Duration$$ExternalSyntheticBUOutline0.m$1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.identity.auth.device.api.MAPFuture
    public final Object get(long j, TimeUnit timeUnit) {
        b();
        if (this.f894a.await(j, timeUnit)) {
            return a();
        }
        Log.e(yf.a("CallbackFuture"), "Timed out waiting for result!");
        throw new TimeoutException("Timed out waiting for result!");
    }

    public void onError(Bundle bundle) {
        a(2, bundle);
    }

    public void onSuccess(Bundle bundle) {
        a(1, bundle);
    }

    @Override // com.amazon.identity.auth.device.api.MAPFuture
    public final Object get() {
        b();
        this.f894a.await();
        return a();
    }

    public static q7 a(Callback callback) {
        if (callback instanceof q7) {
            return (q7) callback;
        }
        return new q7(callback);
    }

    public final synchronized Bundle a() {
        try {
            int i = this.c;
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                throw new MAPCallbackErrorException(this.d);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.d;
    }
}
