package org.apache.commons.net.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class ToNetASCIIInputStream extends FilterInputStream {
    private static final int LAST_WAS_CR = 1;
    private static final int LAST_WAS_NL = 2;
    private static final int NOTHING_SPECIAL = 0;
    private int status;

    public ToNetASCIIInputStream(InputStream inputStream) {
        super(inputStream);
        this.status = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int available = ((FilterInputStream) this).in.available();
        return this.status == 2 ? available + 1 : available;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i2 < 1) {
            return 0;
        }
        int available = available();
        if (i2 > available) {
            i2 = available;
        }
        int i4 = i2 >= 1 ? i2 : 1;
        int read = read();
        if (read == -1) {
            return -1;
        }
        int i5 = i;
        while (true) {
            i3 = i5 + 1;
            bArr[i5] = (byte) read;
            i4--;
            if (i4 <= 0 || (read = read()) == -1) {
                break;
            }
            i5 = i3;
        }
        return i3 - i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.status == 2) {
            this.status = 0;
            return 10;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != 10) {
            if (read == 13) {
                this.status = 1;
                return 13;
            }
        } else if (this.status != 1) {
            this.status = 2;
            return 13;
        }
        this.status = 0;
        return read;
    }
}
