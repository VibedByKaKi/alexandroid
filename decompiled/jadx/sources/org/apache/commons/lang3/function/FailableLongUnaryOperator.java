package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface FailableLongUnaryOperator<E extends Throwable> {
    public static final FailableLongUnaryOperator NOP = new FailableLongUnaryOperator$$ExternalSyntheticLambda0(1);

    static <E extends Throwable> FailableLongUnaryOperator<E> identity() {
        return new FailableLongUnaryOperator$$ExternalSyntheticLambda0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default long lambda$andThen$0(FailableLongUnaryOperator failableLongUnaryOperator, long j) throws Throwable {
        return failableLongUnaryOperator.applyAsLong(applyAsLong(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default long lambda$compose$0(FailableLongUnaryOperator failableLongUnaryOperator, long j) throws Throwable {
        return applyAsLong(failableLongUnaryOperator.applyAsLong(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ long lambda$static$0(long j) throws Throwable {
        return 0L;
    }

    static <E extends Throwable> FailableLongUnaryOperator<E> nop() {
        return NOP;
    }

    default FailableLongUnaryOperator<E> andThen(FailableLongUnaryOperator<E> failableLongUnaryOperator) {
        Objects.requireNonNull(failableLongUnaryOperator);
        return new FailableLongUnaryOperator$$ExternalSyntheticLambda1(this, failableLongUnaryOperator, 0);
    }

    long applyAsLong(long j) throws Throwable;

    default FailableLongUnaryOperator<E> compose(FailableLongUnaryOperator<E> failableLongUnaryOperator) {
        Objects.requireNonNull(failableLongUnaryOperator);
        return new FailableLongUnaryOperator$$ExternalSyntheticLambda1(this, failableLongUnaryOperator, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ long lambda$identity$0(long j) throws Throwable {
        return j;
    }
}
