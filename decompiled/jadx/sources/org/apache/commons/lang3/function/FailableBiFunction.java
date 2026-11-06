package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailableBiFunction<T, U, R, E extends Throwable> {
    public static final FailableBiFunction NOP = new FailableBiFunction$$ExternalSyntheticLambda0();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$andThen$0(FailableFunction failableFunction, Object obj, Object obj2) throws Throwable {
        return failableFunction.apply(apply(obj, obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Object lambda$static$0(Object obj, Object obj2) throws Throwable {
        return null;
    }

    static <T, U, R, E extends Throwable> FailableBiFunction<T, U, R, E> nop() {
        return NOP;
    }

    default <V> FailableBiFunction<T, U, V, E> andThen(final FailableFunction<? super R, ? extends V, E> failableFunction) {
        Objects.requireNonNull(failableFunction);
        return new FailableBiFunction() { // from class: org.apache.commons.lang3.function.FailableBiFunction$$ExternalSyntheticLambda1
            @Override // org.apache.commons.lang3.function.FailableBiFunction
            public final Object apply(Object obj, Object obj2) {
                Object lambda$andThen$0;
                lambda$andThen$0 = FailableBiFunction.this.lambda$andThen$0(failableFunction, obj, obj2);
                return lambda$andThen$0;
            }
        };
    }

    R apply(T t, U u) throws Throwable;
}
