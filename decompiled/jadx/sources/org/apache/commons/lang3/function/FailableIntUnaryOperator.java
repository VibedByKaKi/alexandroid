package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface FailableIntUnaryOperator<E extends Throwable> {
    public static final FailableIntUnaryOperator NOP = new FailableIntUnaryOperator$$ExternalSyntheticLambda0(0);

    static <E extends Throwable> FailableIntUnaryOperator<E> identity() {
        return new FailableIntUnaryOperator$$ExternalSyntheticLambda0(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default int lambda$andThen$0(FailableIntUnaryOperator failableIntUnaryOperator, int i) throws Throwable {
        return failableIntUnaryOperator.applyAsInt(applyAsInt(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default int lambda$compose$0(FailableIntUnaryOperator failableIntUnaryOperator, int i) throws Throwable {
        return applyAsInt(failableIntUnaryOperator.applyAsInt(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ int lambda$static$0(int i) throws Throwable {
        return 0;
    }

    static <E extends Throwable> FailableIntUnaryOperator<E> nop() {
        return NOP;
    }

    default FailableIntUnaryOperator<E> andThen(FailableIntUnaryOperator<E> failableIntUnaryOperator) {
        Objects.requireNonNull(failableIntUnaryOperator);
        return new FailableIntUnaryOperator$$ExternalSyntheticLambda1(this, failableIntUnaryOperator, 1);
    }

    int applyAsInt(int i) throws Throwable;

    default FailableIntUnaryOperator<E> compose(FailableIntUnaryOperator<E> failableIntUnaryOperator) {
        Objects.requireNonNull(failableIntUnaryOperator);
        return new FailableIntUnaryOperator$$ExternalSyntheticLambda1(this, failableIntUnaryOperator, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ int lambda$identity$0(int i) throws Throwable {
        return i;
    }
}
