package org.apache.commons.collections4.iterators;

import org.apache.commons.collections4.OrderedMapIterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class AbstractOrderedMapIteratorDecorator<K, V> implements OrderedMapIterator<K, V> {
    private final OrderedMapIterator<K, V> iterator;

    public AbstractOrderedMapIteratorDecorator(OrderedMapIterator<K, V> orderedMapIterator) {
        if (orderedMapIterator != null) {
            this.iterator = orderedMapIterator;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("OrderedMapIterator must not be null");
            throw null;
        }
    }

    @Override // org.apache.commons.collections4.MapIterator
    public K getKey() {
        return this.iterator.getKey();
    }

    public OrderedMapIterator<K, V> getOrderedMapIterator() {
        return this.iterator;
    }

    @Override // org.apache.commons.collections4.MapIterator
    public V getValue() {
        return this.iterator.getValue();
    }

    @Override // org.apache.commons.collections4.MapIterator, java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // org.apache.commons.collections4.OrderedMapIterator, org.apache.commons.collections4.OrderedIterator
    public boolean hasPrevious() {
        return this.iterator.hasPrevious();
    }

    @Override // org.apache.commons.collections4.MapIterator, java.util.Iterator
    public K next() {
        return this.iterator.next();
    }

    @Override // org.apache.commons.collections4.OrderedMapIterator, org.apache.commons.collections4.OrderedIterator
    public K previous() {
        return this.iterator.previous();
    }

    @Override // org.apache.commons.collections4.MapIterator, java.util.Iterator
    public void remove() {
        this.iterator.remove();
    }

    @Override // org.apache.commons.collections4.MapIterator
    public V setValue(V v) {
        return this.iterator.setValue(v);
    }
}
