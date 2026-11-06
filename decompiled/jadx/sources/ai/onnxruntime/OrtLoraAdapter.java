package ai.onnxruntime;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class OrtLoraAdapter implements AutoCloseable {
    private boolean closed = false;
    private final long nativeHandle;

    static {
        try {
            OnnxRuntime.init();
        } catch (IOException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Failed to load onnx-runtime library", e);
        }
    }

    private OrtLoraAdapter(long j) {
        this.nativeHandle = j;
    }

    private static native void close(long j, long j2);

    public static OrtLoraAdapter create(ByteBuffer byteBuffer, OrtAllocator ortAllocator) throws OrtException {
        Objects.requireNonNull(byteBuffer, "LoRA buffer must not be null");
        if (byteBuffer.remaining() == 0) {
            throw new OrtException("Invalid LoRA buffer, no elements remaining.");
        }
        if (byteBuffer.isDirect()) {
            return new OrtLoraAdapter(createLoraAdapterFromBuffer(OnnxRuntime.ortApiHandle, byteBuffer, byteBuffer.position(), byteBuffer.remaining(), ortAllocator == null ? 0L : ortAllocator.handle));
        }
        throw new OrtException("ByteBuffer is not direct.");
    }

    private static native long createLoraAdapter(long j, String str, long j2) throws OrtException;

    private static native long createLoraAdapterFromArray(long j, byte[] bArr, long j2) throws OrtException;

    private static native long createLoraAdapterFromBuffer(long j, ByteBuffer byteBuffer, int i, int i2, long j2) throws OrtException;

    public void checkClosed() {
        if (this.closed) {
            Single$$ExternalSyntheticBUOutline0.m$2("Trying to use a closed OrtLoraAdapter");
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            Single$$ExternalSyntheticBUOutline0.m$2("Trying to close an already closed OrtLoraAdapter");
        } else {
            close(OnnxRuntime.ortApiHandle, this.nativeHandle);
            this.closed = true;
        }
    }

    public long getNativeHandle() {
        return this.nativeHandle;
    }

    public static OrtLoraAdapter create(byte[] bArr, OrtAllocator ortAllocator) throws OrtException {
        Objects.requireNonNull(bArr, "LoRA array must not be null");
        return new OrtLoraAdapter(createLoraAdapterFromArray(OnnxRuntime.ortApiHandle, bArr, ortAllocator == null ? 0L : ortAllocator.handle));
    }

    public static OrtLoraAdapter create(ByteBuffer byteBuffer) throws OrtException {
        return create(byteBuffer, (OrtAllocator) null);
    }

    public static OrtLoraAdapter create(byte[] bArr) throws OrtException {
        return create(bArr, (OrtAllocator) null);
    }

    public static OrtLoraAdapter create(String str) throws OrtException {
        return create(str, (OrtAllocator) null);
    }

    public static OrtLoraAdapter create(String str, OrtAllocator ortAllocator) throws OrtException {
        return new OrtLoraAdapter(createLoraAdapter(OnnxRuntime.ortApiHandle, str, ortAllocator == null ? 0L : ortAllocator.handle));
    }
}
