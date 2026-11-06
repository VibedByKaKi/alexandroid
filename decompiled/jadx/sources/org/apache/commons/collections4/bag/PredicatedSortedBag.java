package org.apache.commons.collections4.bag;

import java.util.Comparator;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.SortedBag;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class PredicatedSortedBag<E> extends PredicatedBag<E> implements SortedBag<E> {
    private static final long serialVersionUID = 3448581314086406616L;

    public PredicatedSortedBag(SortedBag<E> sortedBag, Predicate<? super E> predicate) {
        super(sortedBag, predicate);
    }

    public static <E> PredicatedSortedBag<E> predicatedSortedBag(SortedBag<E> sortedBag, Predicate<? super E> predicate) {
        return new PredicatedSortedBag<>(sortedBag, predicate);
    }

    @Override // org.apache.commons.collections4.SortedBag
    public Comparator<? super E> comparator() {
        return decorated().comparator();
    }

    @Override // org.apache.commons.collections4.bag.PredicatedBag, org.apache.commons.collections4.collection.AbstractCollectionDecorator
    public SortedBag<E> decorated() {
        return (SortedBag) super.decorated();
    }

    @Override // org.apache.commons.collections4.SortedBag
    public E first() {
        return decorated().first();
    }

    @Override // org.apache.commons.collections4.SortedBag
    public E last() {
        return decorated().last();
    }
}
