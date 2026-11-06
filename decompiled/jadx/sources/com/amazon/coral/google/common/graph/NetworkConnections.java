package com.amazon.coral.google.common.graph;

import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
interface NetworkConnections<N, E> {
    void addInEdge(E e, N n, boolean z);

    void addOutEdge(E e, N n);

    N adjacentNode(E e);

    Set<N> adjacentNodes();

    Set<E> edgesConnecting(N n);

    Set<E> inEdges();

    Set<E> incidentEdges();

    Set<E> outEdges();

    Set<N> predecessors();

    @CheckForNull
    @CanIgnoreReturnValue
    N removeInEdge(E e, boolean z);

    @CanIgnoreReturnValue
    N removeOutEdge(E e);

    Set<N> successors();
}
