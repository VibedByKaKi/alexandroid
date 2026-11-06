package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtIncompatible;
import autovalue.shaded.com.google.errorprone.annotations.DoNotMock;
import java.lang.Comparable;
import java.util.Map;
import java.util.function.BiFunction;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
@DoNotMock("Use ImmutableRangeMap or TreeRangeMap")
/* loaded from: classes15.dex */
public interface RangeMap<K extends Comparable, V> {
    Map<Range<K>, V> asDescendingMapOfRanges();

    Map<Range<K>, V> asMapOfRanges();

    void clear();

    boolean equals(@CheckForNull Object obj);

    @CheckForNull
    V get(K k);

    @CheckForNull
    Map.Entry<Range<K>, V> getEntry(K k);

    int hashCode();

    void merge(Range<K> range, @CheckForNull V v, BiFunction<? super V, ? super V, ? extends V> biFunction);

    void put(Range<K> range, V v);

    void putAll(RangeMap<K, ? extends V> rangeMap);

    void putCoalescing(Range<K> range, V v);

    void remove(Range<K> range);

    Range<K> span();

    RangeMap<K, V> subRangeMap(Range<K> range);

    String toString();
}
