package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;
import autovalue.shaded.com.google.common.collect.AbstractMapBasedMultimap;
import autovalue.shaded.com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes15.dex */
abstract class AbstractSetMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements SetMultimap<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    public AbstractSetMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractMultimap, autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractMapBasedMultimap
    public abstract Set<V> createCollection();

    @Override // autovalue.shaded.com.google.common.collect.AbstractMapBasedMultimap, autovalue.shaded.com.google.common.collect.AbstractMultimap, autovalue.shaded.com.google.common.collect.Multimap
    public Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractMultimap, autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    public boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractMapBasedMultimap, autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    public Set<V> get(@ParametricNullness K k) {
        return (Set) super.get((AbstractSetMultimap<K, V>) k);
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractMapBasedMultimap, autovalue.shaded.com.google.common.collect.AbstractMultimap, autovalue.shaded.com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness K k, @ParametricNullness V v) {
        return super.put(k, v);
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractMapBasedMultimap, autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public Set<V> removeAll(@CheckForNull Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractMapBasedMultimap, autovalue.shaded.com.google.common.collect.AbstractMultimap, autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public Set<V> replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable) {
        return (Set) super.replaceValues((AbstractSetMultimap<K, V>) k, (Iterable) iterable);
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractMapBasedMultimap
    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractMapBasedMultimap
    public Collection<V> wrapCollection(@ParametricNullness K k, Collection<V> collection) {
        return new AbstractMapBasedMultimap.WrappedSet(k, (Set) collection);
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractMapBasedMultimap
    public Set<V> createUnmodifiableEmptyCollection() {
        return Collections.EMPTY_SET;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // autovalue.shaded.com.google.common.collect.AbstractMapBasedMultimap, autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Collection get(@ParametricNullness Object obj) {
        return get((AbstractSetMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // autovalue.shaded.com.google.common.collect.AbstractMapBasedMultimap, autovalue.shaded.com.google.common.collect.AbstractMultimap, autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Collection replaceValues(@ParametricNullness Object obj, Iterable iterable) {
        return replaceValues((AbstractSetMultimap<K, V>) obj, iterable);
    }
}
