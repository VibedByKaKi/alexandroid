package org.apache.commons.lang3.function;

import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface BooleanConsumer {
    public static final BooleanConsumer NOP = new BooleanConsumer$$ExternalSyntheticLambda0();

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void lambda$andThen$0(BooleanConsumer booleanConsumer, boolean z) {
        accept(z);
        booleanConsumer.accept(z);
    }

    static BooleanConsumer nop() {
        return NOP;
    }

    void accept(boolean z);

    default BooleanConsumer andThen(final BooleanConsumer booleanConsumer) {
        Objects.requireNonNull(booleanConsumer);
        return new BooleanConsumer() { // from class: org.apache.commons.lang3.function.BooleanConsumer$$ExternalSyntheticLambda1
            @Override // org.apache.commons.lang3.function.BooleanConsumer
            public final void accept(boolean z) {
                BooleanConsumer.this.lambda$andThen$0(booleanConsumer, z);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(boolean z) {
    }
}
