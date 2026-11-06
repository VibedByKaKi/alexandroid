package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
/* loaded from: classes8.dex */
public interface LoadingCache<K, V> extends Cache<K, V>, Function<K, V> {
    @Override // com.google.common.base.Function
    @Deprecated
    V apply(K k);

    @Override // com.google.common.cache.Cache
    ConcurrentMap<K, V> asMap();

    @CanIgnoreReturnValue
    V get(K k) throws ExecutionException;

    @CanIgnoreReturnValue
    ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException;

    @CanIgnoreReturnValue
    V getUnchecked(K k);

    void refresh(K k);
}
