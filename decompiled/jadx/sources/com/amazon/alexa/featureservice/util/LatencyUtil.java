package com.amazon.alexa.featureservice.util;

import com.amazon.latencyinfra.TimelineInputArgument;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class LatencyUtil {
    private static final String LATENCY_NAMESPACE_FEATURE_SERVICE = "FeatureService";
    private static final int LATENCY_TAG = 0;
    public static final String LATENCY_TIMELINE_PREFETCH = "prefetch";
    public static final String LATENCY_TIMELINE_PREFETCH_NAMESPACE = "prefetchNamespace";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public @interface LatencyTimeline {
    }

    private LatencyUtil() {
    }

    public static TimelineInputArgument.Builder getTimelineArgumentBuilder(@LatencyTimeline String str) {
        return new TimelineInputArgument.Builder().withTimelineName(str).withNamespace(LATENCY_NAMESPACE_FEATURE_SERVICE).withTag(0).withLogOption(true);
    }
}
