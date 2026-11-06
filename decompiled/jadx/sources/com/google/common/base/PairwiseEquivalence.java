package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible(serializable = true)
/* loaded from: classes8.dex */
final class PairwiseEquivalence<E, T extends E> extends Equivalence<Iterable<T>> implements Serializable {

    @J2ktIncompatible
    @GwtIncompatible
    private static final long serialVersionUID = 1;
    final Equivalence<E> elementEquivalence;

    public PairwiseEquivalence(Equivalence<E> equivalence) {
        this.elementEquivalence = (Equivalence) Preconditions.checkNotNull(equivalence);
    }

    @Override // com.google.common.base.Equivalence
    public boolean doEquivalent(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it2 = iterable.iterator();
        Iterator<T> it3 = iterable2.iterator();
        while (it2.hasNext() && it3.hasNext()) {
            if (!this.elementEquivalence.equivalent(it2.next(), it3.next())) {
                return false;
            }
        }
        return (it2.hasNext() || it3.hasNext()) ? false : true;
    }

    @Override // com.google.common.base.Equivalence
    public int doHash(Iterable<T> iterable) {
        Iterator<T> it2 = iterable.iterator();
        int i = 78721;
        while (it2.hasNext()) {
            i = (i * 24943) + this.elementEquivalence.hash(it2.next());
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PairwiseEquivalence) {
            return this.elementEquivalence.equals(((PairwiseEquivalence) obj).elementEquivalence);
        }
        return false;
    }

    public int hashCode() {
        return this.elementEquivalence.hashCode() ^ 1185147655;
    }

    public String toString() {
        return this.elementEquivalence + ".pairwise()";
    }
}
