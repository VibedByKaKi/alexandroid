package org.apache.commons.lang3.function;

import java.util.Objects;
import java.util.function.Function;
import kotlinx.coroutines.rx3.RxConvertKt$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface TriFunction<T, U, V, R> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$andThen$0(Function function, Object obj, Object obj2, Object obj3) {
        return function.apply(apply(obj, obj2, obj3));
    }

    default <W> TriFunction<T, U, V, W> andThen(Function<? super R, ? extends W> function) {
        Objects.requireNonNull(function);
        return new RxConvertKt$$ExternalSyntheticLambda0(this, function, 15);
    }

    R apply(T t, U u, V v);
}
