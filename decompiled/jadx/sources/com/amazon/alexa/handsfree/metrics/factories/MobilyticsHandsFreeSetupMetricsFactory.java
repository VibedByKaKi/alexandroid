package com.amazon.alexa.handsfree.metrics.factories;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.metrics.events.MobilyticsUserInteractionEventWrapper;
import com.amazon.alexa.handsfree.protocols.metrics.Metric;
import com.amazon.alexa.handsfree.protocols.metrics.factories.HandsFreeSetupMetricData;
import com.amazon.alexa.handsfree.protocols.metrics.factories.HandsFreeSetupMetricsFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class MobilyticsHandsFreeSetupMetricsFactory implements HandsFreeSetupMetricsFactory {
    @Override // com.amazon.alexa.handsfree.protocols.metrics.factories.HandsFreeSetupMetricsFactory
    @NonNull
    public Metric buildHandsFreeSetupMetric(@NonNull String str, @NonNull String str2, @NonNull HandsFreeSetupMetricData handsFreeSetupMetricData) {
        return new MobilyticsUserInteractionEventWrapper(handsFreeSetupMetricData.getEventType(), "click", handsFreeSetupMetricData.getComponent(), handsFreeSetupMetricData.getPageType()).withInputType2(handsFreeSetupMetricData.getActionType()).withEnrollmentType(str2);
    }

    @Override // com.amazon.alexa.handsfree.protocols.metrics.factories.HandsFreeSetupMetricsFactory
    @NonNull
    public Metric buildHandsFreeSetupMetric(@NonNull String str, @NonNull HandsFreeSetupMetricData handsFreeSetupMetricData) {
        return new MobilyticsUserInteractionEventWrapper(handsFreeSetupMetricData.getEventType(), "click", handsFreeSetupMetricData.getComponent(), handsFreeSetupMetricData.getPageType()).withInputType2(handsFreeSetupMetricData.getActionType());
    }
}
