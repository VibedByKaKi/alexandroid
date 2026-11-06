package com.amazon.whispercloak.random;

import java.security.SecureRandom;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class SecureRandomProvider {
    private static SecureRandomProvider mInstance;
    private final SecureRandom mSecureRandom = new SecureRandom();

    private SecureRandomProvider() {
    }

    public static SecureRandom getInstance() {
        if (mInstance == null) {
            mInstance = new SecureRandomProvider();
        }
        return mInstance.mSecureRandom;
    }
}
