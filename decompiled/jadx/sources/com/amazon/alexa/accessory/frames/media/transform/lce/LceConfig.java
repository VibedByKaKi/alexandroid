package com.amazon.alexa.accessory.frames.media.transform.lce;

import androidx.annotation.NonNull;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class LceConfig {
    private final int brightnessDownsampleSize;
    private final float compressHMax;
    private final float compressHMin;
    private final float compressLMax;
    private final float compressLMin;
    private final float faceAreaThreshold;
    private final float faceBasedLceGamma;
    private final float faceBasedLceScaleFactor;
    private final float faceBasedLceThreshold;
    private final boolean faceDetectionEnabled;
    private final float gainHMax;
    private final float gainHMin;
    private final float gainLMax;
    private final float gainLMin;
    private final boolean gpuHalfPrecision;
    private final int guidedFilterRadiusRefHeight;
    private final float guidedFilterRadiusScale;
    private final int guidedFilterSubsample;
    private final float highlightRampEnd;
    private final float highlightRampStart;
    private final float maxHighlightGain;
    private final long memoryHeadroomMarginBytes;
    private final double minResolutionMegapixels;
    private final String modelBasePath;
    private final int modelInputSize;
    private final int oomDisableFailureThreshold;
    private final int oomDisableFailureWindow;
    private final long retoucherGpuTimeoutMs;
    private static final RetoucherZoneParams ZONE_HIGH_LUX = new RetoucherZoneParams(120.0f, 8.0f, 0.1f, "high-lux");
    private static final RetoucherZoneParams ZONE_MID_LUX = new RetoucherZoneParams(200.0f, 6.0f, 0.1f, "mid-lux");
    private static final RetoucherZoneParams ZONE_MID_LOW_LUX = new RetoucherZoneParams(100.0f, 7.0f, 0.1f, "mid-low-lux");
    private static final RetoucherZoneParams ZONE_LOW_LUX = new RetoucherZoneParams(0.0f, 6.0f, 0.1f, "low-lux");
    private static final RetoucherZoneParams ZONE_HIGH_LUX_FACE = new RetoucherZoneParams(250.0f, 6.0f, 0.1f, "high-lux");
    private static final RetoucherZoneParams ZONE_MID_LUX_FACE = new RetoucherZoneParams(200.0f, 6.0f, 0.1f, "mid-lux");
    private static final RetoucherZoneParams ZONE_MID_LOW_LUX_FACE = new RetoucherZoneParams(100.0f, 7.0f, 0.1f, "mid-low-lux");
    private static final RetoucherZoneParams ZONE_LOW_LUX_FACE = new RetoucherZoneParams(0.0f, 6.0f, 0.1f, "low-lux");

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private int modelInputSize = 32;
        private float gainLMin = 1.0f;
        private float gainLMax = 255.0f;
        private float gainHMin = 1.0f;
        private float gainHMax = 25.0f;
        private float compressLMin = 1.0f;
        private float compressLMax = 767.0f;
        private float compressHMin = 1.0f;
        private float compressHMax = 32.0f;
        private float faceBasedLceGamma = 6.0f;
        private float faceBasedLceThreshold = 0.1f;
        private float faceBasedLceScaleFactor = 200.0f;
        private int brightnessDownsampleSize = 64;
        private float guidedFilterRadiusScale = 30.0f;
        private int guidedFilterRadiusRefHeight = 300;
        private boolean gpuHalfPrecision = false;
        private int guidedFilterSubsample = 1;
        private boolean faceDetectionEnabled = false;
        private float faceAreaThreshold = 0.35f;
        private float highlightRampStart = 0.08f;
        private float highlightRampEnd = 0.35f;
        private float maxHighlightGain = 1.02f;
        private long retoucherGpuTimeoutMs = 15000;
        private double minResolutionMegapixels = 8.0d;
        private long memoryHeadroomMarginBytes = LceConfigDefaults.MEMORY_HEADROOM_MARGIN_BYTES;
        private int oomDisableFailureThreshold = 3;
        private int oomDisableFailureWindow = 5;
        private String modelBasePath = LceConfigDefaults.MODEL_BASE_PATH;

        private static void validateRange(String str, float f, float f2) {
            if (f < 0.0f) {
                throw new IllegalArgumentException(str + " min must be >= 0, was: " + f);
            }
            if (f2 > f) {
                return;
            }
            throw new IllegalArgumentException(str + " max must be > min, was: max=" + f2 + ", min=" + f);
        }

        public Builder brightnessDownsampleSize(int i) {
            if (i > 0) {
                this.brightnessDownsampleSize = i;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "brightnessDownsampleSize must be > 0, was: "));
            return null;
        }

        @NonNull
        public LceConfig build() {
            return new LceConfig(this, 0);
        }

        public Builder compressHRange(float f, float f2) {
            validateRange("compressH", f, f2);
            this.compressHMin = f;
            this.compressHMax = f2;
            return this;
        }

        public Builder compressLRange(float f, float f2) {
            validateRange("compressL", f, f2);
            this.compressLMin = f;
            this.compressLMax = f2;
            return this;
        }

        public Builder faceAreaThreshold(float f) {
            if (f < 0.0f || f > 1.0f) {
                Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m("faceAreaThreshold must be in [0.0, 1.0], was: ", f));
                return null;
            }
            this.faceAreaThreshold = f;
            return this;
        }

        public Builder faceBasedLceGamma(float f) {
            if (f > 0.0f) {
                this.faceBasedLceGamma = f;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m("faceBasedLceGamma must be > 0, was: ", f));
            return null;
        }

        public Builder faceBasedLceScaleFactor(float f) {
            if (f > 0.0f) {
                this.faceBasedLceScaleFactor = f;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m("faceBasedLceScaleFactor must be > 0, was: ", f));
            return null;
        }

        public Builder faceBasedLceThreshold(float f) {
            if (f < 0.0f || f > 1.0f) {
                Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m("faceBasedLceThreshold must be in [0.0, 1.0], was: ", f));
                return null;
            }
            this.faceBasedLceThreshold = f;
            return this;
        }

        public Builder faceDetectionEnabled(boolean z) {
            this.faceDetectionEnabled = z;
            return this;
        }

        public Builder gainHRange(float f, float f2) {
            validateRange("gainH", f, f2);
            this.gainHMin = f;
            this.gainHMax = f2;
            return this;
        }

        public Builder gainLRange(float f, float f2) {
            validateRange("gainL", f, f2);
            this.gainLMin = f;
            this.gainLMax = f2;
            return this;
        }

        public Builder gpuHalfPrecision(boolean z) {
            this.gpuHalfPrecision = z;
            return this;
        }

        public Builder guidedFilterRadiusRefHeight(int i) {
            if (i > 0) {
                this.guidedFilterRadiusRefHeight = i;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "guidedFilterRadiusRefHeight must be > 0, was: "));
            return null;
        }

        public Builder guidedFilterRadiusScale(float f) {
            if (f > 0.0f) {
                this.guidedFilterRadiusScale = f;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m("guidedFilterRadiusScale must be > 0, was: ", f));
            return null;
        }

        public Builder guidedFilterSubsample(int i) {
            if (i >= 1) {
                this.guidedFilterSubsample = i;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "guidedFilterSubsample must be >= 1, was: "));
            return null;
        }

        public Builder highlightRampEnd(float f) {
            this.highlightRampEnd = f;
            return this;
        }

        public Builder highlightRampStart(float f) {
            this.highlightRampStart = f;
            return this;
        }

        public Builder maxHighlightGain(float f) {
            if (f > 0.0f) {
                this.maxHighlightGain = f;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m("maxHighlightGain must be > 0, was: ", f));
            return null;
        }

        public Builder memoryHeadroomMarginBytes(long j) {
            if (j >= 0) {
                this.memoryHeadroomMarginBytes = j;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m(j, "memoryHeadroomMarginBytes must be >= 0, was: "));
            return null;
        }

        public Builder minResolutionMegapixels(double d) {
            if (d > 0.0d) {
                this.minResolutionMegapixels = d;
                return this;
            }
            Gson$$ExternalSyntheticBUOutline0.m("minResolutionMegapixels must be > 0, was: ", d);
            return null;
        }

        public Builder modelBasePath(@NonNull String str) {
            if (str.isEmpty()) {
                Single$$ExternalSyntheticBUOutline0.m$3("modelBasePath must not be empty");
                return null;
            }
            this.modelBasePath = str;
            return this;
        }

        public Builder modelInputSize(int i) {
            if (i > 0) {
                this.modelInputSize = i;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "modelInputSize must be > 0, was: "));
            return null;
        }

        public Builder oomDisableFailureThreshold(int i) {
            if (i <= 0) {
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "oomDisableFailureThreshold must be > 0, was: "));
                return null;
            }
            if (i <= this.oomDisableFailureWindow) {
                this.oomDisableFailureThreshold = i;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(a$$ExternalSyntheticOutline0.m0m(i, "oomDisableFailureThreshold (", ") must be ≤ oomDisableFailureWindow ("), this.oomDisableFailureWindow, "). Set the window first if widening both."));
            return null;
        }

        public Builder oomDisableFailureWindow(int i) {
            if (i <= 0) {
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "oomDisableFailureWindow must be > 0, was: "));
                return null;
            }
            if (i >= this.oomDisableFailureThreshold) {
                this.oomDisableFailureWindow = i;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(a$$ExternalSyntheticOutline0.m0m(i, "oomDisableFailureWindow (", ") must be ≥ oomDisableFailureThreshold ("), this.oomDisableFailureThreshold, "). Lower the threshold first if narrowing both."));
            return null;
        }

        public Builder retoucherGpuTimeoutMs(long j) {
            if (j > 0) {
                this.retoucherGpuTimeoutMs = j;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m(j, "retoucherGpuTimeoutMs must be > 0, was: "));
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class RetoucherZoneParams {
        public final float gamma;
        public final String label;
        public final float lceScale;
        public final float threshold;

        public RetoucherZoneParams(float f, float f2, float f3, String str) {
            this.lceScale = f;
            this.gamma = f2;
            this.threshold = f3;
            this.label = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RetoucherZoneParams)) {
                return false;
            }
            RetoucherZoneParams retoucherZoneParams = (RetoucherZoneParams) obj;
            return Float.compare(this.lceScale, retoucherZoneParams.lceScale) == 0 && Float.compare(this.gamma, retoucherZoneParams.gamma) == 0 && Float.compare(this.threshold, retoucherZoneParams.threshold) == 0;
        }

        public int hashCode() {
            return Objects.hash(Float.valueOf(this.lceScale), Float.valueOf(this.gamma), Float.valueOf(this.threshold));
        }
    }

    private LceConfig(Builder builder) {
        this.modelInputSize = builder.modelInputSize;
        this.gainLMin = builder.gainLMin;
        this.gainLMax = builder.gainLMax;
        this.gainHMin = builder.gainHMin;
        this.gainHMax = builder.gainHMax;
        this.compressLMin = builder.compressLMin;
        this.compressLMax = builder.compressLMax;
        this.compressHMin = builder.compressHMin;
        this.compressHMax = builder.compressHMax;
        this.faceBasedLceGamma = builder.faceBasedLceGamma;
        this.faceBasedLceThreshold = builder.faceBasedLceThreshold;
        this.faceBasedLceScaleFactor = builder.faceBasedLceScaleFactor;
        this.brightnessDownsampleSize = builder.brightnessDownsampleSize;
        this.guidedFilterRadiusScale = builder.guidedFilterRadiusScale;
        this.guidedFilterRadiusRefHeight = builder.guidedFilterRadiusRefHeight;
        this.gpuHalfPrecision = builder.gpuHalfPrecision;
        this.guidedFilterSubsample = builder.guidedFilterSubsample;
        this.faceDetectionEnabled = builder.faceDetectionEnabled;
        this.faceAreaThreshold = builder.faceAreaThreshold;
        this.highlightRampStart = builder.highlightRampStart;
        this.highlightRampEnd = builder.highlightRampEnd;
        this.maxHighlightGain = builder.maxHighlightGain;
        this.retoucherGpuTimeoutMs = builder.retoucherGpuTimeoutMs;
        this.minResolutionMegapixels = builder.minResolutionMegapixels;
        this.memoryHeadroomMarginBytes = builder.memoryHeadroomMarginBytes;
        this.oomDisableFailureThreshold = builder.oomDisableFailureThreshold;
        this.oomDisableFailureWindow = builder.oomDisableFailureWindow;
        this.modelBasePath = builder.modelBasePath;
    }

    @NonNull
    public static LceConfig getDefault() {
        return new Builder().build();
    }

    @NonNull
    public static RetoucherZoneParams paramsForIso(int i, boolean z) {
        return i < 0 ? ZONE_MID_LUX : i <= 216 ? z ? ZONE_HIGH_LUX_FACE : ZONE_HIGH_LUX : i <= 432 ? z ? ZONE_MID_LUX_FACE : ZONE_MID_LUX : i <= 864 ? z ? ZONE_MID_LOW_LUX_FACE : ZONE_MID_LOW_LUX : z ? ZONE_LOW_LUX_FACE : ZONE_LOW_LUX;
    }

    public int getBrightnessDownsampleSize() {
        return this.brightnessDownsampleSize;
    }

    public float getCompressHMax() {
        return this.compressHMax;
    }

    public float getCompressHMin() {
        return this.compressHMin;
    }

    public float getCompressLMax() {
        return this.compressLMax;
    }

    public float getCompressLMin() {
        return this.compressLMin;
    }

    public float getFaceAreaThreshold() {
        return this.faceAreaThreshold;
    }

    public float getFaceBasedLceGamma() {
        return this.faceBasedLceGamma;
    }

    public float getFaceBasedLceScaleFactor() {
        return this.faceBasedLceScaleFactor;
    }

    public float getFaceBasedLceThreshold() {
        return this.faceBasedLceThreshold;
    }

    public float getGainHMax() {
        return this.gainHMax;
    }

    public float getGainHMin() {
        return this.gainHMin;
    }

    public float getGainLMax() {
        return this.gainLMax;
    }

    public float getGainLMin() {
        return this.gainLMin;
    }

    public int getGuidedFilterRadiusRefHeight() {
        return this.guidedFilterRadiusRefHeight;
    }

    public float getGuidedFilterRadiusScale() {
        return this.guidedFilterRadiusScale;
    }

    public int getGuidedFilterSubsample() {
        return this.guidedFilterSubsample;
    }

    public float getHighlightRampEnd() {
        return this.highlightRampEnd;
    }

    public float getHighlightRampStart() {
        return this.highlightRampStart;
    }

    public float getMaxHighlightGain() {
        return this.maxHighlightGain;
    }

    public long getMemoryHeadroomMarginBytes() {
        return this.memoryHeadroomMarginBytes;
    }

    public double getMinResolutionMegapixels() {
        return this.minResolutionMegapixels;
    }

    @NonNull
    public String getModelBasePath() {
        return this.modelBasePath;
    }

    public int getModelInputSize() {
        return this.modelInputSize;
    }

    public int getOomDisableFailureThreshold() {
        return this.oomDisableFailureThreshold;
    }

    public int getOomDisableFailureWindow() {
        return this.oomDisableFailureWindow;
    }

    public long getRetoucherGpuTimeoutMs() {
        return this.retoucherGpuTimeoutMs;
    }

    public boolean isFaceDetectionEnabled() {
        return this.faceDetectionEnabled;
    }

    public boolean isGpuHalfPrecision() {
        return this.gpuHalfPrecision;
    }

    @NonNull
    public static RetoucherZoneParams paramsForIso(int i) {
        return paramsForIso(i, false);
    }

    public /* synthetic */ LceConfig(Builder builder, int i) {
        this(builder);
    }
}
