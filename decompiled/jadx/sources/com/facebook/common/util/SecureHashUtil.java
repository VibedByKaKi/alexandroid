package com.facebook.common.util;

import android.util.Base64;
import com.amazon.coral.model.basic.BasicStringModel;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class SecureHashUtil {
    private static final int BUFFER_SIZE = 4096;
    static final byte[] HEX_CHAR_TABLE = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    public static String convertToHex(byte[] bArr) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            byte[] bArr2 = HEX_CHAR_TABLE;
            sb.append((char) bArr2[(b & 255) >>> 4]);
            sb.append((char) bArr2[b & 15]);
        }
        return sb.toString();
    }

    private static String makeHash(InputStream inputStream, String str) throws IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    return convertToHex(messageDigest.digest());
                }
                messageDigest.update(bArr, 0, read);
            }
        } catch (UnsupportedEncodingException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        } catch (NoSuchAlgorithmException e2) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            return null;
        }
    }

    public static String makeMD5Hash(String str) {
        try {
            return makeMD5Hash(str.getBytes(BasicStringModel.DEFAULT_ENCODING));
        } catch (UnsupportedEncodingException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public static String makeSHA1Hash(String str) {
        try {
            return makeSHA1Hash(str.getBytes(BasicStringModel.DEFAULT_ENCODING));
        } catch (UnsupportedEncodingException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public static String makeSHA1HashBase64(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, 0, bArr.length);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public static String makeSHA256Hash(byte[] bArr) {
        return makeHash(bArr, "SHA-256");
    }

    public static String makeMD5Hash(byte[] bArr) {
        return makeHash(bArr, MessageDigestAlgorithms.MD5);
    }

    public static String makeSHA1Hash(byte[] bArr) {
        return makeHash(bArr, "SHA-1");
    }

    public static String makeMD5Hash(InputStream inputStream) throws IOException {
        return makeHash(inputStream, MessageDigestAlgorithms.MD5);
    }

    private static String makeHash(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr, 0, bArr.length);
            return convertToHex(messageDigest.digest());
        } catch (UnsupportedEncodingException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        } catch (NoSuchAlgorithmException e2) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            return null;
        }
    }
}
