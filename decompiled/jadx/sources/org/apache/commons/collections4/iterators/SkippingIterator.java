package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class SkippingIterator<E> extends AbstractIteratorDecorator<E> {
    private final long offset;
    private long pos;

    public SkippingIterator(Iterator<E> it2, long j) {
        super(it2);
        if (j < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Offset parameter must not be negative.");
            throw null;
        }
        this.offset = j;
        this.pos = 0L;
        init();
    }

    private void init() {
        while (this.pos < this.offset && hasNext()) {
            next();
        }
    }

    @Override // org.apache.commons.collections4.iterators.AbstractIteratorDecorator, java.util.Iterator
    public E next() {
        E e = (E) super.next();
        this.pos++;
        return e;
    }

    @Override // org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator, java.util.Iterator
    public void remove() {
        if (this.pos > this.offset) {
            super.remove();
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("remove() can not be called before calling next()");
        }
    }
}
