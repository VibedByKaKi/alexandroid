package com.amazon.crypto.asymmetric;

import androidx.annotation.NonNull;
import com.amazon.crypto.ByteDecryptor;
import com.amazon.crypto.utils.Preconditions;
import java.security.GeneralSecurityException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AsymmetricDecryptor implements ByteDecryptor {
    private final AsymmetricCryptoParameters cryptoParameters;
    private final WithheldKey withheldKey;

    private AsymmetricDecryptor(WithheldKey withheldKey, AsymmetricCryptoParameters asymmetricCryptoParameters) {
        Preconditions.notNull(withheldKey);
        Preconditions.notNull(asymmetricCryptoParameters);
        this.withheldKey = withheldKey;
        this.cryptoParameters = asymmetricCryptoParameters;
    }

    @NonNull
    public static AsymmetricDecryptor using(@NonNull WithheldKey withheldKey) {
        return new AsymmetricDecryptor(withheldKey, AsymmetricCryptoParameters.SHA1);
    }

    @Override // com.amazon.crypto.ByteDecryptor
    @NonNull
    public byte[] decrypt(@NonNull byte[] bArr) throws IllegalArgumentException, SecurityException {
        if (bArr == null) {
            return bArr;
        }
        Preconditions.isTrue(bArr.length <= 512);
        try {
            Cipher cipher = Cipher.getInstance(this.cryptoParameters.getTransformation());
            cipher.init(2, this.withheldKey.toJavaPrivateKey(), this.cryptoParameters.getParameterSpec());
            return cipher.doFinal(bArr);
        } catch (BadPaddingException e) {
            Buffer$$ExternalSyntheticBUOutline0.m$1(e);
            return null;
        } catch (GeneralSecurityException e2) {
            throw new SecurityException(e2);
        }
    }

    @NonNull
    public static AsymmetricDecryptor using(@NonNull WithheldKey withheldKey, @NonNull AsymmetricCryptoParameters asymmetricCryptoParameters) {
        return new AsymmetricDecryptor(withheldKey, asymmetricCryptoParameters);
    }
}
