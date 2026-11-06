package com.google.android.gms.tflite.gpu;

import org.tensorflow.lite.Delegate;
import org.tensorflow.lite.annotations.UsedByReflection;
import org.tensorflow.lite.gpu.GpuDelegateFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UsedByReflection("TFLiteSupport/model/GpuDelegateProxy")
/* loaded from: classes7.dex */
public class GpuDelegate implements Delegate {
    private long zza;

    @UsedByReflection("GpuDelegateFactory")
    public GpuDelegate(GpuDelegateFactory.Options options) {
        GpuDelegateNative.zza();
        this.zza = createDelegate(options.isPrecisionLossAllowed(), options.areQuantizedModelsAllowed(), options.getInferencePreference(), options.getSerializationDir(), options.getModelToken(), options.getForceBackend().value());
    }

    private static native long createDelegate(boolean z, boolean z2, int i, String str, String str2, int i2);

    private static native void deleteDelegate(long j);

    @Override // org.tensorflow.lite.Delegate, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j = this.zza;
        if (j != 0) {
            deleteDelegate(j);
            this.zza = 0L;
        }
    }

    @Override // org.tensorflow.lite.Delegate
    public final long getNativeHandle() {
        return this.zza;
    }

    @UsedByReflection("TFLiteSupport/model/GpuDelegateProxy")
    public GpuDelegate() {
        this(new GpuDelegateFactory.Options());
    }
}
