package com.amazon.coral.google.common.util.concurrent;

import com.amazon.coral.google.common.annotations.GwtCompatible;
import com.amazon.coral.google.common.base.Preconditions;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@CanIgnoreReturnValue
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public abstract class ForwardingListenableFuture<V> extends ForwardingFuture<V> implements ListenableFuture<V> {
    @Override // com.amazon.coral.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        delegate().addListener(runnable, executor);
    }

    @Override // com.amazon.coral.google.common.util.concurrent.ForwardingFuture, com.amazon.coral.google.common.collect.ForwardingObject
    public abstract ListenableFuture<? extends V> delegate();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class SimpleForwardingListenableFuture<V> extends ForwardingListenableFuture<V> {
        private final ListenableFuture<V> delegate;

        public SimpleForwardingListenableFuture(ListenableFuture<V> listenableFuture) {
            this.delegate = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
        }

        @Override // com.amazon.coral.google.common.util.concurrent.ForwardingListenableFuture, com.amazon.coral.google.common.util.concurrent.ForwardingFuture, com.amazon.coral.google.common.collect.ForwardingObject
        public final ListenableFuture<V> delegate() {
            return this.delegate;
        }
    }
}
