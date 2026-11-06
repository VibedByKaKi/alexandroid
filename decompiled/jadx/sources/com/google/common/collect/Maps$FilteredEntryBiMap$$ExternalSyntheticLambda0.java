package com.google.common.collect;

import com.google.common.base.Predicate;
import com.google.common.collect.FilteredEntryMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Maps$FilteredEntryBiMap$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Maps$FilteredEntryBiMap$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        boolean lambda$inversePredicate$0;
        boolean lambda$removeEntriesIf$0;
        boolean lambda$createEntrySet$0;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$inversePredicate$0 = Maps.FilteredEntryBiMap.lambda$inversePredicate$0((Predicate) obj2, (Map.Entry) obj);
                return lambda$inversePredicate$0;
            case 1:
                lambda$removeEntriesIf$0 = FilteredEntryMultimap.Keys.AnonymousClass1.lambda$removeEntriesIf$0((Predicate) obj2, (Map.Entry) obj);
                return lambda$removeEntriesIf$0;
            default:
                lambda$createEntrySet$0 = ((Multisets.FilteredMultiset) obj2).lambda$createEntrySet$0((Multiset.Entry) obj);
                return lambda$createEntrySet$0;
        }
    }
}
