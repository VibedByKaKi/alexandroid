package com.amazon.whispercloak.keygen.provider;

import com.amazon.whispercloak.error.CryptoDependencyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyAgreement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class EcdhKeyAgreementProvider implements KeyAgreementProvider {
    @Override // com.amazon.whispercloak.keygen.provider.KeyAgreementProvider
    public KeyAgreement getKeyAgreement() throws CryptoDependencyException {
        try {
            return KeyAgreement.getInstance("ECDH");
        } catch (NoSuchAlgorithmException e) {
            throw new CryptoDependencyException(e);
        }
    }
}
