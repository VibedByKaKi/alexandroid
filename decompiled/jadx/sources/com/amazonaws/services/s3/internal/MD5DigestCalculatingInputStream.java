package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MD5DigestCalculatingInputStream extends SdkFilterInputStream {
    private MessageDigest digest;
    private MessageDigest digestLastMarked;

    public MD5DigestCalculatingInputStream(InputStream inputStream) {
        super(inputStream);
        this.digest = newMD5();
    }

    private MessageDigest cloneFrom(MessageDigest messageDigest) {
        try {
            return (MessageDigest) messageDigest.clone();
        } catch (CloneNotSupportedException e) {
            Single$$ExternalSyntheticBUOutline0.m$1("unexpected", e);
            return null;
        }
    }

    private MessageDigest newMD5() {
        try {
            return MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
        } catch (NoSuchAlgorithmException e) {
            Single$$ExternalSyntheticBUOutline0.m$1("unexpected", e);
            return null;
        }
    }

    public byte[] getMd5Digest() {
        return this.digest.digest();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (markSupported()) {
            super.mark(i);
            this.digestLastMarked = cloneFrom(this.digest);
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.digest.update((byte) read);
        }
        return read;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!markSupported()) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("mark/reset not supported");
            return;
        }
        super.reset();
        MessageDigest messageDigest = this.digestLastMarked;
        this.digest = messageDigest == null ? newMD5() : cloneFrom(messageDigest);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.digest.update(bArr, i, read);
        }
        return read;
    }
}
