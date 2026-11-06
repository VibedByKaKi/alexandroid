package org.apache.thrift.orig.async;

import java.util.concurrent.CompletableFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class AsyncMethodFutureAdapter<T> implements AsyncMethodCallback<T> {
    private final CompletableFuture<T> future = new CompletableFuture<>();

    private AsyncMethodFutureAdapter() {
    }

    public static <T> AsyncMethodFutureAdapter<T> create() {
        return new AsyncMethodFutureAdapter<>();
    }

    public CompletableFuture<T> getFuture() {
        return this.future;
    }

    @Override // org.apache.thrift.orig.async.AsyncMethodCallback
    public void onComplete(T t) {
        this.future.complete(t);
    }

    @Override // org.apache.thrift.orig.async.AsyncMethodCallback
    public void onError(Exception exc) {
        this.future.completeExceptionally(exc);
    }
}
