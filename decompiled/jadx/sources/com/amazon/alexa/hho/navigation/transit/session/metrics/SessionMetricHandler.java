package com.amazon.alexa.hho.navigation.transit.session.metrics;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.hho.metrics.HHOMetricsConstants;
import com.amazon.alexa.hho.metrics.HHOMetricsService;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003J\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/session/metrics/SessionMetricHandler;", "", "transitSessionId", "", "metrics", "Lcom/amazon/alexa/hho/metrics/HHOMetricsService;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/hho/metrics/HHOMetricsService;)V", "sensorMetricUpdateFrequency", "", "getSensorMetricUpdateFrequency", "()I", "setSensorMetricUpdateFrequency", "(I)V", "sensorMetricEventCount", "startMetricCollection", "", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "endMetricCollection", "sendMetricEvent", "event", "Lcom/amazon/alexa/hho/navigation/transit/session/metrics/SessionMetric;", "sendSensorEvent", "Lcom/amazon/alexa/hho/navigation/transit/session/metrics/SensorMetricEvent;", "sendEventToMobilytics", "Companion", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SessionMetricHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String TAG = "NavCA_SessionMetricHandler";

    @NotNull
    private final HHOMetricsService metrics;
    private int sensorMetricEventCount;
    private int sensorMetricUpdateFrequency;

    @NotNull
    private String transitSessionId;

    public SessionMetricHandler(@NotNull String str, @NotNull HHOMetricsService hHOMetricsService) {
        str.getClass();
        hHOMetricsService.getClass();
        this.transitSessionId = str;
        this.metrics = hHOMetricsService;
        this.sensorMetricUpdateFrequency = 1;
    }

    private final void sendEventToMobilytics(SessionMetric event) {
        if (this.transitSessionId.length() == 0) {
            return;
        }
        this.metrics.recordEventWithContentId(HHOMetricsConstants.Event.NAVIGATION_SESSION_METRIC_EVENT, HHOMetricsConstants.Component.NAVIGATION_CAPABILITY_AGENT_TRANSIT_1P_NAVIGATION, HHOMetricsConstants.Subcomponent.NAVIGATION_SESSION_METRICS, this.transitSessionId, event.getName(), event.serialize());
    }

    private final void sendSensorEvent(SensorMetricEvent event) {
        int i = this.sensorMetricEventCount + 1;
        this.sensorMetricEventCount = i;
        if (i % this.sensorMetricUpdateFrequency == 0 || Intrinsics.areEqual(event.getRejected(), Boolean.TRUE)) {
            sendEventToMobilytics(event);
        }
    }

    public final void endMetricCollection() {
        this.transitSessionId = "";
        this.sensorMetricEventCount = 0;
    }

    public final int getSensorMetricUpdateFrequency() {
        return this.sensorMetricUpdateFrequency;
    }

    public final void sendMetricEvent(@NotNull SessionMetric event) {
        event.getClass();
        if (event instanceof SensorMetricEvent) {
            sendSensorEvent((SensorMetricEvent) event);
        } else {
            sendEventToMobilytics(event);
        }
    }

    public final void setSensorMetricUpdateFrequency(int i) {
        this.sensorMetricUpdateFrequency = i;
    }

    public final void startMetricCollection(@NotNull String sessionId) {
        sessionId.getClass();
        this.transitSessionId = sessionId;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/session/metrics/SessionMetricHandler$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
