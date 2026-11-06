package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
class DefaultCloseableStaticBitmap extends BaseCloseableStaticBitmap {
    private static final String TAG = "DefaultCloseableStaticBitmap";

    public DefaultCloseableStaticBitmap(CloseableReference<Bitmap> closeableReference, QualityInfo qualityInfo, int i, int i2) {
        super(closeableReference, qualityInfo, i, i2);
    }

    public void finalize() throws Throwable {
        if (getClosed()) {
            return;
        }
        FLog.w(TAG, "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public DefaultCloseableStaticBitmap(Bitmap bitmap, ResourceReleaser<Bitmap> resourceReleaser, QualityInfo qualityInfo, int i, int i2) {
        super(bitmap, resourceReleaser, qualityInfo, i, i2);
    }
}
