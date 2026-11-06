package org.bouncycastle.util.encoders;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes11.dex */
public class UrlBase64 {
    private static final Encoder encoder = new UrlBase64Encoder();

    public static byte[] decode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("exception decoding URL safe base64 string: ")), e);
        }
    }

    public static byte[] encode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.encode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new EncoderException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("exception encoding URL safe base64 data: ")), e);
        }
    }

    public static int decode(byte[] bArr, OutputStream outputStream) throws IOException {
        return encoder.decode(bArr, 0, bArr.length, outputStream);
    }

    public static int encode(byte[] bArr, OutputStream outputStream) throws IOException {
        return encoder.encode(bArr, 0, bArr.length, outputStream);
    }

    public static byte[] decode(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException(ErrorUtils$$ExternalSyntheticOutline0.m(e, new StringBuilder("exception decoding URL safe base64 string: ")), e);
        }
    }

    public static int decode(String str, OutputStream outputStream) throws IOException {
        return encoder.decode(str, outputStream);
    }
}
