package org.bouncycastle.asn1;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.InputStream;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.bouncycastle.util.io.Streams;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
class DefiniteLengthInputStream extends LimitedInputStream {
    private static final byte[] EMPTY_BYTES = new byte[0];
    private final int _originalLength;
    private int _remaining;

    public DefiniteLengthInputStream(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i <= 0) {
            if (i < 0) {
                Single$$ExternalSyntheticBUOutline0.m$3("negative lengths not allowed");
                throw null;
            }
            setParentEofDetect(true);
        }
        this._originalLength = i;
        this._remaining = i;
    }

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

    public void readAllIntoByteArray(byte[] bArr) throws IOException {
        int i = this._remaining;
        if (i != bArr.length) {
            Single$$ExternalSyntheticBUOutline0.m$3("buffer length not right for data");
            return;
        }
        if (i == 0) {
            return;
        }
        int limit = getLimit();
        int i2 = this._remaining;
        if (i2 >= limit) {
            Buffer$$ExternalSyntheticBUOutline0.m$2(ParcelCompat$$ExternalSyntheticOutline0.m(" >= ", this._remaining, limit, new StringBuilder("corrupted stream - out of bounds length found: ")));
            return;
        }
        int readFully = i2 - Streams.readFully(this._in, bArr, 0, bArr.length);
        this._remaining = readFully;
        if (readFully == 0) {
            setParentEofDetect(true);
        } else {
            PathKt$$ExternalSyntheticBUOutline0.m(" object truncated by ", this._originalLength, this._remaining, "DEF length ");
        }
    }

    public byte[] toByteArray() throws IOException {
        if (this._remaining == 0) {
            return EMPTY_BYTES;
        }
        int limit = getLimit();
        int i = this._remaining;
        if (i >= limit) {
            Buffer$$ExternalSyntheticBUOutline0.m$2(ParcelCompat$$ExternalSyntheticOutline0.m(" >= ", this._remaining, limit, new StringBuilder("corrupted stream - out of bounds length found: ")));
            return null;
        }
        byte[] bArr = new byte[i];
        int readFully = i - Streams.readFully(this._in, bArr, 0, i);
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
        if (read < 0) {
            PathKt$$ExternalSyntheticBUOutline0.m(" object truncated by ", this._originalLength, this._remaining, "DEF length ");
            return 0;
        }
        int i = this._remaining - 1;
        this._remaining = i;
        if (i == 0) {
            setParentEofDetect(true);
        }
        return read;
    }
}
