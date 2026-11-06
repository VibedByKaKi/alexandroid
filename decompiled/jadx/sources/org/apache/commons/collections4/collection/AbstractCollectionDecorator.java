package org.apache.commons.collections4.collection;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class AbstractCollectionDecorator<E> implements Collection<E>, Serializable {
    private static final long serialVersionUID = 6249888059822088500L;
    private Collection<E> collection;

    public AbstractCollectionDecorator(Collection<E> collection) {
        if (collection != null) {
            this.collection = collection;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Collection must not be null.");
            throw null;
        }
    }

    @Override // java.util.Collection, org.apache.commons.collections4.Bag
    public boolean add(E e) {
        return decorated().add(e);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return decorated().addAll(collection);
    }

    @Override // java.util.Collection
    public void clear() {
        decorated().clear();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return decorated().contains(obj);
    }

    @Override // java.util.Collection, org.apache.commons.collections4.Bag
    public boolean containsAll(Collection<?> collection) {
        return decorated().containsAll(collection);
    }

    public Collection<E> decorated() {
        return this.collection;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return decorated().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable, org.apache.commons.collections4.Bag
    public Iterator<E> iterator() {
        return decorated().iterator();
    }

    @Override // java.util.Collection, org.apache.commons.collections4.Bag
    public boolean remove(Object obj) {
        return decorated().remove(obj);
    }

    @Override // java.util.Collection, org.apache.commons.collections4.Bag
    public boolean removeAll(Collection<?> collection) {
        return decorated().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super E> predicate) {
        return decorated().removeIf(predicate);
    }

    @Override // java.util.Collection, org.apache.commons.collections4.Bag
    public boolean retainAll(Collection<?> collection) {
        return decorated().retainAll(collection);
    }

    public void setCollection(Collection<E> collection) {
        this.collection = collection;
    }

    @Override // java.util.Collection
    public int size() {
        return decorated().size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return decorated().toArray();
    }

    public String toString() {
        return decorated().toString();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) decorated().toArray(tArr);
    }

    public AbstractCollectionDecorator() {
    }
}
