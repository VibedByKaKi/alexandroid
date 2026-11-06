package com.amazon.alexa.dnssd.util;

import com.dee.app.metrics.MetricComponentName;
import com.dee.app.metrics.MetricDescriptor;
import com.dee.app.metrics.MetricName;
import com.dee.app.metrics.MetricsServiceV2;
import javax.inject.Inject;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class Metrics {
    public static final String CATEGORY_ID = "dnssd";
    public static final String MODULE = "dnssd";
    private final MetricsServiceV2 metricsService;

    @Inject
    @Generated
    public Metrics(MetricsServiceV2 metricsServiceV2) {
        this.metricsService = metricsServiceV2;
    }

    private MetricDescriptor getDescriptor(String str, String str2) {
        return new MetricDescriptor.Builder(new MetricName.Builder(str2).withModule("dnssd").withSource("native").build(), new MetricComponentName.Builder().withCategoryId("dnssd").withMethod(str).build()).build();
    }

    public void recordCount(String str, String str2, int i) {
        this.metricsService.recordCount(getDescriptor(str, str2), i);
    }

    public void recordCount(String str, String str2) {
        recordCount(str, str2, 1);
    }
}
