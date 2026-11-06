package com.amazon.coral.google.common.graph;

import com.amazon.coral.google.common.annotations.Beta;
import com.amazon.coral.google.errorprone.annotations.DoNotMock;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@Beta
@DoNotMock("Use GraphBuilder to create a real instance")
/* loaded from: classes19.dex */
public interface Graph<N> extends BaseGraph<N> {
    Set<N> adjacentNodes(N n);

    boolean allowsSelfLoops();

    @Override // com.amazon.coral.google.common.graph.BaseGraph
    int degree(N n);

    @Override // com.amazon.coral.google.common.graph.BaseGraph
    Set<EndpointPair<N>> edges();

    boolean equals(@CheckForNull Object obj);

    @Override // com.amazon.coral.google.common.graph.BaseGraph
    boolean hasEdgeConnecting(EndpointPair<N> endpointPair);

    @Override // com.amazon.coral.google.common.graph.BaseGraph
    boolean hasEdgeConnecting(N n, N n2);

    int hashCode();

    @Override // com.amazon.coral.google.common.graph.BaseGraph
    int inDegree(N n);

    @Override // com.amazon.coral.google.common.graph.BaseGraph
    ElementOrder<N> incidentEdgeOrder();

    @Override // com.amazon.coral.google.common.graph.BaseGraph
    Set<EndpointPair<N>> incidentEdges(N n);

    boolean isDirected();

    ElementOrder<N> nodeOrder();

    Set<N> nodes();

    @Override // com.amazon.coral.google.common.graph.BaseGraph
    int outDegree(N n);

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default Iterable predecessors(Object obj) {
        return predecessors((Graph<N>) obj);
    }

    @Override // com.amazon.coral.google.common.graph.BaseGraph, com.amazon.coral.google.common.graph.PredecessorsFunction, com.amazon.coral.google.common.graph.Graph
    Set<N> predecessors(N n);

    /* JADX WARN: Multi-variable type inference failed */
    /* bridge */ /* synthetic */ default Iterable successors(Object obj) {
        return successors((Graph<N>) obj);
    }

    @Override // com.amazon.coral.google.common.graph.BaseGraph, com.amazon.coral.google.common.graph.SuccessorsFunction, com.amazon.coral.google.common.graph.Graph
    Set<N> successors(N n);
}
