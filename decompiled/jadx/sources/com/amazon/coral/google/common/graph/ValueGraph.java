package com.amazon.coral.google.common.graph;

import com.amazon.coral.google.common.annotations.Beta;
import java.util.Optional;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@Beta
/* loaded from: classes19.dex */
public interface ValueGraph<N, V> extends BaseGraph<N> {
    @Override // com.amazon.coral.google.common.graph.BaseGraph, com.amazon.coral.google.common.graph.Graph
    Set<N> adjacentNodes(N n);

    @Override // com.amazon.coral.google.common.graph.BaseGraph, com.amazon.coral.google.common.graph.Graph
    boolean allowsSelfLoops();

    Graph<N> asGraph();

    @Override // com.amazon.coral.google.common.graph.BaseGraph
    int degree(N n);

    Optional<V> edgeValue(EndpointPair<N> endpointPair);

    Optional<V> edgeValue(N n, N n2);

    @CheckForNull
    V edgeValueOrDefault(EndpointPair<N> endpointPair, @CheckForNull V v);

    @CheckForNull
    V edgeValueOrDefault(N n, N n2, @CheckForNull V v);

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

    @Override // com.amazon.coral.google.common.graph.BaseGraph, com.amazon.coral.google.common.graph.Graph
    boolean isDirected();

    @Override // com.amazon.coral.google.common.graph.BaseGraph, com.amazon.coral.google.common.graph.Graph
    ElementOrder<N> nodeOrder();

    @Override // com.amazon.coral.google.common.graph.BaseGraph, com.amazon.coral.google.common.graph.Graph
    Set<N> nodes();

    @Override // com.amazon.coral.google.common.graph.BaseGraph
    int outDegree(N n);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.coral.google.common.graph.BaseGraph, com.amazon.coral.google.common.graph.PredecessorsFunction, com.amazon.coral.google.common.graph.Graph
    /* bridge */ /* synthetic */ default Iterable predecessors(Object obj) {
        return predecessors((ValueGraph<N, V>) obj);
    }

    @Override // com.amazon.coral.google.common.graph.BaseGraph, com.amazon.coral.google.common.graph.PredecessorsFunction, com.amazon.coral.google.common.graph.Graph
    Set<N> predecessors(N n);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.coral.google.common.graph.BaseGraph, com.amazon.coral.google.common.graph.SuccessorsFunction, com.amazon.coral.google.common.graph.Graph
    /* bridge */ /* synthetic */ default Iterable successors(Object obj) {
        return successors((ValueGraph<N, V>) obj);
    }

    @Override // com.amazon.coral.google.common.graph.BaseGraph, com.amazon.coral.google.common.graph.SuccessorsFunction, com.amazon.coral.google.common.graph.Graph
    Set<N> successors(N n);
}
