package com.amazonaws.transform;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MapEntry<K, V> implements Map.Entry<K, V> {
    private K key;
    private V value;

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    public K setKey(K k) {
        this.key = k;
        return k;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        this.value = v;
        return v;
    }
}
