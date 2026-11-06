package androidx.camera.core.internal;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class ByteBufferOutputStream extends OutputStream {
    private final ByteBuffer mByteBuffer;

    public ByteBufferOutputStream(@NonNull ByteBuffer byteBuffer) {
        this.mByteBuffer = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        bArr.getClass();
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            Buffer$$ExternalSyntheticBUOutline0.m();
        } else {
            if (i2 == 0) {
                return;
            }
            if (this.mByteBuffer.remaining() >= i2) {
                this.mByteBuffer.put(bArr, i, i2);
            } else {
                Buffer$$ExternalSyntheticBUOutline0.m$3("Output ByteBuffer has insufficient bytes remaining.");
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        if (this.mByteBuffer.hasRemaining()) {
            this.mByteBuffer.put((byte) i);
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m$3("Output ByteBuffer has no bytes remaining.");
        }
    }
}
