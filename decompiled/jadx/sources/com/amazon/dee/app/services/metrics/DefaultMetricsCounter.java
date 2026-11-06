package com.amazon.dee.app.services.metrics;

import com.dee.app.metrics.MetricsCounter;
import io.ktor.client.utils.CacheControl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/amazon/dee/app/services/metrics/DefaultMetricsCounter;", "Lcom/amazon/dee/app/services/metrics/DefaultAlexaMetricsEvent;", "Lcom/dee/app/metrics/MetricsCounter;", "eventName", "", "componentName", "customEntries", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "currentCount", "", "incrementCounter", "", "incrementCounterByValue", "value", "getCount", "restartCounter", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultMetricsCounter extends DefaultAlexaMetricsEvent implements MetricsCounter {

    @JvmField
    public double currentCount;

    public DefaultMetricsCounter(@Nullable String str, @Nullable String str2, @Nullable Map<String, ? extends Object> map) {
        super(str, str2, map);
    }

    @Override // com.dee.app.metrics.MetricsCounter
    /* renamed from: getCount, reason: from getter */
    public double getCurrentCount() {
        return this.currentCount;
    }

    @Override // com.dee.app.metrics.MetricsCounter
    public void incrementCounter() {
        this.currentCount += 1.0d;
    }

    @Override // com.dee.app.metrics.MetricsCounter
    public void incrementCounterByValue(double value) {
        this.currentCount += value;
    }

    @Override // com.dee.app.metrics.MetricsCounter
    public void restartCounter() {
        this.currentCount = 0.0d;
    }
}
