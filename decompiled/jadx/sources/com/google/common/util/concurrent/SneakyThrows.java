package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.Throwable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
/* loaded from: classes8.dex */
final class SneakyThrows<T extends Throwable> {
    private SneakyThrows() {
    }

    @CanIgnoreReturnValue
    public static Error sneakyThrow(Throwable th) {
        throw new SneakyThrows().throwIt(th);
    }

    private Error throwIt(Throwable th) throws Throwable {
        throw th;
    }
}
