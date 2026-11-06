package org.apache.commons.io.function;

import java.io.IOException;
import java.util.Objects;
import org.apache.commons.io.IOUtils$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes10.dex */
public interface IOConsumer<T> {
    public static final IOConsumer<?> NOOP_IO_CONSUMER = new IOUtils$$ExternalSyntheticLambda0(1);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$1(IOConsumer iOConsumer, Object obj) throws IOException {
        accept(obj);
        iOConsumer.accept(obj);
    }

    static <T> IOConsumer<T> noop() {
        return (IOConsumer<T>) NOOP_IO_CONSUMER;
    }

    void accept(T t) throws IOException;

    default IOConsumer<T> andThen(IOConsumer<? super T> iOConsumer) {
        Objects.requireNonNull(iOConsumer, "after");
        return new IOConsumer$$ExternalSyntheticLambda0(this, iOConsumer, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(Object obj) throws IOException {
    }
}
