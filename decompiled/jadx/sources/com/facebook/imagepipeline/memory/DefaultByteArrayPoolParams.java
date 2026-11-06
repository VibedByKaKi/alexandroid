package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/imagepipeline/memory/DefaultByteArrayPoolParams;", "", "<init>", "()V", "DEFAULT_IO_BUFFER_SIZE", "", "DEFAULT_BUCKET_SIZE", "MAX_SIZE_SOFT_CAP", "MAX_SIZE_HARD_CAP", MetricsConstants.Method.CACHE_GET, "Lcom/facebook/imagepipeline/memory/PoolParams;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultByteArrayPoolParams {
    private static final int DEFAULT_BUCKET_SIZE = 5;
    private static final int DEFAULT_IO_BUFFER_SIZE = 16384;

    @NotNull
    public static final DefaultByteArrayPoolParams INSTANCE = new DefaultByteArrayPoolParams();
    private static final int MAX_SIZE_HARD_CAP = 1048576;
    private static final int MAX_SIZE_SOFT_CAP = 81920;

    private DefaultByteArrayPoolParams() {
    }

    @JvmStatic
    @NotNull
    public static final PoolParams get() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(16384, 5);
        return new PoolParams(MAX_SIZE_SOFT_CAP, 1048576, sparseIntArray);
    }
}
