package org.apache.commons.collections4;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface OrderedMapIterator<K, V> extends MapIterator<K, V>, OrderedIterator<K> {
    @Override // org.apache.commons.collections4.OrderedIterator
    boolean hasPrevious();

    @Override // org.apache.commons.collections4.OrderedIterator
    K previous();
}
