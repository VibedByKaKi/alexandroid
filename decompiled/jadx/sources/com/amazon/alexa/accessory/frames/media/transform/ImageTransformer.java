package com.amazon.alexa.accessory.frames.media.transform;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.amazon.alexa.accessory.frames.media.dto.AssetInfo;
import com.amazon.alexa.accessory.frames.media.transform.ImageNoiseReducer;
import com.amazon.alexa.accessory.frames.media.transform.lce.LceRetoucherProcessor;
import com.amazon.alexa.accessory.frames.metrics.MetricsRecorder;
import com.amazon.alexa.accessory.frames.metrics.media.MediaImportMetricsConstants;
import com.amazon.alexa.accessory.frames.provider.FeatureChecker;
import com.amazon.alexa.accessory.frames.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class ImageTransformer {
    private static final String TAG = "ImageTransformer";
    private AssetInfo assetInfo;
    private final Context context;
    private final byte[] imageData;
    private int originalHeight;
    private int originalWidth;
    private boolean shouldApplyNoiseReduction = false;
    private boolean shouldApplyTiltCorrection = false;
    private boolean shouldApplySmartCrop = false;
    private boolean shouldApplyLceEnhancement = false;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.frames.media.transform.ImageTransformer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$frames$media$transform$ImageNoiseReducer$Outcome;

        static {
            int[] iArr = new int[ImageNoiseReducer.Outcome.values().length];
            $SwitchMap$com$amazon$alexa$accessory$frames$media$transform$ImageNoiseReducer$Outcome = iArr;
            try {
                iArr[ImageNoiseReducer.Outcome.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$frames$media$transform$ImageNoiseReducer$Outcome[ImageNoiseReducer.Outcome.SKIPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$frames$media$transform$ImageNoiseReducer$Outcome[ImageNoiseReducer.Outcome.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ImageTransformResult {

        @NonNull
        public final byte[] finalBytes;
        public final boolean geometricStageRan;

        @Nullable
        public final byte[] intermediateBytes;

        public ImageTransformResult(@NonNull byte[] bArr, @Nullable byte[] bArr2, boolean z) {
            this.finalBytes = bArr;
            this.intermediateBytes = bArr2;
            this.geometricStageRan = z;
        }
    }

    public ImageTransformer(@NonNull Context context, @NonNull byte[] bArr) {
        this.context = context.getApplicationContext();
        this.imageData = bArr;
    }

    @NonNull
    @WorkerThread
    public byte[] apply() {
        return applyAndCapture().finalBytes;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b7  */
    @androidx.annotation.NonNull
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.amazon.alexa.accessory.frames.media.transform.ImageTransformer.ImageTransformResult applyAndCapture() {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.accessory.frames.media.transform.ImageTransformer.applyAndCapture():com.amazon.alexa.accessory.frames.media.transform.ImageTransformer$ImageTransformResult");
    }

    @NonNull
    public ImageTransformer correctTilt() {
        this.shouldApplyTiltCorrection = true;
        return this;
    }

    @NonNull
    public ImageTransformer lceEnhance(@NonNull AssetInfo assetInfo) {
        if (!FeatureChecker.hasMediaLceEnhancementAccess()) {
            Log.d(TAG, "LCE enhancement feature gate disabled");
            MetricsRecorder.getInstance().recordCounter(MediaImportMetricsConstants.LCE_SKIP_FEATURE_GATE_DISABLED);
            return this;
        }
        this.shouldApplyLceEnhancement = true;
        this.assetInfo = assetInfo;
        LceRetoucherProcessor.init(this.context);
        Log.i(TAG, "LCE enhancement enabled via feature gate");
        return this;
    }

    @NonNull
    public ImageTransformer noiseReduce() {
        if (FeatureChecker.hasMediaNoiseReductionAccess()) {
            this.shouldApplyNoiseReduction = true;
            return this;
        }
        Log.i(TAG, "Noise reduction feature gate disabled");
        return this;
    }

    @NonNull
    public ImageTransformer smartCrop() {
        this.shouldApplySmartCrop = true;
        return this;
    }
}
