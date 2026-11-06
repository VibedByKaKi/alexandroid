package org.apache.commons.codec.binary;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.codec.binary.BaseNCodec;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class BaseNCodecOutputStream extends FilterOutputStream {
    private final BaseNCodec baseNCodec;
    private final BaseNCodec.Context context;
    private final boolean doEncode;
    private final byte[] singleByte;

    public BaseNCodecOutputStream(OutputStream outputStream, BaseNCodec baseNCodec, boolean z) {
        super(outputStream);
        this.singleByte = new byte[1];
        this.context = new BaseNCodec.Context();
        this.baseNCodec = baseNCodec;
        this.doEncode = z;
    }

    private void flush(boolean z) throws IOException {
        byte[] bArr;
        int readResults;
        int available = this.baseNCodec.available(this.context);
        if (available > 0 && (readResults = this.baseNCodec.readResults((bArr = new byte[available]), 0, available, this.context)) > 0) {
            ((FilterOutputStream) this).out.write(bArr, 0, readResults);
        }
        if (z) {
            ((FilterOutputStream) this).out.flush();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        eof();
        flush();
        ((FilterOutputStream) this).out.close();
    }

    public void eof() throws IOException {
        boolean z = this.doEncode;
        BaseNCodec baseNCodec = this.baseNCodec;
        if (z) {
            baseNCodec.encode(this.singleByte, 0, -1, this.context);
        } else {
            baseNCodec.decode(this.singleByte, 0, -1, this.context);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        if (i < 0 || i2 < 0) {
            Buffer$$ExternalSyntheticBUOutline0.m();
            return;
        }
        if (i > bArr.length || i + i2 > bArr.length) {
            Buffer$$ExternalSyntheticBUOutline0.m();
            return;
        }
        if (i2 > 0) {
            boolean z = this.doEncode;
            BaseNCodec baseNCodec = this.baseNCodec;
            if (z) {
                baseNCodec.encode(bArr, i, i2, this.context);
            } else {
                baseNCodec.decode(bArr, i, i2, this.context);
            }
            flush(false);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        flush(true);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.singleByte;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }
}
