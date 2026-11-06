package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.annotations.GwtCompatible;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public abstract class ForwardingListMultimap<K, V> extends ForwardingMultimap<K, V> implements ListMultimap<K, V> {
    @Override // com.amazon.coral.google.common.collect.ForwardingMultimap, com.amazon.coral.google.common.collect.ForwardingObject
    public abstract ListMultimap<K, V> delegate();

    @Override // com.amazon.coral.google.common.collect.ForwardingMultimap, com.amazon.coral.google.common.collect.Multimap, com.amazon.coral.google.common.collect.ListMultimap
    public List<V> get(@ParametricNullness K k) {
        return delegate().get((ListMultimap<K, V>) k);
    }

    @Override // com.amazon.coral.google.common.collect.ForwardingMultimap, com.amazon.coral.google.common.collect.Multimap, com.amazon.coral.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public List<V> removeAll(@CheckForNull Object obj) {
        return delegate().removeAll(obj);
    }

    @Override // com.amazon.coral.google.common.collect.ForwardingMultimap, com.amazon.coral.google.common.collect.Multimap, com.amazon.coral.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public List<V> replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable) {
        return delegate().replaceValues((ListMultimap<K, V>) k, (Iterable) iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.coral.google.common.collect.ForwardingMultimap, com.amazon.coral.google.common.collect.Multimap, com.amazon.coral.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Collection get(@ParametricNullness Object obj) {
        return get((ForwardingListMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.coral.google.common.collect.ForwardingMultimap, com.amazon.coral.google.common.collect.Multimap, com.amazon.coral.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Collection replaceValues(@ParametricNullness Object obj, Iterable iterable) {
        return replaceValues((ForwardingListMultimap<K, V>) obj, iterable);
    }
}
