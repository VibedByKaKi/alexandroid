package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class AbstractUntypedIteratorDecorator<I, O> implements Iterator<O> {
    private final Iterator<I> iterator;

    public AbstractUntypedIteratorDecorator(Iterator<I> it2) {
        if (it2 != null) {
            this.iterator = it2;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Iterator must not be null");
            throw null;
        }
    }

    public Iterator<I> getIterator() {
        return this.iterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.iterator.remove();
    }
}
