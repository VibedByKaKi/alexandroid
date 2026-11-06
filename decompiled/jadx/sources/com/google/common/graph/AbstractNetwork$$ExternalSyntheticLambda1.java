package com.google.common.graph;

import com.google.common.base.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class AbstractNetwork$$ExternalSyntheticLambda1 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AbstractNetwork f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ AbstractNetwork$$ExternalSyntheticLambda1(AbstractNetwork abstractNetwork, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = abstractNetwork;
        this.f$1 = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        Boolean lambda$nodeInvalidatableSet$0;
        Boolean lambda$edgeInvalidatableSet$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$nodeInvalidatableSet$0 = this.f$0.lambda$nodeInvalidatableSet$0(this.f$1);
                return lambda$nodeInvalidatableSet$0;
            default:
                lambda$edgeInvalidatableSet$0 = this.f$0.lambda$edgeInvalidatableSet$0(this.f$1);
                return lambda$edgeInvalidatableSet$0;
        }
    }
}
