package com.amazon.coral.util;

import java.lang.CharSequence;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class CharSequenceHashSet<E extends CharSequence> implements Set<E> {
    private final CharSequenceHashMap<E> map;

    public CharSequenceHashSet(HashFunctor<CharSequence> hashFunctor) {
        this.map = new CharSequenceHashMap<>(hashFunctor);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e) {
        return this.map.put(e, e) == null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it2 = collection.iterator();
        boolean z = true;
        while (it2.hasNext()) {
            if (!add((CharSequenceHashSet<E>) it2.next())) {
                z = false;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.map.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.map.keySet().containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (obj instanceof Set) {
            return this.map.keySet().equals(obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.map.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.map.values().iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.map.remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it2 = collection.iterator();
        boolean z = true;
        while (it2.hasNext()) {
            if (!remove(it2.next())) {
                z = false;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.map.keySet().retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.map.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.map.keySet().toArray();
    }

    public String toString() {
        return this.map.keySet().toString();
    }

    public CharSequenceHashSet() {
        this(CharSequenceHashFunctor.CASE_SENSITIVE);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.map.keySet().toArray(tArr);
    }
}
