package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.graph.AbstractNetwork;
import com.google.common.graph.Graphs;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class AbstractValueGraph$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AbstractValueGraph$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        Object lambda$edgeValueMap$0;
        EndpointPair lambda$iterator$0;
        EndpointPair lambda$iterator$02;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$edgeValueMap$0 = AbstractValueGraph.lambda$edgeValueMap$0((ValueGraph) obj2, (EndpointPair) obj);
                return lambda$edgeValueMap$0;
            case 1:
                lambda$iterator$0 = ((AbstractNetwork.AnonymousClass1.C02421) obj2).lambda$iterator$0(obj);
                return lambda$iterator$0;
            default:
                lambda$iterator$02 = ((Graphs.TransposedGraph.AnonymousClass1) obj2).lambda$iterator$0((EndpointPair) obj);
                return lambda$iterator$02;
        }
    }
}
