package com.amazon.alexa.identity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.alexa.mobilytics.event.userinteraction.MobilyticsUserInteractionEvent;
import com.amazon.alexa.mobilytics.event.userinteraction.interactionDetails.InteractionDetails;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class MobilyticsUtils {
    public static final String V2_LOG_PREFIX = "IdentityV2 : ";

    private MobilyticsUtils() {
    }

    public static MobilyticsMetricsTimer createTimer(String str, String str2, String str3, Mobilytics mobilytics) {
        return mobilytics.createTimer(str, str2, str3, "e71ec482-0a7b-4d7b-8448-56400f4e8bd9");
    }

    public static void recordCounter(String str, String str2, String str3, Mobilytics mobilytics, Boolean bool, int i) {
        MobilyticsMetricsCounter createCounter = mobilytics.createCounter(str, str2, str3, "e71ec482-0a7b-4d7b-8448-56400f4e8bd9");
        if (bool.booleanValue()) {
            createCounter.incrementCounter();
        }
        mobilytics.recordCounter(createCounter, i);
    }

    public static void recordCriticalEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @Nullable Throwable th, Mobilytics mobilytics) {
        mobilytics.recordCriticalEvent(str, str2, str3, str4, th, "e71ec482-0a7b-4d7b-8448-56400f4e8bd9");
    }

    public static void recordMobilyticsInteractionEvent(String str, String str2, String str3, String str4, InteractionDetails interactionDetails, Mobilytics mobilytics) {
        MobilyticsUserInteractionEvent createUserInteractionEvent = mobilytics.createUserInteractionEvent(str, str2, str4, str3, "e71ec482-0a7b-4d7b-8448-56400f4e8bd9");
        if (interactionDetails != null) {
            createUserInteractionEvent.setInteractionDetails(interactionDetails);
        }
        mobilytics.recordUserInteractionEvent(createUserInteractionEvent);
    }

    public static void recordMobilyticsOperationalEvent(String str, String str2, String str3, String str4, Mobilytics mobilytics) {
        mobilytics.recordOperationalEvent(mobilytics.createOperationalEvent(str, str2, str4, str3, "e71ec482-0a7b-4d7b-8448-56400f4e8bd9"));
    }

    public static void recordOccurrence(String str, Boolean bool, String str2, String str3, Mobilytics mobilytics) {
        mobilytics.recordOccurrence(str, bool.booleanValue(), str2, str3, "e71ec482-0a7b-4d7b-8448-56400f4e8bd9");
    }

    public static void recordTimer(MobilyticsMetricsTimer mobilyticsMetricsTimer, Mobilytics mobilytics) {
        mobilytics.recordTimer(mobilyticsMetricsTimer);
    }
}
