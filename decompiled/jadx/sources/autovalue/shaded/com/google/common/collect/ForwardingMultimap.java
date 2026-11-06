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
public abstract class ForwardingMultimap<K, V> extends ForwardingObject implements Multimap<K, V> {
    @Override // autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    public Map<K, Collection<V>> asMap() {
        return delegate().asMap();
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    public void clear() {
        delegate().clear();
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    public boolean containsEntry(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return delegate().containsEntry(obj, obj2);
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    public boolean containsKey(@CheckForNull Object obj) {
        return delegate().containsKey(obj);
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    public boolean containsValue(@CheckForNull Object obj) {
        return delegate().containsValue(obj);
    }

    @Override // autovalue.shaded.com.google.common.collect.ForwardingObject
    public abstract Multimap<K, V> delegate();

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    public Collection<Map.Entry<K, V>> entries() {
        return delegate().entries();
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    public boolean equals(@CheckForNull Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    public Collection<V> get(@ParametricNullness K k) {
        return delegate().get(k);
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    public Set<K> keySet() {
        return delegate().keySet();
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    public Multiset<K> keys() {
        return delegate().keys();
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness K k, @ParametricNullness V v) {
        return delegate().put(k, v);
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean putAll(@ParametricNullness K k, Iterable<? extends V> iterable) {
        return delegate().putAll(k, iterable);
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return delegate().remove(obj, obj2);
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public Collection<V> removeAll(@CheckForNull Object obj) {
        return delegate().removeAll(obj);
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap, autovalue.shaded.com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public Collection<V> replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable) {
        return delegate().replaceValues(k, iterable);
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    public int size() {
        return delegate().size();
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    public Collection<V> values() {
        return delegate().values();
    }

    @Override // autovalue.shaded.com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
        return delegate().putAll(multimap);
    }
}
