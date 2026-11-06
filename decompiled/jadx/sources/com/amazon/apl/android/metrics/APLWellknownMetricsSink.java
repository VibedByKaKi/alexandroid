package com.amazon.apl.android.metrics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class APLWellknownMetricsSink implements IMetricsSink {
    public static final String WELLKNOWNMETRIC_CONTENT_CREATE = "APL.Content.create";
    public static final String WELLKNOWNMETRIC_EXTENSIONS_REGISTER = "APL.Extensions.register";
    public static final String WELLKNOWNMETRIC_PREPARE_DOCUMENT = "APL.prepareDocument";
    public static final String WELLKNOWNMETRIC_RENDER_DOCUMENT = "APL.renderDocument";
    public static final String WELLKNOWNMETRIC_ROOT_CONTEXT_INFLATE = "APL.RootContext.inflate";
    public static final String WELLKNOWNMETRIC_TEXT_MEASURE = "APL.Text.measure";
    public static final String WELLKNOWNMETRIC_VIEWS_INFLATE = "APL.Views.inflate";
    public static final String WELLKNOWNMETRIC_VIEWS_LAYOUT = "APL.Views.layout";
    private final Map<String, String> milestoneToWellKnownMap = new HashMap();
    private final Map<String, List<Long>> wellKnownToDurationMap = new HashMap();
    private final Map<String, Integer> counters = new HashMap();
    private final Map<String, Map<String, String>> metadata = new HashMap();
    private final Map<Long, MetricsEvent> mSegmentStarts = new HashMap();
    private final Map<Long, MetricsEvent> mSegmentEnds = new HashMap();

    public APLWellknownMetricsSink(long j) {
        initKPIsWithSeed(j);
    }

    private void addSegmentMetric(MetricsEvent metricsEvent) {
        if (MetricEventType.SEGMENT_START.equals(metricsEvent.getEventType())) {
            this.mSegmentStarts.put(Long.valueOf(metricsEvent.getMetricId()), metricsEvent);
        } else {
            this.mSegmentEnds.put(Long.valueOf(metricsEvent.getRelateId()), metricsEvent);
        }
    }

    private void clear() {
        this.wellKnownToDurationMap.clear();
        this.counters.clear();
        this.mSegmentStarts.clear();
        this.mSegmentEnds.clear();
        initWellKnownDuration();
    }

    private void initKPIsWithSeed(long j) {
        this.milestoneToWellKnownMap.put(MetricsMilestoneConstants.EXTENSION_REGISTRATION_START_MILESTONE, WELLKNOWNMETRIC_EXTENSIONS_REGISTER);
        this.milestoneToWellKnownMap.put(MetricsMilestoneConstants.EXTENSION_REGISTRATION_END_MILESTONE, WELLKNOWNMETRIC_EXTENSIONS_REGISTER);
        this.milestoneToWellKnownMap.put(MetricsMilestoneConstants.EXTENSION_REGISTRATION_FAILED_MILESTONE, WELLKNOWNMETRIC_EXTENSIONS_REGISTER);
        this.milestoneToWellKnownMap.put(MetricsMilestoneConstants.CONTENT_CREATE_START_MILESTONE, WELLKNOWNMETRIC_CONTENT_CREATE);
        this.milestoneToWellKnownMap.put(MetricsMilestoneConstants.CONTENT_CREATE_END_MILESTONE, WELLKNOWNMETRIC_CONTENT_CREATE);
        this.milestoneToWellKnownMap.put(MetricsMilestoneConstants.CONTENT_CREATE_FAILED_MILESTONE, WELLKNOWNMETRIC_CONTENT_CREATE);
        this.milestoneToWellKnownMap.put(MetricsMilestoneConstants.ROOTCONTEXT_INFLATE_START_MILESTONE, WELLKNOWNMETRIC_ROOT_CONTEXT_INFLATE);
        this.milestoneToWellKnownMap.put(MetricsMilestoneConstants.ROOTCONTEXT_INFLATE_END_MILESTONE, WELLKNOWNMETRIC_ROOT_CONTEXT_INFLATE);
        this.milestoneToWellKnownMap.put(MetricsMilestoneConstants.ROOTCONTEXT_INFLATE_FAILED_MILESTONE, WELLKNOWNMETRIC_ROOT_CONTEXT_INFLATE);
        this.milestoneToWellKnownMap.put(MetricsMilestoneConstants.APLLAYOUT_VIEW_INFLATE_START_MILESTONE, WELLKNOWNMETRIC_VIEWS_INFLATE);
        this.milestoneToWellKnownMap.put(MetricsMilestoneConstants.APLLAYOUT_VIEW_INFLATE_END_MILESTONE, WELLKNOWNMETRIC_VIEWS_INFLATE);
        this.milestoneToWellKnownMap.put(MetricsMilestoneConstants.APLLAYOUT_VIEW_INFLATE_FAILED_MILESTONE, WELLKNOWNMETRIC_VIEWS_INFLATE);
        this.milestoneToWellKnownMap.put(MetricsMilestoneConstants.APLLAYOUT_LAYOUT_START_MILESTONE, WELLKNOWNMETRIC_VIEWS_LAYOUT);
        this.milestoneToWellKnownMap.put(MetricsMilestoneConstants.APLLAYOUT_LAYOUT_END_MILESTONE, WELLKNOWNMETRIC_VIEWS_LAYOUT);
        this.milestoneToWellKnownMap.put(MetricsMilestoneConstants.RENDER_END_MILESTONE, WELLKNOWNMETRIC_RENDER_DOCUMENT);
        this.milestoneToWellKnownMap.put(MetricsMilestoneConstants.RENDER_FAILED_MILESTONE, WELLKNOWNMETRIC_RENDER_DOCUMENT);
        initWellKnownDuration();
        this.wellKnownToDurationMap.get(WELLKNOWNMETRIC_RENDER_DOCUMENT).add(Long.valueOf(j));
        this.wellKnownToDurationMap.get(WELLKNOWNMETRIC_PREPARE_DOCUMENT).add(Long.valueOf(j));
    }

    private void initWellKnownDuration() {
        this.wellKnownToDurationMap.put(WELLKNOWNMETRIC_RENDER_DOCUMENT, new ArrayList());
        this.wellKnownToDurationMap.put(WELLKNOWNMETRIC_PREPARE_DOCUMENT, new ArrayList());
        this.wellKnownToDurationMap.put(WELLKNOWNMETRIC_CONTENT_CREATE, new ArrayList());
        this.wellKnownToDurationMap.put(WELLKNOWNMETRIC_EXTENSIONS_REGISTER, new ArrayList());
        this.wellKnownToDurationMap.put(WELLKNOWNMETRIC_ROOT_CONTEXT_INFLATE, new ArrayList());
        this.wellKnownToDurationMap.put(WELLKNOWNMETRIC_VIEWS_INFLATE, new ArrayList());
        this.wellKnownToDurationMap.put(WELLKNOWNMETRIC_VIEWS_LAYOUT, new ArrayList());
        this.wellKnownToDurationMap.put(WELLKNOWNMETRIC_TEXT_MEASURE, new ArrayList());
    }

    private void updateMetadata(String str, Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        Map<String, String> map2 = this.metadata.get(str);
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        map2.putAll(map);
        this.metadata.put(str, map2);
    }

    public void aggregateCounter(MetricsEvent metricsEvent) {
        String metricName = metricsEvent.getMetricName();
        this.counters.put(metricName, Integer.valueOf((this.counters.get(metricName) == null ? 0 : this.counters.get(metricName).intValue()) + ((int) metricsEvent.getValue())));
        updateMetadata(metricName, metricsEvent.getMetaData());
    }

    public abstract void counterPublished(String str, long j, Map<String, String> map);

    public void logAndReset() {
        for (Map.Entry<String, List<Long>> entry : this.wellKnownToDurationMap.entrySet()) {
            String key = entry.getKey();
            List<Long> value = entry.getValue();
            if (value.size() == 2) {
                timerPublished(key, value.get(1).longValue() - value.get(0).longValue(), this.metadata.get(key));
            }
        }
        Iterator<Map.Entry<String, Integer>> it2 = this.counters.entrySet().iterator();
        while (it2.hasNext()) {
            String key2 = it2.next().getKey();
            counterPublished(key2, r1.getValue().intValue(), this.metadata.get(key2));
        }
        for (Long l : this.mSegmentEnds.keySet()) {
            l.longValue();
            MetricsEvent metricsEvent = this.mSegmentEnds.get(l);
            MetricsEvent metricsEvent2 = this.mSegmentStarts.get(l);
            if (metricsEvent2 != null) {
                segmentPublished(metricsEvent.getMetricName(), metricsEvent.getValue() - metricsEvent2.getValue(), metricsEvent.getMetaData());
            }
        }
        clear();
    }

    @Override // com.amazon.apl.android.metrics.IMetricsSink
    public void metricPublished(MetricsEvent metricsEvent) {
        if (MetricEventType.MILESTONE.equals(metricsEvent.getEventType())) {
            updateKPI(metricsEvent);
        } else if (MetricEventType.COUNTER.equals(metricsEvent.getEventType())) {
            aggregateCounter(metricsEvent);
        } else {
            addSegmentMetric(metricsEvent);
        }
    }

    @Override // com.amazon.apl.android.IDocumentLifecycleListener
    public void onDocumentFinish() {
        logAndReset();
    }

    public abstract void segmentPublished(String str, long j, Map<String, String> map);

    public abstract void timerPublished(String str, long j, Map<String, String> map);

    public void updateKPI(MetricsEvent metricsEvent) {
        String str = this.milestoneToWellKnownMap.get(metricsEvent.getMetricName());
        if (str != null) {
            this.wellKnownToDurationMap.get(str).add(Long.valueOf(metricsEvent.getValue()));
            updateMetadata(str, metricsEvent.getMetaData());
        }
    }
}
