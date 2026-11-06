package com.amazon.whisperjoin.provisionerSDK.radios.ble;

import com.amazon.whisperjoin.provisionerSDK.radios.PromiseFactory;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
class GattConnectionPromiseFactory implements PromiseFactory<Void> {
    private static final String TAG = PromiseFactory.class.getName();
    private Callable<GattClientCallback> mCreateConnection;
    private final ExecutorService mExecutor;

    public GattConnectionPromiseFactory(Callable<GattClientCallback> callable, ExecutorService executorService) {
        if (callable == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("createConnection can not be null");
            throw null;
        }
        if (executorService == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("executor can not be null");
            throw null;
        }
        this.mCreateConnection = callable;
        this.mExecutor = executorService;
    }

    @Override // com.amazon.whisperjoin.provisionerSDK.radios.PromiseFactory
    public Future<Void> getFuture() {
        return this.mExecutor.submit(new Callable<Void>() { // from class: com.amazon.whisperjoin.provisionerSDK.radios.ble.GattConnectionPromiseFactory.1
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                return ((GattClientCallback) GattConnectionPromiseFactory.this.mCreateConnection.call()).getFuture().get();
            }
        });
    }
}
