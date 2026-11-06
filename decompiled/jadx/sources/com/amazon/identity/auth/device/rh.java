package com.amazon.identity.auth.device;

import com.amazon.identity.mobi.common.javascript.Promise;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class rh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f920a;
    public final /* synthetic */ Promise b;

    public rh(boolean[] zArr, Promise promise) {
        this.f920a = zArr;
        this.b = promise;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Promise promise;
        boolean[] zArr = this.f920a;
        if (zArr[0] || (promise = this.b) == null) {
            return;
        }
        zArr[0] = true;
        promise.setResult("{\"status\":\"MAP_Native_Acknowledged\"}");
    }
}
