package org.apache.commons.collections4.iterators;

import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.collections4.ResettableListIterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class LoopingListIterator<E> implements ResettableListIterator<E> {
    private ListIterator<E> iterator;
    private final List<E> list;

    public LoopingListIterator(List<E> list) {
        if (list == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("The list must not be null");
            throw null;
        }
        this.list = list;
        _reset();
    }

    private void _reset() {
        this.iterator = this.list.listIterator();
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        this.iterator.add(e);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return !this.list.isEmpty();
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.OrderedIterator
    public boolean hasPrevious() {
        return !this.list.isEmpty();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        if (this.list.isEmpty()) {
            PathKt$$ExternalSyntheticBUOutline0.m("There are no elements for this iterator to loop on");
            return null;
        }
        if (!this.iterator.hasNext()) {
            reset();
        }
        return this.iterator.next();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        if (this.list.isEmpty()) {
            PathKt$$ExternalSyntheticBUOutline0.m("There are no elements for this iterator to loop on");
            return 0;
        }
        if (this.iterator.hasNext()) {
            return this.iterator.nextIndex();
        }
        return 0;
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.OrderedIterator
    public E previous() {
        if (this.list.isEmpty()) {
            PathKt$$ExternalSyntheticBUOutline0.m("There are no elements for this iterator to loop on");
            return null;
        }
        if (this.iterator.hasPrevious()) {
            return this.iterator.previous();
        }
        E e = null;
        while (true) {
            boolean hasNext = this.iterator.hasNext();
            ListIterator<E> listIterator = this.iterator;
            if (!hasNext) {
                listIterator.previous();
                return e;
            }
            e = listIterator.next();
        }
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        if (!this.list.isEmpty()) {
            return !this.iterator.hasPrevious() ? this.list.size() - 1 : this.iterator.previousIndex();
        }
        PathKt$$ExternalSyntheticBUOutline0.m("There are no elements for this iterator to loop on");
        return 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        this.iterator.remove();
    }

    @Override // org.apache.commons.collections4.ResettableIterator
    public void reset() {
        _reset();
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        this.iterator.set(e);
    }

    public int size() {
        return this.list.size();
    }
}
