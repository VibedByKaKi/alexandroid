package com.amazon.coral.util.security;

import com.amazon.coral.util.Base32Encoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import okio.Path$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class MessageDigestHelper {
    public static final String BASE32_ENCODING = "BASE32";
    public static final String BASE64_ENCODING = "BASE64";
    private final String algorithm;

    public MessageDigestHelper(String str) {
        if (str == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        try {
            MessageDigest.getInstance(str);
            this.algorithm = str;
        } catch (NoSuchAlgorithmException e) {
            Single$$ExternalSyntheticBUOutline0.m(str, e);
            throw null;
        }
    }

    public static boolean compare(CharSequence charSequence, CharSequence charSequence2, String str) {
        return MessageDigest.isEqual(decode(charSequence, str), decode(charSequence2, str));
    }

    private static byte[] decode(CharSequence charSequence, String str) {
        if (charSequence == null || str == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        if (str.equalsIgnoreCase(BASE64_ENCODING)) {
            return Base64.getDecoder().decode(charSequence.toString());
        }
        if (str.equalsIgnoreCase(BASE32_ENCODING)) {
            return new Base32Encoder().decode(charSequence);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(str);
        return null;
    }

    private static String encode(byte[] bArr, String str) {
        if (bArr == null || str == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        if (str.equalsIgnoreCase(BASE64_ENCODING)) {
            return Base64.getEncoder().encodeToString(bArr);
        }
        if (str.equalsIgnoreCase(BASE32_ENCODING)) {
            return new Base32Encoder().encode(bArr);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(str);
        return null;
    }

    public byte[] computeHash(byte[] bArr) {
        if (bArr == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        try {
            return MessageDigest.getInstance(this.algorithm).digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            Single$$ExternalSyntheticBUOutline0.m(this.algorithm, e);
            return null;
        }
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public static boolean compare(CharSequence charSequence, byte[] bArr, String str) {
        return compare(decode(charSequence, str), bArr);
    }

    public static boolean compare(byte[] bArr, byte[] bArr2) {
        return MessageDigest.isEqual(bArr, bArr2);
    }

    public String computeHash(byte[] bArr, String str) {
        try {
            return encode(MessageDigest.getInstance(this.algorithm).digest(bArr), str);
        } catch (NoSuchAlgorithmException e) {
            Single$$ExternalSyntheticBUOutline0.m(this.algorithm, e);
            return null;
        }
    }
}
