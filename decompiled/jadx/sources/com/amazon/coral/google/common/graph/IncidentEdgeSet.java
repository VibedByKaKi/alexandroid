package com.amazon.coral.google.common.graph;

import java.util.AbstractSet;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
abstract class IncidentEdgeSet<N> extends AbstractSet<EndpointPair<N>> {
    final BaseGraph<N> graph;
    final N node;

    public IncidentEdgeSet(BaseGraph<N> baseGraph, N n) {
        this.graph = baseGraph;
        this.node = n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (!(obj instanceof EndpointPair)) {
            return false;
        }
        EndpointPair endpointPair = (EndpointPair) obj;
        if (this.graph.isDirected()) {
            if (!endpointPair.isOrdered()) {
                return false;
            }
            Object source = endpointPair.source();
            Object target = endpointPair.target();
            return (this.node.equals(source) && this.graph.successors((BaseGraph<N>) this.node).contains(target)) || (this.node.equals(target) && this.graph.predecessors((BaseGraph<N>) this.node).contains(source));
        }
        if (endpointPair.isOrdered()) {
            return false;
        }
        Set<N> adjacentNodes = this.graph.adjacentNodes(this.node);
        Object nodeU = endpointPair.nodeU();
        Object nodeV = endpointPair.nodeV();
        return (this.node.equals(nodeV) && adjacentNodes.contains(nodeU)) || (this.node.equals(nodeU) && adjacentNodes.contains(nodeV));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        boolean isDirected = this.graph.isDirected();
        BaseGraph<N> baseGraph = this.graph;
        return isDirected ? (baseGraph.inDegree(this.node) + this.graph.outDegree(this.node)) - (this.graph.successors((BaseGraph<N>) this.node).contains(this.node) ? 1 : 0) : baseGraph.adjacentNodes(this.node).size();
    }
}
