package com.amazon.alexa.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amazon.alexa.api.AlexaMetricsName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/api/LogoutApiTimeoutHandler;", "Landroid/os/Handler;", "metricsBroadcastSender", "Lcom/amazon/alexa/api/MetricBroadcastSender;", "looper", "Landroid/os/Looper;", "(Lcom/amazon/alexa/api/MetricBroadcastSender;Landroid/os/Looper;)V", "handleMessage", "", "msg", "Landroid/os/Message;", "Companion", "AVSAndroidClient-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LogoutApiTimeoutHandler extends Handler {
    public static final int MSG_RESULT_RECEIVED = 2;
    public static final int MSG_RESULT_TIMEOUT = 1;

    @NotNull
    private final MetricBroadcastSender metricsBroadcastSender;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutApiTimeoutHandler(@NotNull MetricBroadcastSender metricBroadcastSender, @NotNull Looper looper) {
        super(looper);
        metricBroadcastSender.getClass();
        looper.getClass();
        this.metricsBroadcastSender = metricBroadcastSender;
    }

    @Override // android.os.Handler
    public void handleMessage(@NotNull Message msg) {
        msg.getClass();
        super.handleMessage(msg);
        if (msg.what == 1) {
            this.metricsBroadcastSender.sendEvent(AlexaMetricsName.AccountManager.LOGOUT_API_TIMED_OUT);
            getLooper().quitSafely();
        }
        if (msg.what == 2) {
            getLooper().quitSafely();
        }
    }
}
