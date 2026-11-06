package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import java.util.Collection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Maps$$ExternalSyntheticLambda1 implements Maps.EntryTransformer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Maps$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.google.common.collect.Maps.EntryTransformer
    public final Object transformEntry(Object obj, Object obj2) {
        Object lambda$transformValues$1;
        Object lambda$transformValues$2;
        Object lambda$transformValues$0;
        Object lambda$transformValues$12;
        Object lambda$transformValues$02;
        int i = this.$r8$classId;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                lambda$transformValues$1 = Maps.lambda$transformValues$1((Function) obj3, obj, obj2);
                return lambda$transformValues$1;
            case 1:
                lambda$transformValues$2 = Maps.lambda$transformValues$2((Function) obj3, obj, obj2);
                return lambda$transformValues$2;
            case 2:
                lambda$transformValues$0 = Maps.lambda$transformValues$0((Function) obj3, obj, obj2);
                return lambda$transformValues$0;
            case 3:
                lambda$transformValues$12 = Multimaps.lambda$transformValues$1((Function) obj3, obj, obj2);
                return lambda$transformValues$12;
            case 4:
                lambda$transformValues$02 = Multimaps.lambda$transformValues$0((Function) obj3, obj, obj2);
                return lambda$transformValues$02;
            default:
                return ((Multimaps.TransformedEntriesMultimap) obj3).transform(obj, (Collection) obj2);
        }
    }
}
