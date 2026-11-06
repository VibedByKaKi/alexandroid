package com.dee.app.metrics;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.dee.app.metrics.MetricTimeout;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MetricTimeout {
    private static final String TAG = "MetricTimeout";
    private TimeoutDescriptor firstTimeout;
    private final Handler handler = new Handler();
    private boolean hasFiredOnce = false;
    private MetricsService metricsService;
    private TimeoutDescriptor secondTimeout;
    private Timer timer;
    private Map<String, Object> timerEntries;
    private String timerName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.dee.app.metrics.MetricTimeout$1, reason: invalid class name */
    public class AnonymousClass1 extends TimerTask {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0() {
            if (MetricTimeout.this.metricsService != null) {
                MetricTimeout.this.metricsService.recordEvent(MetricTimeout.this.timerName, "Application", MetricTimeout.this.timerEntries);
            }
            String unused = MetricTimeout.this.timerName;
            boolean z = MetricTimeout.this.hasFiredOnce;
            MetricTimeout metricTimeout = MetricTimeout.this;
            if (z) {
                metricTimeout.stop();
                return;
            }
            metricTimeout.hasFiredOnce = true;
            MetricTimeout metricTimeout2 = MetricTimeout.this;
            metricTimeout2.timerName = metricTimeout2.secondTimeout.metricEvent;
            MetricTimeout metricTimeout3 = MetricTimeout.this;
            metricTimeout3.timerEntries = metricTimeout3.secondTimeout.metricEntries;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            MetricTimeout.this.handler.post(new Runnable() { // from class: com.dee.app.metrics.MetricTimeout$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MetricTimeout.AnonymousClass1.this.lambda$run$0();
                }
            });
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.dee.app.metrics.MetricTimeout$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$dee$app$metrics$MetricTimeout$Timeout;

        static {
            int[] iArr = new int[Timeout.values().length];
            $SwitchMap$com$dee$app$metrics$MetricTimeout$Timeout = iArr;
            try {
                iArr[Timeout.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$dee$app$metrics$MetricTimeout$Timeout[Timeout.SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Timeout {
        FIRST,
        SECOND
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class TimeoutDescriptor {
        Map<String, Object> metricEntries;
        String metricEvent;
        long timeout;

        public TimeoutDescriptor(String str, Map<String, Object> map, long j) {
            if (TextUtils.isEmpty(str) || j <= 0) {
                Log.wtf(MetricTimeout.TAG, Automotive$$ExternalSyntheticOutline0.m(j, "invalid timeout name: ", str, " timeout: "));
            }
            this.metricEvent = str;
            this.metricEntries = map;
            this.timeout = j;
        }
    }

    public MetricTimeout(MetricsService metricsService) {
        this.metricsService = metricsService;
    }

    public void setEventData(Timeout timeout, String str, Map<String, Object> map, int i) {
        int i2 = AnonymousClass2.$SwitchMap$com$dee$app$metrics$MetricTimeout$Timeout[timeout.ordinal()];
        TimeUnit timeUnit = TimeUnit.SECONDS;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        if (i2 == 1) {
            this.firstTimeout = new TimeoutDescriptor(str, map, timeUnit2.convert(i, timeUnit));
        } else if (i2 != 2) {
            Log.wtf(TAG, "setEventData timeout is not FIRST or SECOND");
        } else {
            this.secondTimeout = new TimeoutDescriptor(str, map, timeUnit2.convert(i, timeUnit));
        }
    }

    public void start() {
        TimeoutDescriptor timeoutDescriptor;
        stop();
        TimeoutDescriptor timeoutDescriptor2 = this.firstTimeout;
        if (timeoutDescriptor2 == null || (timeoutDescriptor = this.secondTimeout) == null || timeoutDescriptor2.timeout > timeoutDescriptor.timeout) {
            Log.wtf(TAG, "events or timeouts are not correct");
            return;
        }
        this.timerName = timeoutDescriptor2.metricEvent;
        this.timerEntries = timeoutDescriptor2.metricEntries;
        this.hasFiredOnce = false;
        this.timer = new Timer();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        Timer timer = this.timer;
        long j = this.firstTimeout.timeout;
        timer.schedule(anonymousClass1, j, this.secondTimeout.timeout - j);
    }

    public void stop() {
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
    }

    public void setEventData(Timeout timeout, String str, int i) {
        setEventData(timeout, str, null, i);
    }
}
