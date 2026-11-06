package com.amazon.coral.google.common.graph;

import com.amazon.coral.google.common.annotations.Beta;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@Beta
/* loaded from: classes19.dex */
public interface MutableValueGraph<N, V> extends ValueGraph<N, V> {
    @CanIgnoreReturnValue
    boolean addNode(N n);

    @CheckForNull
    @CanIgnoreReturnValue
    V putEdgeValue(EndpointPair<N> endpointPair, V v);

    @CheckForNull
    @CanIgnoreReturnValue
    V putEdgeValue(N n, N n2, V v);

    @CheckForNull
    @CanIgnoreReturnValue
    V removeEdge(EndpointPair<N> endpointPair);

    @CheckForNull
    @CanIgnoreReturnValue
    V removeEdge(N n, N n2);

    @CanIgnoreReturnValue
    boolean removeNode(N n);
}
