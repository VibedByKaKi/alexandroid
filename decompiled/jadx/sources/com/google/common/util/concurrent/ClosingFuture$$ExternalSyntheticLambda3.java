package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ClosingFuture;
import com.google.common.util.concurrent.UncaughtExceptionHandlers;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class ClosingFuture$$ExternalSyntheticLambda3 implements UncaughtExceptionHandlers.RuntimeWrapper, ClosingFuture.AsyncClosingFunction {
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ClosingFuture$$ExternalSyntheticLambda3(Object obj) {
        this.f$0 = obj;
    }

    @Override // com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction
    public ClosingFuture apply(ClosingFuture.DeferredCloser deferredCloser, Object obj) {
        ClosingFuture lambda$withoutCloser$0;
        lambda$withoutCloser$0 = ClosingFuture.lambda$withoutCloser$0((AsyncFunction) this.f$0, deferredCloser, obj);
        return lambda$withoutCloser$0;
    }

    @Override // com.google.common.util.concurrent.UncaughtExceptionHandlers.RuntimeWrapper
    public void exit(int i) {
        ((Runtime) this.f$0).exit(i);
    }
}
