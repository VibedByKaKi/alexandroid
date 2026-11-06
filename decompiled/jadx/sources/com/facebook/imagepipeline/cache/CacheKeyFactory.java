package com.facebook.imagepipeline.cache;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.ImageRequest;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface CacheKeyFactory {
    CacheKey getBitmapCacheKey(ImageRequest imageRequest, @Nullable Object obj);

    CacheKey getEncodedCacheKey(ImageRequest imageRequest, Uri uri, @Nullable Object obj);

    CacheKey getEncodedCacheKey(ImageRequest imageRequest, @Nullable Object obj);

    CacheKey getPostprocessedBitmapCacheKey(ImageRequest imageRequest, @Nullable Object obj);
}
