package org.apache.commons.collections4.iterators;

import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import org.apache.commons.collections4.Transformer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ObjectGraphIterator<E> implements Iterator<E> {
    private Iterator<? extends E> currentIterator;
    private E currentValue;
    private boolean hasNext;
    private Iterator<? extends E> lastUsedIterator;
    private E root;
    private final Deque<Iterator<? extends E>> stack;
    private final Transformer<? super E, ? extends E> transformer;

    public ObjectGraphIterator(E e, Transformer<? super E, ? extends E> transformer) {
        this.stack = new ArrayDeque(8);
        this.hasNext = false;
        if (e instanceof Iterator) {
            this.currentIterator = (Iterator) e;
        } else {
            this.root = e;
        }
        this.transformer = transformer;
    }

    public void findNext(E e) {
        if (e instanceof Iterator) {
            findNextByIterator((Iterator) e);
        } else {
            this.currentValue = e;
            this.hasNext = true;
        }
    }

    public void findNextByIterator(Iterator<? extends E> it2) {
        Iterator<? extends E> it3 = this.currentIterator;
        if (it2 != it3) {
            if (it3 != null) {
                this.stack.push(it3);
            }
            this.currentIterator = it2;
        }
        while (this.currentIterator.hasNext() && !this.hasNext) {
            E next = this.currentIterator.next();
            Transformer<? super E, ? extends E> transformer = this.transformer;
            if (transformer != null) {
                next = transformer.transform(next);
            }
            findNext(next);
        }
        if (this.hasNext || this.stack.isEmpty()) {
            return;
        }
        Iterator<? extends E> pop = this.stack.pop();
        this.currentIterator = pop;
        findNextByIterator(pop);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        updateCurrentIterator();
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public E next() {
        updateCurrentIterator();
        if (!this.hasNext) {
            PathKt$$ExternalSyntheticBUOutline0.m("No more elements in the iteration");
            return null;
        }
        this.lastUsedIterator = this.currentIterator;
        E e = this.currentValue;
        this.currentValue = null;
        this.hasNext = false;
        return e;
    }

    @Override // java.util.Iterator
    public void remove() {
        Iterator<? extends E> it2 = this.lastUsedIterator;
        if (it2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("Iterator remove() cannot be called at this time");
        } else {
            it2.remove();
            this.lastUsedIterator = null;
        }
    }

    public void updateCurrentIterator() {
        if (this.hasNext) {
            return;
        }
        Iterator<? extends E> it2 = this.currentIterator;
        if (it2 != null) {
            findNextByIterator(it2);
            return;
        }
        E e = this.root;
        if (e == null) {
            return;
        }
        Transformer<? super E, ? extends E> transformer = this.transformer;
        if (transformer == null) {
            findNext(e);
        } else {
            findNext(transformer.transform(e));
        }
        this.root = null;
    }

    public ObjectGraphIterator(Iterator<? extends E> it2) {
        this.stack = new ArrayDeque(8);
        this.hasNext = false;
        this.currentIterator = it2;
        this.transformer = null;
    }
}
