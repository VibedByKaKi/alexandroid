package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtIncompatible;
import java.lang.Comparable;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes15.dex */
abstract class AbstractRangeSet<C extends Comparable> implements RangeSet<C> {
    @Override // autovalue.shaded.com.google.common.collect.RangeSet
    public void add(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // autovalue.shaded.com.google.common.collect.RangeSet
    public void addAll(RangeSet<C> rangeSet) {
        addAll(rangeSet.asRanges());
    }

    @Override // autovalue.shaded.com.google.common.collect.RangeSet
    public void clear() {
        remove(Range.all());
    }

    @Override // autovalue.shaded.com.google.common.collect.RangeSet
    public boolean contains(C c) {
        return rangeContaining(c) != null;
    }

    @Override // autovalue.shaded.com.google.common.collect.RangeSet
    public abstract boolean encloses(Range<C> range);

    @Override // autovalue.shaded.com.google.common.collect.RangeSet
    public boolean enclosesAll(RangeSet<C> rangeSet) {
        return enclosesAll(rangeSet.asRanges());
    }

    @Override // autovalue.shaded.com.google.common.collect.RangeSet
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RangeSet) {
            return asRanges().equals(((RangeSet) obj).asRanges());
        }
        return false;
    }

    @Override // autovalue.shaded.com.google.common.collect.RangeSet
    public final int hashCode() {
        return asRanges().hashCode();
    }

    @Override // autovalue.shaded.com.google.common.collect.RangeSet
    public boolean intersects(Range<C> range) {
        return !subRangeSet(range).isEmpty();
    }

    @Override // autovalue.shaded.com.google.common.collect.RangeSet
    public boolean isEmpty() {
        return asRanges().isEmpty();
    }

    @Override // autovalue.shaded.com.google.common.collect.RangeSet
    @CheckForNull
    public abstract Range<C> rangeContaining(C c);

    @Override // autovalue.shaded.com.google.common.collect.RangeSet
    public void remove(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // autovalue.shaded.com.google.common.collect.RangeSet
    public void removeAll(RangeSet<C> rangeSet) {
        removeAll(rangeSet.asRanges());
    }

    @Override // autovalue.shaded.com.google.common.collect.RangeSet
    public final String toString() {
        return asRanges().toString();
    }
}
