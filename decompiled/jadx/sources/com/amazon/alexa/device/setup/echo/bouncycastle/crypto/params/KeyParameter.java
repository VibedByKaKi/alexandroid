package com.amazon.alexa.device.setup.echo.bouncycastle.crypto.params;

import com.amazon.alexa.device.setup.echo.bouncycastle.crypto.CipherParameters;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class KeyParameter implements CipherParameters {
    private final byte[] key;

    public KeyParameter(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.key = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public byte[] getKey() {
        return this.key;
    }

    public KeyParameter(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }
}
