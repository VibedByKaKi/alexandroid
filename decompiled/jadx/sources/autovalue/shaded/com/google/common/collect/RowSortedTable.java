package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes15.dex */
public interface RowSortedTable<R, C, V> extends Table<R, C, V> {
    @Override // autovalue.shaded.com.google.common.collect.Table
    SortedSet<R> rowKeySet();

    @Override // autovalue.shaded.com.google.common.collect.Table
    SortedMap<R, Map<C, V>> rowMap();
}
