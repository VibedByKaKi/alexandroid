package com.fasterxml.jackson.databind.util;

import java.util.function.BiConsumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface LookupCache<K, V> {
    void clear();

    default void contents(BiConsumer<K, V> biConsumer) {
        throw new UnsupportedOperationException();
    }

    default LookupCache<K, V> emptyCopy() {
        throw new UnsupportedOperationException("LookupCache implementation " + getClass().getName() + " does not implement `emptyCopy()`");
    }

    V get(Object obj);

    V put(K k, V v);

    V putIfAbsent(K k, V v);

    int size();
}
