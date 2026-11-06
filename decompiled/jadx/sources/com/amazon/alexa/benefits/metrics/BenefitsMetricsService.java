package com.amazon.alexa.benefits.metrics;

import android.text.TextUtils;
import com.amazon.alexa.benefits.util.LogUtils;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import dagger.Lazy;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class BenefitsMetricsService {
    public static final String ALEXA_BENEFITS_OWNER_IDENTIFIER = "51cc9849-cfed-4442-a299-ca6143de94aa";
    private static final String TAG = "BenefitsMetricsService";
    private String callerContext = "AlexaBenefits";
    private final Lazy<EnvironmentService> environmentService;
    private final Lazy<Mobilytics> mobilytics;
    private String roleSuffix;

    @Inject
    public BenefitsMetricsService(Lazy<Mobilytics> lazy, Lazy<EnvironmentService> lazy2) {
        this.mobilytics = lazy;
        this.environmentService = lazy2;
    }

    public void finishTimer(MobilyticsMetricsTimer mobilyticsMetricsTimer) {
        if (mobilyticsMetricsTimer != null) {
            String str = TAG;
            LogUtils.i(str, String.format("Finish timer %1$s", mobilyticsMetricsTimer.getEventName()));
            mobilyticsMetricsTimer.finishTimer();
            if (this.environmentService.get().isDebugBuild()) {
                mobilyticsMetricsTimer.setEventName(mobilyticsMetricsTimer.getEventName() + ".Debug");
                LogUtils.d(str, String.format("Debug build, recording timer as %1$s", mobilyticsMetricsTimer.getEventName()));
            }
            LogUtils.i(str, String.format("Record timer %1$s", mobilyticsMetricsTimer.getEventName()));
            this.mobilytics.get().recordOperationalEvent(mobilyticsMetricsTimer);
        }
    }

    public void initializeMetricsContext(String str) {
        if (TextUtils.isEmpty(str)) {
            this.callerContext = "AlexaBenefits";
        } else {
            this.callerContext = str;
        }
    }

    public void recordCounter(String str) {
        LogUtils.i(TAG, "Recording Counter event " + str);
        MobilyticsMetricsCounter createCounter = this.mobilytics.get().createCounter(str, "AlexaBenefits", this.callerContext, "51cc9849-cfed-4442-a299-ca6143de94aa");
        createCounter.incrementCounter();
        this.mobilytics.get().recordCounter(createCounter);
    }

    public void recordOccurrence(String str, boolean z) {
        LogUtils.i(TAG, String.format("Recording occurrence %1$s %2$b", str, Boolean.valueOf(z)));
        this.mobilytics.get().recordOccurrence(str, z, "AlexaBenefits", this.callerContext, "51cc9849-cfed-4442-a299-ca6143de94aa");
    }

    public MobilyticsMetricsTimer startTimer(String str) {
        LogUtils.i(TAG, String.format("Start timer %1$s", str));
        return this.mobilytics.get().createTimer(str, "AlexaBenefits", this.callerContext, "51cc9849-cfed-4442-a299-ca6143de94aa");
    }
}
