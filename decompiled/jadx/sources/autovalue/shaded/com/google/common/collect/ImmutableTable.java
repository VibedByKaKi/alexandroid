package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;
import autovalue.shaded.com.google.common.annotations.GwtIncompatible;
import autovalue.shaded.com.google.common.annotations.J2ktIncompatible;
import autovalue.shaded.com.google.common.base.MoreObjects;
import autovalue.shaded.com.google.common.base.Preconditions;
import autovalue.shaded.com.google.common.collect.ImmutableList;
import autovalue.shaded.com.google.common.collect.Table;
import autovalue.shaded.com.google.common.collect.Tables;
import autovalue.shaded.com.google.errorprone.annotations.CanIgnoreReturnValue;
import autovalue.shaded.com.google.errorprone.annotations.DoNotCall;
import autovalue.shaded.com.google.errorprone.annotations.DoNotMock;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes15.dex */
public abstract class ImmutableTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {
    private static final long serialVersionUID = -889275714;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final int[] cellColumnIndices;
        private final int[] cellRowIndices;
        private final Object[] cellValues;
        private final Object[] columnKeys;
        private final Object[] rowKeys;

        private SerializedForm(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.rowKeys = objArr;
            this.columnKeys = objArr2;
            this.cellValues = objArr3;
            this.cellRowIndices = iArr;
            this.cellColumnIndices = iArr2;
        }

        public static SerializedForm create(ImmutableTable<?, ?, ?> immutableTable, int[] iArr, int[] iArr2) {
            return new SerializedForm(immutableTable.rowKeySet().toArray(), immutableTable.columnKeySet().toArray(), immutableTable.values().toArray(), iArr, iArr2);
        }

