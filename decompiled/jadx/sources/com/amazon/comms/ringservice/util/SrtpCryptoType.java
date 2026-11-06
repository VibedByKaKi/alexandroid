package com.amazon.comms.ringservice.util;

import com.amazon.comms.log.CommsLogger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum SrtpCryptoType {
    DTLS,
    SDES,
    DTLS_SDES;

    private static final CommsLogger log = CommsLogger.getLogger(SrtpCryptoType.class);

    public static SrtpCryptoType getSrtpCryptoType(String str) {
        try {
            return valueOf(str);
        } catch (Exception unused) {
            log.w("Unknown SRTP keying, will fall back to SDES");
            return SDES;
        }
    }
}
