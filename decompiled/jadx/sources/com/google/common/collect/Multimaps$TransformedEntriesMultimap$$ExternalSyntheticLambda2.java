package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.Multimaps;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Multimaps$TransformedEntriesMultimap$$ExternalSyntheticLambda2 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Multimaps.TransformedEntriesMultimap f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ Multimaps$TransformedEntriesMultimap$$ExternalSyntheticLambda2(Multimaps.TransformedEntriesMultimap transformedEntriesMultimap, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = transformedEntriesMultimap;
        this.f$1 = obj;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        Object lambda$transform$0;
        Object lambda$transform$02;
        switch (this.$r8$classId) {
            case 0:
                lambda$transform$0 = this.f$0.lambda$transform$0(this.f$1, obj);
                return lambda$transform$0;
            default:
                lambda$transform$02 = ((Multimaps.TransformedEntriesListMultimap) this.f$0).lambda$transform$0(this.f$1, obj);
                return lambda$transform$02;
        }
    }
}
