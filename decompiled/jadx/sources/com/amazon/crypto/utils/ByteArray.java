package com.amazon.crypto.utils;

import androidx.annotation.NonNull;
import java.security.SecureRandom;
import java.util.Random;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class ByteArray {
    private static final Random random = new SecureRandom();

    private ByteArray() {
        UtilityInstanceAttempt.in(this);
    }

    @NonNull
    public static byte[] random(int i) throws IllegalArgumentException {
        Preconditions.isTrue(i >= 0);
        byte[] bArr = new byte[i];
        random.nextBytes(bArr);
        return bArr;
    }
}
