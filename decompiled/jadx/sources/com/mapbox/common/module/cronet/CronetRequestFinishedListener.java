package com.mapbox.common.module.cronet;

import com.mapbox.common.NetworkUsageMetricsMeter;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.chromium.net.RequestFinishedInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/mapbox/common/module/cronet/CronetRequestFinishedListener;", "Lorg/chromium/net/RequestFinishedInfo$Listener;", "executor", "Ljava/util/concurrent/Executor;", "(Ljava/util/concurrent/Executor;)V", "onRequestFinished", "", "requestInfo", "Lorg/chromium/net/RequestFinishedInfo;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class CronetRequestFinishedListener extends RequestFinishedInfo.Listener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CronetRequestFinishedListener(@NotNull Executor executor) {
        super(executor);
        executor.getClass();
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public void onRequestFinished(@Nullable RequestFinishedInfo requestInfo) {
        requestInfo.getClass();
        RequestFinishedInfo.Metrics metrics = requestInfo.getMetrics();
        String url = requestInfo.getUrl();
        url.getClass();
        Long sentByteCount = metrics.getSentByteCount();
        sentByteCount.getClass();
        int longValue = (int) sentByteCount.longValue();
        Long receivedByteCount = metrics.getReceivedByteCount();
        receivedByteCount.getClass();
        NetworkUsageMetricsMeter.onBytesTransferred(url, longValue, (int) receivedByteCount.longValue());
    }
}
