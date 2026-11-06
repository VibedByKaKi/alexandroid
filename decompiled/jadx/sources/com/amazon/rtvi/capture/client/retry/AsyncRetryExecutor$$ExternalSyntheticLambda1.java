package com.amazon.rtvi.capture.client.retry;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class AsyncRetryExecutor$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ AsyncRetryExecutor f$0;
    public final /* synthetic */ Callable f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ CompletableFuture f$3;

    public /* synthetic */ AsyncRetryExecutor$$ExternalSyntheticLambda1(AsyncRetryExecutor asyncRetryExecutor, int i, Callable callable, CompletableFuture completableFuture) {
        this.f$0 = asyncRetryExecutor;
        this.f$2 = i;
        this.f$1 = callable;
        this.f$3 = completableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$handleFailure$2(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$executeAttempt$1(this.f$2, this.f$1, this.f$3);
                break;
        }
    }

    public /* synthetic */ AsyncRetryExecutor$$ExternalSyntheticLambda1(AsyncRetryExecutor asyncRetryExecutor, Callable callable, int i, CompletableFuture completableFuture) {
        this.f$0 = asyncRetryExecutor;
        this.f$1 = callable;
        this.f$2 = i;
        this.f$3 = completableFuture;
    }
}
