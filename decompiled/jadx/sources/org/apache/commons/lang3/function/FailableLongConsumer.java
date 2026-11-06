package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailableLongConsumer<E extends Throwable> {
    public static final FailableLongConsumer NOP = new FailableLongConsumer$$ExternalSyntheticLambda0();

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void lambda$andThen$0(FailableLongConsumer failableLongConsumer, long j) throws Throwable {
        accept(j);
        failableLongConsumer.accept(j);
    }

    static <E extends Throwable> FailableLongConsumer<E> nop() {
        return NOP;
    }

    void accept(long j) throws Throwable;

    default FailableLongConsumer<E> andThen(final FailableLongConsumer<E> failableLongConsumer) {
        Objects.requireNonNull(failableLongConsumer);
        return new FailableLongConsumer() { // from class: org.apache.commons.lang3.function.FailableLongConsumer$$ExternalSyntheticLambda1
            @Override // org.apache.commons.lang3.function.FailableLongConsumer
            public final void accept(long j) {
                FailableLongConsumer.this.lambda$andThen$0(failableLongConsumer, j);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(long j) throws Throwable {
    }
}
