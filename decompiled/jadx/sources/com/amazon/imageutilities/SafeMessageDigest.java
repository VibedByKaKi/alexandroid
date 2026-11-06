package com.amazon.imageutilities;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class SafeMessageDigest implements Cloneable {
    private final MessageDigest messageDigest;

    public SafeMessageDigest(String str) throws UnsupportedAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            this.messageDigest = messageDigest;
            messageDigest.clone();
        } catch (CloneNotSupportedException | NoSuchAlgorithmException e) {
            throw new UnsupportedAlgorithmException(e);
        }
    }

    public Object clone() {
        return new SafeMessageDigest(this);
    }

    public byte[] digest() {
        return this.messageDigest.digest();
    }

    public String getAlgorithm() {
        return this.messageDigest.getAlgorithm();
    }

    public SafeMessageDigest safeClone() {
        return new SafeMessageDigest(this);
    }

    public void update(byte[] bArr) {
        this.messageDigest.update(bArr);
    }

    public void update(byte[] bArr, int i, int i2) {
        this.messageDigest.update(bArr, i, i2);
    }

    private SafeMessageDigest(SafeMessageDigest safeMessageDigest) {
        try {
            this.messageDigest = (MessageDigest) safeMessageDigest.messageDigest.clone();
        } catch (CloneNotSupportedException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            throw null;
        }
    }
}
