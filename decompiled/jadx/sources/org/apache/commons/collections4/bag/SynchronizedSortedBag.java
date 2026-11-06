package org.apache.commons.collections4.bag;

import java.util.Comparator;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.SortedBag;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class SynchronizedSortedBag<E> extends SynchronizedBag<E> implements SortedBag<E> {
    private static final long serialVersionUID = 722374056718497858L;

    public SynchronizedSortedBag(SortedBag<E> sortedBag) {
        super(sortedBag);
    }

    public static <E> SynchronizedSortedBag<E> synchronizedSortedBag(SortedBag<E> sortedBag) {
        return new SynchronizedSortedBag<>(sortedBag);
    }

    @Override // org.apache.commons.collections4.SortedBag
    public synchronized Comparator<? super E> comparator() {
        Comparator<? super E> comparator;
        synchronized (this.lock) {
            comparator = getSortedBag().comparator();
        }
        return comparator;
    }

    @Override // org.apache.commons.collections4.SortedBag
    public synchronized E first() {
        E first;
        synchronized (this.lock) {
            first = getSortedBag().first();
        }
        return first;
    }

    public SortedBag<E> getSortedBag() {
        return (SortedBag) decorated();
    }

    @Override // org.apache.commons.collections4.SortedBag
    public synchronized E last() {
        E last;
        synchronized (this.lock) {
            last = getSortedBag().last();
        }
        return last;
    }

    public SynchronizedSortedBag(Bag<E> bag, Object obj) {
        super(bag, obj);
    }
}
