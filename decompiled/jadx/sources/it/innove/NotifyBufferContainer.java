package it.innove;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class NotifyBufferContainer {
    public ByteBuffer items;

    public NotifyBufferContainer(int i) {
        this.items = ByteBuffer.allocate(i);
    }

    public void finalize() throws Throwable {
        this.items = ByteBuffer.allocate(0);
    }

    public boolean isBufferFull() {
        return this.items.remaining() == 0;
    }

    public byte[] put(byte[] bArr) {
        byte[] bArr2;
        if (bArr.length > this.items.remaining()) {
            int length = bArr.length - this.items.remaining();
            bArr2 = new byte[length];
            int remaining = this.items.remaining();
            byte[] bArr3 = new byte[remaining];
            System.arraycopy(bArr, 0, bArr3, 0, remaining);
            System.arraycopy(bArr, remaining, bArr2, 0, length);
            bArr = bArr3;
        } else {
            bArr2 = null;
        }
        this.items.put(bArr);
        return bArr2;
    }

    public void resetBuffer() {
        this.items.clear();
    }

    public int size() {
        return this.items.limit();
    }
}
