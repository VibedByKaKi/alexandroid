package com.google.common.graph;

import com.google.common.base.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class AbstractNetwork$$ExternalSyntheticLambda4 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ AbstractNetwork$$ExternalSyntheticLambda4(AbstractBaseGraph abstractBaseGraph, Object obj) {
        this.$r8$classId = 2;
        this.f$1 = abstractBaseGraph;
        this.f$0 = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        String lambda$nodePairInvalidatableSet$1;
        String lambda$nodePairInvalidatableSet$12;
        Boolean lambda$nodeInvalidatableSet$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$nodePairInvalidatableSet$1 = AbstractNetwork.lambda$nodePairInvalidatableSet$1(this.f$0, this.f$1);
                return lambda$nodePairInvalidatableSet$1;
            case 1:
                lambda$nodePairInvalidatableSet$12 = AbstractBaseGraph.lambda$nodePairInvalidatableSet$1(this.f$0, this.f$1);
                return lambda$nodePairInvalidatableSet$12;
            default:
                lambda$nodeInvalidatableSet$0 = ((AbstractBaseGraph) this.f$1).lambda$nodeInvalidatableSet$0(this.f$0);
                return lambda$nodeInvalidatableSet$0;
        }
    }

    public /* synthetic */ AbstractNetwork$$ExternalSyntheticLambda4(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
