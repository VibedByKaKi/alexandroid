package com.amazon.coral.google.common.graph;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.coral.google.common.annotations.Beta;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@Beta
/* loaded from: classes19.dex */
public abstract class AbstractGraph<N> extends AbstractBaseGraph<N> implements Graph<N> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.coral.google.common.graph.AbstractBaseGraph, com.amazon.coral.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int degree(Object obj) {
        return super.degree(obj);
    }

    @Override // com.amazon.coral.google.common.graph.AbstractBaseGraph, com.amazon.coral.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ Set edges() {
        return super.edges();
    }

    @Override // com.amazon.coral.google.common.graph.Graph
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Graph)) {
            return false;
        }
        Graph graph = (Graph) obj;
        return isDirected() == graph.isDirected() && nodes().equals(graph.nodes()) && edges().equals(graph.edges());
    }

    @Override // com.amazon.coral.google.common.graph.AbstractBaseGraph, com.amazon.coral.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(EndpointPair endpointPair) {
        return super.hasEdgeConnecting(endpointPair);
    }

    @Override // com.amazon.coral.google.common.graph.Graph
    public final int hashCode() {
        return edges().hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.coral.google.common.graph.AbstractBaseGraph, com.amazon.coral.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int inDegree(Object obj) {
        return super.inDegree(obj);
    }

    @Override // com.amazon.coral.google.common.graph.AbstractBaseGraph, com.amazon.coral.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ ElementOrder incidentEdgeOrder() {
        return super.incidentEdgeOrder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.coral.google.common.graph.AbstractBaseGraph, com.amazon.coral.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ Set incidentEdges(Object obj) {
        return super.incidentEdges(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.coral.google.common.graph.AbstractBaseGraph, com.amazon.coral.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ int outDegree(Object obj) {
        return super.outDegree(obj);
    }

    public String toString() {
        boolean isDirected = isDirected();
        boolean allowsSelfLoops = allowsSelfLoops();
        String valueOf = String.valueOf(nodes());
        String valueOf2 = String.valueOf(edges());
        StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 59);
        sb.append("isDirected: ");
        sb.append(isDirected);
        sb.append(", allowsSelfLoops: ");
        sb.append(allowsSelfLoops);
        return DoubleList$$ExternalSyntheticOutline0.m(sb, ", nodes: ", valueOf, ", edges: ", valueOf2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.coral.google.common.graph.AbstractBaseGraph, com.amazon.coral.google.common.graph.BaseGraph
    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(Object obj, Object obj2) {
        return super.hasEdgeConnecting(obj, obj2);
    }
}
