package com.amazon.dee.app.services.metrics;

import com.dee.app.metrics.MetricsTimer;
import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/dee/app/services/metrics/HistogramMetricsEvent;", "Lcom/amazon/dee/app/services/metrics/DefaultAlexaMetricsEvent;", "Lcom/dee/app/metrics/MetricsTimer;", "eventName", "", "componentName", "value", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "finishTimer", "", "endTimeMillis", "(Ljava/lang/Long;)V", "pauseTimer", "resumeTimer", "getElapsedTime", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HistogramMetricsEvent extends DefaultAlexaMetricsEvent implements MetricsTimer {
    private final long value;

    public HistogramMetricsEvent(@Nullable String str, @Nullable String str2, long j) {
        super(str, str2, MapsKt.emptyMap());
        this.value = j;
    }

    @Override // com.dee.app.metrics.MetricsTimer
    /* renamed from: getElapsedTime, reason: from getter */
    public long getValue() {
        return this.value;
    }

    @Override // com.dee.app.metrics.MetricsTimer
    public void pauseTimer() {
        throw new UnsupportedOperationException();
    }

    @Override // com.dee.app.metrics.MetricsTimer
    public void resumeTimer() {
        throw new UnsupportedOperationException();
    }

    @Override // com.dee.app.metrics.MetricsTimer
    public void finishTimer(@Nullable Long endTimeMillis) {
    }

    @Override // com.dee.app.metrics.MetricsTimer
    public void finishTimer() {
    }
}
