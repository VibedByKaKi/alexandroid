package org.apache.commons.lang3.function;

import java.util.Objects;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class Functions {
    private Functions() {
    }

    public static <T, R> R apply(Function<T, R> function, T t) {
        if (function != null) {
            return function.apply(t);
        }
        return null;
    }

    public static <T, R> R applyNonNull(T t, Function<? super T, ? extends R> function) {
        if (t == null) {
            return null;
        }
        Objects.requireNonNull(function, "mapper");
        return function.apply(t);
    }

    public static <T, U, R> R applyNonNull(T t, Function<? super T, ? extends U> function, Function<? super U, ? extends R> function2) {
        return (R) applyNonNull(applyNonNull(t, function), function2);
    }

    public static <T, U, V, R> R applyNonNull(T t, Function<? super T, ? extends U> function, Function<? super U, ? extends V> function2, Function<? super V, ? extends R> function3) {
        return (R) applyNonNull(applyNonNull(applyNonNull(t, function), function2), function3);
    }

    public static <T, R> Function<T, R> function(Function<T, R> function) {
        return function;
    }
}
