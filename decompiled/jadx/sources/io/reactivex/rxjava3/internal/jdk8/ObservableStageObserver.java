package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
abstract class ObservableStageObserver<T> extends CompletableFuture<T> implements Observer<T> {
    final AtomicReference<Disposable> upstream = new AtomicReference<>();
    T value;

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        disposeUpstream();
        return super.cancel(z);
    }

    public final void clear() {
        this.value = null;
        this.upstream.lazySet(DisposableHelper.DISPOSED);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean complete(T t) {
        disposeUpstream();
        return super.complete(t);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean completeExceptionally(Throwable th) {
        disposeUpstream();
        return super.completeExceptionally(th);
    }

    public final void disposeUpstream() {
        DisposableHelper.dispose(this.upstream);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        clear();
        if (completeExceptionally(th)) {
            return;
        }
        RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(@NonNull Disposable disposable) {
        DisposableHelper.setOnce(this.upstream, disposable);
    }
}
