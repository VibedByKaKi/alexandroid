package com.amazon.coral.google.common.base;

import com.amazon.coral.google.common.annotations.GwtCompatible;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
@FunctionalInterface
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public interface Function<F, T> extends java.util.function.Function<F, T> {
    @Override // java.util.function.Function
    @ParametricNullness
    @CanIgnoreReturnValue
    T apply(@ParametricNullness F f);

    boolean equals(@CheckForNull Object obj);
}
