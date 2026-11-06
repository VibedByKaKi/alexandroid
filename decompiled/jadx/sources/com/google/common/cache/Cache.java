package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotMock("Use CacheBuilder.newBuilder().build()")
@GwtCompatible
/* loaded from: classes8.dex */
public interface Cache<K, V> {
    ConcurrentMap<K, V> asMap();

    void cleanUp();

    @CanIgnoreReturnValue
    V get(K k, Callable<? extends V> callable) throws ExecutionException;

    ImmutableMap<K, V> getAllPresent(Iterable<? extends Object> iterable);

    @CanIgnoreReturnValue
    V getIfPresent(@CompatibleWith("K") Object obj);

    void invalidate(@CompatibleWith("K") Object obj);

    void invalidateAll();

    void invalidateAll(Iterable<? extends Object> iterable);

    void put(K k, V v);

    void putAll(Map<? extends K, ? extends V> map);

    long size();

    CacheStats stats();
}
