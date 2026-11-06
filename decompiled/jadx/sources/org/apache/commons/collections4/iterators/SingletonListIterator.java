package org.apache.commons.collections4.iterators;

import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import org.apache.commons.collections4.ResettableListIterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class SingletonListIterator<E> implements ResettableListIterator<E> {
    private E object;
    private boolean beforeFirst = true;
    private boolean nextCalled = false;
    private boolean removed = false;

    public SingletonListIterator(E e) {
        this.object = e;
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("add() is not supported by this iterator");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.beforeFirst && !this.removed;
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.OrderedIterator
    public boolean hasPrevious() {
        return (this.beforeFirst || this.removed) ? false : true;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        if (!this.beforeFirst || this.removed) {
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        this.beforeFirst = false;
        this.nextCalled = true;
        return this.object;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return !this.beforeFirst ? 1 : 0;
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.OrderedIterator
    public E previous() {
        if (this.beforeFirst || this.removed) {
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        this.beforeFirst = true;
        return this.object;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.beforeFirst ? -1 : 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        if (!this.nextCalled || this.removed) {
            Duration$$ExternalSyntheticBUOutline0.m$1();
        } else {
            this.object = null;
            this.removed = true;
        }
    }

    @Override // org.apache.commons.collections4.ResettableIterator
    public void reset() {
        this.beforeFirst = true;
        this.nextCalled = false;
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        if (!this.nextCalled || this.removed) {
            Duration$$ExternalSyntheticBUOutline0.m$1();
        } else {
            this.object = e;
        }
    }
}
