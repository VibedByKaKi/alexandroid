package kotlin.reflect.jvm.internal.impl.protobuf;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import androidx.collection.SieveCacheKt;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.XML$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public abstract class ByteString implements Iterable<Byte> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final ByteString EMPTY = new LiteralByteString(new byte[0]);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    private static ByteString balancedConcat(Iterator<ByteString> it2, int i) {
        if (i == 1) {
            return it2.next();
        }
        int i2 = i >>> 1;
        return balancedConcat(it2, i2).concat(balancedConcat(it2, i - i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        ?? r0;
        if (iterable instanceof Collection) {
            r0 = (Collection) iterable;
        } else {
            r0 = new ArrayList();
            Iterator<ByteString> it2 = iterable.iterator();
            while (it2.hasNext()) {
                r0.add(it2.next());
            }
        }
        return r0.isEmpty() ? EMPTY : balancedConcat(r0.iterator(), r0.size());
    }

    public static ByteString copyFromUtf8(String str) {
        try {
            return new LiteralByteString(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("UTF-8 not supported?", e);
            return null;
        }
    }

    public static Output newOutput() {
        return new Output(128);
    }

    public ByteString concat(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        if (size + size2 < SieveCacheKt.NodeLinkMask) {
            return RopeByteString.concatenate(this, byteString);
        }
        PathKt$$ExternalSyntheticBUOutline0.m(53, "ByteString would be too long: ", "+", size, size2);
        return null;
    }

    public void copyTo(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            XML$$ExternalSyntheticBUOutline0.m(CredentialConfig$$ExternalSyntheticOutline0.m(30, i, "Source offset < 0: "));
            return;
        }
        if (i2 < 0) {
            XML$$ExternalSyntheticBUOutline0.m(CredentialConfig$$ExternalSyntheticOutline0.m(30, i2, "Target offset < 0: "));
            return;
        }
        if (i3 < 0) {
            XML$$ExternalSyntheticBUOutline0.m(CredentialConfig$$ExternalSyntheticOutline0.m(23, i3, "Length < 0: "));
            return;
        }
        int i4 = i + i3;
        if (i4 > size()) {
            XML$$ExternalSyntheticBUOutline0.m(CredentialConfig$$ExternalSyntheticOutline0.m(34, i4, "Source end offset < 0: "));
            return;
        }
        int i5 = i2 + i3;
        if (i5 > bArr.length) {
            XML$$ExternalSyntheticBUOutline0.m(CredentialConfig$$ExternalSyntheticOutline0.m(34, i5, "Target end offset < 0: "));
        } else if (i3 > 0) {
            copyToInternal(bArr, i, i2, i3);
        }
    }

    public abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    public abstract int getTreeDepth();

    public abstract boolean isBalanced();

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Iterable
    public abstract Iterator<Byte> iterator();

    public abstract CodedInputStream newCodedInput();

    public abstract int partialHash(int i, int i2, int i3);

    public abstract int partialIsValidUtf8(int i, int i2, int i3);

    public abstract int peekCachedHashCode();

    public abstract int size();

    public byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract String toString(String str) throws UnsupportedEncodingException;

    public String toStringUtf8() {
        try {
            return toString("UTF-8");
        } catch (UnsupportedEncodingException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("UTF-8 not supported?", e);
            return null;
        }
    }

    public void writeTo(OutputStream outputStream, int i, int i2) throws IOException {
        if (i < 0) {
            XML$$ExternalSyntheticBUOutline0.m(CredentialConfig$$ExternalSyntheticOutline0.m(30, i, "Source offset < 0: "));
            return;
        }
        if (i2 < 0) {
            XML$$ExternalSyntheticBUOutline0.m(CredentialConfig$$ExternalSyntheticOutline0.m(23, i2, "Length < 0: "));
            return;
        }
        int i3 = i + i2;
        if (i3 > size()) {
            XML$$ExternalSyntheticBUOutline0.m(CredentialConfig$$ExternalSyntheticOutline0.m(39, i3, "Source end offset exceeded: "));
        } else if (i2 > 0) {
            writeToInternal(outputStream, i, i2);
        }
    }

    public abstract void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Output extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        public Output(int i) {
            if (i < 0) {
                Single$$ExternalSyntheticBUOutline0.m$3("Buffer size < 0");
                throw null;
            }
            this.initialCapacity = i;
            this.flushedBuffers = new ArrayList<>();
            this.buffer = new byte[i];
        }

        private byte[] copyArray(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        private void flushFullBuffer(int i) {
            this.flushedBuffers.add(new LiteralByteString(this.buffer));
            int length = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = length;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i, length >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int i = this.bufferPos;
            byte[] bArr = this.buffer;
            if (i >= bArr.length) {
                this.flushedBuffers.add(new LiteralByteString(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (i > 0) {
                this.flushedBuffers.add(new LiteralByteString(copyArray(bArr, i)));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public synchronized ByteString toByteString() {
            flushLastBuffer();
            return ByteString.copyFrom(this.flushedBuffers);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            try {
                byte[] bArr2 = this.buffer;
                int length = bArr2.length;
                int i3 = this.bufferPos;
                if (i2 <= length - i3) {
                    System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.bufferPos += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i4 = i2 - length2;
                    flushFullBuffer(i4);
                    System.arraycopy(bArr, i + length2, this.buffer, 0, i4);
                    this.bufferPos = i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            try {
                if (this.bufferPos == this.buffer.length) {
                    flushFullBuffer(1);
                }
                byte[] bArr = this.buffer;
                int i2 = this.bufferPos;
                this.bufferPos = i2 + 1;
                bArr[i2] = (byte) i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new LiteralByteString(bArr2);
    }
}
