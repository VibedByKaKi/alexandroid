package org.apache.http.protocol;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
final class ChainBuilder<E> {
    private final LinkedList<E> list = new LinkedList<>();
    private final Map<Class<?>, E> uniqueClasses = new HashMap();

    private void ensureUnique(E e) {
        E remove = this.uniqueClasses.remove(e.getClass());
        if (remove != null) {
            this.list.remove(remove);
        }
        this.uniqueClasses.put(e.getClass(), e);
    }

    public ChainBuilder<E> addAllFirst(Collection<E> collection) {
        if (collection != null) {
            Iterator<E> it2 = collection.iterator();
            while (it2.hasNext()) {
                addFirst(it2.next());
            }
        }
        return this;
    }

    public ChainBuilder<E> addAllLast(Collection<E> collection) {
        if (collection != null) {
            Iterator<E> it2 = collection.iterator();
            while (it2.hasNext()) {
                addLast(it2.next());
            }
        }
        return this;
    }

    public ChainBuilder<E> addFirst(E e) {
        if (e == null) {
            return this;
        }
        ensureUnique(e);
        this.list.addFirst(e);
        return this;
    }

    public ChainBuilder<E> addLast(E e) {
        if (e == null) {
            return this;
        }
        ensureUnique(e);
        this.list.addLast(e);
        return this;
    }

    public LinkedList<E> build() {
        return new LinkedList<>(this.list);
    }

    public ChainBuilder<E> addAllFirst(E... eArr) {
        if (eArr != null) {
            for (E e : eArr) {
                addFirst(e);
            }
        }
        return this;
    }

    public ChainBuilder<E> addAllLast(E... eArr) {
        if (eArr != null) {
            for (E e : eArr) {
                addLast(e);
            }
        }
        return this;
    }
}
