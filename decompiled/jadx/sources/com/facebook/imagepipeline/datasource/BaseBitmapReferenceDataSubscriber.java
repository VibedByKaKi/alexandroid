package com.facebook.imagepipeline.datasource;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.BaseDataSubscriber;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public abstract class BaseBitmapReferenceDataSubscriber extends BaseDataSubscriber<CloseableReference<CloseableImage>> {
    public abstract void onNewResultImpl(@Nullable CloseableReference<Bitmap> closeableReference);

    @Override // com.facebook.datasource.BaseDataSubscriber
    public void onNewResultImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
        if (dataSource.isFinished()) {
            CloseableReference<CloseableImage> result = dataSource.getResult();
            CloseableReference<Bitmap> cloneUnderlyingBitmapReference = (result == null || !(result.get() instanceof CloseableStaticBitmap)) ? null : ((CloseableStaticBitmap) result.get()).cloneUnderlyingBitmapReference();
            try {
                onNewResultImpl(cloneUnderlyingBitmapReference);
            } finally {
                CloseableReference.closeSafely(cloneUnderlyingBitmapReference);
                CloseableReference.closeSafely(result);
            }
        }
    }
}
