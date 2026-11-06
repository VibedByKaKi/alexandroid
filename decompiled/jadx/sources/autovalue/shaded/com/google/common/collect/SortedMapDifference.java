package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;
import autovalue.shaded.com.google.common.collect.MapDifference;
import java.util.SortedMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes15.dex */
public interface SortedMapDifference<K, V> extends MapDifference<K, V> {
    @Override // autovalue.shaded.com.google.common.collect.MapDifference
    SortedMap<K, MapDifference.ValueDifference<V>> entriesDiffering();

    @Override // autovalue.shaded.com.google.common.collect.MapDifference
    SortedMap<K, V> entriesInCommon();

    @Override // autovalue.shaded.com.google.common.collect.MapDifference
    SortedMap<K, V> entriesOnlyOnLeft();

    @Override // autovalue.shaded.com.google.common.collect.MapDifference
    SortedMap<K, V> entriesOnlyOnRight();
}
