package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class PeekingIterator<E> implements Iterator<E> {
    private final Iterator<? extends E> iterator;
    private E slot;
    private boolean exhausted = false;
    private boolean slotFilled = false;

    public PeekingIterator(Iterator<? extends E> it2) {
        this.iterator = it2;
    }

    private void fill() {
        if (this.exhausted || this.slotFilled) {
            return;
        }
        if (this.iterator.hasNext()) {
            this.slot = this.iterator.next();
            this.slotFilled = true;
        } else {
            this.exhausted = true;
            this.slot = null;
            this.slotFilled = false;
        }
    }

    public static <E> PeekingIterator<E> peekingIterator(Iterator<? extends E> it2) {
        if (it2 != null) {
            return it2 instanceof PeekingIterator ? (PeekingIterator) it2 : new PeekingIterator<>(it2);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Iterator must not be null");
        return null;
    }

    public E element() {
        fill();
        if (!this.exhausted) {
            return this.slot;
        }
        Single$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.exhausted) {
            return false;
        }
        return this.slotFilled || this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        if (!hasNext()) {
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        E next = this.slotFilled ? this.slot : this.iterator.next();
        this.slot = null;
        this.slotFilled = false;
        return next;
    }

    public E peek() {
        fill();
        if (this.exhausted) {
            return null;
        }
        return this.slot;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.slotFilled) {
            Single$$ExternalSyntheticBUOutline0.m$2("peek() or element() called before remove()");
        } else {
            this.iterator.remove();
        }
    }
}
