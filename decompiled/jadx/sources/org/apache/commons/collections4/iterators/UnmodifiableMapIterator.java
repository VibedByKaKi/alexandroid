package org.apache.commons.collections4.iterators;

import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.Unmodifiable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class UnmodifiableMapIterator<K, V> implements MapIterator<K, V>, Unmodifiable {
    private final MapIterator<? extends K, ? extends V> iterator;

    private UnmodifiableMapIterator(MapIterator<? extends K, ? extends V> mapIterator) {
        this.iterator = mapIterator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> MapIterator<K, V> unmodifiableMapIterator(MapIterator<? extends K, ? extends V> mapIterator) {
        if (mapIterator != 0) {
            return mapIterator instanceof Unmodifiable ? mapIterator : new UnmodifiableMapIterator(mapIterator);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("MapIterator must not be null");
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

    @Override // org.apache.commons.collections4.MapIterator, java.util.Iterator
    public K next() {
        return this.iterator.next();
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
