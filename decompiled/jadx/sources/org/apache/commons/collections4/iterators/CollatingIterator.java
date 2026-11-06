package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.list.UnmodifiableList;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class CollatingIterator<E> implements Iterator<E> {
    private Comparator<? super E> comparator;
    private List<Iterator<? extends E>> iterators;
    private int lastReturned;
    private BitSet valueSet;
    private List<E> values;

    public CollatingIterator(Comparator<? super E> comparator, Collection<Iterator<? extends E>> collection) {
        this(comparator, collection.size());
        Iterator<Iterator<? extends E>> it2 = collection.iterator();
        while (it2.hasNext()) {
            addIterator(it2.next());
        }
    }

    private boolean anyHasNext(List<Iterator<? extends E>> list) {
        Iterator<Iterator<? extends E>> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().hasNext()) {
                return true;
            }
        }
        return false;
    }

    private boolean anyValueSet(BitSet bitSet) {
        for (int i = 0; i < bitSet.size(); i++) {
            if (bitSet.get(i)) {
                return true;
            }
        }
        return false;
    }

    private void checkNotStarted() throws IllegalStateException {
        if (this.values == null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Can't do that after next or hasNext has been called.");
    }

    private void clear(int i) {
        this.values.set(i, null);
        this.valueSet.clear(i);
    }

    private int least() {
        E e = null;
        int i = -1;
        for (int i2 = 0; i2 < this.values.size(); i2++) {
            if (!this.valueSet.get(i2)) {
                set(i2);
            }
            if (this.valueSet.get(i2)) {
                List<E> list = this.values;
                if (i == -1) {
                    e = list.get(i2);
                    i = i2;
                } else {
                    E e2 = list.get(i2);
                    Comparator<? super E> comparator = this.comparator;
                    if (comparator == null) {
                        Single$$ExternalSyntheticBUOutline0.m$1("You must invoke setComparator() to set a comparator first.");
                        return 0;
                    }
                    if (comparator.compare(e2, e) < 0) {
                        i = i2;
                        e = e2;
                    }
                }
            }
        }
        return i;
    }

    private boolean set(int i) {
        Iterator<? extends E> it2 = this.iterators.get(i);
        boolean hasNext = it2.hasNext();
        List<E> list = this.values;
        if (hasNext) {
            list.set(i, it2.next());
            this.valueSet.set(i);
            return true;
        }
        list.set(i, null);
        this.valueSet.clear(i);
        return false;
    }

    private void start() {
        if (this.values == null) {
            this.values = new ArrayList(this.iterators.size());
            this.valueSet = new BitSet(this.iterators.size());
            for (int i = 0; i < this.iterators.size(); i++) {
                this.values.add(null);
                this.valueSet.clear(i);
            }
        }
    }

    public void addIterator(Iterator<? extends E> it2) {
        checkNotStarted();
        if (it2 != null) {
            this.iterators.add(it2);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Iterator must not be null");
        }
    }

    public Comparator<? super E> getComparator() {
        return this.comparator;
    }

    public int getIteratorIndex() {
        int i = this.lastReturned;
        if (i != -1) {
            return i;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("No value has been returned yet");
        return 0;
    }

    public List<Iterator<? extends E>> getIterators() {
        return UnmodifiableList.unmodifiableList(this.iterators);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        start();
        return anyValueSet(this.valueSet) || anyHasNext(this.iterators);
    }

    @Override // java.util.Iterator
    public E next() throws NoSuchElementException {
        if (!hasNext()) {
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int least = least();
        if (least == -1) {
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        E e = this.values.get(least);
        clear(least);
        this.lastReturned = least;
        return e;
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.lastReturned;
        if (i != -1) {
            this.iterators.get(i).remove();
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("No value can be removed at present");
        }
    }

    public void setComparator(Comparator<? super E> comparator) {
        checkNotStarted();
        this.comparator = comparator;
    }

    public void setIterator(int i, Iterator<? extends E> it2) {
        checkNotStarted();
        if (it2 != null) {
            this.iterators.set(i, it2);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Iterator must not be null");
        }
    }

    public CollatingIterator(Comparator<? super E> comparator) {
        this(comparator, 2);
    }

    public CollatingIterator(Comparator<? super E> comparator, int i) {
        this.comparator = null;
        this.iterators = null;
        this.values = null;
        this.valueSet = null;
        this.lastReturned = -1;
        this.iterators = new ArrayList(i);
        setComparator(comparator);
    }

    public CollatingIterator(Comparator<? super E> comparator, Iterator<? extends E> it2, Iterator<? extends E> it3) {
        this(comparator, 2);
        addIterator(it2);
        addIterator(it3);
    }

    public CollatingIterator(Comparator<? super E> comparator, Iterator<? extends E>[] itArr) {
        this(comparator, itArr.length);
        for (Iterator<? extends E> it2 : itArr) {
            addIterator(it2);
        }
    }

    public CollatingIterator() {
        this((Comparator) null, 2);
    }
}
