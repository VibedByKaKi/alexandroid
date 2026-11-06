package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailableDoubleConsumer<E extends Throwable> {
    public static final FailableDoubleConsumer NOP = new FailableDoubleConsumer$$ExternalSyntheticLambda0();

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void lambda$andThen$0(FailableDoubleConsumer failableDoubleConsumer, double d) throws Throwable {
        accept(d);
        failableDoubleConsumer.accept(d);
    }

    static <E extends Throwable> FailableDoubleConsumer<E> nop() {
        return NOP;
    }

    void accept(double d) throws Throwable;

    default FailableDoubleConsumer<E> andThen(final FailableDoubleConsumer<E> failableDoubleConsumer) {
        Objects.requireNonNull(failableDoubleConsumer);
        return new FailableDoubleConsumer() { // from class: org.apache.commons.lang3.function.FailableDoubleConsumer$$ExternalSyntheticLambda1
            @Override // org.apache.commons.lang3.function.FailableDoubleConsumer
            public final void accept(double d) {
                FailableDoubleConsumer.this.lambda$andThen$0(failableDoubleConsumer, d);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(double d) throws Throwable {
    }
}
