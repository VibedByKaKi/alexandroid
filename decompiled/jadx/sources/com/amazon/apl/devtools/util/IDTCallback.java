package com.amazon.apl.devtools.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IDTCallback<T> {
    default void execute(RequestStatus requestStatus) {
        execute(null, requestStatus);
    }

    void execute(T t, RequestStatus requestStatus);
}
