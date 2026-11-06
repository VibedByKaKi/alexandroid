package org.apache.commons.net.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class FromNetASCIIOutputStream extends FilterOutputStream {
    private boolean lastWasCR;

    public FromNetASCIIOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.lastWasCR = false;
    }

    private void writeInt(int i) throws IOException {
        if (i == 10) {
            if (this.lastWasCR) {
                ((FilterOutputStream) this).out.write(FromNetASCIIInputStream._lineSeparatorBytes);
                this.lastWasCR = false;
                return;
            } else {
                this.lastWasCR = false;
                ((FilterOutputStream) this).out.write(10);
                return;
            }
        }
        if (i == 13) {
            this.lastWasCR = true;
            return;
        }
        if (this.lastWasCR) {
            ((FilterOutputStream) this).out.write(13);
            this.lastWasCR = false;
        }
        ((FilterOutputStream) this).out.write(i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (FromNetASCIIInputStream._noConversionRequired) {
            super.close();
            return;
        }
        if (this.lastWasCR) {
            ((FilterOutputStream) this).out.write(13);
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) throws IOException {
        if (FromNetASCIIInputStream._noConversionRequired) {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
            return;
        }
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                return;
            }
            int i4 = i + 1;
            writeInt(bArr[i]);
            i = i4;
            i2 = i3;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(int i) throws IOException {
        if (FromNetASCIIInputStream._noConversionRequired) {
            ((FilterOutputStream) this).out.write(i);
        } else {
            writeInt(i);
        }
    }
}
