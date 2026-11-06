package com.amazon.alexa.hho.metrics;

import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.alexa.protocols.service.api.LazyComponent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class HHOMetricsService {
    private final LazyComponent<Mobilytics> mobilytics;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class Timer {
        private final MobilyticsMetricsTimer originalTimer;

        public Timer(MobilyticsMetricsTimer mobilyticsMetricsTimer) {
            this.originalTimer = mobilyticsMetricsTimer;
        }

        public void setEventName(String str) {
            this.originalTimer.setEventName(str);
        }
    }

    public HHOMetricsService(LazyComponent<Mobilytics> lazyComponent) {
        this.mobilytics = lazyComponent;
    }

    public Timer createTimer(String str, String str2, String str3) {
        return new Timer(this.mobilytics.get().createTimer(str, str2, str3, OwnerIdentifier.HHO_MOBILE));
    }

    public void recordErrorWithException(String str, Throwable th, String str2) {
        this.mobilytics.get().recordCriticalEvent(str, str, str2, str2, th, OwnerIdentifier.HHO_MOBILE);
    }

    public void recordEventWithContentId(String str, String str2, String str3, String str4, String str5, String str6) {
        MobilyticsMetricsCounter createCounter = this.mobilytics.get().createCounter(str, str2, str3, OwnerIdentifier.HHO_MOBILE);
        createCounter.setContentId(str4);
        createCounter.setContentType(str5);
        createCounter.setContentVersion(str6);
        createCounter.incrementCounter();
        this.mobilytics.get().recordCounter(createCounter);
    }

    public void recordOccurrence(String str, boolean z, String str2, String str3) {
        this.mobilytics.get().recordOccurrence(str, z, str2, str3, OwnerIdentifier.HHO_MOBILE);
    }

    public void recordOperationalEvent(String str, String str2, String str3, String str4) {
        this.mobilytics.get().recordOperationalEvent(this.mobilytics.get().createOperationalEvent(str, str2, str3, str4, OwnerIdentifier.HHO_MOBILE));
    }

    public void recordTimer(Timer timer) {
        this.mobilytics.get().recordTimer(timer.originalTimer);
    }

    public void recordOccurrence(String str, boolean z, String str2) {
        this.mobilytics.get().recordOccurrence(str, z, str2, str2, OwnerIdentifier.HHO_MOBILE);
    }

    public void recordErrorWithException(String str, Throwable th, String str2, String str3) {
        this.mobilytics.get().recordCriticalEvent(str, str, str2, str3, th, OwnerIdentifier.HHO_MOBILE);
    }

    public void recordOperationalEvent(String str, String str2, String str3) {
        this.mobilytics.get().recordOperationalEvent(str, str2, str3, OwnerIdentifier.HHO_MOBILE);
    }
}
