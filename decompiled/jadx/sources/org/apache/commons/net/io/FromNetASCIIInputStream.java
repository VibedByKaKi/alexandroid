package org.apache.commons.net.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.charset.StandardCharsets;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.lang3.SystemProperties;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class FromNetASCIIInputStream extends PushbackInputStream {
    static final String _lineSeparator;
    static final byte[] _lineSeparatorBytes;
    static final boolean _noConversionRequired;
    private int length;

    static {
        String property = System.getProperty(SystemProperties.LINE_SEPARATOR);
        _lineSeparator = property;
        _noConversionRequired = property.equals("\r\n");
        _lineSeparatorBytes = property.getBytes(StandardCharsets.US_ASCII);
    }

    public FromNetASCIIInputStream(InputStream inputStream) {
        super(inputStream, _lineSeparatorBytes.length + 1);
    }

    public static boolean isConversionRequired() {
        return !_noConversionRequired;
    }

    private int readInt() throws IOException {
        int read = super.read();
        if (read != 13) {
            return read;
        }
        int read2 = super.read();
        if (read2 != 10) {
            if (read2 != -1) {
                unread(read2);
            }
            return 13;
        }
        unread(_lineSeparatorBytes);
        this.length--;
        return super.read();
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        if (((PushbackInputStream) this).in != null) {
            return ((PushbackInputStream) this).in.available() + (((PushbackInputStream) this).buf.length - ((PushbackInputStream) this).pos);
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2("Stream closed");
        return 0;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (_noConversionRequired) {
            return super.read(bArr, i, i2);
        }
        if (i2 < 1) {
            return 0;
        }
        int available = available();
        if (i2 > available) {
            i2 = available;
        }
        this.length = i2;
        if (i2 < 1) {
            this.length = 1;
        }
        int readInt = readInt();
        if (readInt == -1) {
            return -1;
        }
        int i4 = i;
        while (true) {
            i3 = i4 + 1;
            bArr[i4] = (byte) readInt;
            int i5 = this.length - 1;
            this.length = i5;
            if (i5 <= 0 || (readInt = readInt()) == -1) {
                break;
            }
            i4 = i3;
        }
        return i3 - i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (_noConversionRequired) {
            return super.read();
        }
        return readInt();
    }
}
