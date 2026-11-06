package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class BoundedIterator<E> implements Iterator<E> {
    private final Iterator<? extends E> iterator;
    private final long max;
    private final long offset;
    private long pos;

    public BoundedIterator(Iterator<? extends E> it2, long j, long j2) {
        if (it2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Iterator must not be null");
            throw null;
        }
        if (j < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Offset parameter must not be negative.");
            throw null;
        }
        if (j2 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Max parameter must not be negative.");
            throw null;
        }
        this.iterator = it2;
        this.offset = j;
        this.max = j2;
        this.pos = 0L;
        init();
    }

    private boolean checkBounds() {
        return (this.pos - this.offset) + 1 <= this.max;
    }

    private void init() {
        while (this.pos < this.offset && this.iterator.hasNext()) {
            this.iterator.next();
            this.pos++;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (checkBounds()) {
            return this.iterator.hasNext();
        }
        return false;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!checkBounds()) {
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        E next = this.iterator.next();
        this.pos++;
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.pos > this.offset) {
            this.iterator.remove();
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("remove() can not be called before calling next()");
        }
    }
}
