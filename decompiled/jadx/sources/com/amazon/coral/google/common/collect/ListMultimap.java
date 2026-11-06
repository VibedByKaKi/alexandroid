package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.annotations.GwtCompatible;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public interface ListMultimap<K, V> extends Multimap<K, V> {
    Map<K, Collection<V>> asMap();

    boolean equals(@CheckForNull Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default Collection get(@ParametricNullness Object obj) {
        return get((ListMultimap<K, V>) obj);
    }

    @Override // com.amazon.coral.google.common.collect.Multimap, com.amazon.coral.google.common.collect.ListMultimap
    List<V> get(@ParametricNullness K k);

    @Override // 
    @CanIgnoreReturnValue
    List<V> removeAll(@CheckForNull Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ default Collection replaceValues(@ParametricNullness Object obj, Iterable iterable) {
        return replaceValues((ListMultimap<K, V>) obj, iterable);
    }

    @Override // com.amazon.coral.google.common.collect.Multimap, com.amazon.coral.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    List<V> replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable);
}
