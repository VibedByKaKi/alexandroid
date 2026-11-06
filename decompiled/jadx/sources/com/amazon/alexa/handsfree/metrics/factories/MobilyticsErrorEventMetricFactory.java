package com.amazon.alexa.handsfree.metrics.factories;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.metrics.events.MobilyticsMetricsCounterWrapper;
import com.amazon.alexa.handsfree.protocols.metrics.Metric;
import com.amazon.alexa.handsfree.protocols.metrics.factories.ErrorEventMetricFactory;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class MobilyticsErrorEventMetricFactory implements ErrorEventMetricFactory {

    @VisibleForTesting
    static final String NON_FATAL_ERROR_PREFIX = "NF_ERROR";

    @VisibleForTesting
    static final String SEPARATOR = ":";

    @Override // com.amazon.alexa.handsfree.protocols.metrics.factories.ErrorEventMetricFactory
    public Metric buildNonFatalErrorMetric(@NonNull String str, @NonNull String str2) {
        return new MobilyticsMetricsCounterWrapper(a$$ExternalSyntheticOutline0.m("NF_ERROR:", str2), str);
    }
}
