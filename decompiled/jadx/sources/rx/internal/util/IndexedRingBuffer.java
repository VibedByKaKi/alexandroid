package rx.internal.util;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.PrintStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.Subscription;
import rx.functions.Func1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class IndexedRingBuffer<E> implements Subscription {
    private static final ObjectPool<IndexedRingBuffer<?>> POOL = new ObjectPool<IndexedRingBuffer<?>>() { // from class: rx.internal.util.IndexedRingBuffer.1
        @Override // rx.internal.util.ObjectPool
        public IndexedRingBuffer<?> createObject() {
            return new IndexedRingBuffer<>();
        }
    };
    static final int SIZE;
    static int defaultSize;
    private final ElementSection<E> elements = new ElementSection<>();
    private final IndexSection removed = new IndexSection();
    final AtomicInteger index = new AtomicInteger();
    final AtomicInteger removedIndex = new AtomicInteger();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ElementSection<E> {
        final AtomicReferenceArray<E> array = new AtomicReferenceArray<>(IndexedRingBuffer.SIZE);
        final AtomicReference<ElementSection<E>> next = new AtomicReference<>();

        public ElementSection<E> getNext() {
            if (this.next.get() != null) {
                return this.next.get();
            }
            ElementSection<E> elementSection = new ElementSection<>();
            AtomicReference<ElementSection<E>> atomicReference = this.next;
            while (!atomicReference.compareAndSet(null, elementSection)) {
                if (atomicReference.get() != null) {
                    return this.next.get();
                }
            }
            return elementSection;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class IndexSection {
        private final AtomicIntegerArray unsafeArray = new AtomicIntegerArray(IndexedRingBuffer.SIZE);
        private final AtomicReference<IndexSection> _next = new AtomicReference<>();

        public int getAndSet(int i, int i2) {
            return this.unsafeArray.getAndSet(i, i2);
        }

        public IndexSection getNext() {
            if (this._next.get() != null) {
                return this._next.get();
            }
            IndexSection indexSection = new IndexSection();
            AtomicReference<IndexSection> atomicReference = this._next;
            while (!atomicReference.compareAndSet(null, indexSection)) {
                if (atomicReference.get() != null) {
                    return this._next.get();
                }
            }
            return indexSection;
        }

        public void set(int i, int i2) {
            this.unsafeArray.set(i, i2);
        }
    }

    static {
        defaultSize = 256;
        if (PlatformDependent.isAndroid()) {
            defaultSize = 8;
        }
        String property = System.getProperty("rx.indexed-ring-buffer.size");
        if (property != null) {
            try {
                defaultSize = Integer.parseInt(property);
            } catch (NumberFormatException e) {
                PrintStream printStream = System.err;
                StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Failed to set 'rx.indexed-ring-buffer.size' with value ", property, " => ");
                m2m.append(e.getMessage());
                printStream.println(m2m.toString());
            }
        }
        SIZE = defaultSize;
    }

    private int forEach(Func1<? super E, Boolean> func1, int i, int i2) {
        int i3;
        int i4 = this.index.get();
        ElementSection<E> elementSection = this.elements;
        int i5 = SIZE;
        if (i >= i5) {
            elementSection = getElementSection(i);
            i %= i5;
            i3 = i;
        } else {
            i3 = i;
        }
        while (elementSection != null) {
            while (i < SIZE) {
                if (i3 >= i4 || i3 >= i2) {
                    return i3;
                }
                E e = elementSection.array.get(i);
                if (e != null && !func1.call(e).booleanValue()) {
                    return i3;
                }
                i++;
                i3++;
            }
            elementSection = elementSection.next.get();
            i = 0;
        }
        return i3;
    }

    private ElementSection<E> getElementSection(int i) {
        int i2 = SIZE;
        if (i < i2) {
            return this.elements;
        }
        int i3 = i / i2;
        ElementSection<E> elementSection = this.elements;
        for (int i4 = 0; i4 < i3; i4++) {
            elementSection = elementSection.getNext();
        }
        return elementSection;
    }

    private synchronized int getIndexForAdd() {
        int andIncrement;
        try {
            int indexFromPreviouslyRemoved = getIndexFromPreviouslyRemoved();
            if (indexFromPreviouslyRemoved >= 0) {
                int i = SIZE;
                if (indexFromPreviouslyRemoved < i) {
                    andIncrement = this.removed.getAndSet(indexFromPreviouslyRemoved, -1);
                } else {
                    andIncrement = getIndexSection(indexFromPreviouslyRemoved).getAndSet(indexFromPreviouslyRemoved % i, -1);
                }
                if (andIncrement == this.index.get()) {
                    this.index.getAndIncrement();
                }
            } else {
                andIncrement = this.index.getAndIncrement();
            }
        } catch (Throwable th) {
            throw th;
        }
        return andIncrement;
    }

    private synchronized int getIndexFromPreviouslyRemoved() {
        int i;
        int i2;
        do {
            i = this.removedIndex.get();
            if (i <= 0) {
                return -1;
            }
            i2 = i - 1;
        } while (!this.removedIndex.compareAndSet(i, i2));
        return i2;
    }

    private IndexSection getIndexSection(int i) {
        int i2 = SIZE;
        if (i < i2) {
            return this.removed;
        }
        int i3 = i / i2;
        IndexSection indexSection = this.removed;
        for (int i4 = 0; i4 < i3; i4++) {
            indexSection = indexSection.getNext();
        }
        return indexSection;
    }

    public static <T> IndexedRingBuffer<T> getInstance() {
        return (IndexedRingBuffer) POOL.borrowObject();
    }

    private synchronized void pushRemovedIndex(int i) {
        try {
            int andIncrement = this.removedIndex.getAndIncrement();
            int i2 = SIZE;
            if (andIncrement < i2) {
                this.removed.set(andIncrement, i);
            } else {
                getIndexSection(andIncrement).set(andIncrement % i2, i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public int add(E e) {
        int indexForAdd = getIndexForAdd();
        int i = SIZE;
        if (indexForAdd < i) {
            this.elements.array.set(indexForAdd, e);
            return indexForAdd;
        }
        getElementSection(indexForAdd).array.set(indexForAdd % i, e);
        return indexForAdd;
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return false;
    }

    public void releaseToPool() {
        int i = this.index.get();
        int i2 = 0;
        loop0: for (ElementSection<E> elementSection = this.elements; elementSection != null; elementSection = elementSection.next.get()) {
            int i3 = 0;
            while (i3 < SIZE) {
                if (i2 >= i) {
                    break loop0;
                }
                elementSection.array.set(i3, null);
                i3++;
                i2++;
            }
        }
        this.index.set(0);
        this.removedIndex.set(0);
        POOL.returnObject(this);
    }

    public E remove(int i) {
        E andSet;
        int i2 = SIZE;
        if (i < i2) {
            andSet = this.elements.array.getAndSet(i, null);
        } else {
            andSet = getElementSection(i).array.getAndSet(i % i2, null);
        }
        pushRemovedIndex(i);
        return andSet;
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        releaseToPool();
    }

    public int forEach(Func1<? super E, Boolean> func1, int i) {
        int forEach = forEach(func1, i, this.index.get());
        if (i > 0 && forEach == this.index.get()) {
            return forEach(func1, 0, i);
        }
        if (forEach == this.index.get()) {
            return 0;
        }
        return forEach;
    }

    public int forEach(Func1<? super E, Boolean> func1) {
        return forEach(func1, 0);
    }
}
