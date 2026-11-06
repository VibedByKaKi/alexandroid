package com.amazon.alexa.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.amazon.alexa.api.AlexaMetricsName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/api/LogoutResultReceiver;", "Landroid/os/ResultReceiver;", "handler", "Landroid/os/Handler;", "broadcastSender", "Lcom/amazon/alexa/api/MetricBroadcastSender;", "(Landroid/os/Handler;Lcom/amazon/alexa/api/MetricBroadcastSender;)V", "onReceiveResult", "", "resultCode", "", "resultData", "Landroid/os/Bundle;", "Companion", "AVSAndroidClient-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LogoutResultReceiver extends ResultReceiver {
    private static final long RESULT_TIME_OUT = 3000;

    @NotNull
    private static final String TAG = "LogoutResultReceiver";

    @NotNull
    private final MetricBroadcastSender broadcastSender;

    @NotNull
    private final Handler handler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutResultReceiver(@NotNull Handler handler, @NotNull MetricBroadcastSender metricBroadcastSender) {
        super(handler);
        handler.getClass();
        metricBroadcastSender.getClass();
        this.handler = handler;
        this.broadcastSender = metricBroadcastSender;
        handler.sendEmptyMessageDelayed(1, 3000L);
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int resultCode, @NotNull Bundle resultData) {
        resultData.getClass();
        super.onReceiveResult(resultCode, resultData);
        this.handler.sendEmptyMessage(2);
        MetricBroadcastSender metricBroadcastSender = this.broadcastSender;
        if (resultCode == 0) {
            metricBroadcastSender.sendEvent(AlexaMetricsName.AccountManager.LOGOUT_API_SUCCESS);
        } else {
            metricBroadcastSender.sendEvent(AlexaMetricsName.AccountManager.LOGOUT_API_FAILURE);
        }
    }
}
