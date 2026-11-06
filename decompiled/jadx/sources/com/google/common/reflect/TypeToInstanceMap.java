package com.google.common.reflect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotMock("Use ImmutableTypeToInstanceMap or MutableTypeToInstanceMap")
/* loaded from: classes8.dex */
public interface TypeToInstanceMap<B> extends Map<TypeToken<? extends B>, B> {
    <T extends B> T getInstance(TypeToken<T> typeToken);

    <T extends B> T getInstance(Class<T> cls);

    @CanIgnoreReturnValue
    <T extends B> T putInstance(TypeToken<T> typeToken, @ParametricNullness T t);

    @CanIgnoreReturnValue
    <T extends B> T putInstance(Class<T> cls, @ParametricNullness T t);
}
