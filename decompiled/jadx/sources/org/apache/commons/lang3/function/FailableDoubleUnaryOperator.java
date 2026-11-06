package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface FailableDoubleUnaryOperator<E extends Throwable> {
    public static final FailableDoubleUnaryOperator NOP = new FailableDoubleUnaryOperator$$ExternalSyntheticLambda0(1);

    static <E extends Throwable> FailableDoubleUnaryOperator<E> identity() {
        return new FailableDoubleUnaryOperator$$ExternalSyntheticLambda0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default double lambda$andThen$0(FailableDoubleUnaryOperator failableDoubleUnaryOperator, double d) throws Throwable {
        return failableDoubleUnaryOperator.applyAsDouble(applyAsDouble(d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default double lambda$compose$0(FailableDoubleUnaryOperator failableDoubleUnaryOperator, double d) throws Throwable {
        return applyAsDouble(failableDoubleUnaryOperator.applyAsDouble(d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ double lambda$static$0(double d) throws Throwable {
        return 0.0d;
    }

    static <E extends Throwable> FailableDoubleUnaryOperator<E> nop() {
        return NOP;
    }

    default FailableDoubleUnaryOperator<E> andThen(FailableDoubleUnaryOperator<E> failableDoubleUnaryOperator) {
        Objects.requireNonNull(failableDoubleUnaryOperator);
        return new FailableDoubleUnaryOperator$$ExternalSyntheticLambda2(this, failableDoubleUnaryOperator, 1);
    }

    double applyAsDouble(double d) throws Throwable;

    default FailableDoubleUnaryOperator<E> compose(FailableDoubleUnaryOperator<E> failableDoubleUnaryOperator) {
        Objects.requireNonNull(failableDoubleUnaryOperator);
        return new FailableDoubleUnaryOperator$$ExternalSyntheticLambda2(this, failableDoubleUnaryOperator, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ double lambda$identity$0(double d) throws Throwable {
        return d;
    }
}
