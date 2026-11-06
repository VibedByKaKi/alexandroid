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
public class RoundAsCirclePostprocessor extends BasePostprocessor {
    private static final boolean ENABLE_ANTI_ALIASING = true;

    @Nullable
    private CacheKey mCacheKey;
    private final boolean mEnableAntiAliasing;

    public RoundAsCirclePostprocessor(boolean z) {
        this.mEnableAntiAliasing = z;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    @Nullable
    /* renamed from: getPostprocessorCacheKey */
    public CacheKey getCacheKey() {
        if (this.mCacheKey == null) {
            if (this.mEnableAntiAliasing) {
                this.mCacheKey = new SimpleCacheKey("RoundAsCirclePostprocessor#AntiAliased");
            } else {
                this.mCacheKey = new SimpleCacheKey("RoundAsCirclePostprocessor");
            }
        }
        return this.mCacheKey;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(Bitmap bitmap) {
        NativeRoundingFilter.toCircleFast(bitmap, this.mEnableAntiAliasing);
    }

    public RoundAsCirclePostprocessor() {
        this(true);
    }
}
