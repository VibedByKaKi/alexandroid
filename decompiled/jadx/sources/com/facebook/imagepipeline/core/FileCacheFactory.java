package com.facebook.imagepipeline.core;

import com.dee.app.metrics.MetricsConstants;
import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.cache.disk.FileCache;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/imagepipeline/core/FileCacheFactory;", "", MetricsConstants.Method.CACHE_GET, "Lcom/facebook/cache/disk/FileCache;", "diskCacheConfig", "Lcom/facebook/cache/disk/DiskCacheConfig;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FileCacheFactory {
    @NotNull
    FileCache get(@NotNull DiskCacheConfig diskCacheConfig);
}
