package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailableIntConsumer<E extends Throwable> {
    public static final FailableIntConsumer NOP = new FailableIntConsumer$$ExternalSyntheticLambda1();

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void lambda$andThen$0(FailableIntConsumer failableIntConsumer, int i) throws Throwable {
        accept(i);
        failableIntConsumer.accept(i);
    }

    static <E extends Throwable> FailableIntConsumer<E> nop() {
        return NOP;
    }

    void accept(int i) throws Throwable;

    default FailableIntConsumer<E> andThen(final FailableIntConsumer<E> failableIntConsumer) {
        Objects.requireNonNull(failableIntConsumer);
        return new FailableIntConsumer() { // from class: org.apache.commons.lang3.function.FailableIntConsumer$$ExternalSyntheticLambda0
            @Override // org.apache.commons.lang3.function.FailableIntConsumer
            public final void accept(int i) {
                FailableIntConsumer.this.lambda$andThen$0(failableIntConsumer, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(int i) throws Throwable {
    }
}
