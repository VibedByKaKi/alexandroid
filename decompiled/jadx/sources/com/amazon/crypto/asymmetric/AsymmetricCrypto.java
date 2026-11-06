package com.amazon.crypto.asymmetric;

import com.amazon.crypto.utils.UtilityInstanceAttempt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class AsymmetricCrypto {
    static final String ALGORITHM = "RSA";
    static final int KEY_SIZE_2048 = 2048;
    static final int MAX_PAYLOAD_LENGTH = 512;

    private AsymmetricCrypto() {
        UtilityInstanceAttempt.in(this);
    }
}
