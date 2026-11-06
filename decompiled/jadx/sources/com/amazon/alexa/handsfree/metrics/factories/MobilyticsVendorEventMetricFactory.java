package com.amazon.alexa.handsfree.metrics.factories;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.metrics.events.MobilyticsMetricsCounterWrapper;
import com.amazon.alexa.handsfree.protocols.metrics.Metric;
import com.amazon.alexa.handsfree.protocols.metrics.factories.VendorEventMetricFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class MobilyticsVendorEventMetricFactory implements VendorEventMetricFactory {
    @Override // com.amazon.alexa.handsfree.protocols.metrics.factories.VendorEventMetricFactory
    public Metric newVendorEventMetric(@NonNull String str, @NonNull String str2) {
        return new MobilyticsMetricsCounterWrapper(str2, str);
    }
}
