package com.amazon.dee.app.services.coral;

import okhttp3.Response;
import rx.functions.Action1;
import rx.functions.Func1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public final /* synthetic */ class HttpCoralAuthenticationResponseInterceptor$$ExternalSyntheticLambda2 implements Action1, Func1 {
    public final /* synthetic */ HttpCoralAuthenticationResponseInterceptor f$0;

    public /* synthetic */ HttpCoralAuthenticationResponseInterceptor$$ExternalSyntheticLambda2(HttpCoralAuthenticationResponseInterceptor httpCoralAuthenticationResponseInterceptor) {
        this.f$0 = httpCoralAuthenticationResponseInterceptor;
    }

    @Override // rx.functions.Func1
    public Object call(Object obj) {
        Response intercept$lambda$2;
        intercept$lambda$2 = HttpCoralAuthenticationResponseInterceptor.intercept$lambda$2(this.f$0, (Throwable) obj);
        return intercept$lambda$2;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public void mo8903call(Object obj) {
        HttpCoralAuthenticationResponseInterceptor.getOrCreateRefresh$lambda$11$lambda$8(this.f$0, (Throwable) obj);
    }
}
