package com.amazon.whispercloak.random;

import java.security.SecureRandom;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class NonceGenerator {
    private static final int NUM_ALPHABETIC_CHARACTERS = 26;
    private static final int NUM_ALPHANUMERIC_CHARACTERS = 62;
    private static final int NUM_BASE_10_CHARACTERS = 10;
    private final SecureRandom secureRandom;

    public NonceGenerator() {
        this.secureRandom = SecureRandomProvider.getInstance();
    }

    public String generateAlphanumericNonce(int i) {
        int nextInt = this.secureRandom.nextInt(Integer.MAX_VALUE);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (nextInt % 256) % 62;
            if (i3 < 10) {
                sb.append((char) (i3 + 48));
            } else if (i3 < 36) {
                sb.append((char) (((i3 - 10) % 26) + 65));
            } else {
                sb.append((char) (((i3 - 36) % 26) + 97));
            }
            nextInt >>= 8;
            if (nextInt == 0) {
                nextInt = this.secureRandom.nextInt(Integer.MAX_VALUE);
            }
        }
        return sb.toString();
    }

    public NonceGenerator(SecureRandom secureRandom) {
        this.secureRandom = secureRandom;
    }
}
