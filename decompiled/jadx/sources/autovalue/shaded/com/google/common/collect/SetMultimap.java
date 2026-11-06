package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;
import autovalue.shaded.com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes15.dex */
public interface SetMultimap<K, V> extends Multimap<K, V> {
    @Override // autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    Map<K, Collection<V>> asMap();

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    Set<Map.Entry<K, V>> entries();

    @Override // autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    boolean equals(@CheckForNull Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    /* bridge */ /* synthetic */ default Collection get(@ParametricNullness Object obj) {
        return get((SetMultimap<K, V>) obj);
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    Set<V> get(@ParametricNullness K k);

    @Override // autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    Set<V> removeAll(@CheckForNull Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ default Collection replaceValues(@ParametricNullness Object obj, Iterable iterable) {
        return replaceValues((SetMultimap<K, V>) obj, iterable);
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    Set<V> replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable);
}
