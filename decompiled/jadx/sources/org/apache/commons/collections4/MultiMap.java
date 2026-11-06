package org.apache.commons.collections4;

import java.util.Collection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes9.dex */
public interface MultiMap<K, V> extends IterableMap<K, Object> {
    @Override // java.util.Map, org.apache.commons.collections4.Get
    boolean containsValue(Object obj);

    @Override // java.util.Map, org.apache.commons.collections4.Get
    Object get(Object obj);

    @Override // java.util.Map, org.apache.commons.collections4.Put
    Object put(K k, Object obj);

    @Override // java.util.Map, org.apache.commons.collections4.Get
    Object remove(Object obj);

    boolean removeMapping(K k, V v);

    @Override // java.util.Map, org.apache.commons.collections4.Get
    int size();

    @Override // java.util.Map, org.apache.commons.collections4.Get
    Collection<Object> values();
}
