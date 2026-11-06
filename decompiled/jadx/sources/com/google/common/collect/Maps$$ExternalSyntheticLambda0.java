package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Maps$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Maps$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        Map.Entry transformEntry;
        Object lambda$createValues$0;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                transformEntry = Maps.transformEntry((Maps.EntryTransformer) obj2, (Map.Entry) obj);
                return transformEntry;
            case 1:
                lambda$createValues$0 = ((Multimaps.TransformedEntriesMultimap) obj2).lambda$createValues$0((Map.Entry) obj);
                return lambda$createValues$0;
            default:
                return ((Multimap) obj2).get(obj);
        }
    }
}
