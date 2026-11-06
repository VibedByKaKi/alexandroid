package org.apache.commons.collections4.iterators;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class EnumerationIterator<E> implements Iterator<E> {
    private final Collection<? super E> collection;
    private Enumeration<? extends E> enumeration;
    private E last;

    public EnumerationIterator(Enumeration<? extends E> enumeration, Collection<? super E> collection) {
        this.enumeration = enumeration;
        this.collection = collection;
        this.last = null;
    }

    public Enumeration<? extends E> getEnumeration() {
        return this.enumeration;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.enumeration.hasMoreElements();
    }

    @Override // java.util.Iterator
    public E next() {
        E nextElement = this.enumeration.nextElement();
        this.last = nextElement;
        return nextElement;
    }

    @Override // java.util.Iterator
    public void remove() {
        Collection<? super E> collection = this.collection;
        if (collection == null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("No Collection associated with this Iterator");
            return;
        }
        E e = this.last;
        if (e != null) {
            collection.remove(e);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("next() must have been called for remove() to function");
        }
    }

    public void setEnumeration(Enumeration<? extends E> enumeration) {
        this.enumeration = enumeration;
    }

    public EnumerationIterator(Enumeration<? extends E> enumeration) {
        this(enumeration, null);
    }

    public EnumerationIterator() {
        this(null, null);
    }
}
