package com.amazon.alexa.accessory.crypto.awscryptoutils;

import defpackage.a$$ExternalSyntheticOutline0;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class Hkdf {
    private static final byte[] EMPTY_ARRAY = new byte[0];
    private final String algorithm;
    private SecretKey prk = null;
    private final Provider provider;

    private Hkdf(String str, Provider provider) {
        if (!str.startsWith("Hmac")) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Invalid algorithm ", str, ". Hkdf may only be used with Hmac algorithms."));
            throw null;
        }
        this.algorithm = str;
        this.provider = provider;
    }

    private void assertInitialized() throws IllegalStateException {
        if (this.prk != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Hkdf has not been initialized");
    }

    private Mac createMac() {
        try {
            Mac mac = Mac.getInstance(this.algorithm, this.provider);
            mac.init(this.prk);
            return mac;
        } catch (InvalidKeyException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        } catch (NoSuchAlgorithmException e2) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            return null;
        }
    }

    public static Hkdf getInstance(String str) throws NoSuchAlgorithmException {
        return new Hkdf(str, Mac.getInstance(str).getProvider());
    }

    private void unsafeInitWithoutKeyExtraction(SecretKey secretKey) throws InvalidKeyException {
        if (secretKey.getAlgorithm().equals(this.algorithm)) {
            this.prk = secretKey;
            return;
        }
        throw new InvalidKeyException("Algorithm for the provided key must match the algorithm for this Hkdf. Expected " + this.algorithm + " but found " + secretKey.getAlgorithm());
    }

    public void deriveKey(byte[] bArr, int i, byte[] bArr2, int i2) throws ShortBufferException, IllegalStateException {
        assertInitialized();
        if (i < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Length must be a non-negative value.");
            return;
        }
        if (bArr2.length < i2 + i) {
            throw new ShortBufferException();
        }
        Mac createMac = createMac();
        if (i > createMac.getMacLength() * 255) {
            Single$$ExternalSyntheticBUOutline0.m$3("Requested keys may not be longer than 255 times the underlying HMAC length.");
            return;
        }
        byte[] bArr3 = EMPTY_ARRAY;
        byte b = 1;
        int i3 = 0;
        while (i3 < i) {
            try {
                createMac.update(bArr3);
                createMac.update(bArr);
                createMac.update(b);
                bArr3 = createMac.doFinal();
                int i4 = 0;
                while (i4 < bArr3.length && i3 < i) {
                    bArr2[i3] = bArr3[i4];
                    i4++;
                    i3++;
                }
                b = (byte) (b + 1);
            } finally {
                Arrays.fill(bArr3, (byte) 0);
            }
        }
    }

    public void init(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr2 == null ? EMPTY_ARRAY : (byte[]) bArr2.clone();
        byte[] bArr4 = EMPTY_ARRAY;
        try {
            try {
                Mac mac = Mac.getInstance(this.algorithm, this.provider);
                if (bArr3.length == 0) {
                    bArr3 = new byte[mac.getMacLength()];
                    Arrays.fill(bArr3, (byte) 0);
                }
                mac.init(new SecretKeySpec(bArr3, this.algorithm));
                bArr4 = mac.doFinal(bArr);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr4, this.algorithm);
                Arrays.fill(bArr4, (byte) 0);
                unsafeInitWithoutKeyExtraction(secretKeySpec);
                Arrays.fill(bArr4, (byte) 0);
            } catch (GeneralSecurityException e) {
                throw new RuntimeException("Unexpected exception", e);
            }
        } catch (Throwable th) {
            Arrays.fill(bArr4, (byte) 0);
            throw th;
        }
    }

    public static Hkdf getInstance(String str, String str2) throws NoSuchAlgorithmException, NoSuchProviderException {
        return new Hkdf(str, Mac.getInstance(str, str2).getProvider());
    }

    public static Hkdf getInstance(String str, Provider provider) throws NoSuchAlgorithmException {
        return new Hkdf(str, Mac.getInstance(str, provider).getProvider());
    }

    public void init(byte[] bArr) {
        init(bArr, null);
    }

    public byte[] deriveKey(byte[] bArr, int i) throws IllegalStateException {
        byte[] bArr2 = new byte[i];
        try {
            deriveKey(bArr, i, bArr2, 0);
            return bArr2;
        } catch (ShortBufferException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public byte[] deriveKey(String str, int i) throws IllegalStateException {
        return deriveKey(str != null ? str.getBytes(StandardCharsets.UTF_8) : null, i);
    }
}
