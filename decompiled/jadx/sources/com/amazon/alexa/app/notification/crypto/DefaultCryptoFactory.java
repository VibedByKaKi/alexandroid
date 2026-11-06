package com.amazon.alexa.app.notification.crypto;

import com.amazon.crypto.ByteDecryptor;
import com.amazon.crypto.asymmetric.AsymmetricDecryptor;
import com.amazon.crypto.asymmetric.WithheldKey;
import com.amazon.crypto.symmetric.SymmetricDecryptor;
import com.amazon.crypto.symmetric.SymmetricKey;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class DefaultCryptoFactory implements CryptoFactory {
    @Override // com.amazon.alexa.app.notification.crypto.CryptoFactory
    public ByteDecryptor createAsymmetricDecryptor(WithheldKey withheldKey) {
        return AsymmetricDecryptor.using(withheldKey);
    }

    @Override // com.amazon.alexa.app.notification.crypto.CryptoFactory
    public ByteDecryptor createSymmetricDecryptor(SymmetricKey symmetricKey) {
        return SymmetricDecryptor.using(symmetricKey);
    }
}
