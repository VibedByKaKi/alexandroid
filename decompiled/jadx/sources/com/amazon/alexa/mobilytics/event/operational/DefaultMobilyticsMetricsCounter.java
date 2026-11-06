package com.amazon.alexa.mobilytics.event.operational;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class DefaultMobilyticsMetricsCounter extends DefaultMobilyticsOperationalEvent implements MobilyticsMetricsCounter {
    private transient AtomicLong currentCount;

    public DefaultMobilyticsMetricsCounter(@NonNull String str, @NonNull String str2, @Nullable String str3, String str4) {
        super(str, "counter", str2, str3, str4);
        this.currentCount = new AtomicLong(0L);
        withEventNumericValue(0L);
    }

    @Override // com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter
    @JsonIgnore
    public long getCount() {
        return this.currentCount.get();
    }

    @Override // com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter
    public void incrementCounter() {
        incrementCounterByValue(1L);
    }

    @Override // com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter
    public void incrementCounterByValue(long j) {
        withEventNumericValue(Long.valueOf(this.currentCount.addAndGet(j)));
    }

    @Override // com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter
    public void resetCounter() {
        this.currentCount.set(0L);
        withEventNumericValue(0L);
    }

    public DefaultMobilyticsMetricsCounter(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        super(str, "counter", str2, str3);
        this.currentCount = new AtomicLong(0L);
        withEventNumericValue(0L);
    }

    public DefaultMobilyticsMetricsCounter(@NonNull String str, @NonNull String str2, @Nullable String str3, long j) {
        super(str, "counter", str2, str3);
        this.currentCount = new AtomicLong(0L);
        incrementCounterByValue(j);
    }

    public DefaultMobilyticsMetricsCounter(@NonNull String str, @NonNull String str2, @Nullable String str3, long j, String str4) {
        super(str, "counter", str2, str3, str4);
        this.currentCount = new AtomicLong(0L);
        incrementCounterByValue(j);
    }
}
