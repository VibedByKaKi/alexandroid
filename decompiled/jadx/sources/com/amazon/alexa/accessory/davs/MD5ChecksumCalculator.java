package com.amazon.alexa.accessory.davs;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import com.amazon.alexa.accessory.internal.util.IOUtils;
import com.amazon.alexa.accessory.io.InputStreamSource;
import com.amazon.alexa.accessory.io.Source;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class MD5ChecksumCalculator {
    private static final String HASHING_ALGORITHM = "MD5";
    private byte[] buffer;
    private final MessageDigest digest;

    public MD5ChecksumCalculator() {
        try {
            this.digest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("UNSUPPORTED algorithm:MD5", e);
            throw null;
        }
    }

    private synchronized String calculateSignature(Source source) throws IOException {
        MessageDigest messageDigest;
        try {
            if (this.buffer == null) {
                this.buffer = new byte[4096];
            }
            this.digest.reset();
            while (true) {
                byte[] bArr = this.buffer;
                int read = source.read(bArr, 0, bArr.length);
                messageDigest = this.digest;
                if (read == -1) {
                } else {
                    messageDigest.update(this.buffer, 0, read);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return IOUtils.byteArrayToBase64(messageDigest.digest());
    }

    public String getMD5Signature(File file) throws IOException {
        InputStreamSource inputStreamSource = null;
        try {
            InputStreamSource inputStreamSource2 = new InputStreamSource(new FileInputStream(file));
            try {
                String calculateSignature = calculateSignature(inputStreamSource2);
                IOUtils.closeQuietly(inputStreamSource2);
                return calculateSignature;
            } catch (Throwable th) {
                th = th;
                inputStreamSource = inputStreamSource2;
                IOUtils.closeQuietly(inputStreamSource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
