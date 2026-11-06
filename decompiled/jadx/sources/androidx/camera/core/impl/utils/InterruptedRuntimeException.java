package androidx.camera.core.impl.utils;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class InterruptedRuntimeException extends RuntimeException {
    public InterruptedRuntimeException() {
    }

    public InterruptedRuntimeException(@NonNull String str) {
        super(str);
    }

    public InterruptedRuntimeException(@NonNull String str, @NonNull Throwable th) {
        super(str, th);
    }

    public InterruptedRuntimeException(@NonNull Throwable th) {
        super(th);
    }
}
