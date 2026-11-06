package com.amazon.alexa.mobilytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.event.MobilyticsEvent;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsOperationalEvent;
import com.amazon.alexa.mobilytics.event.userinteraction.MobilyticsUserInteractionEvent;
import com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatusProviderV2;
import com.amazon.alexa.mobilytics.session.MobilyticsSession;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface Mobilytics {
    void abortTimeline(@NonNull String str, @NonNull String str2, @NonNull String str3);

    void abortTimeline(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4);

    @NonNull
    @Deprecated
    MobilyticsMetricsCounter createCounter(@NonNull String str, @NonNull String str2, @Nullable String str3);

    @NonNull
    MobilyticsMetricsCounter createCounter(@NonNull String str, @NonNull String str2, @Nullable String str3, @NonNull String str4);

    @NonNull
    @Deprecated
    MobilyticsOperationalEvent createOperationalEvent(@NonNull String str, String str2, @NonNull String str3, @Nullable String str4);

    @NonNull
    MobilyticsOperationalEvent createOperationalEvent(@NonNull String str, String str2, @NonNull String str3, @Nullable String str4, @NonNull String str5);

    @NonNull
    @Deprecated
    MobilyticsMetricsTimer createTimer(@NonNull String str, @NonNull String str2, @Nullable String str3);

    @NonNull
    @Deprecated
    MobilyticsMetricsTimer createTimer(@NonNull String str, @NonNull String str2, @Nullable String str3, long j, boolean z);

    @NonNull
    MobilyticsMetricsTimer createTimer(@NonNull String str, @NonNull String str2, @Nullable String str3, long j, boolean z, @NonNull String str4);

    @NonNull
    MobilyticsMetricsTimer createTimer(@NonNull String str, @NonNull String str2, @Nullable String str3, @NonNull String str4);

    @NonNull
    @Deprecated
    MobilyticsUserInteractionEvent createUserInteractionEvent(@NonNull String str, String str2, @NonNull String str3, @NonNull String str4);

    @NonNull
    MobilyticsUserInteractionEvent createUserInteractionEvent(@NonNull String str, String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5);

    @Nullable
    MobilyticsEntitlementStatusProviderV2 getEntitlementStatusProvider();

    @NonNull
    MobilyticsSession getSession();

    void pauseTimeline(@NonNull String str, @NonNull String str2);

    void pauseTimeline(@NonNull String str, @NonNull String str2, @NonNull String str3);

    void recordCounter(MobilyticsMetricsCounter mobilyticsMetricsCounter);

    void recordCounter(MobilyticsMetricsCounter mobilyticsMetricsCounter, int i);

    @Deprecated
    void recordCriticalEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @Nullable Throwable th);

    void recordCriticalEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @Nullable Throwable th, @NonNull String str5);

    @Deprecated
    void recordCriticalEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, boolean z);

    void recordCriticalEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, boolean z, @NonNull String str5);

    @Deprecated
    void recordDataEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4);

    void recordDataEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4, @NonNull String str5);

    @Deprecated
    void recordDiagnosticInfo(@NonNull String str, @NonNull Map<String, String> map, @NonNull String str2, @Nullable String str3);

    void recordDiagnosticInfo(@NonNull String str, @NonNull Map<String, String> map, @NonNull String str2, @Nullable String str3, @NonNull String str4);

    @Deprecated
    void recordErrorEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4);

    void recordEvent(@NonNull MobilyticsEvent mobilyticsEvent, @NonNull String str, @NonNull String str2);

    @Deprecated
    void recordInfoEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @Nullable Throwable th);

    void recordInfoEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @Nullable Throwable th, @NonNull String str5);

    @Deprecated
    void recordInfoEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, boolean z);

    void recordInfoEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, boolean z, @NonNull String str5);

    @Deprecated
    void recordOccurrence(@NonNull String str, boolean z, @NonNull String str2, @Nullable String str3);

    void recordOccurrence(@NonNull String str, boolean z, @NonNull String str2, @Nullable String str3, @NonNull String str4);

    void recordOperationalEvent(MobilyticsOperationalEvent mobilyticsOperationalEvent);

    @Deprecated
    void recordOperationalEvent(@NonNull String str, @NonNull String str2, @Nullable String str3);

    void recordOperationalEvent(@NonNull String str, @NonNull String str2, @Nullable String str3, @NonNull String str4);

    @Deprecated
    void recordPercentOccurrence(@NonNull String str, boolean z, @NonNull String str2, @Nullable String str3);

    void recordPercentOccurrence(@NonNull String str, boolean z, @NonNull String str2, @Nullable String str3, @NonNull String str4);

    void recordTimer(MobilyticsMetricsTimer mobilyticsMetricsTimer);

    void recordTimer(MobilyticsMetricsTimer mobilyticsMetricsTimer, int i);

    void recordUserInteractionEvent(MobilyticsUserInteractionEvent mobilyticsUserInteractionEvent);

    @Deprecated
    void recordWarningEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @Nullable Throwable th);

    void recordWarningEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @Nullable Throwable th, @NonNull String str5);

    @Deprecated
    void recordWarningEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, boolean z);

    void recordWarningEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, boolean z, @NonNull String str5);

    void resumeTimeline(@NonNull String str, @NonNull String str2);

    void resumeTimeline(@NonNull String str, @NonNull String str2, @NonNull String str3);

    void startTimeline(@NonNull String str, @NonNull String str2);

    void startTimeline(@NonNull String str, @NonNull String str2, @NonNull String str3);

    void stopTimeline(@NonNull String str, @NonNull String str2);

    void stopTimeline(@NonNull String str, @NonNull String str2, @NonNull String str3);
}
