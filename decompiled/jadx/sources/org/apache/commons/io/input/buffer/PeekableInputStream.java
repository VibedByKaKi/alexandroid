package org.apache.commons.io.input.buffer;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class PeekableInputStream extends CircularBufferInputStream {
    public PeekableInputStream(InputStream inputStream, int i) {
        super(inputStream, i);
    }

    public boolean peek(byte[] bArr, int i, int i2) throws IOException {
        Objects.requireNonNull(bArr, "sourceBuffer");
        if (bArr.length <= this.bufferSize) {
            if (this.buffer.getCurrentNumberOfBytes() < bArr.length) {
                fillBuffer();
            }
            return this.buffer.peek(bArr, i, i2);
        }
        StringBuilder sb = new StringBuilder("Peek request size of ");
        sb.append(bArr.length);
        sb.append(" bytes exceeds buffer size of ");
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(sb, this.bufferSize, " bytes"));
        return false;
    }

    public PeekableInputStream(InputStream inputStream) {
        super(inputStream);
    }

    public boolean peek(byte[] bArr) throws IOException {
        Objects.requireNonNull(bArr, "sourceBuffer");
        return peek(bArr, 0, bArr.length);
    }
}
