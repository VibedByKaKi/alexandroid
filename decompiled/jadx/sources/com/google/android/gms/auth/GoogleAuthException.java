package com.google.android.gms.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class GoogleAuthException extends Exception {
    public GoogleAuthException() {
    }

    public GoogleAuthException(@Nullable String str) {
        super(str);
    }

    public GoogleAuthException(@Nullable String str, @NonNull Throwable th) {
        super(str, th);
    }

    public GoogleAuthException(@NonNull Throwable th) {
        super(th);
    }
}
