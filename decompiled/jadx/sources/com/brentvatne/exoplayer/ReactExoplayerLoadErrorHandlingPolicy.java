package com.brentvatne.exoplayer;

import androidx.media3.datasource.HttpDataSource;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/brentvatne/exoplayer/ReactExoplayerLoadErrorHandlingPolicy;", "Landroidx/media3/exoplayer/upstream/DefaultLoadErrorHandlingPolicy;", "minLoadRetryCount", "", "<init>", "(I)V", "getRetryDelayMsFor", "", "loadErrorInfo", "Landroidx/media3/exoplayer/upstream/LoadErrorHandlingPolicy$LoadErrorInfo;", "getMinimumLoadableRetryCount", "dataType", "react-native-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReactExoplayerLoadErrorHandlingPolicy extends DefaultLoadErrorHandlingPolicy {
    private final int minLoadRetryCount;

    public ReactExoplayerLoadErrorHandlingPolicy(int i) {
        super(i);
        this.minLoadRetryCount = i;
    }

    @Override // androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public int getMinimumLoadableRetryCount(int dataType) {
        return Integer.MAX_VALUE;
    }

    @Override // androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public long getRetryDelayMsFor(@NotNull LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        loadErrorInfo.getClass();
        String message = loadErrorInfo.exception.getMessage();
        if ((loadErrorInfo.exception instanceof HttpDataSource.HttpDataSourceException) && message != null && (Intrinsics.areEqual(message, "Unable to connect") || Intrinsics.areEqual(message, "Software caused connection abort"))) {
            return 1000L;
        }
        if (loadErrorInfo.errorCount < this.minLoadRetryCount) {
            return Math.min((r5 - 1) * 1000, 5000L);
        }
        return -9223372036854775807L;
    }
}
