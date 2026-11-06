package io.reactivex.rxjava3.parallel;

import io.reactivex.rxjava3.functions.BiFunction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public enum ParallelFailureHandling implements BiFunction<Long, Throwable, ParallelFailureHandling> {
    STOP,
    ERROR,
    SKIP,
    RETRY;

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public ParallelFailureHandling apply(Long l, Throwable th) {
        return this;
    }
}
