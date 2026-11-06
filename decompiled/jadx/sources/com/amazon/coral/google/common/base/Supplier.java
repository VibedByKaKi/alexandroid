package com.amazon.coral.google.common.base;

import com.amazon.coral.google.common.annotations.GwtCompatible;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
@FunctionalInterface
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public interface Supplier<T> extends java.util.function.Supplier<T> {
    @Override // java.util.function.Supplier
    @ParametricNullness
    @CanIgnoreReturnValue
    T get();
}
