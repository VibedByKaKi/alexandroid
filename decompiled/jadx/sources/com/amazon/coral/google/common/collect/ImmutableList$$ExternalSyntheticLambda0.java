package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.collect.ArrayTable;
import com.amazon.coral.google.common.collect.CompactHashMap;
import com.amazon.coral.google.common.collect.ImmutableSet;
import com.amazon.coral.google.common.collect.ImmutableSortedMap;
import java.util.Map;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class ImmutableList$$ExternalSyntheticLambda0 implements IntFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ImmutableList$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        Map.Entry lambda$spliterator$0;
        int i2 = this.$r8$classId;
        Object obj = this.f$0;
        switch (i2) {
            case 0:
                return ((ImmutableList) obj).get(i);
            case 1:
                return ((ArrayTable.ArrayMap) obj).getEntry(i);
            case 2:
                lambda$spliterator$0 = ((CompactHashMap.EntrySetView) obj).lambda$spliterator$0(i);
                return lambda$spliterator$0;
            case 3:
                return ((ImmutableSet.Indexed) obj).get(i);
            case 4:
                return ((ImmutableSortedMap.C1EntrySet.AnonymousClass1) obj).get(i);
            default:
                return ((IndexedImmutableSet) obj).get(i);
        }
    }
}
