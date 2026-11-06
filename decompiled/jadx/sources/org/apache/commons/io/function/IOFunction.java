package org.apache.commons.io.function;

import java.io.IOException;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import kotlinx.coroutines.rx3.RxConvertKt$$ExternalSyntheticLambda0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes10.dex */
public interface IOFunction<T, R> {
    static <T> IOFunction<T, T> identity() {
        return new Path$$ExternalSyntheticBUOutline0(9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$andThen$4(IOFunction iOFunction, Object obj) throws IOException {
        return iOFunction.apply(apply(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$andThen$5(Function function, Object obj) throws IOException {
        return function.apply(apply(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$6(IOConsumer iOConsumer, Object obj) throws IOException {
        iOConsumer.accept(apply(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$7(Consumer consumer, Object obj) throws IOException {
        consumer.accept(apply(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$compose$0(IOFunction iOFunction, Object obj) throws IOException {
        return apply(iOFunction.apply(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$compose$1(Function function, Object obj) throws IOException {
        return apply(function.apply(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$compose$2(IOSupplier iOSupplier) throws IOException {
        return apply(iOSupplier.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object lambda$compose$3(Supplier supplier) throws IOException {
        return apply(supplier.get());
    }

    default <V> IOFunction<T, V> andThen(IOFunction<? super R, ? extends V> iOFunction) {
        Objects.requireNonNull(iOFunction, "after");
        return new IOFunction$$ExternalSyntheticLambda0(this, iOFunction, 0);
    }

    R apply(T t) throws IOException;

    default IOSupplier<R> compose(Supplier<? extends T> supplier) {
        Objects.requireNonNull(supplier, "before");
        return new RxConvertKt$$ExternalSyntheticLambda0(this, supplier, 8);
    }

    default <V> IOFunction<T, V> andThen(Function<? super R, ? extends V> function) {
        Objects.requireNonNull(function, "after");
        return new IOFunction$$ExternalSyntheticLambda1(this, function, 1);
    }

    default <V> IOFunction<V, R> compose(Function<? super V, ? extends T> function) {
        Objects.requireNonNull(function, "before");
        return new IOFunction$$ExternalSyntheticLambda1(this, function, 0);
    }

    default IOConsumer<T> andThen(IOConsumer<? super R> iOConsumer) {
        Objects.requireNonNull(iOConsumer, "after");
        return new IOConsumer$$ExternalSyntheticLambda0(this, iOConsumer);
    }

    default IOSupplier<R> compose(IOSupplier<? extends T> iOSupplier) {
        Objects.requireNonNull(iOSupplier, "before");
        return new RxConvertKt$$ExternalSyntheticLambda0(this, iOSupplier, 7);
    }

    default IOConsumer<T> andThen(Consumer<? super R> consumer) {
        Objects.requireNonNull(consumer, "after");
        return new IOConsumer$$ExternalSyntheticLambda0(this, consumer, 2);
    }

    default <V> IOFunction<V, R> compose(IOFunction<? super V, ? extends T> iOFunction) {
        Objects.requireNonNull(iOFunction, "before");
        return new IOFunction$$ExternalSyntheticLambda0(this, iOFunction, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Object lambda$identity$8(Object obj) throws IOException {
        return obj;
    }
}
