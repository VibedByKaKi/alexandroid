package com.amazon.coral.google.common.graph;

import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
interface GraphConnections<N, V> {
    void addPredecessor(N n, V v);

    @CheckForNull
    @CanIgnoreReturnValue
    V addSuccessor(N n, V v);

    Set<N> adjacentNodes();

    Iterator<EndpointPair<N>> incidentEdgeIterator(N n);

    Set<N> predecessors();

    void removePredecessor(N n);

    @CheckForNull
    @CanIgnoreReturnValue
    V removeSuccessor(N n);

    Set<N> successors();

    @CheckForNull
    V value(N n);
}
