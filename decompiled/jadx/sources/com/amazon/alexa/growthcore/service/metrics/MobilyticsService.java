package com.amazon.alexa.growthcore.service.metrics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsOperationalEvent;
import dagger.Lazy;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MobilyticsService {
    private static final String OWNER_IDENTIFIER = "5769ad1c-2ea1-4551-ba9a-e55d468fa768";
    private final Lazy<Mobilytics> mobilytics;

    @Inject
    public MobilyticsService(@NonNull Lazy<Mobilytics> lazy) {
        this.mobilytics = lazy;
    }

    public static String getPMETMetricName(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        return String.join("_", str, str2, str3);
    }

    public void recordDataEvent(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        MobilyticsOperationalEvent createOperationalEvent = this.mobilytics.get().createOperationalEvent(str, "data", MetricsConstant.APP_COMPONENT, str2, "5769ad1c-2ea1-4551-ba9a-e55d468fa768");
        createOperationalEvent.setContentId(str3);
        createOperationalEvent.setContentType(str4);
        createOperationalEvent.setContentVersion(str5);
        createOperationalEvent.setContentProvider(str6);
        this.mobilytics.get().recordOperationalEvent(createOperationalEvent);
    }

    public void recordErrorEvent(@NonNull String str, @NonNull String str2, Exception exc) {
        this.mobilytics.get().recordCriticalEvent(str, "Error", MetricsConstant.APP_COMPONENT, str2, exc, "5769ad1c-2ea1-4551-ba9a-e55d468fa768");
    }
}
