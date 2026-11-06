package org.apache.commons.collections4.iterators;

import java.util.List;
import java.util.ListIterator;
import org.apache.commons.collections4.ResettableListIterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ReverseListIterator<E> implements ResettableListIterator<E> {
    private ListIterator<E> iterator;
    private final List<E> list;
    private boolean validForUpdate = true;

    public ReverseListIterator(List<E> list) {
        if (list == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("List must not be null.");
            throw null;
        }
        this.list = list;
        this.iterator = list.listIterator(list.size());
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        if (!this.validForUpdate) {
            Single$$ExternalSyntheticBUOutline0.m$2("Cannot add to list until next() or previous() called");
            return;
        }
        this.validForUpdate = false;
        this.iterator.add(e);
        this.iterator.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasPrevious();
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.OrderedIterator
    public boolean hasPrevious() {
        return this.iterator.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        E previous = this.iterator.previous();
        this.validForUpdate = true;
        return previous;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.iterator.previousIndex();
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.OrderedIterator
    public E previous() {
        E next = this.iterator.next();
        this.validForUpdate = true;
        return next;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.iterator.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        if (this.validForUpdate) {
            this.iterator.remove();
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("Cannot remove from list until next() or previous() called");
        }
    }

    @Override // org.apache.commons.collections4.ResettableIterator
    public void reset() {
        List<E> list = this.list;
        this.iterator = list.listIterator(list.size());
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        if (this.validForUpdate) {
            this.iterator.set(e);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("Cannot set to list until next() or previous() called");
        }
    }
}
