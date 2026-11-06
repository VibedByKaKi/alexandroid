package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailableByteConsumer<E extends Throwable> {
    public static final FailableByteConsumer NOP = new FailableByteConsumer$$ExternalSyntheticLambda0();

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void lambda$andThen$0(FailableByteConsumer failableByteConsumer, byte b) throws Throwable {
        accept(b);
        failableByteConsumer.accept(b);
    }

    static <E extends Throwable> FailableByteConsumer<E> nop() {
        return NOP;
    }

    void accept(byte b) throws Throwable;

    default FailableByteConsumer<E> andThen(final FailableByteConsumer<E> failableByteConsumer) {
        Objects.requireNonNull(failableByteConsumer);
        return new FailableByteConsumer() { // from class: org.apache.commons.lang3.function.FailableByteConsumer$$ExternalSyntheticLambda1
            @Override // org.apache.commons.lang3.function.FailableByteConsumer
            public final void accept(byte b) {
                FailableByteConsumer.this.lambda$andThen$0(failableByteConsumer, b);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(byte b) throws Throwable {
    }
}
