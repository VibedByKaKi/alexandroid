package com.amazon.alexa.client.alexaservice.vad.detector.silero;

import ai.onnxruntime.OnnxTensor;
import ai.onnxruntime.OrtEnvironment;
import ai.onnxruntime.OrtException;
import ai.onnxruntime.OrtSession;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.vad.OnnxRuntimeEnvironment;
import com.amazon.alexa.client.alexaservice.vad.configuration.VADModelConfiguration;
import com.amazon.alexa.client.alexaservice.vad.detector.VADInitializationException;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.FloatBuffer;
import java.nio.LongBuffer;
import java.util.HashMap;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class SileroVADModel {
    private static final int BATCH_SIZE = 1;
    public static final int CONTEXT_SAMPLES = 64;
    public static final String DEFAULT_MODEL_NAME = "silero_vad";
    public static final String DEFAULT_MODEL_PATH = "silero_vad_6_2.onnx";
    public static final String DEFAULT_MODEL_VERSION = "6.2";
    public static final int DEFAULT_SAMPLE_RATE = 16000;
    private static final int EFFECTIVE_WINDOW_SIZE = 576;
    private static final int EXPECTED_STATE_SIZE = 256;
    public static final int FRAME_SIZE = 512;
    private static final long[] SAMPLE_RATE = {16000};
    private static final int STATE_SIZE = 128;
    private static final String TAG = "SileroVADModel";
    private float[] contextBuffer;
    private OrtEnvironment ortEnvironment;
    private OrtSession ortSession;
    private FloatBuffer state;

    @Inject
    public SileroVADModel() {
    }

    @NonNull
    public static VADModelConfiguration defaultModelConfiguration() {
        return VADModelConfiguration.builder().setModelPath("silero_vad_6_2.onnx").setModelName("silero_vad").setVersion("6.2").setSampleRate(16000).setFrameSize(512).build();
    }

    private byte[] loadModelFromAssets(@NonNull Context context, @NonNull String str) throws IOException {
        if (str.startsWith("assets://")) {
            str = str.substring(9);
        }
        InputStream open = context.getAssets().open(str);
        try {
            byte[] readAllBytes = readAllBytes(open);
            if (open != null) {
                open.close();
            }
            return readAllBytes;
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static String onnxRuntimeVersion(@NonNull OrtEnvironment ortEnvironment) {
        try {
            return ortEnvironment.getVersion();
        } catch (Throwable th) {
            return "unknown(" + th.getClass().getSimpleName() + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    private byte[] readAllBytes(@NonNull InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private float runInference(@NonNull float[] fArr) throws OrtException {
        float[] fArr2 = new float[EFFECTIVE_WINDOW_SIZE];
        System.arraycopy(this.contextBuffer, 0, fArr2, 0, 64);
        System.arraycopy(fArr, 0, fArr2, 64, 512);
        System.arraycopy(fArr, 448, this.contextBuffer, 0, 64);
        OnnxTensor createTensor = OnnxTensor.createTensor(this.ortEnvironment, FloatBuffer.wrap(fArr2), new long[]{1, 576});
        OnnxTensor createTensor2 = OnnxTensor.createTensor(this.ortEnvironment, LongBuffer.wrap(SAMPLE_RATE), new long[]{1});
        this.state.rewind();
        OnnxTensor createTensor3 = OnnxTensor.createTensor(this.ortEnvironment, this.state, new long[]{2, 1, 128});
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("input", createTensor);
            hashMap.put("sr", createTensor2);
            hashMap.put("state", createTensor3);
            OrtSession.Result run = this.ortSession.run(hashMap);
            try {
                float f = ((OnnxTensor) run.get(0)).getFloatBuffer().get(0);
                FloatBuffer floatBuffer = ((OnnxTensor) run.get(1)).getFloatBuffer();
                floatBuffer.rewind();
                int min = Math.min(floatBuffer.remaining(), 256);
                if (min != 256) {
                    Log.w(TAG, "State size mismatch: expected=256, got=" + min);
                }
                float[] fArr3 = new float[min];
                floatBuffer.get(fArr3);
                this.state.rewind();
                this.state.put(fArr3);
                this.state.rewind();
                run.close();
                return f;
            } catch (Throwable th) {
                run.close();
                throw th;
            }
        } finally {
            createTensor.close();
            createTensor2.close();
            createTensor3.close();
        }
    }

    private static String socInfo() {
        String str;
        String str2;
        if (Build.VERSION.SDK_INT < 31) {
            return "unavailable(API<31)";
        }
        StringBuilder sb = new StringBuilder();
        str = Build.SOC_MANUFACTURER;
        sb.append(str);
        sb.append("/");
        str2 = Build.SOC_MODEL;
        sb.append(str2);
        return sb.toString();
    }

    @VisibleForTesting
    public OrtSession createSession(@NonNull OrtEnvironment ortEnvironment, @NonNull byte[] bArr) throws OrtException {
        try {
            OrtSession.SessionOptions sessionOptions = new OrtSession.SessionOptions();
            sessionOptions.addNnapi();
            OrtSession createSession = ortEnvironment.createSession(bArr, sessionOptions);
            Log.i(TAG, "Using NNAPI execution provider");
            return createSession;
        } catch (OrtException unused) {
            Log.i(TAG, "NNAPI not available, falling back to CPU");
            return ortEnvironment.createSession(bArr);
        }
    }

    @VisibleForTesting
    public void initialize(@NonNull Context context, @NonNull String str) throws VADInitializationException {
        try {
            this.ortEnvironment = obtainOrtEnvironment();
            String str2 = Build.MANUFACTURER;
            String str3 = Build.MODEL;
            socInfo();
            this.ortSession = createSession(this.ortEnvironment, loadModelFromAssets(context, str));
            resetStates();
            Log.i(TAG, "Model initialized: " + str + " onnxRuntimeVersion=" + onnxRuntimeVersion(this.ortEnvironment));
        } catch (FileNotFoundException e) {
            Log.e(TAG, "VAD model file not found: " + str, e);
            release();
            throw new VADInitializationException(VADInitializationException.Reason.MODEL_FILE_NOT_FOUND, a$$ExternalSyntheticOutline0.m("VAD model file not found: ", str), e);
        } catch (Exception e2) {
            Log.e(TAG, "Failed to load Silero VAD model: " + str, e2);
            release();
            throw new VADInitializationException(VADInitializationException.Reason.FAILED_TO_LOAD_MODEL, "Failed to initialize Silero VAD model", e2);
        }
    }

    @VisibleForTesting
    public OrtEnvironment obtainOrtEnvironment() {
        return OnnxRuntimeEnvironment.get();
    }

    @VisibleForTesting
    public float process(@NonNull float[] fArr) {
        if (this.ortSession != null && this.ortEnvironment != null) {
            if (fArr.length != 512) {
                Log.w(TAG, "Unexpected frame size: " + fArr.length + ", expected 512");
                return 0.0f;
            }
            try {
                return runInference(fArr);
            } catch (OrtException e) {
                Log.e(TAG, "Inference failed", e);
            }
        }
        return 0.0f;
    }

    @VisibleForTesting
    public void release() {
        OrtSession ortSession = this.ortSession;
        if (ortSession != null) {
            try {
                ortSession.close();
            } catch (OrtException e) {
                Log.w(TAG, "Error closing ORT session", e);
            }
            this.ortSession = null;
        }
        this.ortEnvironment = null;
        this.state = null;
        this.contextBuffer = new float[64];
    }

    @VisibleForTesting
    public void resetStates() {
        if (this.state == null) {
            this.state = FloatBuffer.allocate(256);
        }
        this.state.rewind();
        int i = 0;
        while (true) {
            FloatBuffer floatBuffer = this.state;
            if (i >= 256) {
                floatBuffer.rewind();
                this.contextBuffer = new float[64];
                return;
            } else {
                floatBuffer.put(i, 0.0f);
                i++;
            }
        }
    }
}
