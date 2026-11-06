package org.apache.commons.collections4.iterators;

import java.lang.reflect.Array;
import org.apache.commons.collections4.ResettableListIterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ArrayListIterator<E> extends ArrayIterator<E> implements ResettableListIterator<E> {
    private int lastItemIndex;

    public ArrayListIterator(Object obj) {
        super(obj);
        this.lastItemIndex = -1;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("add() method is not supported");
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.OrderedIterator
    public boolean hasPrevious() {
        return this.index > this.startIndex;
    }

    @Override // org.apache.commons.collections4.iterators.ArrayIterator, java.util.Iterator
    public E next() {
        if (!hasNext()) {
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int i = this.index;
        this.lastItemIndex = i;
        Object obj = this.array;
        this.index = i + 1;
        return (E) Array.get(obj, i);
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.index - this.startIndex;
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
        return (E) Array.get(this.array, i);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return (this.index - this.startIndex) - 1;
    }

    @Override // org.apache.commons.collections4.iterators.ArrayIterator, org.apache.commons.collections4.ResettableIterator
    public void reset() {
        super.reset();
        this.lastItemIndex = -1;
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        int i = this.lastItemIndex;
        if (i != -1) {
            Array.set(this.array, i, obj);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("must call next() or previous() before a call to set()");
        }
    }

    public ArrayListIterator(Object obj, int i) {
        super(obj, i);
        this.lastItemIndex = -1;
    }

    public ArrayListIterator(Object obj, int i, int i2) {
        super(obj, i, i2);
        this.lastItemIndex = -1;
    }
}
