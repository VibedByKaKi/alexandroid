package com.amazon.coral.google.common.util.concurrent;

import com.amazon.coral.google.common.annotations.GwtCompatible;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
@FunctionalInterface
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public interface AsyncCallable<V> {
    ListenableFuture<V> call() throws Exception;
}
