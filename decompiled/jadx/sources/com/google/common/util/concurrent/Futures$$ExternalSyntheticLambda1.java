package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractExecutionThreadService;
import com.google.common.util.concurrent.JdkFutureAdapters;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Futures$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Futures$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((Future) obj).cancel(false);
                break;
            case 1:
                ((AbstractExecutionThreadService.AnonymousClass1) obj).lambda$doStart$1();
                break;
            case 2:
                ((JdkFutureAdapters.ListenableFutureAdapter) obj).lambda$addListener$0();
                break;
            case 3:
                WrappingExecutorService.lambda$wrapTask$0((Callable) obj);
                break;
            case 4:
                ClosingFuture.lambda$closeQuietly$0((AutoCloseable) obj);
                break;
            default:
                ((ClosingFuture) obj).lambda$finishToFuture$0();
                break;
        }
    }
}
