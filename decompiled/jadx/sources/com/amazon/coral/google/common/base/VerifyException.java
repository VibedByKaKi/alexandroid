package com.amazon.coral.google.common.base;

import com.amazon.coral.google.common.annotations.GwtCompatible;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public class VerifyException extends RuntimeException {
    public VerifyException() {
    }

    public VerifyException(@CheckForNull String str) {
        super(str);
    }

    public VerifyException(@CheckForNull Throwable th) {
        super(th);
    }

    public VerifyException(@CheckForNull String str, @CheckForNull Throwable th) {
        super(str, th);
    }
}
