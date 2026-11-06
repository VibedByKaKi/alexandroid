package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import org.apache.commons.collections4.Predicate;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class FilterIterator<E> implements Iterator<E> {
    private Iterator<? extends E> iterator;
    private E nextObject;
    private boolean nextObjectSet = false;
    private Predicate<? super E> predicate;

    public FilterIterator(Iterator<? extends E> it2, Predicate<? super E> predicate) {
        this.iterator = it2;
        this.predicate = predicate;
    }

    private boolean setNextObject() {
        while (this.iterator.hasNext()) {
            E next = this.iterator.next();
            if (this.predicate.evaluate(next)) {
                this.nextObject = next;
                this.nextObjectSet = true;
                return true;
            }
        }
        return false;
    }

    public Iterator<? extends E> getIterator() {
        return this.iterator;
    }

    public Predicate<? super E> getPredicate() {
        return this.predicate;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.nextObjectSet || setNextObject();
    }

    @Override // java.util.Iterator
    public E next() {
        if (this.nextObjectSet || setNextObject()) {
            this.nextObjectSet = false;
            return this.nextObject;
        }
        Single$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.nextObjectSet) {
            Single$$ExternalSyntheticBUOutline0.m$2("remove() cannot be called");
        } else {
            this.iterator.remove();
        }
    }

    public void setIterator(Iterator<? extends E> it2) {
        this.iterator = it2;
        this.nextObject = null;
        this.nextObjectSet = false;
    }

    public void setPredicate(Predicate<? super E> predicate) {
        this.predicate = predicate;
        this.nextObject = null;
        this.nextObjectSet = false;
    }

    public FilterIterator(Iterator<? extends E> it2) {
        this.iterator = it2;
    }

    public FilterIterator() {
    }
}
