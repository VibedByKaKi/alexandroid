package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailableFunction<T, R, E extends Throwable> {
    public static final FailableFunction NOP = new FailableFunction$$ExternalSyntheticLambda1(0);

    static /* synthetic */ Object $r8$lambda$8gHwzN5myLiBMBsGs74SR6Y67VM(Object obj, FailableFunction failableFunction, FailableFunction failableFunction2) {
        return failableFunction.lambda$compose$0(failableFunction2, obj);
    }

    static /* synthetic */ Object $r8$lambda$okflFqjUv6SAE5OVSWNwTX3EHNc(Object obj, FailableFunction failableFunction, FailableFunction failableFunction2) {
        return failableFunction.lambda$andThen$0(failableFunction2, obj);
    }

    static <T, E extends Throwable> FailableFunction<T, T, E> identity() {
        return new FailableFunction$$ExternalSyntheticLambda1(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ default Object lambda$andThen$0(FailableFunction failableFunction, Object obj) throws Throwable {
        return failableFunction.apply(apply(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ default Object lambda$compose$0(FailableFunction failableFunction, Object obj) throws Throwable {
        return apply(failableFunction.apply(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Object lambda$static$0(Object obj) throws Throwable {
        return null;
    }

    static <T, R, E extends Throwable> FailableFunction<T, R, E> nop() {
        return NOP;
    }

    default <V> FailableFunction<T, V, E> andThen(FailableFunction<? super R, ? extends V, E> failableFunction) {
        Objects.requireNonNull(failableFunction);
        return new FailableFunction$$ExternalSyntheticLambda0(this, failableFunction, 1);
    }

    R apply(T t) throws Throwable;

    default <V> FailableFunction<V, R, E> compose(FailableFunction<? super V, ? extends T, E> failableFunction) {
        Objects.requireNonNull(failableFunction);
        return new FailableFunction$$ExternalSyntheticLambda0(this, failableFunction, 0);
    }

    static <T, R, E extends Throwable> FailableFunction<T, R, E> function(FailableFunction<T, R, E> failableFunction) {
        return failableFunction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Object lambda$identity$0(Object obj) throws Throwable {
        return obj;
    }
}
