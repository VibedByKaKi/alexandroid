package org.apache.commons.collections4.iterators;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class PushbackIterator<E> implements Iterator<E> {
    private final Deque<E> items = new ArrayDeque();
    private final Iterator<? extends E> iterator;

    public PushbackIterator(Iterator<? extends E> it2) {
        this.iterator = it2;
    }

    public static <E> PushbackIterator<E> pushbackIterator(Iterator<? extends E> it2) {
        if (it2 != null) {
            return it2 instanceof PushbackIterator ? (PushbackIterator) it2 : new PushbackIterator<>(it2);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Iterator must not be null");
        return null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return !this.items.isEmpty() || this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        return !this.items.isEmpty() ? this.items.pop() : this.iterator.next();
    }

    public void pushback(E e) {
        this.items.push(e);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
