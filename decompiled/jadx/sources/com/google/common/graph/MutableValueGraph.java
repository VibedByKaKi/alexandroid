package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Beta
/* loaded from: classes8.dex */
public interface MutableValueGraph<N, V> extends ValueGraph<N, V> {
    @CanIgnoreReturnValue
    boolean addNode(N n);

    @CanIgnoreReturnValue
    V putEdgeValue(EndpointPair<N> endpointPair, V v);

    @CanIgnoreReturnValue
    V putEdgeValue(N n, N n2, V v);

    @CanIgnoreReturnValue
    V removeEdge(EndpointPair<N> endpointPair);

    @CanIgnoreReturnValue
    V removeEdge(N n, N n2);

    @CanIgnoreReturnValue
    boolean removeNode(N n);
}
