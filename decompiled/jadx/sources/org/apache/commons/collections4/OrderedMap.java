package org.apache.commons.collections4;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface OrderedMap<K, V> extends IterableMap<K, V> {
    K firstKey();

    K lastKey();

    @Override // org.apache.commons.collections4.IterableGet
    OrderedMapIterator<K, V> mapIterator();

    K nextKey(K k);

    K previousKey(K k);
}
