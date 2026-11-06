package com.amazon.coral.google.common.util.concurrent;

import com.amazon.coral.google.common.annotations.GwtIncompatible;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
@CanIgnoreReturnValue
/* loaded from: classes19.dex */
public abstract class ForwardingListeningExecutorService extends ForwardingExecutorService implements ListeningExecutorService {
    @Override // com.amazon.coral.google.common.util.concurrent.ForwardingExecutorService, com.amazon.coral.google.common.collect.ForwardingObject
    public abstract ListeningExecutorService delegate();

    @Override // com.amazon.coral.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public <T> ListenableFuture<T> submit(Callable<T> callable) {
        return delegate().submit((Callable) callable);
    }

    @Override // com.amazon.coral.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Runnable runnable, @ParametricNullness Object obj) {
        return submit(runnable, (Runnable) obj);
    }

    @Override // com.amazon.coral.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public ListenableFuture<?> submit(Runnable runnable) {
        return delegate().submit(runnable);
    }

    @Override // com.amazon.coral.google.common.util.concurrent.ForwardingExecutorService, java.util.concurrent.ExecutorService
    public <T> ListenableFuture<T> submit(Runnable runnable, @ParametricNullness T t) {
        return delegate().submit(runnable, (Runnable) t);
    }
}
