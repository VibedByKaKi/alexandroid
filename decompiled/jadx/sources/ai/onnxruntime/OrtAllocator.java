package ai.onnxruntime;

import java.io.IOException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
class OrtAllocator implements AutoCloseable {
    private boolean closed = false;
    final long handle;
    private final boolean isDefault;

    static {
        try {
            OnnxRuntime.init();
        } catch (IOException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Failed to load onnx-runtime library", e);
        }
    }

    public OrtAllocator(long j, boolean z) {
        this.handle = j;
        this.isDefault = z;
    }

    private native void closeAllocator(long j, long j2) throws OrtException;

    @Override // java.lang.AutoCloseable
    public void close() throws OrtException {
        if (this.closed) {
            Single$$ExternalSyntheticBUOutline0.m$2("Trying to close an already closed OrtAllocator.");
        } else {
            if (this.isDefault) {
                return;
            }
            closeAllocator(OnnxRuntime.ortApiHandle, this.handle);
            this.closed = true;
        }
    }

    public boolean isClosed() {
        return this.closed;
    }

    public boolean isDefault() {
        return this.isDefault;
    }
}
