package com.amazon.whispercloak.keygen;

import com.amazon.whispercloak.error.CryptoDependencyException;
import com.amazon.whispercloak.keygen.provider.EcdhKeyAgreementProvider;
import com.amazon.whispercloak.keygen.provider.WhisperCloakSecretKey;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ECSharedSecretGenerator {
    private final KeyAgreement mKeyAgreement;

    public ECSharedSecretGenerator() throws CryptoDependencyException {
        this(new EcdhKeyAgreementProvider().getKeyAgreement());
    }

    public SecretKey getSharedSecret(PrivateKey privateKey, PublicKey publicKey) throws InvalidKeyException {
        try {
            this.mKeyAgreement.init(privateKey);
            this.mKeyAgreement.doPhase(publicKey, true);
            return new WhisperCloakSecretKey(this.mKeyAgreement.generateSecret(JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM));
        } catch (NoSuchAlgorithmException e) {
            throw new CryptoDependencyException(e);
        }
    }

    public ECSharedSecretGenerator(KeyAgreement keyAgreement) {
        this.mKeyAgreement = keyAgreement;
    }
}
