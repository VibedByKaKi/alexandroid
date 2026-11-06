package com.amazon.alexa.redesign.client;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.alexa.redesign.utils.HomeMetricsRecorder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/redesign/client/CardStudioTransportMetric;", "Lcom/amazon/alexa/redesign/client/CardStudioTransportMetricObservation;", "operation", "", "mobilytics", "Lcom/amazon/alexa/mobilytics/Mobilytics;", "timer", "Lcom/amazon/alexa/mobilytics/event/operational/MobilyticsMetricsTimer;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/mobilytics/Mobilytics;Lcom/amazon/alexa/mobilytics/event/operational/MobilyticsMetricsTimer;)V", "didFinish", "", "finish", "", "outcome", "Lcom/amazon/alexa/redesign/client/CardStudioTransportOutcome;", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class CardStudioTransportMetric implements CardStudioTransportMetricObservation {

    @NotNull
    public static final String LATENCY_METRIC = "CardStudioTransport.latency.time";

    @NotNull
    public static final String METRIC_FAMILY = "CardStudioTransport";
    private boolean didFinish;

    @NotNull
    private final Mobilytics mobilytics;

    @NotNull
    private final String operation;

    @NotNull
    private final MobilyticsMetricsTimer timer;
    public static final int $stable = 8;

    public CardStudioTransportMetric(@NotNull String str, @NotNull Mobilytics mobilytics, @NotNull MobilyticsMetricsTimer mobilyticsMetricsTimer) {
        str.getClass();
        mobilytics.getClass();
        mobilyticsMetricsTimer.getClass();
        this.operation = str;
        this.mobilytics = mobilytics;
        this.timer = mobilyticsMetricsTimer;
    }

    @Override // com.amazon.alexa.redesign.client.CardStudioTransportMetricObservation
    public void finish(@NotNull CardStudioTransportOutcome outcome) {
        outcome.getClass();
        if (this.didFinish) {
            return;
        }
        this.didFinish = true;
        try {
            MobilyticsMetricsCounter createCounter = this.mobilytics.createCounter(METRIC_FAMILY, HomeMetricsRecorder.APP_COMPONENT, this.operation + "." + outcome.getValue(), "b3d450dc-27f9-4658-8cce-2784e86f06e9");
            createCounter.getClass();
            createCounter.incrementCounterByValue(1L);
            this.mobilytics.recordCounter(createCounter);
            if (outcome == CardStudioTransportOutcome.OK) {
                this.timer.finishTimer();
                this.mobilytics.recordTimer(this.timer);
            }
        } catch (Exception unused) {
        }
    }
}
