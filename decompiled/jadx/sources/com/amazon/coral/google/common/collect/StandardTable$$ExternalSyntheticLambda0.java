package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.collect.AbstractMapBasedMultimap;
import com.amazon.coral.google.common.collect.Maps;
import com.amazon.coral.google.common.collect.StandardTable;
import com.amazon.coral.google.common.collect.Table;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class StandardTable$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ StandardTable$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Table.Cell lambda$cellSpliterator$0;
        Map.Entry lambda$entrySpliterator$0;
        ImmutableSortedMultiset lambda$toImmutableSortedMultiset$4;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$cellSpliterator$0 = StandardTable.lambda$cellSpliterator$0((Map.Entry) obj2, (Map.Entry) obj);
                return lambda$cellSpliterator$0;
            case 1:
                return ((AbstractMapBasedMultimap.AsMap) obj2).wrapEntry((Map.Entry) obj);
            case 2:
                lambda$entrySpliterator$0 = ((Maps.NavigableAsMapView) obj2).lambda$entrySpliterator$0(obj);
                return lambda$entrySpliterator$0;
            case 3:
                return ((StandardTable.Row) obj2).wrapEntry((Map.Entry) obj);
            default:
                lambda$toImmutableSortedMultiset$4 = ImmutableSortedMultiset.lambda$toImmutableSortedMultiset$4((Comparator) obj2, (Multiset) obj);
                return lambda$toImmutableSortedMultiset$4;
        }
    }
}
