package com.amazon.whispercloak.keygen.provider;

import com.amazon.whispercloak.KeyUtils;
import com.amazon.whispercloak.error.CryptoDependencyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class EcdhKeyFactoryProvider implements KeyFactoryProvider {
    @Override // com.amazon.whispercloak.keygen.provider.KeyFactoryProvider
    public KeyFactory getKeyFactory() {
        try {
            return KeyFactory.getInstance(KeyUtils.ALGORITHM_EC);
        } catch (NoSuchAlgorithmException e) {
            throw new CryptoDependencyException(e);
        }
    }
}
