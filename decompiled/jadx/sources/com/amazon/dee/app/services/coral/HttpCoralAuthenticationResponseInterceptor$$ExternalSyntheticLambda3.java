package com.amazon.dee.app.services.coral;

import rx.functions.Action0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public final /* synthetic */ class HttpCoralAuthenticationResponseInterceptor$$ExternalSyntheticLambda3 implements Action0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ HttpCoralAuthenticationResponseInterceptor f$0;

    public /* synthetic */ HttpCoralAuthenticationResponseInterceptor$$ExternalSyntheticLambda3(HttpCoralAuthenticationResponseInterceptor httpCoralAuthenticationResponseInterceptor, int i) {
        this.$r8$classId = i;
        this.f$0 = httpCoralAuthenticationResponseInterceptor;
    }

    @Override // rx.functions.Action0
    public final void call() {
        int i = this.$r8$classId;
        HttpCoralAuthenticationResponseInterceptor httpCoralAuthenticationResponseInterceptor = this.f$0;
        switch (i) {
            case 0:
                HttpCoralAuthenticationResponseInterceptor.getOrCreateRefresh$lambda$11$lambda$10(httpCoralAuthenticationResponseInterceptor);
                break;
            default:
                HttpCoralAuthenticationResponseInterceptor.handleRefreshError$lambda$12(httpCoralAuthenticationResponseInterceptor);
                break;
        }
    }
}
