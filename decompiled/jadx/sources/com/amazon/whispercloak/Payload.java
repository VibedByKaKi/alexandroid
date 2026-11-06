package com.amazon.whispercloak;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class Payload {
    private byte[] mAad;
    private byte[] mData;

    public Payload(byte[] bArr, byte[] bArr2) {
        this.mData = bArr;
        this.mAad = bArr2;
    }

    public byte[] getAad() {
        return this.mAad;
    }

    public byte[] getData() {
        return this.mData;
    }
}
