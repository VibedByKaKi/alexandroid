package org.apache.commons.collections4.iterators;

import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class AbstractIteratorDecorator<E> extends AbstractUntypedIteratorDecorator<E, E> {
    public AbstractIteratorDecorator(Iterator<E> it2) {
        super(it2);
    }

    @Override // java.util.Iterator
    public E next() {
        return getIterator().next();
    }
}
