package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.annotations.GwtCompatible;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements ListMultimap<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    public AbstractListMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.amazon.coral.google.common.collect.AbstractMultimap, com.amazon.coral.google.common.collect.Multimap, com.amazon.coral.google.common.collect.ListMultimap
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // com.amazon.coral.google.common.collect.AbstractMapBasedMultimap
    public abstract List<V> createCollection();

    @Override // com.amazon.coral.google.common.collect.AbstractMultimap, com.amazon.coral.google.common.collect.Multimap, com.amazon.coral.google.common.collect.ListMultimap
    public boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.amazon.coral.google.common.collect.AbstractMapBasedMultimap, com.amazon.coral.google.common.collect.Multimap, com.amazon.coral.google.common.collect.ListMultimap
    public List<V> get(@ParametricNullness K k) {
        return (List) super.get((AbstractListMultimap<K, V>) k);
    }

    @Override // com.amazon.coral.google.common.collect.AbstractMapBasedMultimap, com.amazon.coral.google.common.collect.AbstractMultimap, com.amazon.coral.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness K k, @ParametricNullness V v) {
        return super.put(k, v);
    }

    @Override // com.amazon.coral.google.common.collect.AbstractMapBasedMultimap, com.amazon.coral.google.common.collect.Multimap, com.amazon.coral.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public List<V> removeAll(@CheckForNull Object obj) {
        return (List) super.removeAll(obj);
    }

    @Override // com.amazon.coral.google.common.collect.AbstractMapBasedMultimap, com.amazon.coral.google.common.collect.AbstractMultimap, com.amazon.coral.google.common.collect.Multimap, com.amazon.coral.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public List<V> replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable) {
        return (List) super.replaceValues((AbstractListMultimap<K, V>) k, (Iterable) iterable);
    }

    @Override // com.amazon.coral.google.common.collect.AbstractMapBasedMultimap
    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.amazon.coral.google.common.collect.AbstractMapBasedMultimap
    public Collection<V> wrapCollection(@ParametricNullness K k, Collection<V> collection) {
        return wrapList(k, (List) collection, null);
    }

    @Override // com.amazon.coral.google.common.collect.AbstractMapBasedMultimap
    public List<V> createUnmodifiableEmptyCollection() {
        return Collections.EMPTY_LIST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.coral.google.common.collect.AbstractMapBasedMultimap, com.amazon.coral.google.common.collect.Multimap, com.amazon.coral.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Collection get(@ParametricNullness Object obj) {
        return get((AbstractListMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.coral.google.common.collect.AbstractMapBasedMultimap, com.amazon.coral.google.common.collect.AbstractMultimap, com.amazon.coral.google.common.collect.Multimap, com.amazon.coral.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Collection replaceValues(@ParametricNullness Object obj, Iterable iterable) {
        return replaceValues((AbstractListMultimap<K, V>) obj, iterable);
    }
}
