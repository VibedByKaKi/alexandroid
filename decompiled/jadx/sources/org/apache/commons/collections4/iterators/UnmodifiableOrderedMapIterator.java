package org.apache.commons.collections4.iterators;

import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.Unmodifiable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class UnmodifiableOrderedMapIterator<K, V> implements OrderedMapIterator<K, V>, Unmodifiable {
    private final OrderedMapIterator<? extends K, ? extends V> iterator;

    /* JADX WARN: Multi-variable type inference failed */
    private UnmodifiableOrderedMapIterator(OrderedMapIterator<K, ? extends V> orderedMapIterator) {
        this.iterator = orderedMapIterator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> OrderedMapIterator<K, V> unmodifiableOrderedMapIterator(OrderedMapIterator<K, ? extends V> orderedMapIterator) {
        if (orderedMapIterator != 0) {
            return orderedMapIterator instanceof Unmodifiable ? orderedMapIterator : new UnmodifiableOrderedMapIterator(orderedMapIterator);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("OrderedMapIterator must not be null");
        return null;
    }

    @Override // org.apache.commons.collections4.MapIterator
    public K getKey() {
        return this.iterator.getKey();
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
        throw new UnsupportedOperationException("remove() is not supported");
    }

    @Override // org.apache.commons.collections4.MapIterator
    public V setValue(V v) {
        throw new UnsupportedOperationException("setValue() is not supported");
    }
}
