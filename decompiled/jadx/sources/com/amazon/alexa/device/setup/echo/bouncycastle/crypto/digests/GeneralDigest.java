package com.amazon.alexa.device.setup.echo.bouncycastle.crypto.digests;

import com.amazon.alexa.device.setup.echo.bouncycastle.crypto.ExtendedDigest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class GeneralDigest implements ExtendedDigest {
    private static final int BYTE_LENGTH = 64;
    private long byteCount;
    private final byte[] xBuf;
    private int xBufOff;

    public GeneralDigest(GeneralDigest generalDigest) {
        byte[] bArr = new byte[generalDigest.xBuf.length];
        this.xBuf = bArr;
        byte[] bArr2 = generalDigest.xBuf;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        this.xBufOff = generalDigest.xBufOff;
        this.byteCount = generalDigest.byteCount;
    }

    public void finish() {
        long j = this.byteCount << 3;
        update(Byte.MIN_VALUE);
        while (this.xBufOff != 0) {
            update((byte) 0);
        }
        processLength(j);
        processBlock();
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    public abstract void processBlock();

    public abstract void processLength(long j);

    public abstract void processWord(byte[] bArr, int i);

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.crypto.Digest
    public void reset() {
        this.byteCount = 0L;
        this.xBufOff = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.xBuf;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        while (this.xBufOff != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.xBuf.length) {
            processWord(bArr, i);
            byte[] bArr2 = this.xBuf;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.byteCount += bArr2.length;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    public GeneralDigest() {
        this.xBuf = new byte[4];
        this.xBufOff = 0;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.crypto.Digest
    public void update(byte b) {
        byte[] bArr = this.xBuf;
        int i = this.xBufOff;
        int i2 = i + 1;
        this.xBufOff = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            processWord(bArr, 0);
            this.xBufOff = 0;
        }
        this.byteCount++;
    }
}
