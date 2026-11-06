package com.amazon.coral.google.common.collect;

import java.util.Map;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class ImmutableMultimap$$ExternalSyntheticLambda2 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ImmutableMultimap$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Map.Entry immutableEntry;
        Map.Entry immutableEntry2;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                immutableEntry = Maps.immutableEntry(obj2, obj);
                return immutableEntry;
            default:
                immutableEntry2 = Maps.immutableEntry(obj2, obj);
                return immutableEntry2;
        }
    }
}
