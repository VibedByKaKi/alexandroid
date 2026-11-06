package com.amazon.coral.google.common.graph;

import com.amazon.coral.google.common.base.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class ImmutableNetwork$$ExternalSyntheticLambda1 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ImmutableNetwork$$ExternalSyntheticLambda1(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // com.amazon.coral.google.common.base.Function, java.util.function.Function
    public final Object apply(Object obj) {
        Object lambda$adjacentNodeFn$2;
        Object lambda$connectionsOf$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$adjacentNodeFn$2 = ImmutableNetwork.lambda$adjacentNodeFn$2((Network) this.f$0, this.f$1, obj);
                return lambda$adjacentNodeFn$2;
            default:
                lambda$connectionsOf$0 = ImmutableValueGraph.lambda$connectionsOf$0((ValueGraph) this.f$0, this.f$1, obj);
                return lambda$connectionsOf$0;
        }
    }
}
