package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class MutableStateObservable<T> extends StateObservable<T> {
    private MutableStateObservable(@Nullable Object obj, boolean z) {
        super(obj, z);
    }

    @NonNull
    public static <T> MutableStateObservable<T> withInitialError(@NonNull Throwable th) {
        return new MutableStateObservable<>(th, true);
    }

    @NonNull
    public static <T> MutableStateObservable<T> withInitialState(@Nullable T t) {
        return new MutableStateObservable<>(t, false);
    }

    public void setError(@NonNull Throwable th) {
        updateStateAsError(th);
    }

    public void setState(@Nullable T t) {
        updateState(t);
    }
}
