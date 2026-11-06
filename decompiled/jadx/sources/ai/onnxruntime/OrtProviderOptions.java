package ai.onnxruntime;

import ai.onnxruntime.OrtException;
import java.io.IOException;
import java.util.logging.Logger;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public abstract class OrtProviderOptions implements AutoCloseable {
    private static final Logger logger = Logger.getLogger(OrtProviderOptions.class.getName());
    protected boolean closed = false;
    protected final long nativeHandle;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: ai.onnxruntime.OrtProviderOptions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ai$onnxruntime$OrtProvider;

        static {
            int[] iArr = new int[OrtProvider.values().length];
            $SwitchMap$ai$onnxruntime$OrtProvider = iArr;
            try {
                iArr[OrtProvider.CUDA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OrtProvider[OrtProvider.DNNL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OrtProvider[OrtProvider.OPEN_VINO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OrtProvider[OrtProvider.ROCM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ai$onnxruntime$OrtProvider[OrtProvider.TENSOR_RT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface OrtProviderSupplier {
        long create() throws OrtException;
    }

    static {
        try {
            OnnxRuntime.init();
        } catch (IOException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Failed to load onnx-runtime library", e);
        }
    }

    public OrtProviderOptions(long j) {
        this.nativeHandle = j;
    }

    public static long getApiHandle() {
        return OnnxRuntime.ortApiHandle;
    }

    public static long loadLibraryAndCreate(OrtProvider ortProvider, OrtProviderSupplier ortProviderSupplier) throws OrtException {
        int i = AnonymousClass1.$SwitchMap$ai$onnxruntime$OrtProvider[ortProvider.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5 && !OnnxRuntime.extractTensorRT()) {
                            throw new OrtException(OrtException.OrtErrorCode.ORT_EP_FAIL, "Failed to find TensorRT shared provider");
                        }
                    } else if (!OnnxRuntime.extractROCM()) {
                        throw new OrtException(OrtException.OrtErrorCode.ORT_EP_FAIL, "Failed to find ROCm shared provider");
                    }
                } else if (!OnnxRuntime.extractOpenVINO()) {
                    throw new OrtException(OrtException.OrtErrorCode.ORT_EP_FAIL, "Failed to find OpenVINO shared provider");
                }
            } else if (!OnnxRuntime.extractDNNL()) {
                throw new OrtException(OrtException.OrtErrorCode.ORT_EP_FAIL, "Failed to find DNNL shared provider");
            }
        } else if (!OnnxRuntime.extractCUDA()) {
            throw new OrtException(OrtException.OrtErrorCode.ORT_EP_FAIL, "Failed to find CUDA shared provider");
        }
        return ortProviderSupplier.create();
    }

    public abstract void applyToNative() throws OrtException;

    public void checkClosed() {
        if (this.closed) {
            Single$$ExternalSyntheticBUOutline0.m$2("Trying to use a closed OrtProviderOptions");
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            logger.warning("Closing an already closed tensor.");
        } else {
            close(OnnxRuntime.ortApiHandle, this.nativeHandle);
            this.closed = true;
        }
    }

    public abstract void close(long j, long j2);

    public abstract OrtProvider getProvider();

    public synchronized boolean isClosed() {
        return this.closed;
    }
}
