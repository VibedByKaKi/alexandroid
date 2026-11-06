package com.amazon.whisperjoin.common.sharedtypes.cryptography;

import com.amazon.whisperjoin.common.sharedtypes.exceptions.TrustCommandNotHandledException;
import com.amazon.whisperjoin.common.sharedtypes.exceptions.TrustProviderInitializationFailedException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface TrustProvider<I, O> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TrustState {
        UNTRUSTED,
        UNTRUSTED_ENCRYPTED,
        TRUSTED_ENCRYPTED,
        UNTRUSTED_PIN
    }

    EncryptionProvider getEncryptionProvider();

    O handleRequest(I i) throws TrustCommandNotHandledException;

    void initialize() throws TrustProviderInitializationFailedException;

    boolean isSessionNegotiationComplete();
}
