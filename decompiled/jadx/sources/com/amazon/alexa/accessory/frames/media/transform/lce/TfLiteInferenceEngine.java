package com.amazon.alexa.accessory.frames.media.transform.lce;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.frames.media.transform.LceFaceDetector;
import com.amazon.alexa.accessory.frames.metrics.MetricsRecorder;
import com.amazon.alexa.accessory.frames.metrics.media.MediaImportMetricsConstants;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tflite.client.TfLiteInitializationOptions;
import com.google.android.gms.tflite.java.TfLite;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.gpu.GpuDelegateFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class TfLiteInferenceEngine {
    private static final int INPUT_CHANNELS = 4;
    private static final long LOCK_TIMEOUT_MS = 10000;
    private static final int OUTPUT_PARAM_COUNT = 4;
    private static final String TAG = "LceRetoucher.Inference";
    private static final long TFLITE_INIT_TIMEOUT_MS = 10000;
    private volatile boolean initialized;
    private InterpreterApi interpreter;
    private final ReentrantLock lock = new ReentrantLock();
    private volatile boolean usingGpuDelegate;

    @VisibleForTesting
    public static void bilinearTaps(int i, int i2, @NonNull int[] iArr, @NonNull int[] iArr2, @NonNull float[] fArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            float f = (((i3 + 0.5f) * i) / i2) - 0.5f;
            float floor = (float) Math.floor(f);
            int i4 = (int) floor;
            int i5 = i - 1;
            iArr[i3] = Math.min(Math.max(i4, 0), i5);
            iArr2[i3] = Math.min(Math.max(i4 + 1, 0), i5);
            fArr[i3] = f - floor;
        }
    }

    private static float lerp(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = 1.0f - f5;
        float f8 = 1.0f - f6;
        return (((f5 * f4) + (f7 * f3)) * f6) + (f8 * ((f2 * f5) + (f * f7)));
    }

    private static float mask(@NonNull List<int[]> list, int i, int i2) {
        return UprightPixelSampler.inAny(list, list.size(), i, i2) ? 1.0f : 0.0f;
    }

    @VisibleForTesting
    public static ByteBuffer prepareTensor(@NonNull UprightPixelSampler uprightPixelSampler, @NonNull List<LceFaceDetector.FaceBox> list, int i) {
        UprightPixelSampler uprightPixelSampler2 = uprightPixelSampler;
        int i2 = i;
        List<int[]> pixelRects = uprightPixelSampler.pixelRects(list);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2 * i2 * 16);
        allocateDirect.order(ByteOrder.nativeOrder());
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        float[] fArr = new float[i2];
        bilinearTaps(uprightPixelSampler2.width, i2, iArr, iArr2, fArr);
        int[] iArr3 = new int[i2];
        int[] iArr4 = new int[i2];
        float[] fArr2 = new float[i2];
        bilinearTaps(uprightPixelSampler2.height, i2, iArr3, iArr4, fArr2);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = 0;
            while (i4 < i2) {
                int argb = uprightPixelSampler2.argb(iArr[i4], iArr3[i3]);
                int argb2 = uprightPixelSampler2.argb(iArr2[i4], iArr3[i3]);
                int argb3 = uprightPixelSampler2.argb(iArr[i4], iArr4[i3]);
                int argb4 = uprightPixelSampler2.argb(iArr2[i4], iArr4[i3]);
                allocateDirect.putFloat(lerp(Color.red(argb), Color.red(argb2), Color.red(argb3), Color.red(argb4), fArr[i4], fArr2[i3]) / 255.0f);
                allocateDirect.putFloat(lerp(Color.green(argb), Color.green(argb2), Color.green(argb3), Color.green(argb4), fArr[i4], fArr2[i3]) / 255.0f);
                allocateDirect.putFloat(lerp(Color.blue(argb), Color.blue(argb2), Color.blue(argb3), Color.blue(argb4), fArr[i4], fArr2[i3]) / 255.0f);
                allocateDirect.putFloat(lerp(mask(pixelRects, iArr[i4], iArr3[i3]), mask(pixelRects, iArr2[i4], iArr3[i3]), mask(pixelRects, iArr[i4], iArr4[i3]), mask(pixelRects, iArr2[i4], iArr4[i3]), fArr[i4], fArr2[i3]));
                i4++;
                uprightPixelSampler2 = uprightPixelSampler;
                i2 = i;
            }
            i3++;
            uprightPixelSampler2 = uprightPixelSampler;
            i2 = i;
        }
        allocateDirect.rewind();
        return allocateDirect;
    }

    public boolean initialize(@NonNull Context context, @NonNull File file, @NonNull LceConfig lceConfig) {
        boolean z;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            try {
                if (!this.lock.tryLock(10000L, timeUnit)) {
                    Log.e(TAG, "initialize() timed out acquiring lock after 10000ms");
                    MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_ENGINE_INIT_FAILED);
                    return false;
                }
                if (!this.initialized) {
                    try {
                        Tasks.await(TfLite.initialize(context, TfLiteInitializationOptions.builder().setEnableGpuDelegateSupport(true).build()), 10000L, timeUnit);
                        z = true;
                    } catch (IllegalStateException | ExecutionException e) {
                        Log.w(TAG, "TFLite runtime init with GPU delegate support failed; initializing without it", e);
                        Tasks.await(TfLite.initialize(context, TfLiteInitializationOptions.builder().setEnableGpuDelegateSupport(false).build()), 10000L, timeUnit);
                        z = false;
                    }
                    InterpreterApi.Options runtime = new InterpreterApi.Options().setRuntime(InterpreterApi.Options.TfLiteRuntime.FROM_SYSTEM_ONLY);
                    try {
                    } catch (Exception e2) {
                        Log.w(TAG, "GPU delegate failed, falling back to CPU inference", e2);
                        MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_GPU_DELEGATE_FALLBACK);
                        this.interpreter = InterpreterApi.create(file, new InterpreterApi.Options().setRuntime(InterpreterApi.Options.TfLiteRuntime.FROM_SYSTEM_ONLY));
                        this.usingGpuDelegate = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("TFLite runtime has no GPU delegate support");
                    }
                    runtime.addDelegateFactory(new GpuDelegateFactory());
                    this.interpreter = InterpreterApi.create(file, runtime);
                    this.usingGpuDelegate = true;
                    MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_GPU_DELEGATE_SUCCESS);
                    Log.i(TAG, "GPU delegate enabled for TFLite inference");
                    this.initialized = true;
                    Log.i(TAG, "TFLite engine initialized: model=" + file.getName() + ", gpu=" + this.usingGpuDelegate);
                }
                return true;
            } catch (Exception e3) {
                Log.e(TAG, "Failed to initialize TFLite engine", e3);
                MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_ENGINE_INIT_FAILED);
                return false;
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                Log.e(TAG, "TFLite initialization interrupted", e4);
                MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_ENGINE_INIT_FAILED);
                return false;
            } finally {
                this.lock.unlock();
            }
        } catch (InterruptedException e5) {
            Thread.currentThread().interrupt();
            Log.e(TAG, "initialize() interrupted while waiting for lock", e5);
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_ENGINE_INIT_FAILED);
            return false;
        }
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    public boolean isUsingGpuDelegate() {
        return this.usingGpuDelegate;
    }

    public void release() {
        try {
            if (!this.lock.tryLock(10000L, TimeUnit.MILLISECONDS)) {
                Log.w(TAG, "release() timed out acquiring lock after 10000ms — skipping cleanup");
                MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_ENGINE_RELEASE_FAILED);
                return;
            }
            try {
                InterpreterApi interpreterApi = this.interpreter;
                if (interpreterApi != null) {
                    interpreterApi.close();
                    this.interpreter = null;
                }
                this.initialized = false;
                this.usingGpuDelegate = false;
                Log.i(TAG, "TFLite engine released");
                this.lock.unlock();
            } catch (Throwable th) {
                this.lock.unlock();
                throw th;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Log.w(TAG, "release() interrupted while waiting for lock", e);
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_ENGINE_RELEASE_FAILED);
        }
    }

    @NonNull
    public InferenceResult runInference(@NonNull Bitmap bitmap, int i, @NonNull List<LceFaceDetector.FaceBox> list, @NonNull LceConfig lceConfig) {
        InferenceResult error;
        try {
            if (!this.lock.tryLock(10000L, TimeUnit.MILLISECONDS)) {
                Log.e(TAG, "runInference() timed out acquiring lock after 10000ms");
                MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_INFERENCE_ERROR);
                return InferenceResult.error("Lock acquisition timed out");
            }
            try {
                if (!this.initialized || this.interpreter == null) {
                    MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_INFERENCE_ERROR);
                    error = InferenceResult.error("TFLite engine not initialized");
                } else {
                    try {
                        ByteBuffer prepareTensor = prepareTensor(new UprightPixelSampler(bitmap, i), list, lceConfig.getModelInputSize());
                        ByteBuffer order = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder());
                        HashMap hashMap = new HashMap();
                        hashMap.put(0, order);
                        this.interpreter.runForMultipleInputsOutputs(new Object[]{prepareTensor}, hashMap);
                        order.rewind();
                        float f = order.getFloat();
                        float f2 = order.getFloat();
                        float f3 = order.getFloat();
                        float f4 = order.getFloat();
                        Log.d(TAG, String.format("Inference output: gainL=%.2f, gainH=%.2f, compressL=%.2f, compressH=%.2f", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)));
                        return new InferenceResult(f, f2, f3, f4);
                    } catch (Exception e) {
                        Log.e(TAG, "Inference failed", e);
                        MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_INFERENCE_ERROR);
                        error = InferenceResult.error("Inference failed: " + e.getMessage());
                    }
                }
                return error;
            } finally {
                this.lock.unlock();
            }
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            Log.e(TAG, "runInference() interrupted while waiting for lock", e2);
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_INFERENCE_ERROR);
            return InferenceResult.error("Interrupted waiting for lock");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InferenceResult {
        public final float compressH;
        public final float compressL;
        public final String errorMessage;
        public final float gainH;
        public final float gainL;
        public final boolean success;

        public InferenceResult(float f, float f2, float f3, float f4) {
            this.gainL = f;
            this.gainH = f2;
            this.compressL = f3;
            this.compressH = f4;
            this.success = true;
            this.errorMessage = null;
        }

        public static InferenceResult error(@NonNull String str) {
            return new InferenceResult(str);
        }

        public InferenceResult(@NonNull String str) {
            this.gainL = 0.0f;
            this.gainH = 0.0f;
            this.compressL = 0.0f;
            this.compressH = 0.0f;
            this.success = false;
            this.errorMessage = str;
        }
    }

    @NonNull
    public InferenceResult runInference(@NonNull Bitmap bitmap, @NonNull LceConfig lceConfig) {
        return runInference(bitmap, 1, Collections.EMPTY_LIST, lceConfig);
    }
}
