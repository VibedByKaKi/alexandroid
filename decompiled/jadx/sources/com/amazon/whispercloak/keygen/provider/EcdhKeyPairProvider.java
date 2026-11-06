package com.amazon.whispercloak.keygen.provider;

import com.amazon.whispercloak.KeyUtils;
import com.amazon.whispercloak.error.CryptoDependencyException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.ECGenParameterSpec;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class EcdhKeyPairProvider implements KeyPairProvider {
    private KeyPairGenerator mKeyPairGenerator;

    public EcdhKeyPairProvider() throws CryptoDependencyException {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(KeyUtils.ALGORITHM_EC);
            this.mKeyPairGenerator = keyPairGenerator;
            keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"), new SecureRandom());
        } catch (InvalidAlgorithmParameterException e) {
            throw new CryptoDependencyException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new CryptoDependencyException(e2);
        }
    }

    @Override // com.amazon.whispercloak.keygen.provider.KeyPairProvider
    public KeyPair createNewKeyPair() {
        return this.mKeyPairGenerator.generateKeyPair();
    }
}
