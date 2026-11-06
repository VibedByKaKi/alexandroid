package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;
import autovalue.shaded.com.google.errorprone.annotations.CanIgnoreReturnValue;
import autovalue.shaded.com.google.errorprone.annotations.CompatibleWith;
import autovalue.shaded.com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtCompatible
@DoNotMock("Use ImmutableTable, HashBasedTable, or another implementation")
/* loaded from: classes15.dex */
public interface Table<R, C, V> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Cell<R, C, V> {
        boolean equals(@CheckForNull Object obj);

        @ParametricNullness
        C getColumnKey();

        @ParametricNullness
        R getRowKey();

        @ParametricNullness
        V getValue();

        int hashCode();
    }

    Set<Cell<R, C, V>> cellSet();

    void clear();

    Map<R, V> column(@ParametricNullness C c);

    Set<C> columnKeySet();

    Map<C, Map<R, V>> columnMap();

    boolean contains(@CheckForNull @CompatibleWith("R") Object obj, @CheckForNull @CompatibleWith("C") Object obj2);

    boolean containsColumn(@CheckForNull @CompatibleWith("C") Object obj);

    boolean containsRow(@CheckForNull @CompatibleWith("R") Object obj);

    boolean containsValue(@CheckForNull @CompatibleWith("V") Object obj);

    boolean equals(@CheckForNull Object obj);

    @CheckForNull
    V get(@CheckForNull @CompatibleWith("R") Object obj, @CheckForNull @CompatibleWith("C") Object obj2);

    int hashCode();

    boolean isEmpty();

    @CheckForNull
    @CanIgnoreReturnValue
    V put(@ParametricNullness R r, @ParametricNullness C c, @ParametricNullness V v);

    void putAll(Table<? extends R, ? extends C, ? extends V> table);

    @CheckForNull
    @CanIgnoreReturnValue
    V remove(@CheckForNull @CompatibleWith("R") Object obj, @CheckForNull @CompatibleWith("C") Object obj2);

    Map<C, V> row(@ParametricNullness R r);

    Set<R> rowKeySet();

    Map<R, Map<C, V>> rowMap();

    int size();

    Collection<V> values();
}
