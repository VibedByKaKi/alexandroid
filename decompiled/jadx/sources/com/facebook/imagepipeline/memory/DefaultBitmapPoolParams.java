package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import androidx.collection.SieveCacheKt;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/imagepipeline/memory/DefaultBitmapPoolParams;", "", "<init>", "()V", "MAX_SIZE_SOFT_CAP", "", "maxSizeHardCap", "getMaxSizeHardCap", "()I", "DEFAULT_BUCKETS", "Landroid/util/SparseIntArray;", MetricsConstants.Method.CACHE_GET, "Lcom/facebook/imagepipeline/memory/PoolParams;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultBitmapPoolParams {
    private static final int MAX_SIZE_SOFT_CAP = 0;

    @NotNull
    public static final DefaultBitmapPoolParams INSTANCE = new DefaultBitmapPoolParams();

    @NotNull
    private static final SparseIntArray DEFAULT_BUCKETS = new SparseIntArray(0);

    private DefaultBitmapPoolParams() {
    }

    @JvmStatic
    @NotNull
    public static final PoolParams get() {
        return new PoolParams(0, INSTANCE.getMaxSizeHardCap(), DEFAULT_BUCKETS);
    }

    private final int getMaxSizeHardCap() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), SieveCacheKt.NodeLinkMask);
        return min > 16777216 ? (min / 4) * 3 : min / 2;
    }
}
