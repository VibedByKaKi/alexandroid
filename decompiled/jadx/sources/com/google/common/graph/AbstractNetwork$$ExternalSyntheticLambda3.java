package com.google.common.graph;

import com.google.common.base.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class AbstractNetwork$$ExternalSyntheticLambda3 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ AbstractNetwork$$ExternalSyntheticLambda3(Object obj, int i, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        Boolean lambda$nodePairInvalidatableSet$0;
        Boolean lambda$nodePairInvalidatableSet$02;
        switch (this.$r8$classId) {
            case 0:
                lambda$nodePairInvalidatableSet$0 = ((AbstractNetwork) this.f$0).lambda$nodePairInvalidatableSet$0(this.f$1, this.f$2);
                return lambda$nodePairInvalidatableSet$0;
            default:
                lambda$nodePairInvalidatableSet$02 = ((AbstractBaseGraph) this.f$0).lambda$nodePairInvalidatableSet$0(this.f$1, this.f$2);
                return lambda$nodePairInvalidatableSet$02;
        }
    }
}
