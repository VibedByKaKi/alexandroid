package org.apache.commons.collections4.multiset;

import java.util.Set;
import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.collection.SynchronizedCollection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class SynchronizedMultiSet<E> extends SynchronizedCollection<E> implements MultiSet<E> {
    private static final long serialVersionUID = 20150629;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SynchronizedSet<T> extends SynchronizedCollection<T> implements Set<T> {
        private static final long serialVersionUID = 20150629;

        public SynchronizedSet(Set<T> set, Object obj) {
            super(set, obj);
        }
    }

    public SynchronizedMultiSet(MultiSet<E> multiSet) {
        super(multiSet);
    }

    public static <E> SynchronizedMultiSet<E> synchronizedMultiSet(MultiSet<E> multiSet) {
        return new SynchronizedMultiSet<>(multiSet);
    }

    @Override // org.apache.commons.collections4.MultiSet
    public int add(E e, int i) {
        int add;
        synchronized (this.lock) {
            add = decorated().add(e, i);
        }
        return add;
    }

    @Override // org.apache.commons.collections4.collection.SynchronizedCollection
    public MultiSet<E> decorated() {
        return (MultiSet) super.decorated();
    }

    @Override // org.apache.commons.collections4.MultiSet
    public Set<MultiSet.Entry<E>> entrySet() {
        SynchronizedSet synchronizedSet;
        synchronized (this.lock) {
            synchronizedSet = new SynchronizedSet(decorated().entrySet(), this.lock);
        }
        return synchronizedSet;
    }

    @Override // org.apache.commons.collections4.collection.SynchronizedCollection, java.util.Collection
    public boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.lock) {
            equals = decorated().equals(obj);
        }
        return equals;
    }

    @Override // org.apache.commons.collections4.MultiSet
    public int getCount(Object obj) {
        int count;
        synchronized (this.lock) {
            count = decorated().getCount(obj);
        }
        return count;
    }

    @Override // org.apache.commons.collections4.collection.SynchronizedCollection, java.util.Collection
    public int hashCode() {
        int hashCode;
        synchronized (this.lock) {
            hashCode = decorated().hashCode();
        }
        return hashCode;
    }

    @Override // org.apache.commons.collections4.MultiSet
    public int remove(Object obj, int i) {
        int remove;
        synchronized (this.lock) {
            remove = decorated().remove(obj, i);
        }
        return remove;
    }

    @Override // org.apache.commons.collections4.MultiSet
    public int setCount(E e, int i) {
        int count;
        synchronized (this.lock) {
            count = decorated().setCount(e, i);
        }
        return count;
    }

    @Override // org.apache.commons.collections4.MultiSet
    public Set<E> uniqueSet() {
        SynchronizedSet synchronizedSet;
        synchronized (this.lock) {
            synchronizedSet = new SynchronizedSet(decorated().uniqueSet(), this.lock);
        }
        return synchronizedSet;
    }

    public SynchronizedMultiSet(MultiSet<E> multiSet, Object obj) {
        super(multiSet, obj);
    }
}
