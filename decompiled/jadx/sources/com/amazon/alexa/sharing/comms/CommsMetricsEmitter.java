package com.amazon.alexa.sharing.comms;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.comms.log.CommsLogger;
import com.amazon.commscore.api.metrics.AlexaCommsCoreMetricsService;
import com.amazon.commscore.api.metrics.TimerMetric;
import dagger.Lazy;
import java.util.Map;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class CommsMetricsEmitter {
    private static final String FAIL_SUFFIX = ".fail";

    @Nullable
    AlexaCommsCoreMetricsService metricsService;

    @Nullable
    @Inject
    Lazy<AlexaCommsCoreMetricsService> metricsServiceLazy;
    private final String mobilyticsOwnerIdentifier = OwnerIdentifier.ALEXA_MOBILE_SHARING;
    private final String source;
    private static final String TAG = "sharing-metrics-emitter";
    private static final CommsLogger LOG = CommsLogger.getLogger(TAG, AlexaSharingClient.class);

    public CommsMetricsEmitter(@Nullable Lazy<AlexaCommsCoreMetricsService> lazy, @NonNull String str) {
        this.metricsServiceLazy = lazy;
        this.source = str;
    }

    @Nullable
    private String recordMetricByOccurrence(@NonNull String str, @NonNull Map<String, Object> map, boolean z) {
        if (getMetricService() == null) {
            return null;
        }
        this.metricsService.recordOccurrence(str, this.source, OwnerIdentifier.ALEXA_MOBILE_SHARING, z, map);
        return str;
    }

    @Nullable
    public TimerMetric createTimerMetric(@NonNull String str, @NonNull Map<String, Object> map) {
        if (getMetricService() == null) {
            return null;
        }
        return this.metricsService.createTimer(str, this.source, OwnerIdentifier.ALEXA_MOBILE_SHARING, map);
    }

    @Nullable
    @VisibleForTesting
    public AlexaCommsCoreMetricsService getMetricService() {
        AlexaCommsCoreMetricsService alexaCommsCoreMetricsService = this.metricsService;
        if (alexaCommsCoreMetricsService != null) {
            return alexaCommsCoreMetricsService;
        }
        Lazy<AlexaCommsCoreMetricsService> lazy = this.metricsServiceLazy;
        if (lazy == null) {
            LOG.e("AlexaCommsCoreMetricsServiceLazy is null");
            return null;
        }
        AlexaCommsCoreMetricsService alexaCommsCoreMetricsService2 = lazy.get();
        this.metricsService = alexaCommsCoreMetricsService2;
        if (alexaCommsCoreMetricsService2 != null) {
            return alexaCommsCoreMetricsService2;
        }
        LOG.e("AlexaCommsCoreMetricsService is null");
        return null;
    }

    @Nullable
    public String recordAPIClientFailMetric(@NonNull String str, @NonNull String str2) {
        if (getMetricService() == null) {
            return null;
        }
        String m = BitVector$$ExternalSyntheticOutline0.m(str, ".fail");
        this.metricsService.recordOccurrence(m, this.source, OwnerIdentifier.ALEXA_MOBILE_SHARING, true, Automotive$$ExternalSyntheticOutline0.m("errorSource", str2, "contentProvider", str2));
        return m;
    }

    @Nullable
    public String recordCriticalEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable Throwable th) {
        if (getMetricService() == null) {
            return null;
        }
        this.metricsService.recordCriticalEvent(str, str2, str3, OwnerIdentifier.ALEXA_MOBILE_SHARING, th);
        return str;
    }

    @Nullable
    public String recordNonOccurrenceMetric(@NonNull String str, @NonNull Map<String, Object> map) {
        return recordMetricByOccurrence(str, map, false);
    }

    @Nullable
    public String recordOccurrenceMetric(@NonNull String str, @NonNull Map<String, Object> map) {
        return recordMetricByOccurrence(str, map, true);
    }

    @Nullable
    public TimerMetric recordTimerMetric(@NonNull TimerMetric timerMetric) {
        if (getMetricService() == null) {
            return null;
        }
        this.metricsService.recordTimer(timerMetric);
        return timerMetric;
    }

    public void setMetricsServiceLazy(@Nullable Lazy<AlexaCommsCoreMetricsService> lazy) {
        this.metricsServiceLazy = lazy;
    }

    public CommsMetricsEmitter(@NonNull String str) {
        this.source = str;
    }
}
