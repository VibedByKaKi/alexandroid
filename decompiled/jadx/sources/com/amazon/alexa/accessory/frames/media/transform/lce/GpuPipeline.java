package com.amazon.alexa.accessory.frames.media.transform.lce;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLES31;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.R;
import com.amazon.alexa.accessory.frames.media.transform.lce.LceOutputValidator;
import com.amazon.alexa.accessory.frames.media.transform.lce.ParameterGuardrails;
import com.amazon.alexa.accessory.frames.metrics.MetricsRecorder;
import com.amazon.alexa.accessory.frames.metrics.media.LceRetoucherError;
import com.amazon.alexa.accessory.frames.metrics.media.MediaImportMetricsConstants;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.amazon.alexa.mobilytics.configuration.DefaultRecordChecker;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.commscore.metrics.MetricKeys;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class GpuPipeline {
    private static final boolean DEBUG_PER_PASS_GL_ERROR_CHECK = false;
    private static final long FULL_LAYOUT_STORAGE_BLOCK_BYTES = 201326592;
    static final String LAYOUT_DOES_NOT_FIT = "layout_does_not_fit";
    static final int MAX_TILES_PER_ROW = 64;
    private static final int MIN_REQUIRED_INVOCATIONS = 256;
    private static final int MIN_REQUIRED_STORAGE_BINDINGS = 14;
    private static final int MIN_REQUIRED_STORAGE_BINDINGS_FAST_GF = 15;
    private static final long MIN_REQUIRED_STORAGE_BLOCK_BYTES = 50331648;
    private static final int SAMPLES_PER_TILE = 32;
    private static final String TAG = "LceRetoucher.GpuPipeline";
    private static final int TILE_GRID = 4;
    private static final double UNIFORM_OUTPUT_THRESHOLD = 1.0d;
    private static volatile Boolean cachedGpuSupportedResult;
    private static volatile long cachedProbeDurationMs;
    private static volatile String lastKnownRenderer;
    private static volatile long storageBlockLimitOverrideBytes;
    private boolean fastGfSupported;
    private volatile long heldPoolBytes;
    private boolean initialized;
    private long maxStorageBlockBytes;
    private GpuResourcePool pool;
    private int progArgbPack;
    private int progArgbUnpack;
    private int progColorConvert;
    private int progCumsumH;
    private int progCumsumHAb;
    private int progCumsumHAbPhase2;
    private int progCumsumHLowres;
    private int progCumsumHPhase2;
    private int progCumsumV;
    private int progCumsumVAb;
    private int progDownsampleY;
    private int progGfCoefficients;
    private int progGfOutput;
    private int progGfOutputFast;
    private int progToneLceInlineLinear;
    private int progToneLceOutput;
    private static final AtomicBoolean GPU_INFO_LOGGED = new AtomicBoolean(false);
    private static volatile int probedStorageBindings = -1;
    private static volatile long probedStorageBlockBytes = -1;
    private final EglContextManager eglContext = new EglContextManager();
    private final List<Integer> shaderPrograms = new ArrayList();
    private String commonShaderSource = "";
    private PrecisionMode activePrecisionMode = PrecisionMode.F32;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface JpegEncoder {
        @Nullable
        byte[] encode() throws Exception;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum PrecisionMode {
        F32,
        F16
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ShaderCompilationException extends RuntimeException {

        @NonNull
        final String shaderInfoLog;

        public ShaderCompilationException(@NonNull String str, @NonNull String str2) {
            super(str);
            this.shaderInfoLog = str2;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StorageLayout {
        final boolean inlineLinear;
        final int subsample;

        public StorageLayout(int i, boolean z) {
            this.subsample = i;
            this.inlineLinear = z;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public static final class TileVarianceResult {
        final double maxTileVariance;
        final double meanTileVariance;
        final int minTileIndex;
        final double minTileVariance;
        final int tileCount;
        final int tilesEvaluated;
        final int totalSamples;

        public TileVarianceResult(int i, int i2, int i3, double d, double d2, double d3, int i4) {
            this.tileCount = i;
            this.tilesEvaluated = i2;
            this.totalSamples = i3;
            this.minTileVariance = d;
            this.maxTileVariance = d2;
            this.meanTileVariance = d3;
            this.minTileIndex = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (guidedFilterBufferBytes(r8, r9, r11) > r15) goto L22;
     */
    @androidx.annotation.Nullable
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.alexa.accessory.frames.media.transform.lce.GpuPipeline.StorageLayout chooseStorageLayout(int r8, int r9, boolean r10, int r11, boolean r12, int r13, boolean r14, long r15) {
        /*
            long r0 = (long) r8
            long r2 = (long) r9
            long r0 = r0 * r2
            if (r10 == 0) goto L8
            r2 = 8
            goto La
        L8:
            r2 = 16
        La:
            r4 = 4
            if (r10 == 0) goto L11
            r6 = 2
            goto L12
        L11:
            r6 = r4
        L12:
            long r4 = r4 * r0
            int r10 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            r4 = 0
            if (r10 > 0) goto L4f
            long r6 = r6 * r0
            int r10 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r10 <= 0) goto L1e
            goto L4f
        L1e:
            r10 = 1
            int r11 = java.lang.Math.max(r10, r11)
            long r5 = guidedFilterBufferBytes(r8, r9, r11)
            int r5 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r5 <= 0) goto L3d
            if (r11 != r10) goto L3c
            if (r12 != 0) goto L30
            goto L3c
        L30:
            int r11 = java.lang.Math.max(r10, r13)
            long r8 = guidedFilterBufferBytes(r8, r9, r11)
            int r8 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r8 <= 0) goto L3d
        L3c:
            return r4
        L3d:
            long r0 = r0 * r2
            int r8 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r8 <= 0) goto L43
            goto L44
        L43:
            r10 = 0
        L44:
            if (r10 == 0) goto L49
            if (r14 != 0) goto L49
            return r4
        L49:
            com.amazon.alexa.accessory.frames.media.transform.lce.GpuPipeline$StorageLayout r8 = new com.amazon.alexa.accessory.frames.media.transform.lce.GpuPipeline$StorageLayout
            r8.<init>(r11, r10)
            return r8
        L4f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.accessory.frames.media.transform.lce.GpuPipeline.chooseStorageLayout(int, int, boolean, int, boolean, int, boolean, long):com.amazon.alexa.accessory.frames.media.transform.lce.GpuPipeline$StorageLayout");
    }

    @VisibleForTesting
    public static void clearCachedGpuSupportedResult() {
        synchronized (GpuPipeline.class) {
            cachedGpuSupportedResult = null;
            cachedProbeDurationMs = 0L;
            probedStorageBindings = -1;
            probedStorageBlockBytes = -1L;
        }
    }

    private void compileAllShaders(@NonNull Resources resources, @NonNull PrecisionMode precisionMode) throws ShaderCompilationException {
        boolean usePowerVrScanShaders = usePowerVrScanShaders(safeGlGetString(7936), safeGlGetString(7937));
        Log.i(TAG, "Scan shaders: ".concat(usePowerVrScanShaders ? "PowerVR set" : "standard set"));
        this.progArgbUnpack = loadShader(resources, R.raw.lce_shader_argb_unpack, precisionMode);
        this.progColorConvert = loadShader(resources, R.raw.lce_shader_color_convert, precisionMode);
        this.progCumsumH = loadShader(resources, usePowerVrScanShaders ? R.raw.lce_shader_cumsum_h_pvr : R.raw.lce_shader_cumsum_h, precisionMode);
        this.progCumsumHPhase2 = loadShader(resources, usePowerVrScanShaders ? R.raw.lce_shader_cumsum_h_phase2_pvr : R.raw.lce_shader_cumsum_h_phase2, precisionMode);
        this.progCumsumV = loadShader(resources, R.raw.lce_shader_cumsum_v, precisionMode);
        this.progGfCoefficients = loadShader(resources, R.raw.lce_shader_guided_coeff, precisionMode);
        this.progCumsumHAb = loadShader(resources, usePowerVrScanShaders ? R.raw.lce_shader_cumsum_ab_h_pvr : R.raw.lce_shader_cumsum_ab_h, precisionMode);
        this.progCumsumHAbPhase2 = loadShader(resources, usePowerVrScanShaders ? R.raw.lce_shader_cumsum_ab_h_phase2_pvr : R.raw.lce_shader_cumsum_ab_h_phase2, precisionMode);
        this.progCumsumVAb = loadShader(resources, R.raw.lce_shader_cumsum_ab_v, precisionMode);
        this.progGfOutput = loadShader(resources, R.raw.lce_shader_guided_output, precisionMode);
        this.progToneLceOutput = loadShader(resources, R.raw.lce_shader_tone_lce, precisionMode);
        this.progArgbPack = loadShader(resources, R.raw.lce_shader_argb_pack, precisionMode);
        GLES20.glGetIntegerv(37086, new int[1], 0);
        long effectiveStorageBlockLimit = effectiveStorageBlockLimit(r3[0] & 4294967295L, storageBlockLimitOverrideBytes);
        this.maxStorageBlockBytes = effectiveStorageBlockLimit;
        this.progToneLceInlineLinear = 0;
        if (needsInlineLinearVariant(effectiveStorageBlockLimit)) {
            try {
                this.progToneLceInlineLinear = loadShader(resources, R.raw.lce_shader_tone_lce, precisionMode, "#define LCE_INLINE_LINEAR\n");
            } catch (ShaderCompilationException e) {
                Log.w(TAG, "Inline-linear tone shader failed to compile; images whose linear RGB buffer exceeds the storage-buffer limit will skip LCE", e);
            }
        }
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(37085, iArr, 0);
        boolean supportsFastGuidedFilter = supportsFastGuidedFilter(iArr[0]);
        this.fastGfSupported = supportsFastGuidedFilter;
        if (!supportsFastGuidedFilter) {
            this.progGfOutputFast = 0;
            this.progCumsumHLowres = 0;
            this.progDownsampleY = 0;
            Log.i(TAG, "Fast guided filter unsupported: GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS=" + iArr[0] + " < 15 — compiling full-resolution shaders only");
            return;
        }
        try {
            this.progDownsampleY = loadShader(resources, R.raw.lce_shader_downsample_y, precisionMode);
            this.progCumsumHLowres = loadShader(resources, usePowerVrScanShaders ? R.raw.lce_shader_cumsum_h_lowres_pvr : R.raw.lce_shader_cumsum_h_lowres, precisionMode);
            this.progGfOutputFast = loadShader(resources, R.raw.lce_shader_guided_output_fast, precisionMode);
        } catch (ShaderCompilationException e2) {
            this.progGfOutputFast = 0;
            this.progCumsumHLowres = 0;
            this.progDownsampleY = 0;
            this.fastGfSupported = false;
            Log.w(TAG, "Fast guided filter shaders failed to compile; falling back to full-resolution path", e2);
        }
    }

    @VisibleForTesting
    public static String composeShaderSource(@NonNull String str, @NonNull String str2, @NonNull PrecisionMode precisionMode, @NonNull String str3) {
        int indexOfTopLevelDirective = indexOfTopLevelDirective(str2, "#version");
        if (indexOfTopLevelDirective >= 0) {
            int indexOf = str2.indexOf(10, indexOfTopLevelDirective);
            if (indexOf < 0) {
                indexOf = str2.length();
            }
            str2 = str2.substring(0, indexOfTopLevelDirective).concat(str2.substring(indexOf));
        }
        String str4 = precisionMode == PrecisionMode.F16 ? "#define LCE_PRECISION_F16\n" : "#define LCE_PRECISION_F32\n";
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 64);
        AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, "#version 310 es\n", str4, str3, str);
        return TableInfo$$ExternalSyntheticOutline0.m('\n', str2, sb);
    }

    @VisibleForTesting
    public static TileVarianceResult computeTileVariance(@NonNull ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        double d;
        double d2;
        ByteBuffer byteBuffer2 = byteBuffer;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        int i9 = i7 * i7;
        int max = Math.max(1, i5 / i7);
        int max2 = Math.max(1, i6 / i7);
        int ceil = (int) Math.ceil(Math.sqrt(i8));
        int max3 = Math.max(1, max / Math.max(1, ceil));
        int max4 = Math.max(1, max2 / Math.max(1, ceil));
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        double d3 = 0.0d;
        double d4 = Double.POSITIVE_INFINITY;
        double d5 = Double.NEGATIVE_INFINITY;
        while (i11 < i7) {
            int i14 = 0;
            while (i14 < i7) {
                int i15 = (i11 * i7) + i14;
                int i16 = i14 * max;
                int i17 = i11 * max2;
                int i18 = i9;
                int i19 = i11;
                int i20 = i12;
                int i21 = 0;
                int i22 = 0;
                long j = 0;
                long j2 = 0;
                long j3 = 0;
                long j4 = 0;
                long j5 = 0;
                int i23 = i10;
                int i24 = max3;
                long j6 = 0;
                while (i21 < max2 && i22 < i8) {
                    int i25 = i21;
                    int i26 = 0;
                    while (i26 < max && i22 < i8) {
                        int i27 = i26;
                        int i28 = i16 + i27;
                        int i29 = i17 + i25;
                        if (i28 < i5 && i29 < i6) {
                            int m$1 = ParcelCompat$$ExternalSyntheticOutline0.m$1(i29, i5, i28, 4);
                            int i30 = byteBuffer2.get(m$1) & 255;
                            int i31 = byteBuffer2.get(m$1 + 1) & 255;
                            j2 += i30;
                            j6 += i31;
                            j += byteBuffer2.get(m$1 + 2) & 255;
                            j5 += i30 * i30;
                            j4 += i31 * i31;
                            j3 += r2 * r2;
                            i22++;
                        }
                        i26 = i27 + i24;
                        byteBuffer2 = byteBuffer;
                        i5 = i;
                        i6 = i2;
                        i8 = i4;
                    }
                    i21 = i25 + max4;
                    byteBuffer2 = byteBuffer;
                    i5 = i;
                    i6 = i2;
                    i8 = i4;
                }
                if (i22 == 0) {
                    i10 = i23;
                    i12 = i20;
                } else {
                    double d6 = i22;
                    double d7 = j2 / d6;
                    double d8 = j6 / d6;
                    double d9 = j / d6;
                    double max5 = Math.max(Math.max(0.0d, (j5 / d6) - (d7 * d7)), Math.max(Math.max(0.0d, (j4 / d6) - (d8 * d8)), Math.max(0.0d, (j3 / d6) - (d9 * d9))));
                    if (max5 < d4) {
                        d4 = max5;
                        i10 = i15;
                    } else {
                        i10 = i23;
                    }
                    if (max5 > d5) {
                        d5 = max5;
                    }
                    d3 += max5;
                    i13 += i22;
                    i12 = i20 + 1;
                }
                i14++;
                byteBuffer2 = byteBuffer;
                i5 = i;
                i6 = i2;
                i7 = i3;
                i8 = i4;
                max3 = i24;
                i11 = i19;
                i9 = i18;
            }
            i11++;
            byteBuffer2 = byteBuffer;
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int i32 = i9;
        double d10 = i12 == 0 ? 0.0d : d3 / i12;
        if (i12 == 0) {
            d = Double.POSITIVE_INFINITY;
            d2 = Double.NEGATIVE_INFINITY;
        } else {
            d = d4;
            d2 = d5;
        }
        return new TileVarianceResult(i32, i12, i13, d, d2, d10, i10);
    }

    private void dispatch(int i, @NonNull Runnable runnable, int i2, int i3, int i4) {
        GLES20.glUseProgram(i);
        runnable.run();
        GLES31.glDispatchCompute(i2, i3, i4);
        GLES31.glMemoryBarrier(8224);
    }

    private static boolean doFullProbe(@NonNull Context context) {
        EGLDisplay eglGetDisplay;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        ConfigurationInfo deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo();
        if (deviceConfigurationInfo.reqGlEsVersion < 196609) {
            Log.w(TAG, "GLES version too low: 0x" + Integer.toHexString(deviceConfigurationInfo.reqGlEsVersion));
            return false;
        }
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        try {
            try {
                eglGetDisplay = EGL14.eglGetDisplay(0);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            EGLDisplay eGLDisplay2 = EGL14.EGL_NO_DISPLAY;
            if (eglGetDisplay == eGLDisplay2) {
                if (eglGetDisplay != eGLDisplay2) {
                    EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
                    if (eGLContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eglGetDisplay, eGLContext);
                    }
                    if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eglGetDisplay, eGLSurface);
                    }
                    EGL14.eglTerminate(eglGetDisplay);
                }
                return false;
            }
            int[] iArr = new int[2];
            boolean z = true;
            if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                    if (eGLContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eglGetDisplay, eGLContext);
                    }
                    if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eglGetDisplay, eGLSurface);
                    }
                    EGL14.eglTerminate(eglGetDisplay);
                }
                return false;
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 64, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
            if (iArr2[0] == 0) {
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    EGLSurface eGLSurface4 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface4, eGLSurface4, EGL14.EGL_NO_CONTEXT);
                    if (eGLContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eglGetDisplay, eGLContext);
                    }
                    if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eglGetDisplay, eGLSurface);
                    }
                    EGL14.eglTerminate(eglGetDisplay);
                }
                return false;
            }
            EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
            if (eglCreateContext == EGL14.EGL_NO_CONTEXT) {
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    EGLSurface eGLSurface5 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface5, eGLSurface5, EGL14.EGL_NO_CONTEXT);
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
                    }
                    if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eglGetDisplay, eGLSurface);
                    }
                    EGL14.eglTerminate(eglGetDisplay);
                }
                return false;
            }
            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfigArr[0], new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface == EGL14.EGL_NO_SURFACE) {
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    EGLSurface eGLSurface6 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface6, eGLSurface6, EGL14.EGL_NO_CONTEXT);
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
                    }
                    if (eglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
                    }
                    EGL14.eglTerminate(eglGetDisplay);
                }
                return false;
            }
            if (!EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    EGLSurface eGLSurface7 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface7, eGLSurface7, EGL14.EGL_NO_CONTEXT);
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
                    }
                    if (eglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
                    }
                    EGL14.eglTerminate(eglGetDisplay);
                }
                return false;
            }
            int[] iArr3 = new int[1];
            GLES30.glGetIntegeri_v(37310, 0, iArr3, 0);
            if (iArr3[0] <= 0) {
                Log.w(TAG, "GPU caps: MAX_COMPUTE_WORK_GROUP_COUNT[0]=" + iArr3[0] + " — no compute support");
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    EGLSurface eGLSurface8 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface8, eGLSurface8, EGL14.EGL_NO_CONTEXT);
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
                    }
                    if (eglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
                    }
                    EGL14.eglTerminate(eglGetDisplay);
                }
                return false;
            }
            int[] iArr4 = new int[1];
            GLES20.glGetIntegerv(37099, iArr4, 0);
            int[] iArr5 = new int[1];
            GLES20.glGetIntegerv(37085, iArr5, 0);
            GLES20.glGetIntegerv(37086, new int[1], 0);
            long j = r7[0] & 4294967295L;
            probedStorageBindings = iArr5[0];
            probedStorageBlockBytes = j;
            int i = iArr4[0];
            boolean z2 = i >= 256;
            boolean z3 = iArr5[0] >= 14;
            boolean z4 = j >= MIN_REQUIRED_STORAGE_BLOCK_BYTES;
            if (!z2 || !z3 || !z4) {
                z = false;
            }
            Log.i(TAG, String.format("GPU caps: invocations=%d (min %d) storageBindings=%d (min %d) storageBlockSize=%d MiB (min %d MiB) → %s", Integer.valueOf(i), 256, Integer.valueOf(iArr5[0]), 14, Long.valueOf(j / 1048576), 48L, z ? MetricKeys.SUFFIX_SUCCESS : "FAIL"));
            if (!z2) {
                Log.w(TAG, "GPU caps: invocations too small (counter=MediaImport_lce_skip_gpu_invocations_too_small)");
                MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_SKIP_GPU_INVOCATIONS_TOO_SMALL);
            }
            if (!z3) {
                Log.w(TAG, "GPU caps: storage bindings too small (counter=MediaImport_lce_skip_gpu_bindings_too_small)");
                MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_SKIP_GPU_BINDINGS_TOO_SMALL);
            }
            if (!z4) {
                Log.w(TAG, "GPU caps: storage block size too small (counter=MediaImport_lce_skip_gpu_block_size_too_small)");
                MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_SKIP_GPU_BLOCK_SIZE_TOO_SMALL);
            }
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface9 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface9, eGLSurface9, EGL14.EGL_NO_CONTEXT);
                if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                    EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
                }
                if (eglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                    EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
                }
                EGL14.eglTerminate(eglGetDisplay);
            }
            return z;
        } catch (Exception e2) {
            e = e2;
            eGLDisplay = eglGetDisplay;
            Log.w(TAG, "GPU support check failed", e);
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface10 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface10, eGLSurface10, EGL14.EGL_NO_CONTEXT);
                if (eGLContext != EGL14.EGL_NO_CONTEXT) {
                    EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                }
                if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                    EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                }
                EGL14.eglTerminate(eGLDisplay);
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            eGLDisplay = eglGetDisplay;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface11 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface11, eGLSurface11, EGL14.EGL_NO_CONTEXT);
                if (eGLContext != EGL14.EGL_NO_CONTEXT) {
                    EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                }
                if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                    EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                }
                EGL14.eglTerminate(eGLDisplay);
            }
            throw th;
        }
    }

    public static int effectiveRequestedSubsample(int i, boolean z) {
        int max = Math.max(1, i);
        if (max <= 1 || z) {
            return max;
        }
        return 1;
    }

    @VisibleForTesting
    public static long effectiveStorageBlockLimit(long j, long j2) {
        if (j2 <= 0 || j2 >= j) {
            return j;
        }
        StringBuilder m = a$$ExternalSyntheticOutline0.m("Storage-buffer limit capped for testing: ", j, " -> ");
        m.append(j2);
        m.append(" B");
        Log.i(TAG, m.toString());
        return j2;
    }

    @Nullable
    public static String getLastKnownRenderer() {
        return lastKnownRenderer;
    }

    public static int getProbedStorageBindings() {
        return probedStorageBindings;
    }

    public static long getProbedStorageBlockBytes() {
        long j = probedStorageBlockBytes;
        return j < 0 ? j : effectiveStorageBlockLimit(j, storageBlockLimitOverrideBytes);
    }

    @VisibleForTesting
    public static long getStorageBlockLimitOverrideForTesting() {
        return storageBlockLimitOverrideBytes;
    }

    private static long guidedFilterBufferBytes(int i, int i2, int i3) {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m$1(i, i3, 1, i3) * AppLaunchChecker$$ExternalSyntheticOutline0.m$1(i2, i3, 1, i3) * 16;
    }

    private static int indexOfTopLevelDirective(@NonNull String str, @NonNull String str2) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            while (i < length && (str.charAt(i) == ' ' || str.charAt(i) == '\t')) {
                i++;
            }
            if (i >= length) {
                return -1;
            }
            int i2 = i + 1;
            if (i2 < length && str.charAt(i) == '/' && str.charAt(i2) == '/') {
                int indexOf = str.indexOf(10, i);
                if (indexOf < 0) {
                    return -1;
                }
                i = indexOf + 1;
            } else {
                if (str.charAt(i) != '\n' && str.charAt(i) != '\r') {
                    if (str.startsWith(str2, i)) {
                        return i;
                    }
                    return -1;
                }
                i = i2;
            }
        }
        return -1;
    }

    public static boolean isGpuSupported(@NonNull Context context) {
        boolean z;
        Boolean bool = cachedGpuSupportedResult;
        if (bool != null) {
            Log.d(TAG, "isGpuSupported: returning cached=" + bool);
            return bool.booleanValue();
        }
        synchronized (GpuPipeline.class) {
            try {
                Boolean bool2 = cachedGpuSupportedResult;
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                long nanoTime = System.nanoTime();
                try {
                    z = doFullProbe(context);
                } catch (Exception e) {
                    Log.w(TAG, "GPU support probe threw — caching as false", e);
                    z = false;
                }
                cachedProbeDurationMs = (System.nanoTime() - nanoTime) / 1000000;
                cachedGpuSupportedResult = Boolean.valueOf(z);
                Log.i(TAG, String.format("isGpuSupported: cached=%b (first call did probe in %d ms)", Boolean.valueOf(z), Long.valueOf(cachedProbeDurationMs)));
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$0(int i, int i2) {
        GLES31.glBindImageTexture(0, this.pool.inputTex, 0, false, 0, 35001, 34836);
        GLES30.glBindBufferBase(37074, 10, this.pool.uploadBuf);
        GLES20.glUniform2i(0, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$1(int i, int i2) {
        GLES31.glBindImageTexture(0, this.pool.inputTex, 0, false, 0, 35000, 34836);
        GLES30.glBindBufferBase(37074, 2, this.pool.inpLinearBuf);
        GLES20.glUniform2i(0, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$10(int i, int i2, int i3, int i4, int i5) {
        GLES31.glBindImageTexture(0, this.pool.inputTex, 0, false, 0, 35000, 34836);
        GLES30.glBindBufferBase(37074, 14, this.pool.yLowBuf);
        GLES20.glUniform2i(0, i, i2);
        GLES20.glUniform2i(1, i3, i4);
        GLES20.glUniform1i(2, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$11(int i, int i2, int i3) {
        GLES30.glBindBufferBase(37074, 14, this.pool.yLowBuf);
        GLES30.glBindBufferBase(37074, 3, this.pool.sharedBufA);
        GLES30.glBindBufferBase(37074, 12, this.pool.tileSumsBuf);
        GLES20.glUniform2i(0, i, i2);
        GLES20.glUniform1i(1, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$12(int i, int i2, int i3) {
        GLES30.glBindBufferBase(37074, 3, this.pool.sharedBufA);
        GLES30.glBindBufferBase(37074, 12, this.pool.tileSumsBuf);
        GLES20.glUniform2i(0, i, i2);
        GLES20.glUniform1i(1, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$13(int i, int i2, int i3) {
        GLES30.glBindBufferBase(37074, 3, this.pool.sharedBufA);
        GLES30.glBindBufferBase(37074, 4, this.pool.sharedBufB);
        GLES20.glUniform2i(0, i, i2);
        GLES20.glUniform1i(1, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$14(int i, int i2) {
        GLES30.glBindBufferBase(37074, 4, this.pool.sharedBufB);
        GLES30.glBindBufferBase(37074, 5, this.pool.abBuf);
        GLES20.glUniform2i(0, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$15(int i, int i2, int i3) {
        GLES30.glBindBufferBase(37074, 5, this.pool.abBuf);
        GLES30.glBindBufferBase(37074, 6, this.pool.sharedBufA);
        GLES30.glBindBufferBase(37074, 13, this.pool.tileSumsAbBuf);
        GLES20.glUniform2i(0, i, i2);
        GLES20.glUniform1i(1, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$16(int i, int i2, int i3) {
        GLES30.glBindBufferBase(37074, 6, this.pool.sharedBufA);
        GLES30.glBindBufferBase(37074, 13, this.pool.tileSumsAbBuf);
        GLES20.glUniform2i(0, i, i2);
        GLES20.glUniform1i(1, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$17(int i, int i2, int i3) {
        GLES30.glBindBufferBase(37074, 6, this.pool.sharedBufA);
        GLES30.glBindBufferBase(37074, 7, this.pool.sharedBufC);
        GLES20.glUniform2i(0, i, i2);
        GLES20.glUniform1i(1, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$18(int i, int i2, int i3, int i4, int i5) {
        GLES31.glBindImageTexture(0, this.pool.inputTex, 0, false, 0, 35000, 34836);
        GLES30.glBindBufferBase(37074, 7, this.pool.sharedBufC);
        GLES30.glBindBufferBase(37074, 8, this.pool.lpfBuf);
        GLES20.glUniform2i(0, i, i2);
        GLES20.glUniform2i(1, i3, i4);
        GLES20.glUniform1i(2, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$19(boolean z, int i, int i2, ParameterGuardrails.GuardrailResult guardrailResult, LceConfig lceConfig) {
        GLES31.glBindImageTexture(0, this.pool.inputTex, 0, false, 0, 35000, 34836);
        if (!z) {
            GLES30.glBindBufferBase(37074, 2, this.pool.inpLinearBuf);
        }
        GLES30.glBindBufferBase(37074, 8, this.pool.lpfBuf);
        GLES31.glBindImageTexture(9, this.pool.outputTex, 0, false, 0, 35001, 32856);
        GLES20.glUniform2i(0, i, i2);
        GLES20.glUniform1f(2, guardrailResult.gainL);
        GLES20.glUniform1f(3, guardrailResult.gainH);
        GLES20.glUniform1f(4, guardrailResult.compressL);
        GLES20.glUniform1f(5, guardrailResult.compressH);
        GLES20.glUniform1f(6, lceConfig.getHighlightRampStart());
        GLES20.glUniform1f(7, lceConfig.getHighlightRampEnd());
        GLES20.glUniform1f(8, lceConfig.getMaxHighlightGain());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$2(int i, int i2, int i3) {
        GLES31.glBindImageTexture(0, this.pool.inputTex, 0, false, 0, 35000, 34836);
        GLES30.glBindBufferBase(37074, 3, this.pool.sharedBufA);
        GLES30.glBindBufferBase(37074, 12, this.pool.tileSumsBuf);
        GLES20.glUniform2i(0, i, i2);
        GLES20.glUniform1i(1, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$20(int i, int i2) {
        GLES31.glBindImageTexture(9, this.pool.outputTex, 0, false, 0, 35000, 32856);
        GLES30.glBindBufferBase(37074, 11, this.pool.readbackBuf);
        GLES20.glUniform2i(0, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$process$21(Bitmap bitmap) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap.compress(Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream)) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$3(int i, int i2, int i3) {
        GLES30.glBindBufferBase(37074, 3, this.pool.sharedBufA);
        GLES30.glBindBufferBase(37074, 12, this.pool.tileSumsBuf);
        GLES20.glUniform2i(0, i, i2);
        GLES20.glUniform1i(1, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$4(int i, int i2, int i3) {
        GLES30.glBindBufferBase(37074, 3, this.pool.sharedBufA);
        GLES30.glBindBufferBase(37074, 4, this.pool.sharedBufB);
        GLES20.glUniform2i(0, i, i2);
        GLES20.glUniform1i(1, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$5(int i, int i2) {
        GLES30.glBindBufferBase(37074, 4, this.pool.sharedBufB);
        GLES30.glBindBufferBase(37074, 5, this.pool.abBuf);
        GLES20.glUniform2i(0, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$6(int i, int i2, int i3) {
        GLES30.glBindBufferBase(37074, 5, this.pool.abBuf);
        GLES30.glBindBufferBase(37074, 6, this.pool.sharedBufA);
        GLES30.glBindBufferBase(37074, 13, this.pool.tileSumsAbBuf);
        GLES20.glUniform2i(0, i, i2);
        GLES20.glUniform1i(1, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$7(int i, int i2, int i3) {
        GLES30.glBindBufferBase(37074, 6, this.pool.sharedBufA);
        GLES30.glBindBufferBase(37074, 13, this.pool.tileSumsAbBuf);
        GLES20.glUniform2i(0, i, i2);
        GLES20.glUniform1i(1, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$8(int i, int i2, int i3) {
        GLES30.glBindBufferBase(37074, 6, this.pool.sharedBufA);
        GLES30.glBindBufferBase(37074, 7, this.pool.sharedBufC);
        GLES20.glUniform2i(0, i, i2);
        GLES20.glUniform1i(1, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$process$9(int i, int i2) {
        GLES31.glBindImageTexture(0, this.pool.inputTex, 0, false, 0, 35000, 34836);
        GLES30.glBindBufferBase(37074, 7, this.pool.sharedBufC);
        GLES30.glBindBufferBase(37074, 8, this.pool.lpfBuf);
        GLES20.glUniform2i(0, i, i2);
    }

    private int loadShader(@NonNull Resources resources, int i, @NonNull PrecisionMode precisionMode, @NonNull String str) {
        String composeShaderSource = composeShaderSource(this.commonShaderSource, readRawResource(resources, i), precisionMode, str);
        int glCreateShader = GLES20.glCreateShader(37305);
        if (glCreateShader == 0) {
            Single$$ExternalSyntheticBUOutline0.m$2("glCreateShader failed");
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, composeShaderSource);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
            Log.e(TAG, "Shader compile failed (resId=0x" + Integer.toHexString(i) + ", mode=" + precisionMode + "). Driver log:\n" + glGetShaderInfoLog + "\nComposite source:\n" + composeShaderSource);
            GLES20.glDeleteShader(glCreateShader);
            throw new ShaderCompilationException("Shader compilation failed for resId=0x" + Integer.toHexString(i) + " (mode=" + precisionMode + MarkdownConstants.RIGHT_PARENTHESIS, glGetShaderInfoLog);
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram == 0) {
            GLES20.glDeleteShader(glCreateShader);
            Single$$ExternalSyntheticBUOutline0.m$2("glCreateProgram failed");
            return 0;
        }
        GLES20.glAttachShader(glCreateProgram, glCreateShader);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
        if (iArr2[0] != 0) {
            GLES20.glDeleteShader(glCreateShader);
            this.shaderPrograms.add(Integer.valueOf(glCreateProgram));
            return glCreateProgram;
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
        Log.e(TAG, "Shader link failed (resId=0x" + Integer.toHexString(i) + ", mode=" + precisionMode + "). Driver log:\n" + glGetProgramInfoLog);
        GLES20.glDeleteProgram(glCreateProgram);
        GLES20.glDeleteShader(glCreateShader);
        throw new ShaderCompilationException("Shader link failed for resId=0x" + Integer.toHexString(i) + " (mode=" + precisionMode + MarkdownConstants.RIGHT_PARENTHESIS, glGetProgramInfoLog);
    }

    private static void logGpuInfoOnce() {
        if (GPU_INFO_LOGGED.compareAndSet(false, true)) {
            String safeGlGetString = safeGlGetString(7936);
            String safeGlGetString2 = safeGlGetString(7937);
            String safeGlGetString3 = safeGlGetString(7938);
            String safeGlGetString4 = safeGlGetString(35724);
            int[] iArr = new int[1];
            try {
                GLES20.glGetIntegerv(37086, iArr, 0);
            } catch (Exception unused) {
                iArr[0] = -1;
            }
            lastKnownRenderer = safeGlGetString2;
            Log.i(TAG, String.format("GPU info: vendor=%s renderer=%s version=%s glslVersion=%s maxSsboSize=%dB", safeGlGetString, safeGlGetString2, safeGlGetString3, safeGlGetString4, Integer.valueOf(iArr[0])));
        }
    }

    @VisibleForTesting
    public static boolean needsInlineLinearVariant(long j) {
        return j < FULL_LAYOUT_STORAGE_BLOCK_BYTES;
    }

    private static String readRawResource(@NonNull Resources resources, int i) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resources.openRawResource(i), StandardCharsets.UTF_8));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        String sb2 = sb.toString();
                        bufferedReader.close();
                        return sb2;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
            } finally {
            }
        } catch (Exception e) {
            Single$$ExternalSyntheticBUOutline0.m$1(DoubleList$$ExternalSyntheticOutline0.m(i, new StringBuilder("Failed to read raw resource id=0x")), e);
            return null;
        }
    }

    @Nullable
    @VisibleForTesting
    public static String recordValidation(@NonNull LceOutputValidator.Result result) {
        Throwable th = result.error;
        if (th != null) {
            Log.e(TAG, "LCE output validator threw — rejecting GPU output, falling back to original image", th);
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_OUTPUT_SANITY_CHECK_ERROR);
            return "Output validator threw: " + result.error;
        }
        if (result.passed()) {
            Log.d(TAG, "LCE output passed photo-integrity check: " + result.stats);
            return null;
        }
        Log.e(TAG, "LCE output failed photo-integrity check, falling back to original image: " + LceOutputValidator.describe(result));
        for (String str : result.reasons) {
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_OUTPUT_SANITY_CHECK_FAILED_PREFIX + str);
        }
        return "Photo-integrity check failed: " + result.reasons;
    }

    private void release(boolean z) {
        try {
            try {
                if (this.eglContext.isInitialized()) {
                    this.eglContext.makeCurrent();
                }
                try {
                    GpuResourcePool gpuResourcePool = this.pool;
                    if (gpuResourcePool != null) {
                        gpuResourcePool.release();
                    }
                } catch (Exception e) {
                    Log.w(TAG, "Error releasing pool", e);
                }
                Iterator<Integer> it2 = this.shaderPrograms.iterator();
                while (it2.hasNext()) {
                    int intValue = it2.next().intValue();
                    if (intValue != 0) {
                        GLES20.glDeleteProgram(intValue);
                    }
                }
            } catch (Exception e2) {
                Log.w(TAG, "Error during release()", e2);
            }
        } finally {
            this.pool = null;
            this.heldPoolBytes = 0L;
            this.shaderPrograms.clear();
            this.eglContext.release(z);
            this.initialized = false;
            Log.i(TAG, "GPU pipeline released");
        }
    }

    private void releaseShaderProgramsInternal() {
        Iterator<Integer> it2 = this.shaderPrograms.iterator();
        while (it2.hasNext()) {
            int intValue = it2.next().intValue();
            if (intValue != 0) {
                try {
                    GLES20.glDeleteProgram(intValue);
                } catch (Exception unused) {
                }
            }
        }
        this.shaderPrograms.clear();
        this.progCumsumV = 0;
        this.progCumsumH = 0;
        this.progColorConvert = 0;
        this.progArgbUnpack = 0;
        this.progCumsumHAbPhase2 = 0;
        this.progCumsumHPhase2 = 0;
        this.progCumsumVAb = 0;
        this.progCumsumHAb = 0;
        this.progGfCoefficients = 0;
        this.progArgbPack = 0;
        this.progToneLceOutput = 0;
        this.progGfOutput = 0;
        this.progToneLceInlineLinear = 0;
        this.progGfOutputFast = 0;
        this.progCumsumHLowres = 0;
        this.progDownsampleY = 0;
        this.fastGfSupported = false;
    }

    private static String safeGlGetString(int i) {
        try {
            String glGetString = GLES20.glGetString(i);
            return glGetString == null ? DefaultRecordChecker.Regex.EMPTY : glGetString;
        } catch (Exception e) {
            return "<error:" + e.getClass().getSimpleName() + ">";
        }
    }

    @VisibleForTesting
    public static void setStorageBlockLimitOverrideForTesting(long j) {
        storageBlockLimitOverrideBytes = Math.max(0L, j);
    }

    public static boolean supportsFastGuidedFilter(int i) {
        return i >= 15;
    }

    @VisibleForTesting
    public static boolean usePowerVrScanShaders(@Nullable String str, @Nullable String str2) {
        return (str == null ? "" : str.toLowerCase(Locale.US)).contains("imagination") || (str2 != null ? str2.toLowerCase(Locale.US) : "").contains("powervr");
    }

    @NonNull
    @VisibleForTesting
    public static LceResult validateAndEncode(@NonNull LceOutputValidator.PixelSource pixelSource, @NonNull LceOutputValidator.PixelSource pixelSource2, @NonNull JpegEncoder jpegEncoder, boolean z) {
        byte[] bArr;
        String validateOutput = validateOutput(pixelSource, pixelSource2);
        if (validateOutput != null) {
            return LceResult.photoIntegrityReject(validateOutput);
        }
        MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_OUTPUT_VALIDATION_PASSED);
        try {
            bArr = jpegEncoder.encode();
        } catch (Exception e) {
            Log.e(TAG, "LCE JPEG encode threw — falling back to original image", e);
            bArr = null;
        }
        if (bArr != null && bArr.length != 0) {
            return LceResult.success(bArr, z);
        }
        Log.e(TAG, "LCE JPEG encode failed or produced no bytes — falling back to original image (counter=MediaImport_lce_enhancement_encode_failed)");
        MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_ENHANCEMENT_ENCODE_FAILED);
        return LceResult.failure(LceRetoucherError.UNEXPECTED_ERROR, "JPEG encode failed");
    }

    @Nullable
    private static String validateOutput(@NonNull LceOutputValidator.PixelSource pixelSource, @NonNull LceOutputValidator.PixelSource pixelSource2) {
        MobilyticsMetricsTimer startTimer = MetricsRecorder.getInstance().startTimer(MediaImportMetricsConstants.LCE_OUTPUT_VALIDATOR_LATENCY);
        try {
            return recordValidation(LceOutputValidator.validate(pixelSource, pixelSource2));
        } finally {
            if (startTimer != null) {
                MetricsRecorder.getInstance().recordTimer(startTimer);
            }
        }
    }

    public PrecisionMode getActivePrecisionMode() {
        return this.activePrecisionMode;
    }

    public long getHeldPoolBytes() {
        return this.heldPoolBytes;
    }

    public long getMaxStorageBlockBytes() {
        return this.maxStorageBlockBytes;
    }

    public void initialize(@NonNull Context context, @NonNull LceConfig lceConfig) {
        if (this.initialized) {
            return;
        }
        this.eglContext.initialize();
        try {
            try {
                this.eglContext.makeCurrent();
                Resources resources = context.getResources();
                this.commonShaderSource = readRawResource(resources, R.raw.lce_shader_common);
                PrecisionMode precisionMode = lceConfig.isGpuHalfPrecision() ? PrecisionMode.F16 : PrecisionMode.F32;
                try {
                    compileAllShaders(resources, precisionMode);
                    this.activePrecisionMode = precisionMode;
                } catch (ShaderCompilationException e) {
                    if (precisionMode != PrecisionMode.F16) {
                        throw e;
                    }
                    Log.e(TAG, "Precision fallback: f16 → FP32, reason=" + e.shaderInfoLog);
                    MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_PRECISION_FALLBACK_F32);
                    releaseShaderProgramsInternal();
                    PrecisionMode precisionMode2 = PrecisionMode.F32;
                    compileAllShaders(resources, precisionMode2);
                    this.activePrecisionMode = precisionMode2;
                }
                Log.i(TAG, "Precision mode: " + this.activePrecisionMode + " (requested=" + precisionMode + ", defaultFromConfig=" + (lceConfig.isGpuHalfPrecision() ? "F16" : "F32") + MarkdownConstants.RIGHT_PARENTHESIS);
                this.initialized = true;
                Log.i(TAG, "GPU pipeline initialized: 12 shaders compiled");
                if (this.eglContext.isInitialized()) {
                    this.eglContext.releaseCurrent();
                }
            } catch (Exception e2) {
                release();
                throw e2;
            }
        } catch (Throwable th) {
            if (this.eglContext.isInitialized()) {
                this.eglContext.releaseCurrent();
            }
            throw th;
        }
    }

    public boolean isFastGuidedFilterSupported() {
        return this.fastGfSupported;
    }

    public boolean isHalfPrecisionActive() {
        return this.activePrecisionMode == PrecisionMode.F16;
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    public boolean isInlineLinearAvailable() {
        return this.progToneLceInlineLinear != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0801 A[Catch: all -> 0x0613, Exception -> 0x0805, TRY_LEAVE, TryCatch #25 {Exception -> 0x0805, blocks: (B:243:0x07fd, B:245:0x0801), top: B:242:0x07fd, outer: #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x082e A[Catch: all -> 0x0613, Exception -> 0x0832, TRY_LEAVE, TryCatch #4 {Exception -> 0x0832, blocks: (B:259:0x082a, B:261:0x082e), top: B:258:0x082a, outer: #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x07df A[Catch: all -> 0x0613, OutOfMemoryError -> 0x0616, Exception -> 0x0629, TryCatch #0 {Exception -> 0x0629, blocks: (B:103:0x0620, B:109:0x061c, B:125:0x0690, B:130:0x068c, B:142:0x06d9, B:145:0x06e1, B:151:0x06d5, B:160:0x0701, B:171:0x075f, B:172:0x0762, B:175:0x075b, B:204:0x0746, B:216:0x0765, B:218:0x0771, B:220:0x0776, B:224:0x0780, B:228:0x079d, B:232:0x0779, B:280:0x07c0, B:281:0x07de, B:282:0x07df, B:283:0x07f7), top: B:39:0x0238 }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x023a A[Catch: all -> 0x00b7, Exception -> 0x00bb, OutOfMemoryError -> 0x00c0, TryCatch #23 {Exception -> 0x00bb, OutOfMemoryError -> 0x00c0, all -> 0x00b7, blocks: (B:8:0x0052, B:11:0x0067, B:13:0x00b0, B:14:0x00c5, B:17:0x00d0, B:19:0x00ee, B:22:0x0128, B:24:0x012c, B:26:0x0162, B:28:0x016a, B:31:0x018b, B:33:0x0191, B:34:0x0194, B:35:0x01b6, B:38:0x01bf, B:41:0x023a, B:43:0x025f, B:46:0x0274, B:48:0x027a, B:53:0x02bc, B:57:0x0311, B:59:0x0460, B:61:0x0467, B:64:0x04b2, B:67:0x04f9, B:71:0x051b, B:75:0x0531, B:235:0x0464, B:274:0x033c, B:275:0x0356, B:276:0x0357, B:278:0x035d, B:289:0x0130), top: B:7:0x0052 }] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.amazon.alexa.accessory.frames.media.transform.lce.GpuPipeline] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [com.amazon.alexa.accessory.frames.media.transform.lce.GpuPipeline] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [int] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.amazon.alexa.accessory.frames.media.transform.lce.LceResult process(@androidx.annotation.NonNull android.graphics.Bitmap r40, @androidx.annotation.NonNull final com.amazon.alexa.accessory.frames.media.transform.lce.ParameterGuardrails.GuardrailResult r41, @androidx.annotation.NonNull final com.amazon.alexa.accessory.frames.media.transform.lce.LceConfig r42, int r43) {
        /*
            Method dump skipped, instructions count: 2136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.accessory.frames.media.transform.lce.GpuPipeline.process(android.graphics.Bitmap, com.amazon.alexa.accessory.frames.media.transform.lce.ParameterGuardrails$GuardrailResult, com.amazon.alexa.accessory.frames.media.transform.lce.LceConfig, int):com.amazon.alexa.accessory.frames.media.transform.lce.LceResult");
    }

    public void releaseAfterFailure() {
        release(false);
    }

    public void releasePool() {
        try {
            try {
                try {
                    if (this.eglContext.isInitialized()) {
                        this.eglContext.makeCurrent();
                        GpuResourcePool gpuResourcePool = this.pool;
                        if (gpuResourcePool != null) {
                            gpuResourcePool.release();
                        }
                    }
                    this.pool = null;
                    this.heldPoolBytes = 0L;
                    this.eglContext.releaseCurrent();
                } catch (Exception e) {
                    Log.w(TAG, "Error during releasePool()", e);
                    this.pool = null;
                    this.heldPoolBytes = 0L;
                    this.eglContext.releaseCurrent();
                }
            } catch (Exception e2) {
                Log.w(TAG, "Failed to release EGL current in releasePool", e2);
            }
        } catch (Throwable th) {
            this.pool = null;
            this.heldPoolBytes = 0L;
            try {
                this.eglContext.releaseCurrent();
            } catch (Exception e3) {
                Log.w(TAG, "Failed to release EGL current in releasePool", e3);
            }
            throw th;
        }
    }

    public void release() {
        release(true);
    }

    private int loadShader(@NonNull Resources resources, int i, @NonNull PrecisionMode precisionMode) {
        return loadShader(resources, i, precisionMode, "");
    }

    @NonNull
    public LceResult process(@NonNull Bitmap bitmap, @NonNull ParameterGuardrails.GuardrailResult guardrailResult, @NonNull LceConfig lceConfig) {
        return process(bitmap, guardrailResult, lceConfig, 1);
    }
}
