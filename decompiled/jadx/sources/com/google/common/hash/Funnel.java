package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotMock("Implement with a lambda")
@Beta
/* loaded from: classes8.dex */
public interface Funnel<T> extends Serializable {
    void funnel(@ParametricNullness T t, PrimitiveSink primitiveSink);
}
