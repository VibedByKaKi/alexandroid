package com.amazon.alexa.presence.library;

import android.util.Log;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter;
import com.amazon.alexa.presence.FeatureGating;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.dee.app.metrics.MetricComponentName;
import com.dee.app.metrics.MetricDescriptor;
import com.dee.app.metrics.MetricName;
import com.dee.app.metrics.MetricsServiceV2;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class MetricsRecorder {
    private static final String ALEXA_MOBILE_ANDROID_PRESENCE_MOBILYTICS = "ALEXA_MOBILE_ANDROID_PRESENCE_MOBILYTICS";
    public static final String CATEGORY = "presence";
    private static final Map<String, Object> GUARDIAN_CUSTOM_ENTRY;
    private static final Logger LOG = LoggerFactory.getLogger((Class<?>) MetricsRecorder.class);
    public static final String MODULE = "presence";
    public static final String SOURCE = "native";
    private static final String TAG = "com.amazon.alexa.presence.library.MetricsRecorder";
    private MetricsServiceV2 metricsService;
    private Mobilytics mobilytics;

    static {
        HashMap hashMap = new HashMap();
        GUARDIAN_CUSTOM_ENTRY = hashMap;
        hashMap.put("ownerIdentifier", OwnerIdentifier.ALEXA_PRESENCE);
    }

    private MetricsRecorder() {
        this.metricsService = null;
        this.mobilytics = null;
        try {
            this.metricsService = (MetricsServiceV2) ComponentRegistry.getInstance().get(MetricsServiceV2.class).orNull();
        } catch (Throwable unused) {
            Log.w(TAG, "Unable to setup metrics service.");
        }
        try {
            this.mobilytics = (Mobilytics) ComponentRegistry.getInstance().get(Mobilytics.class).orNull();
        } catch (Throwable unused2) {
            Log.w(TAG, "Unable to setup mobilytics.");
        }
    }

    private static MetricDescriptor getMetricDescriptor(String str, String str2, String str3, String str4, String str5) {
        return new MetricDescriptor.Builder(new MetricName.Builder(str).withModule(str2).withSource(str3).build(), new MetricComponentName.Builder().withCategoryId(str4).withMethod(str5).build()).withCustomEntries(GUARDIAN_CUSTOM_ENTRY).build();
    }

    public static MetricsRecorder getMetricsUtil() {
        return new MetricsRecorder();
    }

    public void recordCount(String str, String str2) {
        if (!FeatureGating.getTreatment(ALEXA_MOBILE_ANDROID_PRESENCE_MOBILYTICS).equals("T1")) {
            MetricsServiceV2 metricsServiceV2 = this.metricsService;
            if (metricsServiceV2 == null) {
                return;
            }
            metricsServiceV2.recordCount(getMetricDescriptor(str, "presence", "native", "presence", str2), 1.0d);
            return;
        }
        Mobilytics mobilytics = this.mobilytics;
        if (mobilytics == null) {
            return;
        }
        MobilyticsMetricsCounter createCounter = mobilytics.createCounter(str, "presence", str2, OwnerIdentifier.ALEXA_PRESENCE);
        createCounter.incrementCounter();
        this.mobilytics.recordCounter(createCounter);
    }

    public void recordTime(String str, String str2, long j) {
        MetricsServiceV2 metricsServiceV2 = this.metricsService;
        if (metricsServiceV2 == null) {
            return;
        }
        metricsServiceV2.recordTime(getMetricDescriptor(str, "presence", "native", "presence", str2), j);
    }

    public void recordZeroCount(String str, String str2) {
        if (!FeatureGating.getTreatment(ALEXA_MOBILE_ANDROID_PRESENCE_MOBILYTICS).equals("T1")) {
            MetricsServiceV2 metricsServiceV2 = this.metricsService;
            if (metricsServiceV2 == null) {
                return;
            }
            metricsServiceV2.recordCount(getMetricDescriptor(str, "presence", "native", "presence", str2), 0.0d);
            return;
        }
        Mobilytics mobilytics = this.mobilytics;
        if (mobilytics == null) {
            return;
        }
        this.mobilytics.recordCounter(mobilytics.createCounter(str, "presence", str2, OwnerIdentifier.ALEXA_PRESENCE));
    }
}
