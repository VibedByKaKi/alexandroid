package org.apache.commons.collections4.set;

import java.util.Set;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.collection.PredicatedCollection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class PredicatedSet<E> extends PredicatedCollection<E> implements Set<E> {
    private static final long serialVersionUID = -684521469108685117L;

    public PredicatedSet(Set<E> set, Predicate<? super E> predicate) {
        super(set, predicate);
    }

    public static <E> PredicatedSet<E> predicatedSet(Set<E> set, Predicate<? super E> predicate) {
        return new PredicatedSet<>(set, predicate);
    }

    @Override // org.apache.commons.collections4.collection.AbstractCollectionDecorator
    public Set<E> decorated() {
        return (Set) super.decorated();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || decorated().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return decorated().hashCode();
    }
}
