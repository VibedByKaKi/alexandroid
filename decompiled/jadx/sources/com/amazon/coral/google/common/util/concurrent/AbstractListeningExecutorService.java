package com.amazon.coral.google.common.util.concurrent;

import com.amazon.coral.google.common.annotations.Beta;
import com.amazon.coral.google.common.annotations.GwtIncompatible;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Beta
@GwtIncompatible
@CanIgnoreReturnValue
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public abstract class AbstractListeningExecutorService extends AbstractExecutorService implements ListeningExecutorService, AutoCloseable {
    @Override // com.amazon.coral.google.common.util.concurrent.ListeningExecutorService, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean isTerminated;
        if (this == ForkJoinPool.commonPool() || (isTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, @ParametricNullness T t) {
        return TrustedListenableFutureTask.create(runnable, t);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.amazon.coral.google.common.util.concurrent.ListeningExecutorService
    public ListenableFuture<?> submit(Runnable runnable) {
        return (ListenableFuture) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return TrustedListenableFutureTask.create(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.amazon.coral.google.common.util.concurrent.ListeningExecutorService
    public /* bridge */ /* synthetic */ Future submit(Runnable runnable, @ParametricNullness Object obj) {
        return submit(runnable, (Runnable) obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.amazon.coral.google.common.util.concurrent.ListeningExecutorService
    public <T> ListenableFuture<T> submit(Runnable runnable, @ParametricNullness T t) {
        return (ListenableFuture) super.submit(runnable, (Runnable) t);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.amazon.coral.google.common.util.concurrent.ListeningExecutorService
    public <T> ListenableFuture<T> submit(Callable<T> callable) {
        return (ListenableFuture) super.submit((Callable) callable);
    }
}
