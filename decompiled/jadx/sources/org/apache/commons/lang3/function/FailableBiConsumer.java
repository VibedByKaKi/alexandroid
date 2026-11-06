package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;
import org.apache.commons.lang3.reflect.TypeUtils$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailableBiConsumer<T, U, E extends Throwable> {
    public static final FailableBiConsumer NOP = new TypeUtils$$ExternalSyntheticLambda0(1);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$0(FailableBiConsumer failableBiConsumer, Object obj, Object obj2) throws Throwable {
        accept(obj, obj2);
        failableBiConsumer.accept(obj, obj2);
    }

    static <T, U, E extends Throwable> FailableBiConsumer<T, U, E> nop() {
        return NOP;
    }

    void accept(T t, U u) throws Throwable;

    default FailableBiConsumer<T, U, E> andThen(final FailableBiConsumer<? super T, ? super U, E> failableBiConsumer) {
        Objects.requireNonNull(failableBiConsumer);
        return new FailableBiConsumer() { // from class: org.apache.commons.lang3.function.FailableBiConsumer$$ExternalSyntheticLambda1
            @Override // org.apache.commons.lang3.function.FailableBiConsumer
            public final void accept(Object obj, Object obj2) {
                FailableBiConsumer.this.lambda$andThen$0(failableBiConsumer, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(Object obj, Object obj2) throws Throwable {
    }
}
