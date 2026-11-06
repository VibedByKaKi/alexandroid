package com.amazon.alexa.accessory.frames.media.transform;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.amazon.alexa.accessory.frames.media.dto.AssetInfo;
import com.amazon.alexa.accessory.frames.media.transform.ImageTransformer;
import com.amazon.alexa.accessory.frames.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class MediaTransformer {
    private static final String TAG = "MediaTransformer";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TransformOutput {

        @NonNull
        public final byte[] finalBytes;
        public final boolean geometricStageRan;

        @Nullable
        public final byte[] intermediateBytes;

        public TransformOutput(@NonNull byte[] bArr, @Nullable byte[] bArr2, boolean z) {
            this.finalBytes = bArr;
            this.intermediateBytes = bArr2;
            this.geometricStageRan = z;
        }
    }

    private MediaTransformer() {
    }

    @Nullable
    @WorkerThread
    private static ImageTransformer.ImageTransformResult transformInternal(@NonNull Context context, @NonNull byte[] bArr, @NonNull AssetInfo assetInfo) {
        if (assetInfo.isImage()) {
            Log.i(TAG, "Starting transformation for image: " + assetInfo.getAssetId());
            return new ImageTransformer(context, bArr).noiseReduce().lceEnhance(assetInfo).correctTilt().smartCrop().applyAndCapture();
        }
        Log.d(TAG, "Skipping image transformations for non-image content: " + assetInfo.getMimeType());
        return null;
    }

    @NonNull
    @WorkerThread
    public static byte[] transformMedia(@NonNull Context context, @NonNull byte[] bArr, @NonNull AssetInfo assetInfo) {
        return transformMediaWithCapture(context, bArr, assetInfo).finalBytes;
    }

    @NonNull
    @WorkerThread
    public static TransformOutput transformMediaWithCapture(@NonNull Context context, @NonNull byte[] bArr, @NonNull AssetInfo assetInfo) {
        byte[] bArr2;
        String mimeType = assetInfo.getMimeType();
        String str = TAG;
        Log.i(str, "Applying media transformations for assetId: " + assetInfo.getAssetId());
        Log.i(str, "Original image size: " + bArr.length + " bytes");
        ImageTransformer.ImageTransformResult transformInternal = transformInternal(context, bArr, assetInfo);
        String assetId = assetInfo.getAssetId();
        boolean z = false;
        if (transformInternal == null || (bArr2 = transformInternal.finalBytes) == bArr) {
            Log.i(str, "No transformation applied, using original media");
        } else {
            Log.i(str, "Transformed image size: " + bArr2.length + " bytes, MIME: image/jpeg");
            int lastIndexOf = assetId.lastIndexOf(46);
            if (lastIndexOf != -1) {
                assetId = assetId.substring(0, lastIndexOf).concat(".jpg");
                Log.i(str, "Updated display name to: ".concat(assetId));
            }
            mimeType = "image/jpeg";
            bArr = bArr2;
        }
        assetInfo.setTransformedMimeType(mimeType);
        assetInfo.setDisplayName(assetId);
        byte[] bArr3 = transformInternal != null ? transformInternal.intermediateBytes : null;
        if (transformInternal != null && transformInternal.geometricStageRan) {
            z = true;
        }
        return new TransformOutput(bArr, bArr3, z);
    }
}
