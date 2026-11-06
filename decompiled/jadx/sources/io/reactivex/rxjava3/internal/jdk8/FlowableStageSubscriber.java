package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
abstract class FlowableStageSubscriber<T> extends CompletableFuture<T> implements FlowableSubscriber<T> {
    final AtomicReference<Subscription> upstream = new AtomicReference<>();
    T value;

    public abstract void afterSubscribe(Subscription subscription);

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        cancelUpstream();
        return super.cancel(z);
    }

    public final void cancelUpstream() {
        SubscriptionHelper.cancel(this.upstream);
    }

    public final void clear() {
        this.value = null;
        this.upstream.lazySet(SubscriptionHelper.CANCELLED);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean complete(T t) {
        cancelUpstream();
        return super.complete(t);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean completeExceptionally(Throwable th) {
        cancelUpstream();
        return super.completeExceptionally(th);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        clear();
        if (completeExceptionally(th)) {
            return;
        }
        RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(@NonNull Subscription subscription) {
        if (SubscriptionHelper.setOnce(this.upstream, subscription)) {
            afterSubscribe(subscription);
        }
    }
}
