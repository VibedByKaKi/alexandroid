package com.mapbox.bindgen;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class ExpectedFactory {
    private ExpectedFactory() {
    }

    @NonNull
    public static <E, V> Expected<E, V> createError(@NonNull E e) {
        return new Expected<>(e, null);
    }

    @NonNull
    public static <E> Expected<E, None> createNone() {
        return new Expected<>(null, None.getInstance());
    }

    @NonNull
    public static <E, V> Expected<E, V> createValue(@NonNull V v) {
        return new Expected<>(null, v);
    }
}
