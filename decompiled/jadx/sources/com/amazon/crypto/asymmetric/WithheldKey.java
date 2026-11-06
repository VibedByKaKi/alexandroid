package com.amazon.crypto.asymmetric;

import androidx.annotation.NonNull;
import com.amazon.crypto.utils.Preconditions;
import com.amazon.whispercloak.KeyUtils;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.interfaces.RSAKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Objects;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class WithheldKey {
    private final PrivateKey privateKey;

    private WithheldKey(PrivateKey privateKey) {
        Preconditions.isTrue(KeyUtils.ALGORITHM_RSA == privateKey.getAlgorithm());
        Preconditions.isTrue(2048 <= ((RSAKey) privateKey).getModulus().bitLength());
        this.privateKey = privateKey;
    }

    @NonNull
    public static WithheldKey from(@NonNull byte[] bArr) throws IllegalArgumentException, SecurityException {
        Preconditions.notNull(bArr);
        try {
            try {
                return new WithheldKey(KeyFactory.getInstance(KeyUtils.ALGORITHM_RSA).generatePrivate(new PKCS8EncodedKeySpec(bArr)));
            } catch (InvalidKeySpecException e) {
                Buffer$$ExternalSyntheticBUOutline0.m$1(e);
                return null;
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new SecurityException(e2);
        }
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass().equals(WithheldKey.class) && toJavaPrivateKey().equals(((WithheldKey) obj).toJavaPrivateKey());
    }

    public int hashCode() {
        return Objects.hash(toJavaPrivateKey());
    }

    @NonNull
    public byte[] toBytes() {
        return this.privateKey.getEncoded();
    }

    @NonNull
    public PrivateKey toJavaPrivateKey() {
        return this.privateKey;
    }

    @NonNull
    public static WithheldKey from(@NonNull PrivateKey privateKey) {
        Preconditions.notNull(privateKey);
        return new WithheldKey(privateKey);
    }
}
