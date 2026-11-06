package com.amazon.alexa.accessory.frames.media.transform;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.artifact.ModelArtifactManager;
import com.amazon.alexa.accessory.frames.media.transform.NrOutputValidator;
import com.amazon.alexa.accessory.frames.metrics.MetricsRecorder;
import com.amazon.alexa.accessory.frames.metrics.media.MediaImportMetricsConstants;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.facebook.imagepipeline.cache.BufferedDiskCache$$ExternalSyntheticLambda2;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tflite.client.TfLiteInitializationOptions;
import com.google.android.gms.tflite.java.TfLite;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.gpu.GpuDelegateFactory;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class ImageNoiseReducer {
    private static final int BUDGET_CHECK_AFTER_TILES = 3;
    private static final MillisClock DEFAULT_CLOCK;
    private static final DelegateProbe DEFAULT_DELEGATE_PROBE;
    private static final int DEFAULT_GAIN = 64;
    private static final GpuAvailabilityChecker DEFAULT_GPU_AVAILABILITY_CHECKER;
    private static final DelegateInterpreterFactory DEFAULT_INTERPRETER_FACTORY;
    private static final int DEFAULT_MAX_GAIN = 448;
    private static final NanoClock DEFAULT_NANO_CLOCK;
    private static final NrBody DEFAULT_NR_BODY;
    private static final OutputValidatorFn DEFAULT_OUTPUT_VALIDATOR;
    private static final RuntimeInitializer DEFAULT_RUNTIME_INITIALIZER;
    private static final int DENOISED_HEAD_OFFSET = 3;
    private static final int GAIN_ENCODE_LUT_SIZE = 4096;
    private static final int GAIN_MAP_COLS = 17;
    private static final int GAIN_MAP_ROWS = 13;
    private static final int GPU_CHECK_TIMEOUT_SECONDS = 5;
    private static final int GPU_INIT_FAILURES_BEFORE_FALLBACK = 1;

    @VisibleForTesting
    static final long GPU_PROBE_MAX_MS = 1500;
    private static final long INIT_RETRY_COOLDOWN_MS = 300000;
    private static final int INIT_TIMEOUT_SECONDS = 30;
    private static final int INPUT_CHANNELS = 4;
    private static final float ISO_TO_GAIN_DIVISOR = 54.0f;
    private static final int K_EDGE = 1;
    private static final int K_NOISE = 0;
    private static final double[][] K_TABLE;
    private static final double LOG2;
    private static final int MAX_CONSECUTIVE_STATISTICAL_REJECTS = 3;
    private static final float MIN_GAIN = 2.0f;

    @VisibleForTesting
    static final long NNAPI_PROBE_MAX_MS = 800;
    private static final long NO_FAST_DELEGATE_REEVALUATE_MS = 600000;
    private static final int NR_MIN_ISO = 40;
    private static final ExecutorService NR_WORKER;
    private static final int NUM_COLS = 7;
    private static final int NUM_ROWS = 5;
    private static final int OUTPUT_CHANNELS = 6;
    private static final int OUT_HEAD_OFFSET = 0;
    private static final long PENDING_INIT_MAX_MS = 600000;
    private static final long PHOTO_TIME_BUDGET_MS = 60000;
    private static final String TAG = "ImageNoiseReducer";
    private static final int TILE_FINGERPRINT_BYTES = 64;
    private static final int TILE_FINGERPRINT_OFFSETS = 16;
    private static final byte[] TILE_SENTINEL;
    private static final int TILE_W = 704;
    private static final boolean USE_FIXED_GAIN = false;
    private static final long WATCHDOG_MS = 150000;
    private static final long WATCHDOG_POLL_MS = 500;
    private static volatile NnApiDelegate cachedDelegate;
    private static volatile Delegate cachedDelegateKind;
    private static volatile InterpreterApi cachedInterpreter;
    private static volatile String cachedModelPath;
    private static volatile MillisClock clock;
    private static int consecutiveStatisticalRejects;
    private static volatile DelegateProbe delegateProbe;
    private static volatile boolean dropDelegateAfterHang;
    private static byte[] gainChannelScratch;
    private static byte[] gainEncodeLut;
    private static volatile GpuAvailabilityChecker gpuAvailabilityChecker;
    private static int gpuInitFailures;

    @Nullable
    private static volatile Future<NrResult> hungPhoto;
    private static final Object initLock;
    private static volatile DelegateInterpreterFactory interpreterFactory;
    private static final Object lock;
    private static volatile NanoClock nanoClock;
    private static volatile NrBody nrBody;
    private static volatile OutputValidatorFn outputValidator;

    @Nullable
    private static Task<Void> pendingInitTask;
    private static volatile boolean runInlineForTesting;
    private static volatile RuntimeInitializer runtimeInitializer;

    @Nullable
    private static ByteBuffer tileInBuffer;

    @Nullable
    private static ByteBuffer tileOutBuffer;
    private static volatile long watchdogMs;
    private static final int TILE_H = 736;
    private static final int IMAGE_W = 4032;
    private static final int IMAGE_H = 3024;
    private static final int[][] TILES = {new int[]{0, 0, 0, 704, 0, TILE_H, 0, 576, 0, TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO}, new int[]{0, 1, 512, 1216, 0, TILE_H, 64, 640, 0, TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO}, new int[]{0, 2, 1088, 1792, 0, TILE_H, 64, 640, 0, TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO}, new int[]{0, 3, 1664, 2368, 0, TILE_H, 64, 640, 0, TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO}, new int[]{0, 4, 2240, 2944, 0, TILE_H, 64, 640, 0, TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO}, new int[]{0, 5, 2816, 3520, 0, TILE_H, 64, 640, 0, TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO}, new int[]{0, 6, 3328, IMAGE_W, 0, TILE_H, 128, 704, 0, TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO}, new int[]{1, 0, 0, 704, 540, 1276, 0, 576, 66, 670}, new int[]{1, 1, 512, 1216, 540, 1276, 64, 640, 66, 670}, new int[]{1, 2, 1088, 1792, 540, 1276, 64, 640, 66, 670}, new int[]{1, 3, 1664, 2368, 540, 1276, 64, 640, 66, 670}, new int[]{1, 4, 2240, 2944, 540, 1276, 64, 640, 66, 670}, new int[]{1, 5, 2816, 3520, 540, 1276, 64, 640, 66, 670}, new int[]{1, 6, 3328, IMAGE_W, 540, 1276, 128, 704, 66, 670}, new int[]{2, 0, 0, 704, 1144, 1880, 0, 576, 66, 670}, new int[]{2, 1, 512, 1216, 1144, 1880, 64, 640, 66, 670}, new int[]{2, 2, 1088, 1792, 1144, 1880, 64, 640, 66, 670}, new int[]{2, 3, 1664, 2368, 1144, 1880, 64, 640, 66, 670}, new int[]{2, 4, 2240, 2944, 1144, 1880, 64, 640, 66, 670}, new int[]{2, 5, 2816, 3520, 1144, 1880, 64, 640, 66, 670}, new int[]{2, 6, 3328, IMAGE_W, 1144, 1880, 128, 704, 66, 670}, new int[]{3, 0, 0, 704, 1748, 2484, 0, 576, 66, 670}, new int[]{3, 1, 512, 1216, 1748, 2484, 64, 640, 66, 670}, new int[]{3, 2, 1088, 1792, 1748, 2484, 64, 640, 66, 670}, new int[]{3, 3, 1664, 2368, 1748, 2484, 64, 640, 66, 670}, new int[]{3, 4, 2240, 2944, 1748, 2484, 64, 640, 66, 670}, new int[]{3, 5, 2816, 3520, 1748, 2484, 64, 640, 66, 670}, new int[]{3, 6, 3328, IMAGE_W, 1748, 2484, 128, 704, 66, 670}, new int[]{4, 0, 0, 704, 2288, IMAGE_H, 0, 576, 130, TILE_H}, new int[]{4, 1, 512, 1216, 2288, IMAGE_H, 64, 640, 130, TILE_H}, new int[]{4, 2, 1088, 1792, 2288, IMAGE_H, 64, 640, 130, TILE_H}, new int[]{4, 3, 1664, 2368, 2288, IMAGE_H, 64, 640, 130, TILE_H}, new int[]{4, 4, 2240, 2944, 2288, IMAGE_H, 64, 640, 130, TILE_H}, new int[]{4, 5, 2816, 3520, 2288, IMAGE_H, 64, 640, 130, TILE_H}, new int[]{4, 6, 3328, IMAGE_W, 2288, IMAGE_H, 128, 704, 130, TILE_H}};
    private static int gainEncodeLutMaxGain = -1;
    private static final float[][] SHADING_GAIN_MAP = {new float[]{5.144137f, 4.719698f, 4.125448f, 3.629166f, 3.161285f, 2.787657f, 2.541903f, 2.401772f, 2.333882f, 2.351901f, 2.440397f, 2.642375f, 2.965511f, 3.311952f, 3.745996f, 4.375161f, 4.743667f}, new float[]{4.832114f, 4.170416f, 3.617153f, 3.071241f, 2.628031f, 2.32294f, 2.115866f, 1.984192f, 1.924176f, 1.942256f, 2.041453f, 2.212022f, 2.464536f, 2.838356f, 3.296596f, 3.797151f, 4.531055f}, new float[]{4.45493f, 3.801407f, 3.192008f, 2.66475f, 2.272804f, 1.992835f, 1.783616f, 1.649592f, 1.585263f, 1.614488f, 1.719072f, 1.890819f, 2.139319f, 2.471605f, 2.94538f, 3.441119f, 4.078898f}, new float[]{4.148566f, 3.478467f, 2.867766f, 2.368054f, 2.004086f, 1.715129f, 1.502598f, 1.377586f, 1.324292f, 1.347628f, 1.445551f, 1.625715f, 1.876874f, 2.193318f, 2.614181f, 3.180757f, 3.779543f}, new float[]{3.938949f, 3.248867f, 2.635139f, 2.176345f, 1.818046f, 1.523252f, 1.321711f, 1.208766f, 1.16025f, 1.187357f, 1.275902f, 1.440213f, 1.69864f, 2.019227f, 2.418945f, 2.962594f, 3.595703f}, new float[]{3.804902f, 3.088546f, 2.507901f, 2.067142f, 1.692264f, 1.405633f, 1.218347f, 1.102624f, 1.057664f, 1.08725f, 1.176715f, 1.334493f, 1.584275f, 1.916564f, 2.307967f, 2.852314f, 3.509467f}, new float[]{3.771823f, 3.057791f, 2.463284f, 2.03304f, 1.657624f, 1.368044f, 1.182775f, 1.067739f, 1.02367f, 1.047909f, 1.144736f, 1.30503f, 1.555376f, 1.886276f, 2.278973f, 2.810336f, 3.456533f}, new float[]{3.826331f, 3.103754f, 2.51661f, 2.064721f, 1.700883f, 1.408896f, 1.220447f, 1.104696f, 1.061356f, 1.086058f, 1.182692f, 1.342086f, 1.597066f, 1.928949f, 2.321772f, 2.8593f, 3.520111f}, new float[]{3.965068f, 3.265449f, 2.639682f, 2.190383f, 1.821213f, 1.531385f, 1.328199f, 1.211238f, 1.164901f, 1.194654f, 1.285125f, 1.457885f, 1.717335f, 2.0436f, 2.450056f, 3.004756f, 3.656633f}, new float[]{4.154614f, 3.508309f, 2.887591f, 2.394888f, 2.033512f, 1.737958f, 1.522937f, 1.392664f, 1.345387f, 1.36815f, 1.473168f, 1.65759f, 1.909148f, 2.231513f, 2.670858f, 3.23479f, 3.840271f}, new float[]{4.55453f, 3.83215f, 3.256995f, 2.701153f, 2.311982f, 2.026524f, 1.812693f, 1.676777f, 1.620813f, 1.649989f, 1.752042f, 1.930296f, 2.173045f, 2.519239f, 2.998251f, 3.527639f, 4.172926f}, new float[]{5.040514f, 4.261259f, 3.676934f, 3.143018f, 2.692107f, 2.367476f, 2.158864f, 2.02602f, 1.97375f, 1.991346f, 2.096624f, 2.264805f, 2.528497f, 2.915822f, 3.380376f, 3.925177f, 4.650431f}, new float[]{5.349018f, 4.87667f, 4.238676f, 3.731654f, 3.263087f, 2.875858f, 2.624909f, 2.478158f, 2.419743f, 2.439662f, 2.546887f, 2.753313f, 3.072262f, 3.479028f, 3.899177f, 4.560017f, 4.995199f}};
    private static volatile boolean runtimeInitialized = false;
    private static volatile long lastInitFailureTime = 0;
    private static volatile boolean runtimeGpuSupported = true;
    private static volatile boolean runtimeGpuFallbackUsed = false;
    private static long pendingInitSinceMs = 0;
    private static final EnumSet<Delegate> failedDelegates = EnumSet.noneOf(Delegate.class);
    private static final EnumSet<Delegate> transientFailedDelegates = EnumSet.noneOf(Delegate.class);
    private static volatile boolean noFastDelegate = false;
    private static volatile long noFastDelegateSinceMs = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.frames.media.transform.ImageNoiseReducer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$frames$media$transform$ImageNoiseReducer$InitAttempt;

        static {
            int[] iArr = new int[InitAttempt.values().length];
            $SwitchMap$com$amazon$alexa$accessory$frames$media$transform$ImageNoiseReducer$InitAttempt = iArr;
            try {
                iArr[InitAttempt.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$frames$media$transform$ImageNoiseReducer$InitAttempt[InitAttempt.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$frames$media$transform$ImageNoiseReducer$InitAttempt[InitAttempt.INTERRUPTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$frames$media$transform$ImageNoiseReducer$InitAttempt[InitAttempt.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public enum Delegate {
        NNAPI,
        GPU
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public interface DelegateInterpreterFactory {
        @Nullable
        InterpreterApi create(@NonNull Delegate delegate, @NonNull MappedByteBuffer mappedByteBuffer);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public interface DelegateProbe {
        @NonNull
        ProbeResult probe(@NonNull Delegate delegate, @NonNull InterpreterApi interpreterApi);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public interface GpuAvailabilityChecker {
        @NonNull
        Task<Boolean> isGpuDelegateAvailable(@NonNull Context context);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum InitAttempt {
        READY,
        PENDING,
        INTERRUPTED,
        FAILED
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class MainThreadAwaitException extends RuntimeException {
        public MainThreadAwaitException() {
            super("Tasks.await must not be called on the main thread");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public interface MillisClock {
        long nowMs();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public interface NanoClock {
        long nowNs();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public interface NrBody {
        @NonNull
        NrResult run(@NonNull Context context, @NonNull byte[] bArr, @NonNull String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NrResult {

        @Nullable
        public final byte[] data;
        public final Outcome outcome;
        final boolean ranInference;

        private NrResult(Outcome outcome, @Nullable byte[] bArr, boolean z) {
            this.outcome = outcome;
            this.data = bArr;
            this.ranInference = z;
        }

        public static NrResult failed() {
            return new NrResult(Outcome.FAILED, null, false);
        }

        public static NrResult failedAfterInference() {
            return new NrResult(Outcome.FAILED, null, true);
        }

        public static NrResult skipped() {
            return new NrResult(Outcome.SKIPPED, null, false);
        }

        public static NrResult success(@NonNull byte[] bArr) {
            return new NrResult(Outcome.SUCCESS, bArr, true);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Outcome {
        SUCCESS,
        SKIPPED,
        FAILED
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public interface OutputValidatorFn {
        @NonNull
        NrOutputValidator.Result validate(@NonNull NrOutputValidator.PixelSource pixelSource, @NonNull NrOutputValidator.PixelSource pixelSource2, double d, @NonNull int[] iArr, @NonNull int[] iArr2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class OverTimeBudgetException extends IllegalStateException {
        public OverTimeBudgetException(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public enum ProbeResult {
        FAST,
        SLOW,
        ERROR
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public interface RuntimeInitializer {
        @NonNull
        Task<Void> initialize(@NonNull Context context, boolean z);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public enum RuntimeStatus {
        READY,
        SKIPPED,
        FAILED
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TileOutputException extends IllegalStateException {
        public TileOutputException(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class UnexpectedModelException extends IllegalStateException {
        public UnexpectedModelException(String str) {
            super(str);
        }
    }

    static {
        ImageNoiseReducer$$ExternalSyntheticLambda2 imageNoiseReducer$$ExternalSyntheticLambda2 = new ImageNoiseReducer$$ExternalSyntheticLambda2();
        DEFAULT_CLOCK = imageNoiseReducer$$ExternalSyntheticLambda2;
        clock = imageNoiseReducer$$ExternalSyntheticLambda2;
        ImageNoiseReducer$$ExternalSyntheticLambda2 imageNoiseReducer$$ExternalSyntheticLambda22 = new ImageNoiseReducer$$ExternalSyntheticLambda2();
        DEFAULT_NANO_CLOCK = imageNoiseReducer$$ExternalSyntheticLambda22;
        nanoClock = imageNoiseReducer$$ExternalSyntheticLambda22;
        ImageNoiseReducer$$ExternalSyntheticLambda2 imageNoiseReducer$$ExternalSyntheticLambda23 = new ImageNoiseReducer$$ExternalSyntheticLambda2();
        DEFAULT_DELEGATE_PROBE = imageNoiseReducer$$ExternalSyntheticLambda23;
        delegateProbe = imageNoiseReducer$$ExternalSyntheticLambda23;
        consecutiveStatisticalRejects = 0;
        ImageNoiseReducer$$ExternalSyntheticLambda2 imageNoiseReducer$$ExternalSyntheticLambda24 = new ImageNoiseReducer$$ExternalSyntheticLambda2();
        DEFAULT_RUNTIME_INITIALIZER = imageNoiseReducer$$ExternalSyntheticLambda24;
        runtimeInitializer = imageNoiseReducer$$ExternalSyntheticLambda24;
        ImageNoiseReducer$$ExternalSyntheticLambda2 imageNoiseReducer$$ExternalSyntheticLambda25 = new ImageNoiseReducer$$ExternalSyntheticLambda2();
        DEFAULT_GPU_AVAILABILITY_CHECKER = imageNoiseReducer$$ExternalSyntheticLambda25;
        gpuAvailabilityChecker = imageNoiseReducer$$ExternalSyntheticLambda25;
        ImageNoiseReducer$$ExternalSyntheticLambda2 imageNoiseReducer$$ExternalSyntheticLambda26 = new ImageNoiseReducer$$ExternalSyntheticLambda2();
        DEFAULT_INTERPRETER_FACTORY = imageNoiseReducer$$ExternalSyntheticLambda26;
        interpreterFactory = imageNoiseReducer$$ExternalSyntheticLambda26;
        ImageNoiseReducer$$ExternalSyntheticLambda2 imageNoiseReducer$$ExternalSyntheticLambda27 = new ImageNoiseReducer$$ExternalSyntheticLambda2();
        DEFAULT_OUTPUT_VALIDATOR = imageNoiseReducer$$ExternalSyntheticLambda27;
        outputValidator = imageNoiseReducer$$ExternalSyntheticLambda27;
        lock = new Object();
        initLock = new Object();
        NR_WORKER = Executors.newSingleThreadExecutor(new ImageNoiseReducer$$ExternalSyntheticLambda9());
        watchdogMs = 150000L;
        dropDelegateAfterHang = false;
        runInlineForTesting = false;
        ImageNoiseReducer$$ExternalSyntheticLambda2 imageNoiseReducer$$ExternalSyntheticLambda28 = new ImageNoiseReducer$$ExternalSyntheticLambda2();
        DEFAULT_NR_BODY = imageNoiseReducer$$ExternalSyntheticLambda28;
        nrBody = imageNoiseReducer$$ExternalSyntheticLambda28;
        K_TABLE = new double[][]{new double[]{1.0d, 0.65d, 0.9d}, new double[]{2.0d, 0.8d, 0.9d}, new double[]{4.0d, 0.5d, 0.75d}, new double[]{8.0d, 0.5d, 0.65d}, new double[]{16.0d, 0.55d, 0.6d}, new double[]{32.0d, 0.5d, 0.5d}, new double[]{64.0d, 0.4d, 0.55d}};
        LOG2 = Math.log(2.0d);
        gpuInitFailures = 0;
        TILE_SENTINEL = new byte[]{90, -91, 60, -61};
    }

    private ImageNoiseReducer() {
    }

    @VisibleForTesting
    public static void armTileSentinels(@NonNull ByteBuffer byteBuffer, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int sentinelOffset = sentinelOffset(i4, i3, i2);
            for (int i5 = 0; i5 < TILE_SENTINEL.length; i5++) {
                byteBuffer.put(sentinelOffset + i5, sentinelByte(i5, i));
            }
        }
    }

    private static <T> T awaitTask(@NonNull Task<T> task, long j) throws ExecutionException, InterruptedException, TimeoutException {
        if (task.isComplete()) {
            if (task.isCanceled()) {
                throw new CancellationException("Task was canceled");
            }
            if (task.isSuccessful()) {
                return task.getResult();
            }
            throw new ExecutionException(task.getException());
        }
        if (Thread.interrupted()) {
            throw new InterruptedException("interrupted before awaiting TFLite task");
        }
        long nowNs = j - nanoClock.nowNs();
        if (nowNs <= 0) {
            throw new TimeoutException("TFLite init deadline passed");
        }
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null || mainLooper.getThread() != Thread.currentThread()) {
            return (T) Tasks.await(task, nowNs, TimeUnit.NANOSECONDS);
        }
        throw new MainThreadAwaitException();
    }

    @NonNull
    private static NrResult awaitWithWatchdog(@NonNull Future<NrResult> future, @NonNull AtomicLong atomicLong) {
        while (true) {
            try {
                return future.get(500L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                Log.w(TAG, "Interrupted waiting for NR; keeping the original photo");
                return NrResult.failed();
            } catch (CancellationException unused2) {
                return NrResult.skipped();
            } catch (ExecutionException e) {
                Log.e(TAG, "NR worker failed; keeping the original photo", e);
                MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_UNEXPECTED_ERROR);
                return NrResult.failed();
            } catch (TimeoutException unused3) {
                long j = atomicLong.get();
                if (j == 0) {
                    Future<NrResult> future2 = hungPhoto;
                    if (future2 == null) {
                        continue;
                    } else if (future2.isDone()) {
                        continue;
                    } else if (future.cancel(false)) {
                        MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_SKIP_WEDGED);
                        return NrResult.skipped();
                    }
                } else {
                    long nanoTime = (System.nanoTime() - j) / 1000000;
                    if (nanoTime >= watchdogMs) {
                        hungPhoto = future;
                        Log.e(TAG, "NR photo still running after " + nanoTime + " ms (hung GPU / NNAPI call?); keeping the original photo");
                        MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_WATCHDOG_TIMEOUT);
                        return NrResult.failed();
                    }
                }
            }
        }
    }

    @Nullable
    private static Boolean checkGpuDelegateAvailable(@NonNull Context context, long j) {
        try {
            Boolean bool = (Boolean) awaitTask(gpuAvailabilityChecker.isGpuDelegateAvailable(context), Math.min(j, nanoClock.nowNs() + 5000000000L));
            if (bool == null) {
                throw new IllegalStateException("isGpuDelegateAvailable returned null");
            }
            Log.i(TAG, "TFLite GPU delegate available: " + bool);
            return bool;
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            Log.w(TAG, "TFLite GPU delegate availability check failed (" + describeInitFailure(e) + "); trying GPU-enabled init", e);
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_GPU_DELEGATE_CHECK_FAILED);
            return null;
        }
    }

    @NonNull
    private static byte[] computeGainChannelMap(float f, int i, int i2, int i3) {
        String str;
        float f2;
        float f3;
        float f4;
        float f5;
        int i4 = i2;
        int i5 = i * i4;
        byte[] bArr = gainChannelScratch;
        boolean z = bArr != null && bArr.length == i5;
        if (!z) {
            bArr = new byte[i5];
            gainChannelScratch = bArr;
        }
        String str2 = TAG;
        Float valueOf = Float.valueOf(f);
        Integer valueOf2 = Integer.valueOf(i);
        Integer valueOf3 = Integer.valueOf(i4);
        Integer valueOf4 = Integer.valueOf(i3);
        float f6 = 2.0f;
        Float valueOf5 = Float.valueOf(2.0f);
        if (z) {
            str = "reused";
        } else {
            str = "allocated " + (i5 / 1048576) + "MB";
        }
        Log.i(str2, String.format("computeGainChannelMap: gain=%.3f, size=%dx%d, maxGain=%d, minGain=%.1f, scratch=%s", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, str));
        float f7 = 17.0f / i;
        float f8 = 13.0f / i4;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        float[] fArr = new float[i];
        int i6 = 0;
        while (true) {
            f2 = 0.0f;
            f3 = 0.5f;
            if (i6 >= i) {
                break;
            }
            float max = Math.max(0.0f, Math.min(((i6 + 0.5f) * f7) - 0.5f, 16.0f));
            int i7 = (int) max;
            iArr[i6] = i7;
            iArr2[i6] = Math.min(i7 + 1, 16);
            fArr[i6] = max - i7;
            i6++;
        }
        byte[] gainEncodeLut2 = getGainEncodeLut(i3);
        float f9 = i3;
        float f10 = 4095.0f / (f9 - 2.0f);
        float[] fArr2 = new float[i];
        int i8 = 0;
        while (i8 < i4) {
            float f11 = f3;
            float f12 = f6;
            float max2 = Math.max(f2, Math.min(((i8 + f11) * f8) - f11, 12.0f));
            int i9 = (int) max2;
            int min = Math.min(i9 + 1, 12);
            float f13 = max2 - i9;
            float[][] fArr3 = SHADING_GAIN_MAP;
            float[] fArr4 = fArr3[i9];
            float[] fArr5 = fArr3[min];
            int i10 = 0;
            while (i10 < i) {
                int i11 = iArr[i10];
                int i12 = iArr2[i10];
                float[] fArr6 = fArr5;
                float f14 = fArr[i10];
                int i13 = i5;
                float f15 = fArr4[i11];
                byte[] bArr2 = bArr;
                float m = ErrorUtils$$ExternalSyntheticOutline0.m(fArr4[i12], f15, f14, f15);
                float f16 = fArr6[i11];
                fArr2[i10] = (((((fArr6[i12] - f16) * f14) + f16) - m) * f13) + m;
                i10++;
                fArr5 = fArr6;
                i5 = i13;
                bArr = bArr2;
            }
            int i14 = i5;
            byte[] bArr3 = bArr;
            int i15 = i8 * i;
            int i16 = 0;
            while (i16 < i) {
                float f17 = fArr2[i16] * f;
                if (f17 < f12) {
                    f4 = f11;
                    f17 = f12;
                    f5 = f17;
                } else {
                    if (f17 > f9) {
                        f17 = f9;
                    }
                    f4 = f11;
                    f5 = f12;
                }
                int m2 = (int) ErrorUtils$$ExternalSyntheticOutline0.m(f17, f5, f10, f4);
                if (m2 > 4095) {
                    m2 = 4095;
                }
                bArr3[i15 + i16] = gainEncodeLut2[m2];
                i16++;
                f11 = f4;
                f12 = f5;
            }
            i8++;
            i4 = i2;
            f6 = f12;
            i5 = i14;
            bArr = bArr3;
            f3 = f11;
            f2 = 0.0f;
        }
        byte[] bArr4 = bArr;
        Log.i(TAG, String.format("computeGainChannelMap: done — uint8 center=%d, topLeft=%d, bottomRight=%d (corners > center confirms LSC gradient)", Integer.valueOf(bArr4[(i / 2) + ((i2 / 2) * i)] & 255), Integer.valueOf(bArr4[0] & 255), Integer.valueOf(bArr4[i5 - 1] & 255)));
        return bArr4;
    }

    @Nullable
    private static InterpreterApi createInterpreter(@NonNull MappedByteBuffer mappedByteBuffer) {
        boolean preferGpuDelegate = preferGpuDelegate();
        String str = TAG;
        StringBuilder m = DoubleList$$ExternalSyntheticOutline0.m("NR delegate selection: preferGpu=", " (manufacturer=", preferGpuDelegate);
        m.append(Build.MANUFACTURER);
        m.append(", runtimeGpuSupported=");
        m.append(runtimeGpuSupported);
        m.append(", failedDelegates=");
        m.append(failedDelegates);
        m.append(", transientFailedDelegates=");
        m.append(transientFailedDelegates);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        Log.i(str, m.toString());
        Delegate[] delegateArr = preferGpuDelegate ? new Delegate[]{Delegate.GPU, Delegate.NNAPI} : new Delegate[]{Delegate.NNAPI, Delegate.GPU};
        ArrayList arrayList = new ArrayList();
        int length = delegateArr.length;
        for (int i = 0; i < length; i++) {
            Delegate delegate = delegateArr[i];
            if (isDelegateUsable(delegate)) {
                InterpreterApi tryCreate = tryCreate(delegate, mappedByteBuffer);
                if (tryCreate == null) {
                    arrayList.add(delegate + "=construction failed");
                } else {
                    ProbeResult probe = delegateProbe.probe(delegate, tryCreate);
                    if (probe == ProbeResult.FAST) {
                        Log.i(TAG, "NR using " + delegate + " delegate");
                        MetricsRecorder.getInstance().recordCounter(delegate == Delegate.NNAPI ? MediaImportMetricsConstants.NOISE_REDUCTION_DELEGATE_NNAPI : MediaImportMetricsConstants.NOISE_REDUCTION_DELEGATE_GPU);
                        return tryCreate;
                    }
                    Log.w(TAG, "NR " + delegate + " warm-up probe " + probe + "; not using " + delegate);
                    if (probe == ProbeResult.ERROR) {
                        MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_DELEGATE_PROBE_ERROR);
                    } else {
                        MetricsRecorder.getInstance().recordCounter(delegate == Delegate.NNAPI ? MediaImportMetricsConstants.NOISE_REDUCTION_DELEGATE_NNAPI_SLOW : MediaImportMetricsConstants.NOISE_REDUCTION_DELEGATE_GPU_SLOW);
                    }
                    tryCreate.close();
                    if (cachedDelegate != null) {
                        cachedDelegate.close();
                        cachedDelegate = null;
                    }
                    cachedDelegateKind = null;
                    transientFailedDelegates.add(delegate);
                    arrayList.add(delegate + "=probe " + probe);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(delegate);
                sb.append("=");
                sb.append(failedDelegates.contains(delegate) ? "dropped earlier" : transientFailedDelegates.contains(delegate) ? "dropped/slow earlier, retried later" : "no GPU runtime");
                arrayList.add(sb.toString());
            }
        }
        Log.w(TAG, "NR delegate selection: no fast delegate " + arrayList + "; skipping NR (re-evaluated in 10 min)");
        noFastDelegateSinceMs = clock.nowMs();
        noFastDelegate = true;
        MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_SKIP_NO_FAST_DELEGATE);
        return null;
    }

    @NonNull
    private static String describeInitFailure(@Nullable Throwable th) {
        if (th == null) {
            return "unknown";
        }
        Throwable cause = th.getCause();
        return th.getClass().getSimpleName().concat(cause != null ? "/".concat(cause.getClass().getSimpleName()) : "");
    }

    private static void dropCurrentDelegate(@NonNull String str, boolean z) {
        Delegate delegate = cachedDelegateKind;
        String str2 = TAG;
        StringBuilder sb = new StringBuilder("Dropping NR delegate ");
        sb.append(delegate);
        sb.append(" (");
        Log.w(str2, DoubleList$$ExternalSyntheticOutline0.m(sb, z ? "structural" : "transient", "): ", str, "; the next image uses the next delegate"));
        consecutiveStatisticalRejects = 0;
        if (delegate != null) {
            (z ? failedDelegates : transientFailedDelegates).add(delegate);
        }
        if (cachedInterpreter != null) {
            cachedInterpreter.close();
            cachedInterpreter = null;
        }
        if (cachedDelegate != null) {
            cachedDelegate.close();
            cachedDelegate = null;
        }
        cachedDelegateKind = null;
        cachedModelPath = null;
    }

    private static void dropDelegateAfterGuardrail(@NonNull String str, boolean z) {
        MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_DELEGATE_DROPPED_AFTER_GUARDRAIL);
        dropCurrentDelegate("guardrail: " + str, z);
    }

    @NonNull
    @VisibleForTesting
    public static RuntimeStatus ensureRuntimeInitialized(@NonNull Context context) {
        if (runtimeInitialized) {
            return RuntimeStatus.READY;
        }
        synchronized (initLock) {
            try {
                if (runtimeInitialized) {
                    return RuntimeStatus.READY;
                }
                Task<Void> task = pendingInitTask;
                if (task != null) {
                    if (!task.isComplete() && clock.nowMs() - pendingInitSinceMs >= 600000) {
                        Log.w(TAG, "TFLite runtime init pending for over 10 min; abandoning it and retrying after the cooldown");
                        MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_RUNTIME_INIT_PENDING_ABANDONED);
                        pendingInitTask = null;
                        lastInitFailureTime = clock.nowMs();
                        return RuntimeStatus.SKIPPED;
                    }
                    if (!task.isComplete()) {
                        Log.w(TAG, "Skipping NR: TFLite runtime init still pending");
                        MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_SKIP_RUNTIME_INIT_PENDING);
                        return RuntimeStatus.SKIPPED;
                    }
                    pendingInitTask = null;
                    if (task.isSuccessful()) {
                        Log.i(TAG, "TFLite runtime init completed after timeout (gpuSupport=" + runtimeGpuSupported + MarkdownConstants.RIGHT_PARENTHESIS);
                        onRuntimeReady();
                        return RuntimeStatus.READY;
                    }
                    Log.w(TAG, "Pending TFLite runtime init failed (" + describeInitFailure(task.getException()) + "); retrying");
                } else if (clock.nowMs() - lastInitFailureTime < 300000) {
                    Log.w(TAG, "Skipping initRuntime — recent failure within cooldown");
                    MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_SKIP_RUNTIME_COOLDOWN);
                    return RuntimeStatus.SKIPPED;
                }
                int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$frames$media$transform$ImageNoiseReducer$InitAttempt[initRuntime(context).ordinal()];
                if (i == 1) {
                    onRuntimeReady();
                    return RuntimeStatus.READY;
                }
                if (i == 2 || i == 3) {
                    return RuntimeStatus.FAILED;
                }
                lastInitFailureTime = clock.nowMs();
                return RuntimeStatus.FAILED;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    private static byte[] getGainEncodeLut(int i) {
        byte[] bArr = gainEncodeLut;
        if (bArr != null && gainEncodeLutMaxGain == i) {
            return bArr;
        }
        byte[] bArr2 = new byte[4096];
        double d = 1.0d / i;
        double d2 = (i - 2.0f) / 4095.0d;
        for (int i2 = 0; i2 < 4096; i2++) {
            int floor = (int) Math.floor((Math.sqrt(((i2 * d2) + 2.0d) * d) * 255.0d) + 0.5d);
            if (floor > 255) {
                floor = 255;
            }
            bArr2[i2] = (byte) floor;
        }
        gainEncodeLut = bArr2;
        gainEncodeLutMaxGain = i;
        return bArr2;
    }

    @Nullable
    public static String getNrModelPath(@NonNull Context context) {
        ModelArtifactManager modelArtifactManager = ModelArtifactManager.getInstance(context);
        ModelArtifactManager.ModelCategory modelCategory = ModelArtifactManager.ModelCategory.NOISE_REDUCTION;
        String assetFilePath = modelArtifactManager.getAssetFilePath(modelCategory.getFileName(), modelCategory);
        if (assetFilePath != null) {
            Log.i(TAG, "Using DAVS NR model: ".concat(assetFilePath));
            return assetFilePath;
        }
        Log.i(TAG, "NR model not available");
        MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_MODEL_NOT_AVAILABLE);
        return null;
    }

    @Nullable
    private static InterpreterApi getOrCreateInterpreter(@NonNull String str) {
        if (noFastDelegate) {
            long nowMs = clock.nowMs() - noFastDelegateSinceMs;
            if (nowMs < 600000) {
                MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_SKIP_NO_FAST_DELEGATE);
                return null;
            }
            noFastDelegate = false;
            String str2 = TAG;
            StringBuilder sb = new StringBuilder("Re-evaluating NR delegates: no-fast-delegate decision is ");
            sb.append(nowMs / 1000);
            sb.append(" s old (failedDelegates=");
            sb.append(failedDelegates);
            sb.append(", retrying transient ");
            EnumSet<Delegate> enumSet = transientFailedDelegates;
            sb.append(enumSet);
            sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
            Log.i(str2, sb.toString());
            enumSet.clear();
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_FAST_DELEGATE_REEVALUATED);
        }
        if (cachedInterpreter != null && str.equals(cachedModelPath)) {
            return cachedInterpreter;
        }
        if (cachedInterpreter != null) {
            cachedInterpreter.close();
            cachedInterpreter = null;
        }
        if (cachedDelegate != null) {
            cachedDelegate.close();
            cachedDelegate = null;
        }
        cachedDelegateKind = null;
        MappedByteBuffer loadModel = loadModel(str);
        if (loadModel == null) {
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.MEDIA_IMPORT_NOISE_REDUCTION_MODEL_LOAD_FAILED);
            return null;
        }
        InterpreterApi createInterpreter = createInterpreter(loadModel);
        if (createInterpreter == null) {
            return null;
        }
        cachedInterpreter = createInterpreter;
        cachedModelPath = str;
        return cachedInterpreter;
    }

    private static int groupOffset(int i, int i2, int i3) {
        return (int) ((i * (i3 - 4)) / (i2 - 1));
    }

    @NonNull
    private static InitAttempt initRuntime(@NonNull Context context) {
        long nowNs = nanoClock.nowNs() + 30000000000L;
        Boolean checkGpuDelegateAvailable = checkGpuDelegateAvailable(context, nowNs);
        runtimeGpuSupported = true;
        runtimeGpuFallbackUsed = false;
        try {
            try {
                if (Boolean.FALSE.equals(checkGpuDelegateAvailable)) {
                    Log.w(TAG, "TFLite GPU delegate unavailable; initializing without GPU support");
                    MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_GPU_DELEGATE_UNAVAILABLE);
                    runtimeGpuSupported = false;
                    awaitTask(runtimeInitializer.initialize(context, false), nowNs);
                    return InitAttempt.READY;
                }
                try {
                    awaitTask(runtimeInitializer.initialize(context, true), nowNs);
                } catch (CancellationException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    Log.w(TAG, "TFLite runtime init with GPU delegate support failed (" + describeInitFailure(e2) + "); initializing without it", e2);
                    runtimeGpuSupported = false;
                    runtimeGpuFallbackUsed = true;
                    awaitTask(runtimeInitializer.initialize(context, false), nowNs);
                } catch (ExecutionException e3) {
                    int i = gpuInitFailures;
                    if (i < 1) {
                        gpuInitFailures = i + 1;
                        Log.w(TAG, "TFLite runtime init with GPU delegate support failed (" + describeInitFailure(e3) + "); retrying with GPU after the cooldown", e3);
                        MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_RUNTIME_INIT_GPU_RETRY);
                        return InitAttempt.FAILED;
                    }
                    Log.w(TAG, "TFLite runtime init with GPU delegate support failed again (" + describeInitFailure(e3) + "); initializing without it", e3);
                    runtimeGpuSupported = false;
                    runtimeGpuFallbackUsed = true;
                    awaitTask(runtimeInitializer.initialize(context, false), nowNs);
                }
                return InitAttempt.READY;
            } catch (CancellationException e4) {
                Log.w(TAG, "TFLite Play Services init was cancelled; will retry after the cooldown", e4);
                MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_RUNTIME_INIT_FAILED);
                return InitAttempt.FAILED;
            }
        } catch (MainThreadAwaitException e5) {
            Log.e(TAG, "TFLite Play Services init awaited on the main thread; NR must run on a worker thread", e5);
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_RUNTIME_INIT_FAILED);
            return InitAttempt.FAILED;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            Log.w(TAG, "TFLite Play Services init interrupted; will retry on a later image");
            pendingInitTask = null;
            pendingInitSinceMs = clock.nowMs();
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_RUNTIME_INIT_INTERRUPTED);
            return InitAttempt.INTERRUPTED;
        } catch (TimeoutException unused2) {
            Log.w(TAG, "TFLite Play Services init did not finish within 30 s (gpuSupport=" + runtimeGpuSupported + "); will use it once it completes");
            pendingInitTask = null;
            pendingInitSinceMs = clock.nowMs();
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_RUNTIME_INIT_TIMEOUT);
            return InitAttempt.PENDING;
        } catch (Exception e6) {
            Log.e(TAG, "TFLite Play Services init failed (" + describeInitFailure(e6) + MarkdownConstants.RIGHT_PARENTHESIS, e6);
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_RUNTIME_INIT_FAILED);
            return InitAttempt.FAILED;
        }
    }

    @VisibleForTesting
    public static void invalidateInterpreterAfterInferenceFailure(@NonNull Exception exc) {
        dropCurrentDelegate("inference failed (" + exc.getClass().getSimpleName() + MarkdownConstants.RIGHT_PARENTHESIS, false);
    }

    private static boolean isDelegateUsable(@NonNull Delegate delegate) {
        if (failedDelegates.contains(delegate) || transientFailedDelegates.contains(delegate)) {
            return false;
        }
        return delegate != Delegate.GPU || runtimeGpuSupported;
    }

    @VisibleForTesting
    public static boolean isNoFastDelegateCached() {
        return noFastDelegate && clock.nowMs() - noFastDelegateSinceMs < 600000;
    }

    @VisibleForTesting
    public static boolean isRepeatedTileOutput(@NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3, @NonNull byte[] bArr4) {
        if (Arrays.equals(bArr, bArr2) && !Arrays.equals(bArr3, bArr4)) {
            for (byte b : bArr) {
                if (b != bArr[0]) {
                    return true;
                }
            }
        }
        return false;
    }

    @VisibleForTesting
    public static boolean isWedgedForTesting() {
        Future<NrResult> future = hungPhoto;
        return (future == null || future.isDone()) ? false : true;
    }

    @NonNull
    private static double[] kFromGain(double d) {
        double[][] dArr = K_TABLE;
        int length = dArr.length - 1;
        double[] dArr2 = dArr[0];
        if (d <= dArr2[0]) {
            return new double[]{dArr2[1], dArr2[2]};
        }
        double[] dArr3 = dArr[length];
        if (d >= dArr3[0]) {
            return new double[]{dArr3[1], dArr3[2]};
        }
        double log = Math.log(d) / LOG2;
        int i = 0;
        while (i < length) {
            double[][] dArr4 = K_TABLE;
            int i2 = i + 1;
            double d2 = dArr4[i2][0];
            if (d < d2) {
                double log2 = Math.log(dArr4[i][0]);
                double d3 = LOG2;
                double d4 = log2 / d3;
                double log3 = (log - d4) / ((Math.log(d2) / d3) - d4);
                double[] dArr5 = dArr4[i];
                double d5 = dArr5[1];
                double[] dArr6 = dArr4[i2];
                double m$2 = AppLaunchChecker$$ExternalSyntheticOutline0.m$2(dArr6[1], d5, log3, d5);
                double d6 = dArr5[2];
                return new double[]{m$2, AppLaunchChecker$$ExternalSyntheticOutline0.m$2(dArr6[2], d6, log3, d6)};
            }
            i = i2;
        }
        double[] dArr7 = K_TABLE[length];
        return new double[]{dArr7[1], dArr7[2]};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ NrResult lambda$reduceNoise$3(AtomicLong atomicLong, Context context, byte[] bArr, String str) throws Exception {
        atomicLong.set(System.nanoTime() | 1);
        if (dropDelegateAfterHang) {
            dropDelegateAfterHang = false;
            synchronized (lock) {
                dropCurrentDelegate("hung past the " + (watchdogMs / 1000) + " s watchdog", false);
            }
        }
        try {
            return nrBody.run(context, bArr, str);
        } catch (OutOfMemoryError e) {
            return onOutOfMemory(e, "worker");
        } catch (Throwable th) {
            Log.e(TAG, "Unexpected NR error; keeping the original photo", th);
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_UNEXPECTED_ERROR);
            return NrResult.failed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$static$0(Context context, boolean z) {
        return TfLite.initialize(context, TfLiteInitializationOptions.builder().setEnableGpuDelegateSupport(z).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterpreterApi lambda$static$1(Delegate delegate, MappedByteBuffer mappedByteBuffer) {
        return delegate == Delegate.NNAPI ? tryCreateNnapiInterpreter(mappedByteBuffer) : tryCreateGpuInterpreter(mappedByteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$static$2(Runnable runnable) {
        Thread thread = new Thread(runnable, "ansel-nr");
        thread.setDaemon(true);
        return thread;
    }

    @Nullable
    private static MappedByteBuffer loadModel(@NonNull String str) {
        File file = new File(str);
        if (!file.exists()) {
            Log.w(TAG, "Model not found: " + str);
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_MODEL_FILE_MISSING);
            return null;
        }
        String str2 = TAG;
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Loading model: ", str, " (");
        m2m.append(file.length() / 1024);
        m2m.append(" KB)");
        Log.i(str2, m2m.toString());
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                try {
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    channel.close();
                    fileInputStream.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            Log.e(TAG, "Failed to load model", e);
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_MODEL_FILE_LOAD_FAILED);
            return null;
        }
    }

    @NonNull
    private static NrResult onOutOfMemory(@NonNull OutOfMemoryError outOfMemoryError, @NonNull String str) {
        Log.e(TAG, "Out of memory during NR " + str + "; keeping the original photo", outOfMemoryError);
        synchronized (lock) {
            gainChannelScratch = null;
            tileInBuffer = null;
            tileOutBuffer = null;
        }
        MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_OOM);
        return NrResult.failed();
    }

    private static void onRuntimeReady() {
        runtimeInitialized = true;
        if (runtimeGpuFallbackUsed) {
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_RUNTIME_INIT_WITHOUT_GPU);
        }
    }

    @VisibleForTesting
    public static boolean passesOutputGuardrail(@NonNull NrOutputValidator.PixelSource pixelSource, @NonNull NrOutputValidator.PixelSource pixelSource2, double d, @NonNull int[] iArr, @NonNull int[] iArr2) {
        MetricsRecorder metricsRecorder = MetricsRecorder.getInstance();
        MobilyticsMetricsTimer startTimer = metricsRecorder.startTimer(MediaImportMetricsConstants.MEDIA_IMPORT_NOISE_REDUCTION_OUTPUT_VALIDATION_LATENCY);
        try {
            try {
                NrOutputValidator.Result validate = outputValidator.validate(pixelSource, pixelSource2, d, iArr, iArr2);
                metricsRecorder.recordTimer(startTimer);
                if (validate.passed()) {
                    String str = TAG;
                    StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("NR output sanity check passed (wIn=", d, "): ");
                    m.append(validate.stats);
                    Log.i(str, m.toString());
                    consecutiveStatisticalRejects = 0;
                    return true;
                }
                Log.e(TAG, "NR output sanity check FAILED " + validate.failedReasons + " (wIn=" + d + ", delegate=" + cachedDelegateKind + "); keeping the original photo: " + validate.stats);
                metricsRecorder.recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_OUTPUT_SANITY_CHECK_FAILED);
                ArrayList arrayList = new ArrayList();
                for (String str2 : validate.failedReasons) {
                    metricsRecorder.recordCounter(MediaImportMetricsConstants.noiseReductionOutputSanityCheckFailed(str2));
                    if (NrOutputValidator.isStructuralReason(str2)) {
                        arrayList.add(str2);
                    }
                }
                if (arrayList.isEmpty()) {
                    int i = consecutiveStatisticalRejects + 1;
                    consecutiveStatisticalRejects = i;
                    List<String> list = validate.failedReasons;
                    if (i >= 3) {
                        dropDelegateAfterGuardrail(AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("repeated_statistical (3 statistical rejects in a row, last ", MarkdownConstants.RIGHT_PARENTHESIS, list), false);
                    } else {
                        Log.w(TAG, "NR guardrail reject " + list + " is statistical (" + consecutiveStatisticalRejects + " in a row); keeping delegate " + cachedDelegateKind);
                    }
                } else {
                    dropDelegateAfterGuardrail("output sanity check " + arrayList, true);
                }
                return false;
            } catch (Exception | OutOfMemoryError e) {
                Log.e(TAG, "NR output sanity check threw; keeping the original photo", e);
                metricsRecorder.recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_OUTPUT_SANITY_CHECK_ERROR);
                if (e instanceof OutOfMemoryError) {
                    onOutOfMemory((OutOfMemoryError) e, "output validation");
                }
                metricsRecorder.recordTimer(startTimer);
                return false;
            }
        } catch (Throwable th) {
            metricsRecorder.recordTimer(startTimer);
            throw th;
        }
    }

    private static boolean preferGpuDelegate() {
        String str = Build.MANUFACTURER;
        return str != null && str.equalsIgnoreCase("samsung");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static ProbeResult probeDelegate(@NonNull Delegate delegate, @NonNull InterpreterApi interpreterApi) {
        MobilyticsMetricsTimer startTimer = MetricsRecorder.getInstance().startTimer(MediaImportMetricsConstants.MEDIA_IMPORT_NOISE_REDUCTION_DELEGATE_PROBE_LATENCY);
        try {
            try {
                int numBytes = interpreterApi.getInputTensor(0).numBytes();
                int numBytes2 = interpreterApi.getOutputTensor(0).numBytes();
                ByteBuffer order = ByteBuffer.allocateDirect(numBytes).order(ByteOrder.nativeOrder());
                ByteBuffer order2 = ByteBuffer.allocateDirect(numBytes2).order(ByteOrder.nativeOrder());
                long nowNs = nanoClock.nowNs();
                interpreterApi.run(order, order2);
                long nowNs2 = (nanoClock.nowNs() - nowNs) / 1000000;
                long j = delegate == Delegate.GPU ? 1500L : NNAPI_PROBE_MAX_MS;
                ProbeResult probeResult = nowNs2 < j ? ProbeResult.FAST : ProbeResult.SLOW;
                Log.i(TAG, delegate + " warm-up probe: " + nowNs2 + " ms/tile (threshold " + j + " ms) -> " + probeResult);
                if (startTimer != null) {
                    MetricsRecorder.getInstance().recordTimer(startTimer);
                }
                return probeResult;
            } catch (RuntimeException e) {
                Log.w(TAG, delegate + " warm-up probe failed; treating " + delegate + " as unusable", e);
                ProbeResult probeResult2 = ProbeResult.ERROR;
                if (startTimer != null) {
                    MetricsRecorder.getInstance().recordTimer(startTimer);
                }
                return probeResult2;
            }
        } catch (Throwable th) {
            if (startTimer != null) {
                MetricsRecorder.getInstance().recordTimer(startTimer);
            }
            throw th;
        }
    }

    @VisibleForTesting
    public static long projectedPhotoMs(@NonNull long[] jArr, int i, int i2, long j) {
        long j2;
        long[] copyOf = Arrays.copyOf(jArr, i);
        Arrays.sort(copyOf);
        if (i % 2 != 0) {
            j2 = copyOf[i / 2];
        } else {
            int i3 = i / 2;
            j2 = (copyOf[i3 - 1] + copyOf[i3]) / 2;
        }
        return ((j2 * (i2 - i)) + j) / 1000000;
    }

    private static int recombine(float f, int i, float f2, int i2, float f3, int i3) {
        int rint = (int) Math.rint((f3 * i3) + (f2 * i2) + (f * i));
        if (rint < 0) {
            return 0;
        }
        if (rint > 255) {
            return 255;
        }
        return rint;
    }

    @NonNull
    @WorkerThread
    public static NrResult reduceNoise(@NonNull Context context, @NonNull byte[] bArr, @NonNull String str) {
        Future future;
        Future<NrResult> future2 = hungPhoto;
        if (future2 != null) {
            if (!future2.isDone()) {
                Log.w(TAG, "Skipping NR: an earlier NR call is still hung past the watchdog");
                MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_SKIP_WEDGED);
                return NrResult.skipped();
            }
            hungPhoto = null;
            dropDelegateAfterHang = true;
            Log.w(TAG, "Hung NR call returned; NR resumes");
        }
        AtomicLong atomicLong = new AtomicLong();
        BufferedDiskCache$$ExternalSyntheticLambda2 bufferedDiskCache$$ExternalSyntheticLambda2 = new BufferedDiskCache$$ExternalSyntheticLambda2(1, atomicLong, context, bArr, str);
        try {
            if (runInlineForTesting) {
                FutureTask futureTask = new FutureTask(bufferedDiskCache$$ExternalSyntheticLambda2);
                futureTask.run();
                future = futureTask;
            } else {
                future = NR_WORKER.submit(bufferedDiskCache$$ExternalSyntheticLambda2);
            }
            return awaitWithWatchdog(future, atomicLong);
        } catch (RejectedExecutionException e) {
            Log.e(TAG, "NR worker rejected the photo; keeping the original", e);
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_UNEXPECTED_ERROR);
            return NrResult.failed();
        }
    }

    @NonNull
    @VisibleForTesting
    public static NrResult reduceNoiseDecoded(@NonNull Context context, @NonNull Bitmap bitmap, @NonNull ExifInterface exifInterface, int i, @NonNull byte[] bArr, @NonNull String str, long j) {
        boolean z;
        try {
            int extractRawIsoFromExif = ExifManager.extractRawIsoFromExif(exifInterface, -1);
            if (NrOutputValidator.shouldSkipDarkHighIso(NrOutputValidator.of(bitmap), extractRawIsoFromExif)) {
                Log.i(TAG, "Skipping NR: dark frame at ISO " + extractRawIsoFromExif);
                MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_SKIP_DARK_HIGH_ISO);
                return NrResult.skipped();
            }
            RuntimeStatus ensureRuntimeInitialized = ensureRuntimeInitialized(context);
            if (ensureRuntimeInitialized != RuntimeStatus.READY) {
                Log.w(TAG, "TFLite runtime not available (" + ensureRuntimeInitialized + "), skipping NR");
                return resultForUnavailableRuntime(ensureRuntimeInitialized);
            }
            synchronized (lock) {
                long nanoTime = System.nanoTime();
                InterpreterApi orCreateInterpreter = getOrCreateInterpreter(str);
                if (orCreateInterpreter == null) {
                    if (noFastDelegate) {
                        Log.w(TAG, "No fast NR delegate, skipping NR");
                        return NrResult.skipped();
                    }
                    Log.w(TAG, "Failed to create interpreter, skipping NR");
                    return NrResult.failed();
                }
                long nanoTime2 = (System.nanoTime() - nanoTime) / 1000000;
                String str2 = TAG;
                Log.i(str2, "Model + " + cachedDelegateKind + " init: " + nanoTime2 + " ms");
                Runtime runtime = Runtime.getRuntime();
                Log.i(str2, "Memory before inference: " + ((runtime.totalMemory() - runtime.freeMemory()) / 1048576) + "MB used / " + (runtime.maxMemory() / 1048576) + "MB max");
                float f = ((float) i) / ISO_TO_GAIN_DIVISOR;
                long nanoTime3 = System.nanoTime();
                byte[] computeGainChannelMap = computeGainChannelMap(f, IMAGE_W, IMAGE_H, 448);
                Log.i(str2, String.format("ISO: %d, gain: %.3f, maxGain: %d, LSC channel center uint8: %d, gain map build: %d ms", Integer.valueOf(i), Float.valueOf(f), 448, Integer.valueOf(computeGainChannelMap[6098400] & 255), Long.valueOf((System.nanoTime() - nanoTime3) / 1000000)));
                double[] kFromGain = kFromGain(f);
                Log.i(str2, String.format("Dual-head strengths: kNoise=%.4f, kEdge=%.4f (gain=%.3f, rawISO=%d)", Double.valueOf(kFromGain[0]), Double.valueOf(kFromGain[1]), Float.valueOf(f), Integer.valueOf(i)));
                MobilyticsMetricsTimer startTimer = MetricsRecorder.getInstance().startTimer(MediaImportMetricsConstants.MEDIA_IMPORT_NOISE_REDUCTION_INFERENCE_LATENCY);
                try {
                    try {
                        try {
                            try {
                                z = false;
                                try {
                                    Bitmap runTiledInference = runTiledInference(orCreateInterpreter, bitmap, computeGainChannelMap, kFromGain[0], kFromGain[1]);
                                    MetricsRecorder.getInstance().recordTimer(startTimer);
                                    if (!passesOutputGuardrail(NrOutputValidator.of(bitmap), NrOutputValidator.of(runTiledInference), 1.0d - kFromGain[0], NrOutputValidator.NR_COL_EDGES, NrOutputValidator.NR_ROW_EDGES)) {
                                        runTiledInference.recycle();
                                        return NrResult.failedAfterInference();
                                    }
                                    try {
                                        long nanoTime4 = System.nanoTime();
                                        try {
                                            try {
                                                byte[] writeJpegWithExif = ExifManager.writeJpegWithExif(runTiledInference, exifInterface, runTiledInference.getWidth(), runTiledInference.getHeight(), bArr);
                                                long nanoTime5 = (System.nanoTime() - nanoTime4) / 1000000;
                                                if (writeJpegWithExif == null) {
                                                    Log.e(str2, "Failed to encode NR output with EXIF");
                                                    MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_ENCODE_FAILED);
                                                    return NrResult.failedAfterInference();
                                                }
                                                Log.i(str2, "JPEG encode + EXIF: " + nanoTime5 + " ms, size: " + writeJpegWithExif.length + " bytes");
                                                Log.i(str2, "NR complete: " + ((System.nanoTime() - j) / 1000000) + " ms, output " + writeJpegWithExif.length + " bytes");
                                                NrResult success = NrResult.success(writeJpegWithExif);
                                                if (!runTiledInference.isRecycled()) {
                                                    runTiledInference.recycle();
                                                }
                                                return success;
                                            } catch (OutOfMemoryError e) {
                                                onOutOfMemory(e, "encode");
                                                NrResult failedAfterInference = NrResult.failedAfterInference();
                                                if (!runTiledInference.isRecycled()) {
                                                    runTiledInference.recycle();
                                                }
                                                return failedAfterInference;
                                            }
                                        } catch (Exception e2) {
                                            Log.e(TAG, "NR output encode threw; keeping the original photo", e2);
                                            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_ENCODE_FAILED);
                                            NrResult failedAfterInference2 = NrResult.failedAfterInference();
                                            if (!runTiledInference.isRecycled()) {
                                                runTiledInference.recycle();
                                            }
                                            return failedAfterInference2;
                                        }
                                    } finally {
                                        if (!runTiledInference.isRecycled()) {
                                            runTiledInference.recycle();
                                        }
                                    }
                                } catch (OverTimeBudgetException e3) {
                                    e = e3;
                                    MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_SKIP_OVER_TIME_BUDGET);
                                    dropCurrentDelegate(e.getMessage(), z);
                                    return NrResult.failedAfterInference();
                                }
                            } catch (OverTimeBudgetException e4) {
                                e = e4;
                                z = false;
                            }
                        } catch (TileOutputException e5) {
                            dropDelegateAfterGuardrail(e5.getMessage(), true);
                            return NrResult.failedAfterInference();
                        }
                    } catch (RuntimeException e6) {
                        Log.e(TAG, "Noise reduction inference failed", e6);
                        MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_INFERENCE_FAILED);
                        invalidateInterpreterAfterInferenceFailure(e6);
                        return NrResult.failedAfterInference();
                    }
                } catch (UnexpectedModelException e7) {
                    Log.e(TAG, "NR model mismatch; keeping the original photo", e7);
                    return NrResult.failedAfterInference();
                }
            }
        } catch (Exception e8) {
            Log.e(TAG, "Noise reduction failed", e8);
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_INFERENCE_FAILED);
            return NrResult.failed();
        } catch (OutOfMemoryError e9) {
            return onOutOfMemory(e9, "processing");
        } finally {
            bitmap.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static NrResult reduceNoiseOnWorker(@NonNull Context context, @NonNull byte[] bArr, @NonNull String str) {
        long nanoTime = System.nanoTime();
        try {
            ExifInterface exifInterface = new ExifInterface(new ByteArrayInputStream(bArr));
            int extractRawIsoFromExif = ExifManager.extractRawIsoFromExif(exifInterface, 64);
            if (extractRawIsoFromExif < 40) {
                Log.i(TAG, "Skipping NR: rawISO=" + extractRawIsoFromExif + " below 40");
                MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_SKIP_LOW_ISO);
                return NrResult.skipped();
            }
            if (isNoFastDelegateCached()) {
                Log.i(TAG, "Skipping NR: no fast delegate in this process");
                MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_SKIP_NO_FAST_DELEGATE);
                return NrResult.skipped();
            }
            MobilyticsMetricsTimer startTimer = MetricsRecorder.getInstance().startTimer(MediaImportMetricsConstants.MEDIA_IMPORT_NOISE_REDUCTION_LATENCY);
            try {
                long nanoTime2 = System.nanoTime();
                MobilyticsMetricsTimer startTimer2 = MetricsRecorder.getInstance().startTimer(MediaImportMetricsConstants.MEDIA_IMPORT_NOISE_REDUCTION_DECODE_LATENCY);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                if (decodeByteArray == null) {
                    Log.w(TAG, "Failed to decode image");
                    MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_IMAGE_DECODE_FAILED);
                    return NrResult.failed();
                }
                MetricsRecorder.getInstance().recordTimer(startTimer2);
                long nanoTime3 = (System.nanoTime() - nanoTime2) / 1000000;
                String str2 = TAG;
                Log.i(str2, "Decoded image: " + decodeByteArray.getWidth() + "x" + decodeByteArray.getHeight() + " (" + bArr.length + " bytes) in " + nanoTime3 + " ms");
                if (decodeByteArray.getWidth() == IMAGE_W && decodeByteArray.getHeight() == IMAGE_H) {
                    NrResult reduceNoiseDecoded = reduceNoiseDecoded(context, decodeByteArray, exifInterface, extractRawIsoFromExif, bArr, str, nanoTime);
                    if (reduceNoiseDecoded.ranInference) {
                        MetricsRecorder.getInstance().recordTimer(startTimer);
                    }
                    return reduceNoiseDecoded;
                }
                Log.w(str2, "Unexpected dimensions: " + decodeByteArray.getWidth() + "x" + decodeByteArray.getHeight() + ", expected 4032x3024");
                MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_UNEXPECTED_DIMENSIONS);
                decodeByteArray.recycle();
                return NrResult.failed();
            } catch (OutOfMemoryError e) {
                return onOutOfMemory(e, "decode");
            }
        } catch (Exception e2) {
            Log.w(TAG, "Failed to parse EXIF", e2);
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_EXIF_PARSE_FAILED);
            return NrResult.failed();
        }
    }

    @VisibleForTesting
    public static void resetRuntimeStateForTesting() {
        watchdogMs = 150000L;
        hungPhoto = null;
        dropDelegateAfterHang = false;
        nrBody = DEFAULT_NR_BODY;
        synchronized (initLock) {
            runtimeInitialized = false;
            lastInitFailureTime = 0L;
            runtimeGpuSupported = true;
            runtimeGpuFallbackUsed = false;
            gpuInitFailures = 0;
            pendingInitTask = null;
            pendingInitSinceMs = 0L;
            runtimeInitializer = DEFAULT_RUNTIME_INITIALIZER;
            gpuAvailabilityChecker = DEFAULT_GPU_AVAILABILITY_CHECKER;
            interpreterFactory = DEFAULT_INTERPRETER_FACTORY;
            outputValidator = DEFAULT_OUTPUT_VALIDATOR;
        }
        synchronized (lock) {
            failedDelegates.clear();
            transientFailedDelegates.clear();
            noFastDelegate = false;
            noFastDelegateSinceMs = 0L;
            clock = DEFAULT_CLOCK;
            nanoClock = DEFAULT_NANO_CLOCK;
            delegateProbe = DEFAULT_DELEGATE_PROBE;
            consecutiveStatisticalRejects = 0;
            tileInBuffer = null;
            tileOutBuffer = null;
            cachedInterpreter = null;
            cachedDelegate = null;
            cachedDelegateKind = null;
            cachedModelPath = null;
        }
    }

    @NonNull
    @VisibleForTesting
    public static NrResult resultForUnavailableRuntime(@NonNull RuntimeStatus runtimeStatus) {
        return runtimeStatus == RuntimeStatus.SKIPPED ? NrResult.skipped() : NrResult.failed();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0444 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0468 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3 A[Catch: all -> 0x0057, LOOP:0: B:19:0x00ad->B:21:0x00b3, LOOP_END, TryCatch #1 {all -> 0x0057, blocks: (B:3:0x0013, B:6:0x004c, B:8:0x0050, B:11:0x006a, B:13:0x006e, B:15:0x0082, B:18:0x0091, B:21:0x00b3, B:23:0x00cc, B:25:0x00d5, B:30:0x00e7, B:32:0x00f4, B:34:0x00fe, B:36:0x0119, B:87:0x03c4, B:116:0x0074, B:117:0x005c), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5 A[Catch: all -> 0x0057, LOOP:1: B:24:0x00d3->B:25:0x00d5, LOOP_END, TryCatch #1 {all -> 0x0057, blocks: (B:3:0x0013, B:6:0x004c, B:8:0x0050, B:11:0x006a, B:13:0x006e, B:15:0x0082, B:18:0x0091, B:21:0x00b3, B:23:0x00cc, B:25:0x00d5, B:30:0x00e7, B:32:0x00f4, B:34:0x00fe, B:36:0x0119, B:87:0x03c4, B:116:0x0074, B:117:0x005c), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7 A[Catch: all -> 0x0057, LOOP:2: B:28:0x00e4->B:30:0x00e7, LOOP_END, TryCatch #1 {all -> 0x0057, blocks: (B:3:0x0013, B:6:0x004c, B:8:0x0050, B:11:0x006a, B:13:0x006e, B:15:0x0082, B:18:0x0091, B:21:0x00b3, B:23:0x00cc, B:25:0x00d5, B:30:0x00e7, B:32:0x00f4, B:34:0x00fe, B:36:0x0119, B:87:0x03c4, B:116:0x0074, B:117:0x005c), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fe A[Catch: all -> 0x0057, LOOP:3: B:33:0x00fc->B:34:0x00fe, LOOP_END, TryCatch #1 {all -> 0x0057, blocks: (B:3:0x0013, B:6:0x004c, B:8:0x0050, B:11:0x006a, B:13:0x006e, B:15:0x0082, B:18:0x0091, B:21:0x00b3, B:23:0x00cc, B:25:0x00d5, B:30:0x00e7, B:32:0x00f4, B:34:0x00fe, B:36:0x0119, B:87:0x03c4, B:116:0x0074, B:117:0x005c), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0179 A[Catch: all -> 0x01f6, TryCatch #0 {all -> 0x01f6, blocks: (B:38:0x013a, B:39:0x0171, B:41:0x0179, B:43:0x01b9, B:45:0x01ca, B:47:0x01f9, B:49:0x0200, B:54:0x0231, B:57:0x0240, B:59:0x0290, B:62:0x029b, B:64:0x02a3, B:68:0x02aa, B:69:0x02cc, B:71:0x02cd, B:75:0x02db, B:77:0x035b, B:79:0x036d, B:83:0x037b, B:85:0x038f, B:88:0x03c7, B:90:0x03d5, B:92:0x03da, B:98:0x03e9, B:99:0x0422, B:104:0x0444, B:105:0x0467, B:109:0x0468, B:112:0x047e, B:114:0x0477, B:118:0x04c4, B:119:0x04ee), top: B:4:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x029b A[Catch: all -> 0x01f6, TRY_ENTER, TryCatch #0 {all -> 0x01f6, blocks: (B:38:0x013a, B:39:0x0171, B:41:0x0179, B:43:0x01b9, B:45:0x01ca, B:47:0x01f9, B:49:0x0200, B:54:0x0231, B:57:0x0240, B:59:0x0290, B:62:0x029b, B:64:0x02a3, B:68:0x02aa, B:69:0x02cc, B:71:0x02cd, B:75:0x02db, B:77:0x035b, B:79:0x036d, B:83:0x037b, B:85:0x038f, B:88:0x03c7, B:90:0x03d5, B:92:0x03da, B:98:0x03e9, B:99:0x0422, B:104:0x0444, B:105:0x0467, B:109:0x0468, B:112:0x047e, B:114:0x0477, B:118:0x04c4, B:119:0x04ee), top: B:4:0x004a }] */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap runTiledInference(@androidx.annotation.NonNull org.tensorflow.lite.InterpreterApi r59, @androidx.annotation.NonNull android.graphics.Bitmap r60, @androidx.annotation.NonNull byte[] r61, double r62, double r64) {
        /*
            Method dump skipped, instructions count: 1267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.accessory.frames.media.transform.ImageNoiseReducer.runTiledInference(org.tensorflow.lite.InterpreterApi, android.graphics.Bitmap, byte[], double, double):android.graphics.Bitmap");
    }

    private static byte sentinelByte(int i, int i2) {
        return (byte) (TILE_SENTINEL[i] ^ (i2 * 31));
    }

    private static int sentinelOffset(int i, int i2, int i3) {
        return (i * (i3 / i2)) + ((int) ((i * 1031) % (r6 - 3)));
    }

    @VisibleForTesting
    public static void setClockForTesting(@Nullable MillisClock millisClock) {
        if (millisClock == null) {
            millisClock = DEFAULT_CLOCK;
        }
        clock = millisClock;
    }

    @VisibleForTesting
    public static void setDelegateProbeForTesting(@Nullable DelegateProbe delegateProbe2) {
        if (delegateProbe2 == null) {
            delegateProbe2 = DEFAULT_DELEGATE_PROBE;
        }
        delegateProbe = delegateProbe2;
    }

    @VisibleForTesting
    public static void setGpuAvailabilityCheckerForTesting(@Nullable GpuAvailabilityChecker gpuAvailabilityChecker2) {
        if (gpuAvailabilityChecker2 == null) {
            gpuAvailabilityChecker2 = DEFAULT_GPU_AVAILABILITY_CHECKER;
        }
        gpuAvailabilityChecker = gpuAvailabilityChecker2;
    }

    @VisibleForTesting
    public static void setInterpreterFactoryForTesting(@Nullable DelegateInterpreterFactory delegateInterpreterFactory) {
        if (delegateInterpreterFactory == null) {
            delegateInterpreterFactory = DEFAULT_INTERPRETER_FACTORY;
        }
        interpreterFactory = delegateInterpreterFactory;
    }

    @VisibleForTesting
    public static void setNanoClockForTesting(@Nullable NanoClock nanoClock2) {
        if (nanoClock2 == null) {
            nanoClock2 = DEFAULT_NANO_CLOCK;
        }
        nanoClock = nanoClock2;
    }

    @VisibleForTesting
    public static void setNrBodyForTesting(@Nullable NrBody nrBody2) {
        if (nrBody2 == null) {
            nrBody2 = DEFAULT_NR_BODY;
        }
        nrBody = nrBody2;
    }

    @VisibleForTesting
    public static void setOutputValidatorForTesting(@Nullable OutputValidatorFn outputValidatorFn) {
        if (outputValidatorFn == null) {
            outputValidatorFn = DEFAULT_OUTPUT_VALIDATOR;
        }
        outputValidator = outputValidatorFn;
    }

    @VisibleForTesting
    public static void setRunInlineForTesting(boolean z) {
        runInlineForTesting = z;
    }

    @VisibleForTesting
    public static void setRuntimeInitializerForTesting(@Nullable RuntimeInitializer runtimeInitializer2) {
        if (runtimeInitializer2 == null) {
            runtimeInitializer2 = DEFAULT_RUNTIME_INITIALIZER;
        }
        runtimeInitializer = runtimeInitializer2;
    }

    @VisibleForTesting
    public static void setWatchdogMsForTesting(long j) {
        if (j <= 0) {
            j = 150000;
        }
        watchdogMs = j;
    }

    @VisibleForTesting
    public static void tileFingerprint(@NonNull byte[] bArr, int i, @NonNull byte[] bArr2) {
        for (int i2 = 0; i2 < 16; i2++) {
            System.arraycopy(bArr, groupOffset(i2, 16, i), bArr2, i2 * 4, 4);
        }
    }

    @VisibleForTesting
    public static boolean tileSentinelsUnchanged(@NonNull byte[] bArr, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int sentinelOffset = sentinelOffset(i4, i3, i2);
            boolean z = true;
            for (int i5 = 0; i5 < TILE_SENTINEL.length && z; i5++) {
                z = bArr[sentinelOffset + i5] == sentinelByte(i5, i);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    private static InterpreterApi tryCreate(@NonNull Delegate delegate, @NonNull MappedByteBuffer mappedByteBuffer) {
        if (!isDelegateUsable(delegate)) {
            return null;
        }
        InterpreterApi create = interpreterFactory.create(delegate, mappedByteBuffer);
        if (create != null) {
            cachedDelegateKind = delegate;
        }
        return create;
    }

    @Nullable
    private static InterpreterApi tryCreateGpuInterpreter(@NonNull MappedByteBuffer mappedByteBuffer) {
        try {
            InterpreterApi create = InterpreterApi.create(mappedByteBuffer, new InterpreterApi.Options().setRuntime(InterpreterApi.Options.TfLiteRuntime.FROM_SYSTEM_ONLY).addDelegateFactory(new GpuDelegateFactory()));
            cachedDelegateKind = Delegate.GPU;
            Log.i(TAG, "NR GPU delegate interpreter built; probing");
            return create;
        } catch (LinkageError | RuntimeException e) {
            Log.w(TAG, "NR GPU delegate creation failed; falling through", e);
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_DELEGATE_GPU_FAILED);
            return null;
        }
    }

    @Nullable
    private static InterpreterApi tryCreateNnapiInterpreter(@NonNull MappedByteBuffer mappedByteBuffer) {
        NnApiDelegate nnApiDelegate;
        try {
            nnApiDelegate = new NnApiDelegate();
        } catch (LinkageError | RuntimeException e) {
            e = e;
            nnApiDelegate = null;
        }
        try {
            InterpreterApi create = InterpreterApi.create(mappedByteBuffer, new InterpreterApi.Options().setRuntime(InterpreterApi.Options.TfLiteRuntime.FROM_SYSTEM_ONLY).addDelegate(nnApiDelegate));
            cachedDelegate = nnApiDelegate;
            cachedDelegateKind = Delegate.NNAPI;
            Log.i(TAG, "NR NNAPI delegate interpreter built; probing");
            return create;
        } catch (LinkageError | RuntimeException e2) {
            e = e2;
            Log.w(TAG, "NR NNAPI delegate creation failed; falling through", e);
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.NOISE_REDUCTION_DELEGATE_NNAPI_FAILED);
            if (nnApiDelegate != null) {
                nnApiDelegate.close();
            }
            return null;
        }
    }
}
