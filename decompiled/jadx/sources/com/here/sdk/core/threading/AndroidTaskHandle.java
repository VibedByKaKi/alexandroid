package com.here.sdk.core.threading;

import java.util.concurrent.Future;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class AndroidTaskHandle implements TaskHandle {
    private final Future<?> mFuture;

    public AndroidTaskHandle(Future<?> future) {
        this.mFuture = future;
    }

    @Override // com.here.sdk.core.threading.TaskHandle
    public boolean cancel() {
        return this.mFuture.cancel(false);
    }

    @Override // com.here.sdk.core.threading.TaskHandle
    public boolean isCancelled() {
        return this.mFuture.isCancelled();
    }

    @Override // com.here.sdk.core.threading.TaskHandle
    public boolean isFinished() {
        return this.mFuture.isDone();
    }
}
