package org.apache.commons.collections4;

import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface BidiMap<K, V> extends IterableMap<K, V> {
    K getKey(Object obj);

    BidiMap<V, K> inverseBidiMap();

    @Override // java.util.Map, org.apache.commons.collections4.Put
    V put(K k, V v);

    K removeValue(Object obj);

    @Override // java.util.Map, org.apache.commons.collections4.Get
    Set<V> values();
}
