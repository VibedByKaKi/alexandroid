package com.amazonaws.util;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes6.dex */
public class CountingInputStream extends SdkFilterInputStream {
    private long byteCount;

    public CountingInputStream(InputStream inputStream) {
        super(inputStream);
        this.byteCount = 0L;
    }

    public long getByteCount() {
        return this.byteCount;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = super.read();
        this.byteCount += read >= 0 ? 1L : 0L;
        return read;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        this.byteCount += read >= 0 ? read : 0L;
        return read;
    }
}
