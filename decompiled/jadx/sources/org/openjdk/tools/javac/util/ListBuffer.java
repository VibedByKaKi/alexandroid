package org.openjdk.tools.javac.util;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class ListBuffer<A> extends AbstractQueue<A> {
    private int count;
    private List<A> elems;
    private List<A> last;
    private boolean shared;

    public ListBuffer() {
        clear();
    }

    private void copy() {
        if (!this.elems.nonEmpty()) {
            return;
        }
        List<A> list = this.elems;
        List<A> of = List.of((Object) list.head);
        this.last = of;
        this.elems = of;
        while (true) {
            list = list.tail;
            if (!list.nonEmpty()) {
                return;
            }
            this.last.tail = List.of((Object) list.head);
            this.last = this.last.tail;
        }
    }

    public static <T> ListBuffer<T> of(T t) {
        ListBuffer<T> listBuffer = new ListBuffer<>();
        listBuffer.add(t);
        return listBuffer;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(A a2) {
        append(a2);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends A> collection) {
        Iterator<? extends A> it2 = collection.iterator();
        while (it2.hasNext()) {
            append(it2.next());
        }
        return true;
    }

    public ListBuffer<A> append(A a2) {
        Assert.checkNonNull(a2);
        if (this.shared) {
            copy();
        }
        List<A> of = List.of((Object) a2);
        List<A> list = this.last;
        if (list != null) {
            list.tail = of;
            this.last = of;
        } else {
            this.last = of;
            this.elems = of;
        }
        this.count++;
        return this;
    }

    public ListBuffer<A> appendArray(A[] aArr) {
        for (A a2 : aArr) {
            append(a2);
        }
        return this;
    }

    public ListBuffer<A> appendList(List<A> list) {
        while (list.nonEmpty()) {
            append(list.head);
            list = list.tail;
        }
        return this;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.elems = List.nil();
        this.last = null;
        this.count = 0;
        this.shared = false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.elems.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public A first() {
        return this.elems.head;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<A> iterator() {
        return new Iterator<A>() { // from class: org.openjdk.tools.javac.util.ListBuffer.1
            List<A> elems;

            {
                this.elems = ListBuffer.this.elems;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return !this.elems.isEmpty();
            }

            @Override // java.util.Iterator
            public A next() {
                if (this.elems.isEmpty()) {
                    Single$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                List<A> list = this.elems;
                A a2 = list.head;
                this.elems = list.tail;
                return a2;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public A last() {
        List<A> list = this.last;
        if (list != null) {
            return list.head;
        }
        return null;
    }

    public int length() {
        return this.count;
    }

    public A next() {
        List<A> list = this.elems;
        A a2 = list.head;
        if (!list.isEmpty()) {
            List<A> list2 = this.elems.tail;
            this.elems = list2;
            if (list2.isEmpty()) {
                this.last = null;
            }
            this.count--;
        }
        return a2;
    }

    public boolean nonEmpty() {
        return this.count != 0;
    }

    @Override // java.util.Queue
    public boolean offer(A a2) {
        append(a2);
        return true;
    }

    @Override // java.util.Queue
    public A peek() {
        return first();
    }

    @Override // java.util.Queue
    public A poll() {
        return next();
    }

    public ListBuffer<A> prepend(A a2) {
        List<A> prepend = this.elems.prepend(a2);
        this.elems = prepend;
        if (this.last == null) {
            this.last = prepend;
        }
        this.count++;
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.count;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public List<A> toList() {
        this.shared = true;
        return this.elems;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.elems.toArray(tArr);
    }

    public ListBuffer<A> appendList(ListBuffer<A> listBuffer) {
        return appendList(listBuffer.toList());
    }
}
