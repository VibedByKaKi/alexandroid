package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public interface CloseableStaticBitmap extends CloseableBitmap {
    static CloseableStaticBitmap of(Bitmap bitmap, ResourceReleaser<Bitmap> resourceReleaser, QualityInfo qualityInfo, int i, int i2) {
        return BaseCloseableStaticBitmap.shouldUseSimpleCloseableStaticBitmap() ? new BaseCloseableStaticBitmap(bitmap, resourceReleaser, qualityInfo, i, i2) : new DefaultCloseableStaticBitmap(bitmap, resourceReleaser, qualityInfo, i, i2);
    }

    CloseableReference<Bitmap> cloneUnderlyingBitmapReference();

    CloseableReference<Bitmap> convertToBitmapReference();

    int getExifOrientation();

    int getRotationAngle();

    static CloseableStaticBitmap of(CloseableReference<Bitmap> closeableReference, QualityInfo qualityInfo, int i) {
        return of(closeableReference, qualityInfo, i, 0);
    }

    static CloseableStaticBitmap of(Bitmap bitmap, ResourceReleaser<Bitmap> resourceReleaser, QualityInfo qualityInfo, int i) {
        return of(bitmap, resourceReleaser, qualityInfo, i, 0);
    }

    static CloseableStaticBitmap of(CloseableReference<Bitmap> closeableReference, QualityInfo qualityInfo, int i, int i2) {
        if (BaseCloseableStaticBitmap.shouldUseSimpleCloseableStaticBitmap()) {
            return new BaseCloseableStaticBitmap(closeableReference, qualityInfo, i, i2);
        }
        return new DefaultCloseableStaticBitmap(closeableReference, qualityInfo, i, i2);
    }
}
