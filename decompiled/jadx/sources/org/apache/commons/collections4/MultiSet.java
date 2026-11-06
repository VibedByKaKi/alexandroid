package org.apache.commons.collections4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface MultiSet<E> extends Collection<E> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Entry<E> {
        boolean equals(Object obj);

        int getCount();

        E getElement();

        int hashCode();
    }

    int add(E e, int i);

    @Override // java.util.Collection
    boolean add(E e);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    Set<Entry<E>> entrySet();

    @Override // java.util.Collection
    boolean equals(Object obj);

    int getCount(Object obj);

    @Override // java.util.Collection
    int hashCode();

    @Override // java.util.Collection, java.lang.Iterable
    Iterator<E> iterator();

    int remove(Object obj, int i);

    @Override // java.util.Collection
    boolean remove(Object obj);

    @Override // java.util.Collection
    boolean removeAll(Collection<?> collection);

    @Override // java.util.Collection
    boolean retainAll(Collection<?> collection);

    int setCount(E e, int i);

    @Override // java.util.Collection
    int size();

    Set<E> uniqueSet();
}
