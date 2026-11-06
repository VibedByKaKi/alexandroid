package com.facebook.imagepipeline.postprocessors;

import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.SimpleCacheKey;
import com.facebook.imagepipeline.nativecode.NativeRoundingFilter;
import com.facebook.imagepipeline.request.BasePostprocessor;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class RoundedCornersPostprocessor extends BasePostprocessor {

    @Nullable
    private CacheKey mCacheKey;

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    @Nullable
    /* renamed from: getPostprocessorCacheKey */
    public CacheKey getCacheKey() {
        if (this.mCacheKey == null) {
            this.mCacheKey = new SimpleCacheKey("RoundedCornersPostprocessor");
        }
        return this.mCacheKey;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(Bitmap bitmap) {
        int min = Math.min(bitmap.getHeight(), bitmap.getWidth());
        NativeRoundingFilter.addRoundedCorners(bitmap, min / 2, min / 3, min / 4, min / 5);
    }
}
