package com.mapbox.bindgen;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class Expected<E, V> {

    @Nullable
    private final E error;

    @Nullable
    private final V value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface Action<T> {
        void run(@NonNull T t);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface Transformer<T, R> {
        @NonNull
        R invoke(@NonNull T t);
    }

    public Expected(@Nullable E e, @Nullable V v) {
        this.value = v;
        this.error = e;
    }

    @NonNull
    public <R> R fold(@NonNull Transformer<E, R> transformer, @NonNull Transformer<V, R> transformer2) {
        return isValue() ? transformer2.invoke(getValue()) : transformer.invoke(getError());
    }

    @Nullable
    public E getError() {
        return this.error;
    }

    @Nullable
    public V getValue() {
        return this.value;
    }

    @NonNull
    public V getValueOrElse(@NonNull Transformer<E, V> transformer) {
        return isValue() ? getValue() : transformer.invoke(getError());
    }

    public boolean isError() {
        return !isValue();
    }

    public boolean isValue() {
        return this.value != null;
    }

    @NonNull
    public <E1, V1> Expected<E1, V1> map(@NonNull Transformer<E, E1> transformer, @NonNull Transformer<V, V1> transformer2) {
        return isValue() ? ExpectedFactory.createValue(transformer2.invoke(getValue())) : ExpectedFactory.createError(transformer.invoke(getError()));
    }

    @NonNull
    public <E1> Expected<E1, V> mapError(@NonNull Transformer<E, E1> transformer) {
        return isValue() ? ExpectedFactory.createValue(getValue()) : ExpectedFactory.createError(transformer.invoke(getError()));
    }

    @NonNull
    public <V1> Expected<E, V1> mapValue(@NonNull Transformer<V, V1> transformer) {
        return isValue() ? ExpectedFactory.createValue(transformer.invoke(getValue())) : ExpectedFactory.createError(getError());
    }

    @NonNull
    public Expected<E, V> onError(@NonNull Action<E> action) {
        if (isError()) {
            action.run(getError());
        }
        return this;
    }

    @NonNull
    public Expected<E, V> onValue(@NonNull Action<V> action) {
        if (isValue()) {
            action.run(getValue());
        }
        return this;
    }
}
