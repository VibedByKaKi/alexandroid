package com.amazon.coral.google.common.util.concurrent;

import com.amazon.coral.google.common.annotations.Beta;
import com.amazon.coral.google.common.annotations.GwtIncompatible;
import com.amazon.coral.google.common.base.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Beta
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public final class JdkFutureAdapters {
    private JdkFutureAdapters() {
    }

    public static <V> ListenableFuture<V> listenInPoolThread(Future<V> future, Executor executor) {
        Preconditions.checkNotNull(executor);
        return future instanceof ListenableFuture ? (ListenableFuture) future : new ListenableFutureAdapter(future, executor);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ListenableFutureAdapter<V> extends ForwardingFuture<V> implements ListenableFuture<V> {
        private static final Executor defaultAdapterExecutor;
        private static final ThreadFactory threadFactory;
        private final Executor adapterExecutor;
        private final Future<V> delegate;
        private final ExecutionList executionList;
        private final AtomicBoolean hasListeners;

        static {
            ThreadFactory build = new ThreadFactoryBuilder().setDaemon(true).setNameFormat("ListenableFutureAdapter-thread-%d").build();
            threadFactory = build;
            defaultAdapterExecutor = Executors.newCachedThreadPool(build);
        }

        public ListenableFutureAdapter(Future<V> future, Executor executor) {
            this.executionList = new ExecutionList();
            this.hasListeners = new AtomicBoolean(false);
            this.delegate = (Future) Preconditions.checkNotNull(future);
            this.adapterExecutor = (Executor) Preconditions.checkNotNull(executor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$addListener$0() {
            try {
                Uninterruptibles.getUninterruptibly(this.delegate);
            } catch (Throwable unused) {
            }
            this.executionList.execute();
        }

        @Override // com.amazon.coral.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
            this.executionList.add(runnable, executor);
            if (this.hasListeners.compareAndSet(false, true)) {
                if (this.delegate.isDone()) {
                    this.executionList.execute();
                } else {
                    this.adapterExecutor.execute(new WrappingExecutorService$$ExternalSyntheticLambda0(this, 1));
                }
            }
        }

        @Override // com.amazon.coral.google.common.util.concurrent.ForwardingFuture, com.amazon.coral.google.common.collect.ForwardingObject
        public Future<V> delegate() {
            return this.delegate;
        }

        public ListenableFutureAdapter(Future<V> future) {
            this(future, defaultAdapterExecutor);
        }
    }

    public static <V> ListenableFuture<V> listenInPoolThread(Future<V> future) {
        if (future instanceof ListenableFuture) {
            return (ListenableFuture) future;
        }
        return new ListenableFutureAdapter(future);
    }
}
