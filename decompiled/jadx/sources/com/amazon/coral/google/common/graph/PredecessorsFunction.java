package com.amazon.coral.google.common.graph;

import com.amazon.coral.google.common.annotations.Beta;
import com.amazon.coral.google.errorprone.annotations.DoNotMock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@Beta
@DoNotMock("Implement with a lambda, or use GraphBuilder to build a Graph with the desired edges")
/* loaded from: classes19.dex */
public interface PredecessorsFunction<N> {
    Iterable<? extends N> predecessors(N n);
}
