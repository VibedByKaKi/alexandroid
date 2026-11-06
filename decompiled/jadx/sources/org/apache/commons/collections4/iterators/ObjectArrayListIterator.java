package org.apache.commons.collections4.iterators;

import org.apache.commons.collections4.ResettableListIterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ObjectArrayListIterator<E> extends ObjectArrayIterator<E> implements ResettableListIterator<E> {
    private int lastItemIndex;

    public ObjectArrayListIterator(E... eArr) {
        super(eArr);
        this.lastItemIndex = -1;
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("add() method is not supported");
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.OrderedIterator
    public boolean hasPrevious() {
        return this.index > getStartIndex();
    }

    @Override // org.apache.commons.collections4.iterators.ObjectArrayIterator, java.util.Iterator
    public E next() {
        if (!hasNext()) {
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int i = this.index;
        this.lastItemIndex = i;
        E[] eArr = this.array;
        this.index = i + 1;
        return eArr[i];
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.index - getStartIndex();
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.OrderedIterator
    public E previous() {
        if (!hasPrevious()) {
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int i = this.index - 1;
        this.index = i;
        this.lastItemIndex = i;
        return this.array[i];
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return (this.index - getStartIndex()) - 1;
    }

    @Override // org.apache.commons.collections4.iterators.ObjectArrayIterator, org.apache.commons.collections4.ResettableIterator
    public void reset() {
        super.reset();
        this.lastItemIndex = -1;
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        int i = this.lastItemIndex;
        if (i != -1) {
            this.array[i] = e;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("must call next() or previous() before a call to set()");
        }
    }

    public ObjectArrayListIterator(E[] eArr, int i) {
        super(eArr, i);
        this.lastItemIndex = -1;
    }

    public ObjectArrayListIterator(E[] eArr, int i, int i2) {
        super(eArr, i, i2);
        this.lastItemIndex = -1;
    }
}
