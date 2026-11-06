package org.apache.commons.lang3.concurrent;

import io.reactivex.rxjava3.core.Maybe$$ExternalSyntheticLambda0;
import java.util.Collection;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface UncheckedFuture<V> extends Future<V> {
    static <T> Stream<UncheckedFuture<T>> map(Collection<Future<T>> collection) {
        return (Stream<UncheckedFuture<T>>) collection.stream().map(new Maybe$$ExternalSyntheticLambda0(7));
    }

    static <T> Collection<UncheckedFuture<T>> on(Collection<Future<T>> collection) {
        return (Collection) map(collection).collect(Collectors.toList());
    }

    @Override // java.util.concurrent.Future
    V get();

    @Override // java.util.concurrent.Future
    V get(long j, TimeUnit timeUnit);

    static <T> UncheckedFuture<T> on(Future<T> future) {
        return new UncheckedFutureImpl(future);
    }
}
