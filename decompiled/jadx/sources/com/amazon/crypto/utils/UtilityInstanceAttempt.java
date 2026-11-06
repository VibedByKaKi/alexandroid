package com.amazon.crypto.utils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class UtilityInstanceAttempt {
    private UtilityInstanceAttempt() {
        in(this);
    }

    public static void in(Object obj) throws UnsupportedOperationException {
        if (obj != null) {
            throw new UnsupportedOperationException(obj.getClass().getSimpleName().concat(" is a utility class; instantiation is not allowed."));
        }
        throw new UnsupportedOperationException("No instances of utility classes.");
    }
}
