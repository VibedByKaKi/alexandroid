package autovalue.shaded.com.google.common.base;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@FunctionalInterface
@GwtCompatible
/* loaded from: classes15.dex */
public interface Supplier<T> extends java.util.function.Supplier<T> {
    @Override // java.util.function.Supplier
    @ParametricNullness
    T get();
}
