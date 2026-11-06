package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.Table;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class TreeBasedTable$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TreeBasedTable$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        Iterator lambda$createColumnKeyIterator$0;
        Collection access$000;
        Table.Cell access$0002;
        switch (this.$r8$classId) {
            case 0:
                lambda$createColumnKeyIterator$0 = TreeBasedTable.lambda$createColumnKeyIterator$0((Map) obj);
                return lambda$createColumnKeyIterator$0;
            case 1:
                access$000 = Multimaps.access$000((Collection) obj);
                return access$000;
            case 2:
                access$0002 = Tables.access$000((Table.Cell) obj);
                return access$0002;
            case 3:
                return ((Iterable) obj).iterator();
            case 4:
                return ((Range) obj).upperBound();
            case 5:
                return ((Range) obj).lowerBound();
            default:
                return Collections.unmodifiableMap((Map) obj);
        }
    }
}
