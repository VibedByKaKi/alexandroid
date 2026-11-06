package org.apache.commons.collections4.iterators;

import java.util.ListIterator;
import org.apache.commons.collections4.Unmodifiable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class UnmodifiableListIterator<E> implements ListIterator<E>, Unmodifiable {
    private final ListIterator<? extends E> iterator;

    private UnmodifiableListIterator(ListIterator<? extends E> listIterator) {
        this.iterator = listIterator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> ListIterator<E> umodifiableListIterator(ListIterator<? extends E> listIterator) {
        if (listIterator != 0) {
            return listIterator instanceof Unmodifiable ? listIterator : new UnmodifiableListIterator(listIterator);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("ListIterator must not be null");
        return null;
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("add() is not supported");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.iterator.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        return this.iterator.next();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.iterator.nextIndex();
    }

    @Override // java.util.ListIterator
    public E previous() {
        return this.iterator.previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.iterator.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() is not supported");
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        throw new UnsupportedOperationException("set() is not supported");
    }
}