        public Object readResolve() {
            Object[] objArr = this.cellValues;
            if (objArr.length == 0) {
                return ImmutableTable.of();
            }
            int i = 0;
            if (objArr.length == 1) {
                return ImmutableTable.of(this.rowKeys[0], this.columnKeys[0], objArr[0]);
            }
            ImmutableList.Builder builder = new ImmutableList.Builder(objArr.length);
            while (true) {
                Object[] objArr2 = this.cellValues;
                if (i >= objArr2.length) {
                    return RegularImmutableTable.forOrderedComponents(builder.build(), ImmutableSet.copyOf(this.rowKeys), ImmutableSet.copyOf(this.columnKeys));
                }
                builder.add((ImmutableList.Builder) ImmutableTable.cellOf(this.rowKeys[this.cellRowIndices[i]], this.columnKeys[this.cellColumnIndices[i]], objArr2[i]));
                i++;
            }
        }
    }

    public static <R, C, V> Builder<R, C, V> builder() {
        return new Builder<>();
    }

    public static <R, C, V> Table.Cell<R, C, V> cellOf(R r, C c, V v) {
        return Tables.immutableCell(Preconditions.checkNotNull(r, "rowKey"), Preconditions.checkNotNull(c, "columnKey"), Preconditions.checkNotNull(v, "value"));
    }

    public static <R, C, V> ImmutableTable<R, C, V> copyOf(Iterable<? extends Table.Cell<? extends R, ? extends C, ? extends V>> iterable) {
        Builder builder = builder();
        Iterator<? extends Table.Cell<? extends R, ? extends C, ? extends V>> it2 = iterable.iterator();
        while (it2.hasNext()) {
            builder.put(it2.next());
        }
        return builder.build();
    }

    public static <R, C, V> ImmutableTable<R, C, V> of(R r, C c, V v) {
        return new SingletonImmutableTable(r, c, v);
    }

    @GwtIncompatible
    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <T, R, C, V> Collector<T, ?, ImmutableTable<R, C, V>> toImmutableTable(Function<? super T, ? extends R> function, Function<? super T, ? extends C> function2, Function<? super T, ? extends V> function3) {
        return TableCollectors.toImmutableTable(function, function2, function3);
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable
    public final UnmodifiableIterator<Table.Cell<R, C, V>> cellIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable, autovalue.shaded.com.google.common.collect.Table
    public ImmutableSet<Table.Cell<R, C, V>> cellSet() {
        return (ImmutableSet) super.cellSet();
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable
    public final Spliterator<Table.Cell<R, C, V>> cellSpliterator() {
        throw new AssertionError("should never be called");
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable, autovalue.shaded.com.google.common.collect.Table
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    public ImmutableMap<R, V> column(C c) {
        Preconditions.checkNotNull(c, "columnKey");
        return (ImmutableMap) MoreObjects.firstNonNull((ImmutableMap) columnMap().get(c), ImmutableMap.of());
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable, autovalue.shaded.com.google.common.collect.Table
    public ImmutableSet<C> columnKeySet() {
        return columnMap().keySet();
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    public abstract ImmutableMap<C, Map<R, V>> columnMap();

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable, autovalue.shaded.com.google.common.collect.Table
    public boolean contains(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return get(obj, obj2) != null;
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable, autovalue.shaded.com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsColumn(@CheckForNull Object obj) {
        return super.containsColumn(obj);
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable, autovalue.shaded.com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsRow(@CheckForNull Object obj) {
        return super.containsRow(obj);
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable, autovalue.shaded.com.google.common.collect.Table
    public boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable
    public abstract ImmutableSet<Table.Cell<R, C, V>> createCellSet();

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable
    public abstract ImmutableCollection<V> createValues();

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable, autovalue.shaded.com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable, autovalue.shaded.com.google.common.collect.Table
    @CheckForNull
    public /* bridge */ /* synthetic */ Object get(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.get(obj, obj2);
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable, autovalue.shaded.com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable, autovalue.shaded.com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable, autovalue.shaded.com.google.common.collect.Table
    @CheckForNull
    @Deprecated
    @DoNotCall("Always throws UnsupportedOperationException")
    @CanIgnoreReturnValue
    public final V put(R r, C c, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable, autovalue.shaded.com.google.common.collect.Table
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(Table<? extends R, ? extends C, ? extends V> table) {
        throw new UnsupportedOperationException();
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable, autovalue.shaded.com.google.common.collect.Table
    @CheckForNull
    @Deprecated
    @DoNotCall("Always throws UnsupportedOperationException")
    @CanIgnoreReturnValue
    public final V remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    public ImmutableMap<C, V> row(R r) {
        Preconditions.checkNotNull(r, "rowKey");
        return (ImmutableMap) MoreObjects.firstNonNull((ImmutableMap) rowMap().get(r), ImmutableMap.of());
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable, autovalue.shaded.com.google.common.collect.Table
    public ImmutableSet<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // autovalue.shaded.com.google.common.collect.Table
    public abstract ImmutableMap<R, Map<C, V>> rowMap();

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable, autovalue.shaded.com.google.common.collect.Table
    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    @Override // autovalue.shaded.com.google.common.collect.AbstractTable
    public final Iterator<V> valuesIterator() {
        throw new AssertionError("should never be called");
    }

    @GwtIncompatible
    @J2ktIncompatible
    public abstract Object writeReplace();

    public static <T, R, C, V> Collector<T, ?, ImmutableTable<R, C, V>> toImmutableTable(Function<? super T, ? extends R> function, Function<? super T, ? extends C> function2, Function<? super T, ? extends V> function3, BinaryOperator<V> binaryOperator) {
        return TableCollectors.toImmutableTable(function, function2, function3, binaryOperator);
    }

    public static <R, C, V> ImmutableTable<R, C, V> of() {
        return (ImmutableTable<R, C, V>) SparseImmutableTable.EMPTY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // autovalue.shaded.com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map column(Object obj) {
        return column((ImmutableTable<R, C, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // autovalue.shaded.com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map row(Object obj) {
        return row((ImmutableTable<R, C, V>) obj);
    }

    public static <R, C, V> ImmutableTable<R, C, V> copyOf(Table<? extends R, ? extends C, ? extends V> table) {
        if (table instanceof ImmutableTable) {
            return (ImmutableTable) table;
        }
        return copyOf(table.cellSet());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @DoNotMock
    public static final class Builder<R, C, V> {
        private final List<Table.Cell<R, C, V>> cells = Lists.newArrayList();

        @CheckForNull
        private Comparator<? super C> columnComparator;

        @CheckForNull
        private Comparator<? super R> rowComparator;

        public ImmutableTable<R, C, V> build() {
            return buildOrThrow();
        }

        public ImmutableTable<R, C, V> buildOrThrow() {
            int size = this.cells.size();
            if (size == 0) {
                return ImmutableTable.of();
            }
            List<Table.Cell<R, C, V>> list = this.cells;
            return size != 1 ? RegularImmutableTable.forCells(list, this.rowComparator, this.columnComparator) : new SingletonImmutableTable((Table.Cell) Iterables.getOnlyElement(list));
        }

        @CanIgnoreReturnValue
        public Builder<R, C, V> combine(Builder<R, C, V> builder) {
            this.cells.addAll(builder.cells);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<R, C, V> orderColumnsBy(Comparator<? super C> comparator) {
            this.columnComparator = (Comparator) Preconditions.checkNotNull(comparator, "columnComparator");
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<R, C, V> orderRowsBy(Comparator<? super R> comparator) {
            this.rowComparator = (Comparator) Preconditions.checkNotNull(comparator, "rowComparator");
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<R, C, V> put(Table.Cell<? extends R, ? extends C, ? extends V> cell) {
            if (!(cell instanceof Tables.ImmutableCell)) {
                put(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
                return this;
            }
            Preconditions.checkNotNull(cell.getRowKey(), "row");
            Preconditions.checkNotNull(cell.getColumnKey(), "column");
            Preconditions.checkNotNull(cell.getValue(), "value");
            this.cells.add(cell);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<R, C, V> putAll(Table<? extends R, ? extends C, ? extends V> table) {
            Iterator<Table.Cell<? extends R, ? extends C, ? extends V>> it2 = table.cellSet().iterator();
            while (it2.hasNext()) {
                put(it2.next());
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<R, C, V> put(R r, C c, V v) {
            this.cells.add(ImmutableTable.cellOf(r, c, v));
            return this;
        }
    }
}
