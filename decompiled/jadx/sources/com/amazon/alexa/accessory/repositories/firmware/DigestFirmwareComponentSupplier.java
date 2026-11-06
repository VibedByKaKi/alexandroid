package com.amazon.alexa.accessory.repositories.firmware;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import com.amazon.alexa.accessory.internal.util.IOUtils;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.io.Source;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public abstract class DigestFirmwareComponentSupplier implements FirmwareComponentSupplier {
    private byte[] buffer;
    private final MessageDigest digest;

    public DigestFirmwareComponentSupplier(String str) {
        Preconditions.notNull(str, "algorithm");
        try {
            this.digest = MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Invalid environment (unsupported algorithm: ", str, MarkdownConstants.RIGHT_PARENTHESIS), e);
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

    @Override // com.amazon.alexa.accessory.repositories.firmware.FirmwareComponentSupplier
    public final String getSignature() throws IOException {
        Source open = open();
        try {
            return calculateSignature(open);
        } finally {
            IOUtils.closeQuietly(open);
        }
    }

    public final String getSignatureAlgorithm() {
        return this.digest.getAlgorithm();
    }

    @Override // com.amazon.alexa.accessory.repositories.firmware.FirmwareComponentSupplier
    public final String getSignature(int i, int i2) throws IOException {
        Source open = open(i, i2);
        try {
            return calculateSignature(open);
        } finally {
            IOUtils.closeQuietly(open);
        }
    }
}
