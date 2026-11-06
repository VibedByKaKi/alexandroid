package com.amazon.crypto.asymmetric;

import androidx.annotation.NonNull;
import com.amazon.crypto.utils.Preconditions;
import com.amazon.whispercloak.KeyUtils;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.RSAKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Objects;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class PublishedKey {
    private final PublicKey publicKey;

    private PublishedKey(PublicKey publicKey) {
        Preconditions.isTrue(KeyUtils.ALGORITHM_RSA.equals(publicKey.getAlgorithm()));
        Preconditions.isTrue(2048 <= ((RSAKey) publicKey).getModulus().bitLength());
        this.publicKey = publicKey;
    }

    @NonNull
    public static PublishedKey from(@NonNull byte[] bArr) throws IllegalArgumentException, SecurityException {
        Preconditions.notNull(bArr);
        try {
            try {
                return new PublishedKey(KeyFactory.getInstance(KeyUtils.ALGORITHM_RSA).generatePublic(new X509EncodedKeySpec(bArr)));
            } catch (InvalidKeySpecException e) {
                Buffer$$ExternalSyntheticBUOutline0.m$1(e);
                return null;
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new SecurityException(e2);
        }
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass().equals(PublishedKey.class) && toJavaPublicKey().equals(((PublishedKey) obj).toJavaPublicKey());
    }

    public int hashCode() {
        return Objects.hash(toJavaPublicKey());
    }

    public byte[] toBytes() {
        return this.publicKey.getEncoded();
    }

    public PublicKey toJavaPublicKey() {
        return this.publicKey;
    }

    @NonNull
    public static PublishedKey from(@NonNull PublicKey publicKey) {
        Preconditions.notNull(publicKey);
        return new PublishedKey(publicKey);
    }
}
