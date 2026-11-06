package org.apache.logging.log4j.util;

import java.util.Objects;
import java.util.function.Function;
import org.apache.commons.lang3.Validate$$ExternalSyntheticLambda1;
import org.apache.logging.log4j.util.LazyUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface Lazy<T> extends java.util.function.Supplier<T> {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default Object lambda$map$0(Function function) {
        return function.apply(value());
    }

    static <T> Lazy<T> lazy(java.util.function.Supplier<T> supplier) {
        Objects.requireNonNull(supplier);
        return new LazyUtil.SafeLazy(supplier);
    }

    static <T> Lazy<T> pure(java.util.function.Supplier<T> supplier) {
        Objects.requireNonNull(supplier);
        return new LazyUtil.PureLazy(supplier);
    }

    static <T> Lazy<T> value(T t) {
        return new LazyUtil.Constant(t);
    }

    static <T> Lazy<T> weak(T t) {
        return new LazyUtil.WeakConstant(t);
    }

    @Override // java.util.function.Supplier
    default T get() {
        return value();
    }

    boolean isInitialized();

    default <R> Lazy<R> map(Function<? super T, ? extends R> function) {
        return lazy(new Validate$$ExternalSyntheticLambda1(this, function, 2));
    }

    void set(T t);

    T value();
}
