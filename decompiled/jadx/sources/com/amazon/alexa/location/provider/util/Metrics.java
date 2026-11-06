package com.amazon.alexa.location.provider.util;

import androidx.annotation.NonNull;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.sensor.api.location.ErrorCodes;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class Metrics {
    public static final String COMPONENT_NAME = "LocationSkillsProvider";
    public static final String SUBSCRIPTION_ABORTED = "subscription_aborted";

    private Metrics() {
    }

    public static void recordOccurrence(@NonNull String str, @NonNull String str2) {
        Object obj;
        obj = ComponentRegistry.getInstance().getLazy(Mobilytics.class).get();
        ((Mobilytics) obj).recordOccurrence(str, true, COMPONENT_NAME, str2, OwnerIdentifier.APP_LOCATION_LIBRARIES_ANDROID);
    }

    public static void recordSubscriptionAborted(int i) {
        Object obj;
        obj = ComponentRegistry.getInstance().getLazy(Mobilytics.class).get();
        ((Mobilytics) obj).recordOperationalEvent(SUBSCRIPTION_ABORTED, COMPONENT_NAME, ErrorCodes.schemaString(i), OwnerIdentifier.APP_LOCATION_LIBRARIES_ANDROID);
    }

    public static void recordSuccess(@NonNull String str, boolean z, @NonNull String str2) {
        Object obj;
        obj = ComponentRegistry.getInstance().getLazy(Mobilytics.class).get();
        ((Mobilytics) obj).recordOccurrence(str, z, COMPONENT_NAME, str2, OwnerIdentifier.APP_LOCATION_LIBRARIES_ANDROID);
    }

    public static void recordValue(@NonNull String str, long j, @NonNull String str2) {
        Object obj;
        obj = ComponentRegistry.getInstance().getLazy(Mobilytics.class).get();
        Mobilytics mobilytics = (Mobilytics) obj;
        MobilyticsMetricsCounter createCounter = mobilytics.createCounter(str, COMPONENT_NAME, str2, OwnerIdentifier.APP_LOCATION_LIBRARIES_ANDROID);
        createCounter.incrementCounterByValue(j);
        mobilytics.recordCounter(createCounter);
    }
}
