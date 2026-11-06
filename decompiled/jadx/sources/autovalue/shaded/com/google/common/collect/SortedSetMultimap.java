package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;
import autovalue.shaded.com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes15.dex */
public interface SortedSetMultimap<K, V> extends SetMultimap<K, V> {
    @Override // autovalue.shaded.com.google.common.collect.SetMultimap, autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    Map<K, Collection<V>> asMap();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // autovalue.shaded.com.google.common.collect.SetMultimap, autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    /* bridge */ /* synthetic */ default Collection get(@ParametricNullness Object obj) {
        return get((SortedSetMultimap<K, V>) obj);
    }

    @Override // autovalue.shaded.com.google.common.collect.SetMultimap, autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    SortedSet<V> get(@ParametricNullness K k);

    @Override // autovalue.shaded.com.google.common.collect.SetMultimap, autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    SortedSet<V> removeAll(@CheckForNull Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // autovalue.shaded.com.google.common.collect.SetMultimap, autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ default Collection replaceValues(@ParametricNullness Object obj, Iterable iterable) {
        return replaceValues((SortedSetMultimap<K, V>) obj, iterable);
    }

    @Override // autovalue.shaded.com.google.common.collect.SetMultimap, autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    SortedSet<V> replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable);

    @CheckForNull
    Comparator<? super V> valueComparator();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // autovalue.shaded.com.google.common.collect.SetMultimap, autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    /* bridge */ /* synthetic */ default Set get(@ParametricNullness Object obj) {
        return get((SortedSetMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // autovalue.shaded.com.google.common.collect.SetMultimap, autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ default Set replaceValues(@ParametricNullness Object obj, Iterable iterable) {
        return replaceValues((SortedSetMultimap<K, V>) obj, iterable);
    }
}
