package com.amazon.alexa.device.setup.echo.bouncycastle.asn1;

import com.amazon.alexa.device.setup.echo.bouncycastle.util.io.Streams;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.InputStream;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class DefiniteLengthInputStream extends LimitedInputStream {
    private static final byte[] EMPTY_BYTES = new byte[0];
    private final int _originalLength;
    private int _remaining;

    public DefiniteLengthInputStream(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        if (i < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("negative lengths not allowed");
            throw null;
        }
        this._originalLength = i;
        this._remaining = i;
        if (i == 0) {
            setParentEofDetect(true);
        }
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.LimitedInputStream
    public int getRemaining() {
        return this._remaining;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this._remaining;
        if (i3 == 0) {
            return -1;
        }
        int read = this._in.read(bArr, i, Math.min(i2, i3));
        if (read < 0) {
            PathKt$$ExternalSyntheticBUOutline0.m(" object truncated by ", this._originalLength, this._remaining, "DEF length ");
            return 0;
        }
        int i4 = this._remaining - read;
        this._remaining = i4;
        if (i4 == 0) {
            setParentEofDetect(true);
        }
        return read;
    }

    public byte[] toByteArray() throws IOException {
        int i = this._remaining;
        if (i == 0) {
            return EMPTY_BYTES;
        }
        byte[] bArr = new byte[i];
        int readFully = i - Streams.readFully(this._in, bArr);
        this._remaining = readFully;
        if (readFully == 0) {
            setParentEofDetect(true);
            return bArr;
        }
        PathKt$$ExternalSyntheticBUOutline0.m(" object truncated by ", this._originalLength, this._remaining, "DEF length ");
        return null;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this._remaining == 0) {
            return -1;
        }
        int read = this._in.read();
        if (read >= 0) {
            int i = this._remaining - 1;
            this._remaining = i;
            if (i == 0) {
                setParentEofDetect(true);
            }
            return read;
        }
        PathKt$$ExternalSyntheticBUOutline0.m(" object truncated by ", this._originalLength, this._remaining, "DEF length ");
        return 0;
    }
}
