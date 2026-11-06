package com.amazon.deecomms.oobe;

import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class Result<T, E> {
    private final E error;
    private final boolean hasResult;
    private final T value;

    private Result(T t, E e, boolean z) {
        this.value = t;
        this.error = e;
        this.hasResult = z;
    }

    public static <T, E> Result<T, E> error(E e) {
        return new Result<>(null, e, false);
    }

    public static <T, E> Result<T, E> value(T t) {
        return new Result<>(t, null, true);
    }

    public E getError() {
        if (!hasValue()) {
            return this.error;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$1("Cannot call getError on a successful Result.");
        return null;
    }

    public T getValue() {
        if (hasValue()) {
            return this.value;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$1("Cannot call getValue on a failed Result.");
        return null;
    }

    public boolean hasValue() {
        return this.hasResult;
    }
}
