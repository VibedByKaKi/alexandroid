package com.google.common.graph;

import com.google.common.base.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class AbstractNetwork$$ExternalSyntheticLambda2 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AbstractNetwork$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        String lambda$nodeInvalidatableSet$1;
        String lambda$nodeInvalidatableSet$12;
        String lambda$edgeInvalidatableSet$1;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                lambda$nodeInvalidatableSet$1 = AbstractNetwork.lambda$nodeInvalidatableSet$1(obj);
                return lambda$nodeInvalidatableSet$1;
            case 1:
                lambda$nodeInvalidatableSet$12 = AbstractBaseGraph.lambda$nodeInvalidatableSet$1(obj);
                return lambda$nodeInvalidatableSet$12;
            default:
                lambda$edgeInvalidatableSet$1 = AbstractNetwork.lambda$edgeInvalidatableSet$1(obj);
                return lambda$edgeInvalidatableSet$1;
        }
    }
}
