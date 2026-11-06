package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public abstract class ForwardingSortedSetMultimap<K, V> extends ForwardingSetMultimap<K, V> implements SortedSetMultimap<K, V> {
    @Override // com.amazon.coral.google.common.collect.ForwardingSetMultimap, com.amazon.coral.google.common.collect.ForwardingMultimap, com.amazon.coral.google.common.collect.ForwardingObject
    public abstract SortedSetMultimap<K, V> delegate();

    @Override // com.amazon.coral.google.common.collect.ForwardingSetMultimap, com.amazon.coral.google.common.collect.ForwardingMultimap, com.amazon.coral.google.common.collect.Multimap, com.amazon.coral.google.common.collect.ListMultimap
    public SortedSet<V> get(@ParametricNullness K k) {
        return delegate().get((SortedSetMultimap<K, V>) k);
    }

    @Override // com.amazon.coral.google.common.collect.ForwardingSetMultimap, com.amazon.coral.google.common.collect.ForwardingMultimap, com.amazon.coral.google.common.collect.Multimap, com.amazon.coral.google.common.collect.ListMultimap
    public SortedSet<V> removeAll(@CheckForNull Object obj) {
        return delegate().removeAll(obj);
    }

    @Override // com.amazon.coral.google.common.collect.ForwardingSetMultimap, com.amazon.coral.google.common.collect.ForwardingMultimap, com.amazon.coral.google.common.collect.Multimap, com.amazon.coral.google.common.collect.ListMultimap
    public SortedSet<V> replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable) {
        return delegate().replaceValues((SortedSetMultimap<K, V>) k, (Iterable) iterable);
    }

    @Override // com.amazon.coral.google.common.collect.SortedSetMultimap
    @CheckForNull
    public Comparator<? super V> valueComparator() {
        return delegate().valueComparator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.coral.google.common.collect.ForwardingSetMultimap, com.amazon.coral.google.common.collect.ForwardingMultimap, com.amazon.coral.google.common.collect.Multimap, com.amazon.coral.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Set get(@ParametricNullness Object obj) {
        return get((ForwardingSortedSetMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.coral.google.common.collect.ForwardingSetMultimap, com.amazon.coral.google.common.collect.ForwardingMultimap, com.amazon.coral.google.common.collect.Multimap, com.amazon.coral.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Set replaceValues(@ParametricNullness Object obj, Iterable iterable) {
        return replaceValues((ForwardingSortedSetMultimap<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.coral.google.common.collect.ForwardingSetMultimap, com.amazon.coral.google.common.collect.ForwardingMultimap, com.amazon.coral.google.common.collect.Multimap, com.amazon.coral.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Collection get(@ParametricNullness Object obj) {
        return get((ForwardingSortedSetMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.coral.google.common.collect.ForwardingSetMultimap, com.amazon.coral.google.common.collect.ForwardingMultimap, com.amazon.coral.google.common.collect.Multimap, com.amazon.coral.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Collection replaceValues(@ParametricNullness Object obj, Iterable iterable) {
        return replaceValues((ForwardingSortedSetMultimap<K, V>) obj, iterable);
    }
}
