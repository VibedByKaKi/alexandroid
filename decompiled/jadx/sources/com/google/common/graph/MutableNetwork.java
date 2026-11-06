package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Beta
/* loaded from: classes8.dex */
public interface MutableNetwork<N, E> extends Network<N, E> {
    @CanIgnoreReturnValue
    boolean addEdge(EndpointPair<N> endpointPair, E e);

    @CanIgnoreReturnValue
    boolean addEdge(N n, N n2, E e);

    @CanIgnoreReturnValue
    boolean addNode(N n);

    @CanIgnoreReturnValue
    boolean removeEdge(E e);

    @CanIgnoreReturnValue
    boolean removeNode(N n);
}
