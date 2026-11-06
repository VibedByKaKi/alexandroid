package com.amazon.ion.impl;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ResizingPipedInputStream extends InputStream {
    private static final NotificationConsumer NO_OP_NOTIFICATION_CONSUMER = new NotificationConsumer() { // from class: com.amazon.ion.impl.ResizingPipedInputStream.1
        @Override // com.amazon.ion.impl.ResizingPipedInputStream.NotificationConsumer
        public void bytesConsolidatedToStartOfBuffer(int i) {
        }
    };
    private static final int SINGLE_BYTE_MASK = 255;
    private int available;
    private int boundary;
    private byte[] buffer;
    private java.nio.ByteBuffer byteBuffer;
    private int capacity;
    private final int initialBufferSize;
    private final int maximumBufferSize;
    private NotificationConsumer notificationConsumer;
    private int readIndex;
    private int size;
    private final boolean useBoundary;
    private int writeIndex;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface NotificationConsumer {
        void bytesConsolidatedToStartOfBuffer(int i);
    }

    public ResizingPipedInputStream(int i, int i2, boolean z) {
        this.notificationConsumer = NO_OP_NOTIFICATION_CONSUMER;
        this.readIndex = 0;
        this.writeIndex = 0;
        this.available = 0;
        this.size = 0;
        this.boundary = 0;
        if (i < 1) {
            Single$$ExternalSyntheticBUOutline0.m$3("Initial buffer size must be at least 1.");
            throw null;
        }
        if (i2 < i) {
            Single$$ExternalSyntheticBUOutline0.m$3("Maximum buffer size cannot be less than the initial buffer size.");
            throw null;
        }
        this.initialBufferSize = i;
        this.maximumBufferSize = i2;
        this.capacity = i;
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.byteBuffer = java.nio.ByteBuffer.wrap(bArr, 0, i);
        this.useBoundary = z;
    }

    private void ensureSpaceInBuffer(int i) {
        if (this.size < 1 || freeSpaceAtEndOfBuffer() < i) {
            int freeSpaceAtEndOfBuffer = (i - freeSpaceAtEndOfBuffer()) - this.readIndex;
            if (freeSpaceAtEndOfBuffer <= 0) {
                moveBytesToStartOfBuffer(this.buffer);
                return;
            }
            int max = Math.max(this.initialBufferSize, freeSpaceAtEndOfBuffer);
            int i2 = this.capacity;
            int i3 = i2 + max;
            int i4 = this.maximumBufferSize;
            if (i3 <= i4) {
                freeSpaceAtEndOfBuffer = max;
            } else if (i2 + freeSpaceAtEndOfBuffer > i4) {
                throw new BufferOverflowException();
            }
            byte[] bArr = new byte[this.buffer.length + freeSpaceAtEndOfBuffer];
            moveBytesToStartOfBuffer(bArr);
            int i5 = this.capacity + freeSpaceAtEndOfBuffer;
            this.capacity = i5;
            this.buffer = bArr;
            this.byteBuffer = java.nio.ByteBuffer.wrap(bArr, this.readIndex, i5);
        }
    }

    private int freeSpaceAtEndOfBuffer() {
        return this.capacity - this.writeIndex;
    }

    private void moveBytesToStartOfBuffer(byte[] bArr) {
        int i = this.size;
        if (i > 0) {
            System.arraycopy(this.buffer, this.readIndex, bArr, 0, i);
        }
        int i2 = this.readIndex;
        if (i2 > 0) {
            this.notificationConsumer.bytesConsolidatedToStartOfBuffer(i2);
        }
        this.readIndex = 0;
        this.boundary = this.available;
        this.writeIndex = this.size;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.available;
    }

    public int availableBeyondBoundary() {
        return this.size - this.available;
    }

    public int capacity() {
        return this.capacity;
    }

    public void clear() {
        this.readIndex = 0;
        this.writeIndex = 0;
        this.available = 0;
        this.boundary = 0;
        this.size = 0;
    }

    public void consolidate(int i, int i2) {
        int i3 = this.writeIndex;
        if (i > i3 || i > this.boundary || i2 < this.readIndex) {
            Single$$ExternalSyntheticBUOutline0.m$3("Tried to consolidate using an index that violates the constraints.");
            return;
        }
        int i4 = i - i2;
        byte[] bArr = this.buffer;
        System.arraycopy(bArr, i, bArr, i2, i3 - i);
        this.size -= i4;
        this.available -= i4;
        this.writeIndex -= i4;
        this.boundary -= i4;
    }

    public void copyBytes(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.buffer, i, bArr, i2, i3);
    }

    public void copyTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.buffer, this.readIndex, this.available);
    }

    public void extendBoundary(int i) {
        this.boundary += i;
        this.available += i;
    }

    public int getBoundary() {
        return this.boundary;
    }

    public java.nio.ByteBuffer getByteBuffer(int i, int i2) {
        this.byteBuffer.limit(this.capacity);
        this.byteBuffer.position(i);
        this.byteBuffer.limit(i2);
        return this.byteBuffer;
    }

    public int getInitialBufferSize() {
        return this.initialBufferSize;
    }

    public int getReadIndex() {
        return this.readIndex;
    }

    public int getWriteIndex() {
        return this.writeIndex;
    }

    public int peek(int i) {
        return this.buffer[i] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (bArr.length == 0 || i2 == 0) {
            return 0;
        }
        int i3 = this.available;
        if (i3 < 1) {
            return -1;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.buffer, this.readIndex, bArr, i, min);
        this.readIndex += min;
        this.available -= min;
        this.size -= min;
        return min;
    }

    public int receive(InputStream inputStream, int i) throws IOException {
        int i2;
        ensureSpaceInBuffer(i);
        try {
            i2 = inputStream.read(this.buffer, this.writeIndex, i);
        } catch (EOFException unused) {
            i2 = -1;
        }
        if (i2 > 0) {
            this.writeIndex += i2;
            this.size += i2;
        } else {
            i2 = 0;
        }
        if (!this.useBoundary) {
            extendBoundary(i2);
        }
        return i2;
    }

    public void registerNotificationConsumer(NotificationConsumer notificationConsumer) {
        this.notificationConsumer = notificationConsumer;
    }

    public void rewind(int i, int i2) {
        this.readIndex = i;
        this.available = i2;
        this.boundary = i2 + i;
        this.size = this.writeIndex - i;
    }

    public void seekTo(int i) {
        int i2 = i - this.readIndex;
        this.available -= i2;
        this.size -= i2;
        this.readIndex = i;
    }

    public int size() {
        return this.size;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        int i;
        if (j < 1 || (i = this.available) < 1) {
            return 0L;
        }
        int min = (int) Math.min(i, j);
        this.readIndex += min;
        this.available -= min;
        this.size -= min;
        return min;
    }

    public void truncate(int i, int i2) {
        this.writeIndex = i;
        this.available = i2;
        this.boundary = i;
        this.size = i2;
    }

    public void receive(byte[] bArr, int i, int i2) {
        ensureSpaceInBuffer(i2);
        System.arraycopy(bArr, i, this.buffer, this.writeIndex, i2);
        this.writeIndex += i2;
        this.size += i2;
        if (this.useBoundary) {
            return;
        }
        extendBoundary(i2);
    }

    public void receive(byte[] bArr) {
        receive(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read() {
        int i = this.available;
        if (i < 1) {
            return -1;
        }
        byte[] bArr = this.buffer;
        int i2 = this.readIndex;
        byte b = bArr[i2];
        this.readIndex = i2 + 1;
        this.available = i - 1;
        this.size--;
        return b & 255;
    }

    public void receive(int i) {
        ensureSpaceInBuffer(1);
        byte[] bArr = this.buffer;
        int i2 = this.writeIndex;
        bArr[i2] = (byte) i;
        this.writeIndex = i2 + 1;
        this.size++;
        if (this.useBoundary) {
            return;
        }
        extendBoundary(1);
    }

    public ResizingPipedInputStream(int i) {
        this(i, Integer.MAX_VALUE, false);
    }
}
