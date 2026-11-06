package org.apache.commons.codec.binary;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.codec.binary.BaseNCodec;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class BaseNCodecInputStream extends FilterInputStream {
    private final BaseNCodec baseNCodec;
    private final BaseNCodec.Context context;
    private final boolean doEncode;
    private final byte[] singleByte;

    public BaseNCodecInputStream(InputStream inputStream, BaseNCodec baseNCodec, boolean z) {
        super(inputStream);
        this.singleByte = new byte[1];
        this.context = new BaseNCodec.Context();
        this.doEncode = z;
        this.baseNCodec = baseNCodec;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return !this.context.eof ? 1 : 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        if (i < 0 || i2 < 0) {
            Buffer$$ExternalSyntheticBUOutline0.m();
            return 0;
        }
        if (i > bArr.length || i + i2 > bArr.length) {
            Buffer$$ExternalSyntheticBUOutline0.m();
            return 0;
        }
        if (i2 == 0) {
            return 0;
        }
        int i3 = 0;
        while (i3 == 0) {
            if (!this.baseNCodec.hasData(this.context)) {
                byte[] bArr2 = new byte[this.doEncode ? 4096 : 8192];
                int read = ((FilterInputStream) this).in.read(bArr2);
                boolean z = this.doEncode;
                BaseNCodec baseNCodec = this.baseNCodec;
                if (z) {
                    baseNCodec.encode(bArr2, 0, read, this.context);
                } else {
                    baseNCodec.decode(bArr2, 0, read, this.context);
                }
            }
            i3 = this.baseNCodec.readResults(bArr, i, i2, this.context);
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        throw new IOException("mark/reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        int read;
        if (j < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m(j, "Negative skip length: "));
            return 0L;
        }
        byte[] bArr = new byte[512];
        long j2 = j;
        while (j2 > 0 && (read = read(bArr, 0, (int) Math.min(512, j2))) != -1) {
            j2 -= read;
        }
        return j - j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = read(this.singleByte, 0, 1);
        while (read == 0) {
            read = read(this.singleByte, 0, 1);
        }
        if (read <= 0) {
            return -1;
        }
        byte b = this.singleByte[0];
        return b < 0 ? b + 256 : b;
    }
}
