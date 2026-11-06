package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtIncompatible;
import autovalue.shaded.com.google.errorprone.annotations.DoNotMock;
import java.lang.Comparable;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
@DoNotMock("Use ImmutableRangeSet or TreeRangeSet")
/* loaded from: classes15.dex */
public interface RangeSet<C extends Comparable> {
    void add(Range<C> range);

    void addAll(RangeSet<C> rangeSet);

    default void addAll(Iterable<Range<C>> iterable) {
        Iterator<Range<C>> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    Set<Range<C>> asDescendingSetOfRanges();

    Set<Range<C>> asRanges();

    void clear();

    RangeSet<C> complement();

    boolean contains(C c);

    boolean encloses(Range<C> range);

    boolean enclosesAll(RangeSet<C> rangeSet);

    default boolean enclosesAll(Iterable<Range<C>> iterable) {
        Iterator<Range<C>> it2 = iterable.iterator();
        while (it2.hasNext()) {
            if (!encloses(it2.next())) {
                return false;
            }
        }
        return true;
    }

    boolean equals(@CheckForNull Object obj);

    int hashCode();

    boolean intersects(Range<C> range);

    boolean isEmpty();

    @CheckForNull
    Range<C> rangeContaining(C c);

    void remove(Range<C> range);

    void removeAll(RangeSet<C> rangeSet);

    default void removeAll(Iterable<Range<C>> iterable) {
        Iterator<Range<C>> it2 = iterable.iterator();
        while (it2.hasNext()) {
            remove(it2.next());
        }
    }

    Range<C> span();

    RangeSet<C> subRangeSet(Range<C> range);

    String toString();
}
