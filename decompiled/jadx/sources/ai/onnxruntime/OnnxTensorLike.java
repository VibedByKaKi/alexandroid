package ai.onnxruntime;

import java.io.IOException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public abstract class OnnxTensorLike implements OnnxValue {
    protected final long allocatorHandle;
    protected boolean closed = false;
    protected final TensorInfo info;
    protected final long nativeHandle;

    static {
        try {
            OnnxRuntime.init();
        } catch (IOException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Failed to load onnx-runtime library", e);
        }
    }

    public OnnxTensorLike(long j, long j2, TensorInfo tensorInfo) {
        this.nativeHandle = j;
        this.allocatorHandle = j2;
        this.info = tensorInfo;
    }

    public void checkClosed() {
        if (this.closed) {
            Single$$ExternalSyntheticBUOutline0.m$2("Trying to use a closed OnnxValue");
        }
    }

    public long getNativeHandle() {
        return this.nativeHandle;
    }

    @Override // ai.onnxruntime.OnnxValue
    public synchronized boolean isClosed() {
        return this.closed;
    }

    @Override // ai.onnxruntime.OnnxValue
    public TensorInfo getInfo() {
        return this.info;
    }
}
