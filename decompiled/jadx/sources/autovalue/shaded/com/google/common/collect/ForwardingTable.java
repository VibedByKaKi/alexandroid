package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;
import autovalue.shaded.com.google.common.collect.Table;
import autovalue.shaded.com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes15.dex */
public abstract class ForwardingTable<R, C, V> extends ForwardingObject implements Table<R, C, V> {
    @Override // autovalue.shaded.com.google.common.collect.Table
    public Set<Table.Cell<R, C, V>> cellSet() {
        return delegate().cellSet();
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    public void clear() {
        delegate().clear();
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    public Map<R, V> column(@ParametricNullness C c) {
        return delegate().column(c);
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    public Set<C> columnKeySet() {
        return delegate().columnKeySet();
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    public Map<C, Map<R, V>> columnMap() {
        return delegate().columnMap();
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    public boolean contains(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return delegate().contains(obj, obj2);
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    public boolean containsColumn(@CheckForNull Object obj) {
        return delegate().containsColumn(obj);
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    public boolean containsRow(@CheckForNull Object obj) {
        return delegate().containsRow(obj);
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    public boolean containsValue(@CheckForNull Object obj) {
        return delegate().containsValue(obj);
    }

    @Override // autovalue.shaded.com.google.common.collect.ForwardingObject
    public abstract Table<R, C, V> delegate();

    @Override // autovalue.shaded.com.google.common.collect.Table
    public boolean equals(@CheckForNull Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    @CheckForNull
    public V get(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return delegate().get(obj, obj2);
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    @CheckForNull
    @CanIgnoreReturnValue
    public V put(@ParametricNullness R r, @ParametricNullness C c, @ParametricNullness V v) {
        return delegate().put(r, c, v);
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
        delegate().putAll(table);
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    @CheckForNull
    @CanIgnoreReturnValue
    public V remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return delegate().remove(obj, obj2);
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    public Map<C, V> row(@ParametricNullness R r) {
        return delegate().row(r);
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    public Set<R> rowKeySet() {
        return delegate().rowKeySet();
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    public Map<R, Map<C, V>> rowMap() {
        return delegate().rowMap();
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    public int size() {
        return delegate().size();
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    public Collection<V> values() {
        return delegate().values();
    }
}
