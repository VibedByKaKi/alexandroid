package com.amazon.alexa.device.setup.echo.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class IndefiniteLengthInputStream extends LimitedInputStream {
    private int _b1;
    private int _b2;
    private boolean _eofOn00;
    private boolean _eofReached;

    public IndefiniteLengthInputStream(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this._eofReached = false;
        this._eofOn00 = true;
        this._b1 = inputStream.read();
        int read = inputStream.read();
        this._b2 = read;
        if (read >= 0) {
            checkForEof();
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m$3();
            throw null;
        }
    }

    private boolean checkForEof() {
        if (!this._eofReached && this._eofOn00 && this._b1 == 0 && this._b2 == 0) {
            this._eofReached = true;
            setParentEofDetect(true);
        }
        return this._eofReached;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this._eofOn00 || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this._eofReached) {
            return -1;
        }
        int read = this._in.read(bArr, i + 2, i2 - 2);
        if (read < 0) {
            Buffer$$ExternalSyntheticBUOutline0.m$3();
            return 0;
        }
        bArr[i] = (byte) this._b1;
        bArr[i + 1] = (byte) this._b2;
        this._b1 = this._in.read();
        int read2 = this._in.read();
        this._b2 = read2;
        if (read2 >= 0) {
            return read + 2;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$3();
        return 0;
    }

    public void setEofOn00(boolean z) {
        this._eofOn00 = z;
        checkForEof();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (checkForEof()) {
            return -1;
        }
        int read = this._in.read();
        if (read >= 0) {
            int i = this._b1;
            this._b1 = this._b2;
            this._b2 = read;
            return i;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$3();
        return 0;
    }
}
