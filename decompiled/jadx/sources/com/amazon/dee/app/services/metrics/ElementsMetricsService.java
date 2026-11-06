package com.amazon.dee.app.services.metrics;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.dee.app.services.logging.Log;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import com.dee.app.contacts.common.constants.Constants;
import com.dee.app.metrics.MetricComponentName;
import com.dee.app.metrics.MetricDescriptor;
import com.dee.app.metrics.MetricName;
import com.dee.app.metrics.MetricsService;
import com.dee.app.metrics.MetricsServiceV2;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\u0018\u0000 '2\u00020\u0001:\u0001'B\u0019\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010 \u001a\u00020!H\u0002J \u0010\"\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010 \u001a\u00020!2\u0006\u0010#\u001a\u00020\u0014H\u0002J$\u0010$\u001a\u00020\n2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001b0&2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/amazon/dee/app/services/metrics/ElementsMetricsService;", "Lcom/dee/app/metrics/MetricsServiceV2;", "metricsService", "Lcom/dee/app/metrics/MetricsService;", "rand", "Ljava/util/Random;", "<init>", "(Lcom/dee/app/metrics/MetricsService;Ljava/util/Random;)V", "(Lcom/dee/app/metrics/MetricsService;)V", "recordTime", "", "metricDescriptor", "Lcom/dee/app/metrics/MetricDescriptor;", "elapsedTime", "", "recordCount", "count", "", "recordFailure", "message", "", "recordSuccess", "recordLimit", "eventOccurred", "", "recordData", "data", "", "recordAvailable", "recordUnavailable", "shouldLog", "getMetricNameWithType", "metricType", "Lcom/amazon/dee/app/services/metrics/MetricType;", "recordCustom", "eventType", "insertCountEntries", "customEntries", "", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ElementsMetricsService implements MetricsServiceV2 {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = Log.tag((Class<?>) ElementsMetricsService.class);

    @NotNull
    public static final String UNKNOWN_FAILURE_MESSAGE = "UNKNOWN";

    @NotNull
    private final MetricsService metricsService;

    @NotNull
    private final Random rand;

    @VisibleForTesting
    public ElementsMetricsService(@NotNull MetricsService metricsService, @NotNull Random random) {
        metricsService.getClass();
        random.getClass();
        this.metricsService = metricsService;
        this.rand = random;
    }

    private final String getMetricNameWithType(MetricDescriptor metricDescriptor, MetricType metricType) {
        String metricName = metricDescriptor.getName().toString();
        metricName.getClass();
        if (metricType == MetricType.DATA) {
            return metricName;
        }
        String m = BitVector$$ExternalSyntheticOutline0.m(metricName, a$$ExternalSyntheticOutline0.m(".", metricType.getType()));
        int emissionFactor = metricDescriptor.getEmissionFactor();
        if (emissionFactor >= 100) {
            return m;
        }
        return m + emissionFactor;
    }

    private final void insertCountEntries(Map<String, Object> customEntries, double count) {
        customEntries.put("EventNumericValue", Double.valueOf(count));
        customEntries.put("CounterValue", Double.valueOf(count));
    }

    private final void recordCustom(MetricDescriptor metricDescriptor, MetricType metricType, String eventType) {
        if (shouldLog(metricDescriptor)) {
            MetricName name = metricDescriptor.getName();
            name.getClass();
            MetricComponentName componentName = metricDescriptor.getComponentName();
            componentName.getClass();
            String module = name.getModule();
            if (module == null || module.length() == 0) {
                Map<String, Object> customEntries = metricDescriptor.getCustomEntries();
                Log.e(TAG, "Empty module in metric name.");
                if (customEntries.containsKey("url")) {
                    customEntries.get("url");
                }
                name.setModule("unknown");
            }
            String metricComponentName = componentName.toString();
            metricComponentName.getClass();
            if (metricComponentName.length() == 0) {
                Map<String, Object> customEntries2 = metricDescriptor.getCustomEntries();
                Log.e(TAG, "Empty category id in metric component name.");
                if (customEntries2.containsKey("url")) {
                    customEntries2.get("url");
                }
                componentName.setCategoryId("unknown");
            }
            String source = name.getSource();
            if (source == null || source.length() == 0) {
                name.setSource("native");
            }
            this.metricsService.recordCustom(eventType, getMetricNameWithType(metricDescriptor, metricType), metricDescriptor.getComponentName().toString(), new HashMap(metricDescriptor.getCustomEntries()));
        }
    }

    private final boolean shouldLog(MetricDescriptor metricDescriptor) {
        int emissionFactor = metricDescriptor.getEmissionFactor();
        return emissionFactor == 100 || this.rand.nextInt(100) + 1 <= emissionFactor;
    }

    @Override // com.dee.app.metrics.MetricsServiceV2
    public void recordAvailable(@NotNull MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        Map<String, Object> customEntries = metricDescriptor.getCustomEntries();
        customEntries.getClass();
        insertCountEntries(customEntries, 1.0d);
        MetricType metricType = MetricType.AVAILABILITY;
        recordCustom(metricDescriptor, metricType, metricType.getType());
    }

    @Override // com.dee.app.metrics.MetricsServiceV2
    public void recordCount(@NotNull MetricDescriptor metricDescriptor, double count) {
        metricDescriptor.getClass();
        Map<String, Object> customEntries = metricDescriptor.getCustomEntries();
        customEntries.getClass();
        insertCountEntries(customEntries, count);
        recordCustom(metricDescriptor, MetricType.COUNT, "Counter");
    }

    @Override // com.dee.app.metrics.MetricsServiceV2
    public void recordData(@NotNull MetricDescriptor metricDescriptor, @NotNull Object data) {
        metricDescriptor.getClass();
        data.getClass();
        Map<String, Object> customEntries = metricDescriptor.getCustomEntries();
        customEntries.getClass();
        customEntries.put("EventValue", data);
        recordCustom(metricDescriptor, MetricType.DATA, "Data");
    }

    @Override // com.dee.app.metrics.MetricsServiceV2
    public void recordFailure(@NotNull MetricDescriptor metricDescriptor, @Nullable String message) {
        metricDescriptor.getClass();
        Map<String, Object> customEntries = metricDescriptor.getCustomEntries();
        customEntries.getClass();
        if (message == null) {
            message = "UNKNOWN";
        }
        customEntries.put("EventValue", message);
        insertCountEntries(customEntries, 1.0d);
        MetricType metricType = MetricType.FAULT;
        recordCustom(metricDescriptor, metricType, metricType.getType());
    }

    @Override // com.dee.app.metrics.MetricsServiceV2
    public void recordLimit(@NotNull MetricDescriptor metricDescriptor, boolean eventOccurred) {
        metricDescriptor.getClass();
        Map<String, Object> customEntries = metricDescriptor.getCustomEntries();
        customEntries.getClass();
        insertCountEntries(customEntries, eventOccurred ? 1.0d : 0.0d);
        recordCustom(metricDescriptor, MetricType.LIMIT, AlexaMetricsConstants.EventTypes.EVENT_TYPE_OCCURRENCE);
    }

    @Override // com.dee.app.metrics.MetricsServiceV2
    public void recordSuccess(@NotNull MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        Map<String, Object> customEntries = metricDescriptor.getCustomEntries();
        customEntries.getClass();
        insertCountEntries(customEntries, 0.0d);
        MetricType metricType = MetricType.FAULT;
        recordCustom(metricDescriptor, metricType, metricType.getType());
    }

    @Override // com.dee.app.metrics.MetricsServiceV2
    public void recordTime(@NotNull MetricDescriptor metricDescriptor, long elapsedTime) {
        metricDescriptor.getClass();
        Map<String, Object> customEntries = metricDescriptor.getCustomEntries();
        customEntries.getClass();
        customEntries.put("TimerValue", Long.valueOf(elapsedTime));
        recordCustom(metricDescriptor, MetricType.TIME, "Timer");
    }

    @Override // com.dee.app.metrics.MetricsServiceV2
    public void recordUnavailable(@NotNull MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        Map<String, Object> customEntries = metricDescriptor.getCustomEntries();
        customEntries.getClass();
        insertCountEntries(customEntries, 0.0d);
        MetricType metricType = MetricType.AVAILABILITY;
        recordCustom(metricDescriptor, metricType, metricType.getType());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/amazon/dee/app/services/metrics/ElementsMetricsService$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "UNKNOWN_FAILURE_MESSAGE", "getUNKNOWN_FAILURE_MESSAGE$annotations", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getUNKNOWN_FAILURE_MESSAGE$annotations() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ElementsMetricsService(@NotNull MetricsService metricsService) {
        this(metricsService, new Random());
        metricsService.getClass();
    }
}
