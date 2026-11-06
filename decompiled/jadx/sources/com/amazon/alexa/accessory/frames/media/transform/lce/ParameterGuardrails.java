package com.amazon.alexa.accessory.frames.media.transform.lce;

import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.frames.media.transform.lce.LceConfig;
import com.amazon.alexa.accessory.frames.media.transform.lce.TfLiteInferenceEngine;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class ParameterGuardrails {
    private static final String TAG = "LceRetoucher.Guardrails";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GuardrailResult {
        public final float compressH;
        public final float compressL;
        public final float gainH;
        public final float gainL;
        public final float meanBrightness;

        public GuardrailResult(float f, float f2, float f3, float f4, float f5) {
            this.gainL = f;
            this.gainH = f2;
            this.compressL = f3;
            this.compressH = f4;
            this.meanBrightness = f5;
        }
    }

    private ParameterGuardrails() {
    }

    public static GuardrailResult apply(@NonNull TfLiteInferenceEngine.InferenceResult inferenceResult, @NonNull Bitmap bitmap, @NonNull LceConfig lceConfig, int i, boolean z, @Nullable Float f) {
        float f2;
        float clamp = clamp(inferenceResult.gainL, lceConfig.getGainLMin(), lceConfig.getGainLMax());
        float clamp2 = clamp(inferenceResult.gainH, lceConfig.getGainHMin(), lceConfig.getGainHMax());
        float clamp3 = clamp(inferenceResult.compressL, lceConfig.getCompressLMin(), lceConfig.getCompressLMax());
        float clamp4 = clamp(inferenceResult.compressH, lceConfig.getCompressHMin(), lceConfig.getCompressHMax());
        Log.d(TAG, String.format("After clamping: gainL=%.2f, gainH=%.2f, compressL=%.2f, compressH=%.2f", Float.valueOf(clamp), Float.valueOf(clamp2), Float.valueOf(clamp3), Float.valueOf(clamp4)));
        float floatValue = f != null ? f.floatValue() : computeMeanBrightness(bitmap, lceConfig);
        Log.d(TAG, String.format("Mean brightness: %.4f [%s]", Float.valueOf(floatValue), f != null ? OptionalModuleUtils.FACE : "image"));
        LceConfig.RetoucherZoneParams paramsForIso = LceConfig.paramsForIso(i, z);
        if (floatValue > paramsForIso.threshold) {
            float computeFaceBasedLimit = computeFaceBasedLimit(floatValue, paramsForIso);
            if (computeFaceBasedLimit < clamp3) {
                float max = Math.max(computeFaceBasedLimit, lceConfig.getCompressLMin());
                Log.i(TAG, String.format("Brightness limiter reduced compressL: %.2f -> %.2f (brightness=%.4f, zone=%s, iso=%d)", Float.valueOf(clamp3), Float.valueOf(max), Float.valueOf(floatValue), paramsForIso.label, Integer.valueOf(i)));
                f2 = max;
                return new GuardrailResult(clamp, clamp2, f2, clamp4, floatValue);
            }
        }
        f2 = clamp3;
        return new GuardrailResult(clamp, clamp2, f2, clamp4, floatValue);
    }

    @VisibleForTesting
    public static float clamp(float f, float f2, float f3) {
        return Float.isNaN(f) ? f2 : Math.max(f2, Math.min(f3, f));
    }

    @VisibleForTesting
    public static float computeFaceBasedLimit(float f, @NonNull LceConfig.RetoucherZoneParams retoucherZoneParams) {
        if (f < retoucherZoneParams.threshold) {
            return retoucherZoneParams.lceScale;
        }
        return (float) (retoucherZoneParams.lceScale / Math.pow((f - r0) + 1.0d, retoucherZoneParams.gamma));
    }

    @VisibleForTesting
    public static float computeMeanBrightness(@NonNull Bitmap bitmap, @NonNull LceConfig lceConfig) {
        int brightnessDownsampleSize = lceConfig.getBrightnessDownsampleSize();
        Bitmap createScaledBitmap = (bitmap.getWidth() > brightnessDownsampleSize || bitmap.getHeight() > brightnessDownsampleSize) ? Bitmap.createScaledBitmap(bitmap, brightnessDownsampleSize, brightnessDownsampleSize, true) : bitmap;
        try {
            int width = createScaledBitmap.getWidth();
            int height = createScaledBitmap.getHeight();
            int i = width * height;
            int[] iArr = new int[i];
            createScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            double d = 0.0d;
            double d2 = 0.0d;
            double d3 = 0.0d;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = iArr[i2];
                d += Color.red(i3);
                d2 += Color.green(i3);
                d3 += Color.blue(i3);
            }
            double d4 = i * 255.0d;
            float f = ((((float) (d / d4)) + ((float) (d2 / d4))) + ((float) (d3 / d4))) / 3.0f;
            if (createScaledBitmap != bitmap && !createScaledBitmap.isRecycled()) {
                createScaledBitmap.recycle();
            }
            return f;
        } finally {
        }
    }

    @NonNull
    public static GuardrailResult apply(@NonNull TfLiteInferenceEngine.InferenceResult inferenceResult, @NonNull Bitmap bitmap, @NonNull LceConfig lceConfig, int i, boolean z) {
        return apply(inferenceResult, bitmap, lceConfig, i, z, null);
    }

    @NonNull
    public static GuardrailResult apply(@NonNull TfLiteInferenceEngine.InferenceResult inferenceResult, @NonNull Bitmap bitmap, @NonNull LceConfig lceConfig, int i) {
        return apply(inferenceResult, bitmap, lceConfig, i, false);
    }
}
