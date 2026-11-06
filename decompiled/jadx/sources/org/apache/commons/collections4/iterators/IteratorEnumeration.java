package org.apache.commons.collections4.iterators;

import java.util.Enumeration;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class IteratorEnumeration<E> implements Enumeration<E> {
    private Iterator<? extends E> iterator;

    public IteratorEnumeration(Iterator<? extends E> it2) {
        this.iterator = it2;
    }

    public Iterator<? extends E> getIterator() {
        return this.iterator;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Enumeration
    public E nextElement() {
        return this.iterator.next();
    }

    public void setIterator(Iterator<? extends E> it2) {
        this.iterator = it2;
    }

    public IteratorEnumeration() {
    }
}
