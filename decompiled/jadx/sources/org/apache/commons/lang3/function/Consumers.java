package org.apache.commons.lang3.function;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apache.commons.io.FileUtils$$ExternalSyntheticLambda2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Consumers {
    private static final Consumer NOP;

    static {
        Function identity = Function.identity();
        Objects.requireNonNull(identity);
        NOP = new FileUtils$$ExternalSyntheticLambda2(identity, 25);
    }

    private Consumers() {
    }

    public static <T> void accept(Consumer<T> consumer, T t) {
        if (consumer != null) {
            consumer.accept(t);
        }
    }

    public static <T> Consumer<T> nop() {
        return NOP;
    }
}
