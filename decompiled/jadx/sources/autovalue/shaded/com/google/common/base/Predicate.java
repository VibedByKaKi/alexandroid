package autovalue.shaded.com.google.common.base;

import autovalue.shaded.com.google.common.annotations.GwtCompatible;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@FunctionalInterface
@GwtCompatible
/* loaded from: classes15.dex */
public interface Predicate<T> extends java.util.function.Predicate<T> {
    boolean apply(@ParametricNullness T t);

    boolean equals(@CheckForNull Object obj);

    @Override // java.util.function.Predicate
    default boolean test(@ParametricNullness T t) {
        return apply(t);
    }
}
