package org.apache.commons.io.input;

import java.io.InputStream;
import java.util.Objects;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class UnsynchronizedByteArrayInputStream extends InputStream {
    public static final int END_OF_STREAM = -1;
    private final byte[] data;
    private final int eod;
    private int markedOffset;
    private int offset;

    public UnsynchronizedByteArrayInputStream(byte[] bArr, int i, int i2) {
        if (i < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("offset cannot be negative");
            throw null;
        }
        if (i2 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("length cannot be negative");
            throw null;
        }
        Objects.requireNonNull(bArr, "data");
        this.data = bArr;
        int min = Math.min(i, bArr.length > 0 ? bArr.length : i);
        this.offset = min;
        this.eod = Math.min(min + i2, bArr.length);
        this.markedOffset = this.offset;
    }

    @Override // java.io.InputStream
    public int available() {
        int i = this.offset;
        int i2 = this.eod;
        if (i < i2) {
            return i2 - i;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.markedOffset = this.offset;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "dest");
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            Buffer$$ExternalSyntheticBUOutline0.m();
            return 0;
        }
        int i3 = this.offset;
        int i4 = this.eod;
        if (i3 >= i4) {
            return -1;
        }
        int i5 = i4 - i3;
        if (i2 >= i5) {
            i2 = i5;
        }
        if (i2 <= 0) {
            return 0;
        }
        System.arraycopy(this.data, i3, bArr, i, i2);
        this.offset += i2;
        return i2;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.offset = this.markedOffset;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        if (j < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Skipping backward is not supported");
            return 0L;
        }
        int i = this.eod;
        int i2 = this.offset;
        long j2 = i - i2;
        if (j >= j2) {
            j = j2;
        }
        this.offset = (int) (i2 + j);
        return j;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        Objects.requireNonNull(bArr, "dest");
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read() {
        int i = this.offset;
        if (i >= this.eod) {
            return -1;
        }
        byte[] bArr = this.data;
        this.offset = i + 1;
        return bArr[i] & 255;
    }

    public UnsynchronizedByteArrayInputStream(byte[] bArr, int i) {
        Objects.requireNonNull(bArr, "data");
        if (i >= 0) {
            this.data = bArr;
            int min = Math.min(i, bArr.length > 0 ? bArr.length : i);
            this.offset = min;
            this.eod = bArr.length;
            this.markedOffset = min;
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("offset cannot be negative");
        throw null;
    }

    public UnsynchronizedByteArrayInputStream(byte[] bArr) {
        Objects.requireNonNull(bArr, "data");
        this.data = bArr;
        this.offset = 0;
        this.eod = bArr.length;
        this.markedOffset = 0;
    }
}
