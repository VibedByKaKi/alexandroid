package dagger.producers.internal;

import dagger.producers.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface CancellableProducer<T> extends Producer<T> {
    void cancel(boolean z);

    Producer<T> newDependencyView();

    Producer<T> newEntryPointView(CancellationListener cancellationListener);
}
