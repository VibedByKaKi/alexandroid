package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.FluentIterable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ZippingIterator<E> implements Iterator<E> {
    private final Iterator<Iterator<? extends E>> iterators;
    private Iterator<? extends E> lastReturned;
    private Iterator<? extends E> nextIterator;

    public ZippingIterator(Iterator<? extends E>... itArr) {
        this.nextIterator = null;
        this.lastReturned = null;
        ArrayList arrayList = new ArrayList();
        for (Iterator<? extends E> it2 : itArr) {
            if (it2 == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("Iterator must not be null.");
                throw null;
            }
            arrayList.add(it2);
        }
        this.iterators = FluentIterable.of((Iterable) arrayList).loop().iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.nextIterator != null) {
            return true;
        }
        while (this.iterators.hasNext()) {
            Iterator<? extends E> next = this.iterators.next();
            if (next.hasNext()) {
                this.nextIterator = next;
                return true;
            }
            this.iterators.remove();
        }
        return false;
    }

    @Override // java.util.Iterator
    public E next() throws NoSuchElementException {
        if (!hasNext()) {
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        E next = this.nextIterator.next();
        this.lastReturned = this.nextIterator;
        this.nextIterator = null;
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        Iterator<? extends E> it2 = this.lastReturned;
        if (it2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("No value can be removed at present");
        } else {
            it2.remove();
            this.lastReturned = null;
        }
    }

    public ZippingIterator(Iterator<? extends E> it2, Iterator<? extends E> it3, Iterator<? extends E> it4) {
        this(it2, it3, it4);
    }

    public ZippingIterator(Iterator<? extends E> it2, Iterator<? extends E> it3) {
        this(it2, it3);
    }
}
