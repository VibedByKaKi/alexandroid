package com.amazon.alexa.mobile.assistant.client.auth;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public /* synthetic */ class AuthorizationDelegateAdapter$forcePolicy$1 extends FunctionReferenceImpl implements Function0<Long> {
    public AuthorizationDelegateAdapter$forcePolicy$1(Object obj) {
        super(0, obj, RejectedTokenRefreshHooks.class, "elapsedRealtime", "elapsedRealtime()J", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(((RejectedTokenRefreshHooks) this.receiver).elapsedRealtime());
    }
}
