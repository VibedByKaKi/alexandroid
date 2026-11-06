package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;
import java.util.function.Function;
import org.apache.commons.lang3.Functions$$ExternalSyntheticLambda8;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface FailableConsumer<T, E extends Throwable> {
    public static final FailableConsumer NOP;

    static {
        Function identity = Function.identity();
        Objects.requireNonNull(identity);
        NOP = new Functions$$ExternalSyntheticLambda8(identity, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$0(FailableConsumer failableConsumer, Object obj) throws Throwable {
        accept(obj);
        failableConsumer.accept(obj);
    }

    static <T, E extends Throwable> FailableConsumer<T, E> nop() {
        return NOP;
    }

    void accept(T t) throws Throwable;

    default FailableConsumer<T, E> andThen(final FailableConsumer<? super T, E> failableConsumer) {
        Objects.requireNonNull(failableConsumer);
        return new FailableConsumer() { // from class: org.apache.commons.lang3.function.FailableConsumer$$ExternalSyntheticLambda1
            @Override // org.apache.commons.lang3.function.FailableConsumer
            public final void accept(Object obj) {
                FailableConsumer.this.lambda$andThen$0(failableConsumer, obj);
            }
        };
    }
}
