package org.apache.commons.collections4.iterators;

import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.collections4.ResettableIterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class LoopingIterator<E> implements ResettableIterator<E> {
    private final Collection<? extends E> collection;
    private Iterator<? extends E> iterator;

    public LoopingIterator(Collection<? extends E> collection) {
        if (collection == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("The collection must not be null");
            throw null;
        }
        this.collection = collection;
        reset();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.collection.size() > 0;
    }

    @Override // java.util.Iterator
    public E next() {
        if (this.collection.size() == 0) {
            PathKt$$ExternalSyntheticBUOutline0.m("There are no elements for this iterator to loop on");
            return null;
        }
        if (!this.iterator.hasNext()) {
            reset();
        }
        return this.iterator.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.iterator.remove();
    }

    @Override // org.apache.commons.collections4.ResettableIterator
    public void reset() {
        this.iterator = this.collection.iterator();
    }

    public int size() {
        return this.collection.size();
    }
}
