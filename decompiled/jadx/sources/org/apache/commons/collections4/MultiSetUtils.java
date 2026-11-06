package org.apache.commons.collections4;

import org.apache.commons.collections4.multiset.HashMultiSet;
import org.apache.commons.collections4.multiset.PredicatedMultiSet;
import org.apache.commons.collections4.multiset.SynchronizedMultiSet;
import org.apache.commons.collections4.multiset.UnmodifiableMultiSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class MultiSetUtils {
    public static final MultiSet EMPTY_MULTISET = UnmodifiableMultiSet.unmodifiableMultiSet(new HashMultiSet());

    private MultiSetUtils() {
    }

    public static <E> MultiSet<E> emptyMultiSet() {
        return EMPTY_MULTISET;
    }

    public static <E> MultiSet<E> predicatedMultiSet(MultiSet<E> multiSet, Predicate<? super E> predicate) {
        return PredicatedMultiSet.predicatedMultiSet(multiSet, predicate);
    }

    public static <E> MultiSet<E> synchronizedMultiSet(MultiSet<E> multiSet) {
        return SynchronizedMultiSet.synchronizedMultiSet(multiSet);
    }

    public static <E> MultiSet<E> unmodifiableMultiSet(MultiSet<? extends E> multiSet) {
        return UnmodifiableMultiSet.unmodifiableMultiSet(multiSet);
    }
}
