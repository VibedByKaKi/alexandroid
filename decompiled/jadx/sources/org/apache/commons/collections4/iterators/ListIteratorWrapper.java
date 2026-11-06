package org.apache.commons.collections4.iterators;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.collections4.ResettableListIterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ListIteratorWrapper<E> implements ResettableListIterator<E> {
    private static final String CANNOT_REMOVE_MESSAGE = "Cannot remove element at index {0}.";
    private static final String UNSUPPORTED_OPERATION_MESSAGE = "ListIteratorWrapper does not support optional operations of ListIterator.";
    private final Iterator<? extends E> iterator;
    private boolean removeState;
    private final List<E> list = new ArrayList();
    private int currentIndex = 0;
    private int wrappedIteratorIndex = 0;

    public ListIteratorWrapper(Iterator<? extends E> it2) {
        if (it2 != null) {
            this.iterator = it2;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Iterator must not be null");
            throw null;
        }
    }

    @Override // java.util.ListIterator
    public void add(E e) throws UnsupportedOperationException {
        Iterator<? extends E> it2 = this.iterator;
        if (it2 instanceof ListIterator) {
            ((ListIterator) it2).add(e);
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m$1(UNSUPPORTED_OPERATION_MESSAGE);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.currentIndex == this.wrappedIteratorIndex || (this.iterator instanceof ListIterator)) {
            return this.iterator.hasNext();
        }
        return true;
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.OrderedIterator
    public boolean hasPrevious() {
        Iterator<? extends E> it2 = this.iterator;
        return it2 instanceof ListIterator ? ((ListIterator) it2).hasPrevious() : this.currentIndex > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() throws NoSuchElementException {
        Iterator<? extends E> it2 = this.iterator;
        if (it2 instanceof ListIterator) {
            return it2.next();
        }
        int i = this.currentIndex;
        if (i < this.wrappedIteratorIndex) {
            this.currentIndex = i + 1;
            return this.list.get(i);
        }
        E next = it2.next();
        this.list.add(next);
        this.currentIndex++;
        this.wrappedIteratorIndex++;
        this.removeState = true;
        return next;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        Iterator<? extends E> it2 = this.iterator;
        return it2 instanceof ListIterator ? ((ListIterator) it2).nextIndex() : this.currentIndex;
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.OrderedIterator
    public E previous() throws NoSuchElementException {
        Iterator<? extends E> it2 = this.iterator;
        if (it2 instanceof ListIterator) {
            return (E) ((ListIterator) it2).previous();
        }
        int i = this.currentIndex;
        if (i == 0) {
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        this.removeState = this.wrappedIteratorIndex == i;
        List<E> list = this.list;
        int i2 = i - 1;
        this.currentIndex = i2;
        return list.get(i2);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        Iterator<? extends E> it2 = this.iterator;
        return it2 instanceof ListIterator ? ((ListIterator) it2).previousIndex() : this.currentIndex - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() throws UnsupportedOperationException {
        Iterator<? extends E> it2 = this.iterator;
        if (it2 instanceof ListIterator) {
            it2.remove();
            return;
        }
        int i = this.currentIndex;
        int i2 = this.wrappedIteratorIndex;
        int i3 = i == i2 ? i - 1 : i;
        if (!this.removeState || i2 - i > 1) {
            Single$$ExternalSyntheticBUOutline0.m$2(MessageFormat.format(CANNOT_REMOVE_MESSAGE, Integer.valueOf(i3)));
            return;
        }
        it2.remove();
        this.list.remove(i3);
        this.currentIndex = i3;
        this.wrappedIteratorIndex--;
        this.removeState = false;
    }

    @Override // org.apache.commons.collections4.ResettableIterator
    public void reset() {
        Iterator<? extends E> it2 = this.iterator;
        if (!(it2 instanceof ListIterator)) {
            this.currentIndex = 0;
            return;
        }
        ListIterator listIterator = (ListIterator) it2;
        while (listIterator.previousIndex() >= 0) {
            listIterator.previous();
        }
    }

    @Override // java.util.ListIterator
    public void set(E e) throws UnsupportedOperationException {
        Iterator<? extends E> it2 = this.iterator;
        if (it2 instanceof ListIterator) {
            ((ListIterator) it2).set(e);
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m$1(UNSUPPORTED_OPERATION_MESSAGE);
        }
    }
}
