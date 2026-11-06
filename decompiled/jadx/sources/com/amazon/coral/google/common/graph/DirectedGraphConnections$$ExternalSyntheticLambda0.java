package com.amazon.coral.google.common.graph;

import com.amazon.coral.google.common.base.Function;
import com.amazon.coral.google.common.graph.DirectedGraphConnections;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class DirectedGraphConnections$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DirectedGraphConnections$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.amazon.coral.google.common.base.Function, java.util.function.Function
    public final Object apply(Object obj) {
        EndpointPair lambda$incidentEdgeIterator$0;
        EndpointPair ordered;
        EndpointPair lambda$incidentEdgeIterator$2;
        EndpointPair unordered;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$incidentEdgeIterator$0 = DirectedGraphConnections.lambda$incidentEdgeIterator$0(obj2, obj);
                return lambda$incidentEdgeIterator$0;
            case 1:
                ordered = EndpointPair.ordered(obj2, obj);
                return ordered;
            case 2:
                lambda$incidentEdgeIterator$2 = DirectedGraphConnections.lambda$incidentEdgeIterator$2(obj2, (DirectedGraphConnections.NodeConnection) obj);
                return lambda$incidentEdgeIterator$2;
            default:
                unordered = EndpointPair.unordered(obj2, obj);
                return unordered;
        }
    }
}
