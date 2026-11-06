package org.apache.commons.lang3.function;

import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface ByteConsumer {
    public static final ByteConsumer NOP = new ByteConsumer$$ExternalSyntheticLambda1();

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void lambda$andThen$0(ByteConsumer byteConsumer, byte b) {
        accept(b);
        byteConsumer.accept(b);
    }

    static ByteConsumer nop() {
        return NOP;
    }

    void accept(byte b);

    default ByteConsumer andThen(final ByteConsumer byteConsumer) {
        Objects.requireNonNull(byteConsumer);
        return new ByteConsumer() { // from class: org.apache.commons.lang3.function.ByteConsumer$$ExternalSyntheticLambda0
            @Override // org.apache.commons.lang3.function.ByteConsumer
            public final void accept(byte b) {
                ByteConsumer.this.lambda$andThen$0(byteConsumer, b);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(byte b) {
    }
}
