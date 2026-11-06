package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import org.apache.commons.collections4.Unmodifiable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class UnmodifiableIterator<E> implements Iterator<E>, Unmodifiable {
    private final Iterator<? extends E> iterator;

    private UnmodifiableIterator(Iterator<? extends E> it2) {
        this.iterator = it2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> Iterator<E> unmodifiableIterator(Iterator<? extends E> it2) {
        if (it2 != 0) {
            return it2 instanceof Unmodifiable ? it2 : new UnmodifiableIterator(it2);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Iterator must not be null");
        return null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        return this.iterator.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() is not supported");
    }
}
