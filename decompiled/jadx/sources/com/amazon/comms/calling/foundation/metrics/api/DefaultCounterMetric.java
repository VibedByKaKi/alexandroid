package com.amazon.comms.calling.foundation.metrics.api;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import com.amazon.alexa.mobilytics.event.operational.DefaultMobilyticsMetricsCounter;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/api/DefaultCounterMetric;", "Lcom/amazon/comms/calling/foundation/metrics/api/CounterMetric;", "name", "", JsonFields.COMPONENT, "subComponent", "ownerIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "mCounter", "Lcom/amazon/alexa/mobilytics/event/operational/MobilyticsMetricsCounter;", "incrementCounter", "", "incrementCounterBy", "value", "", "getMetricCount", "resetCounter", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class DefaultCounterMetric extends CounterMetric {

    @Nullable
    private MobilyticsMetricsCounter mCounter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultCounterMetric(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4) {
        super(str, str2, str3, str4);
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str4);
        this.mCounter = new DefaultMobilyticsMetricsCounter(str, str2, str3, str4);
    }

    @Override // com.amazon.comms.calling.foundation.metrics.api.CounterMetric
    public long getMetricCount() {
        MobilyticsMetricsCounter mobilyticsMetricsCounter = this.mCounter;
        if (mobilyticsMetricsCounter != null) {
            return mobilyticsMetricsCounter.getCount();
        }
        return 0L;
    }

    @Override // com.amazon.comms.calling.foundation.metrics.api.CounterMetric
    public void incrementCounter() {
        MobilyticsMetricsCounter mobilyticsMetricsCounter = this.mCounter;
        if (mobilyticsMetricsCounter != null) {
            mobilyticsMetricsCounter.incrementCounter();
        }
    }

    @Override // com.amazon.comms.calling.foundation.metrics.api.CounterMetric
    public void incrementCounterBy(long value) {
        MobilyticsMetricsCounter mobilyticsMetricsCounter = this.mCounter;
        if (mobilyticsMetricsCounter != null) {
            mobilyticsMetricsCounter.incrementCounterByValue(value);
        }
    }

    @Override // com.amazon.comms.calling.foundation.metrics.api.CounterMetric
    public void resetCounter() {
        MobilyticsMetricsCounter mobilyticsMetricsCounter = this.mCounter;
        if (mobilyticsMetricsCounter != null) {
            mobilyticsMetricsCounter.resetCounter();
        }
    }
}
