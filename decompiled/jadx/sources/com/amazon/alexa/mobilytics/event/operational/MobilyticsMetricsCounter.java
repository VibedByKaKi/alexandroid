package com.amazon.alexa.mobilytics.event.operational;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface MobilyticsMetricsCounter extends MobilyticsOperationalEvent {
    long getCount();

    void incrementCounter();

    void incrementCounterByValue(long j);

    void resetCounter();
}
