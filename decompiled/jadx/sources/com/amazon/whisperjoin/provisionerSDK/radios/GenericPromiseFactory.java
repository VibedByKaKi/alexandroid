package com.amazon.whisperjoin.provisionerSDK.radios;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class GenericPromiseFactory<TResult> implements PromiseFactory<TResult> {
    private final Callable<TResult> mAction;
    private final ExecutorService mExecutor;

    public GenericPromiseFactory(Callable<TResult> callable, ExecutorService executorService) {
        if (callable == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("action can not be null");
            throw null;
        }
        if (executorService == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("executor can not be null");
            throw null;
        }
        this.mAction = callable;
        this.mExecutor = executorService;
    }

    @Override // com.amazon.whisperjoin.provisionerSDK.radios.PromiseFactory
    public Future<TResult> getFuture() {
        return this.mExecutor.submit(this.mAction);
    }
}
