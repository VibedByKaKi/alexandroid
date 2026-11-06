package com.amazon.crypto.symmetric;

import androidx.annotation.NonNull;
import com.amazon.crypto.utils.Preconditions;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class SymmetricKey {
    static final String ALGORITHM = "AES";
    static final int KEY_SIZE_BITS = 256;
    private final SecretKey secretKey;

    private SymmetricKey(SecretKey secretKey) {
        Preconditions.isTrue("AES".equals(secretKey.getAlgorithm()));
        Preconditions.isTrue(256 == secretKey.getEncoded().length * 8);
        this.secretKey = secretKey;
    }

    @NonNull
    public static SymmetricKey from(@NonNull byte[] bArr) throws IllegalArgumentException {
        Preconditions.notNull(bArr);
        return new SymmetricKey(new SecretKeySpec(bArr, 0, bArr.length, "AES"));
    }

    @NonNull
    public static SymmetricKey generate() throws SecurityException {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(256, new SecureRandom());
            return new SymmetricKey(keyGenerator.generateKey());
        } catch (NoSuchAlgorithmException e) {
            throw new SecurityException(e);
        }
    }

    @NonNull
    public byte[] toBytes() {
        return this.secretKey.getEncoded();
    }

    @NonNull
    public SecretKey toJavaSecretKey() {
        return this.secretKey;
    }

    @NonNull
    public static SymmetricKey from(@NonNull SecretKey secretKey) {
        Preconditions.notNull(secretKey);
        return new SymmetricKey(secretKey);
    }
}
