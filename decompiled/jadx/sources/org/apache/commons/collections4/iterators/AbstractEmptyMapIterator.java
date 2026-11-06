package org.apache.commons.collections4.iterators;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class AbstractEmptyMapIterator<K, V> extends AbstractEmptyIterator<K> {
    @Override // org.apache.commons.collections4.iterators.AbstractEmptyIterator
    public /* bridge */ /* synthetic */ void add(Object obj) {
        super.add(obj);
    }

    public K getKey() {
        throw new IllegalStateException("Iterator contains no elements");
    }

    public V getValue() {
        throw new IllegalStateException("Iterator contains no elements");
    }

    @Override // org.apache.commons.collections4.iterators.AbstractEmptyIterator
    public /* bridge */ /* synthetic */ boolean hasNext() {
        return super.hasNext();
    }

    @Override // org.apache.commons.collections4.iterators.AbstractEmptyIterator
    public /* bridge */ /* synthetic */ boolean hasPrevious() {
        return super.hasPrevious();
    }

    @Override // org.apache.commons.collections4.iterators.AbstractEmptyIterator
    public /* bridge */ /* synthetic */ Object next() {
        return super.next();
    }

    @Override // org.apache.commons.collections4.iterators.AbstractEmptyIterator
    public /* bridge */ /* synthetic */ int nextIndex() {
        return super.nextIndex();
    }

    @Override // org.apache.commons.collections4.iterators.AbstractEmptyIterator
    public /* bridge */ /* synthetic */ Object previous() {
        return super.previous();
    }

    @Override // org.apache.commons.collections4.iterators.AbstractEmptyIterator
    public /* bridge */ /* synthetic */ int previousIndex() {
        return super.previousIndex();
    }

    @Override // org.apache.commons.collections4.iterators.AbstractEmptyIterator
    public /* bridge */ /* synthetic */ void remove() {
        super.remove();
    }

    @Override // org.apache.commons.collections4.iterators.AbstractEmptyIterator
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // org.apache.commons.collections4.iterators.AbstractEmptyIterator
    public /* bridge */ /* synthetic */ void set(Object obj) {
        super.set(obj);
    }

    public V setValue(V v) {
        throw new IllegalStateException("Iterator contains no elements");
    }
}
