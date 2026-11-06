package com.amazon.alexa.assetManagementService.metrics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.assetManagementService.model.constants.GetAssetURLServiceMetricsConstants;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import dagger.Lazy;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class MetricsHelper {
    private static MetricsHelper instance;
    private Lazy<Mobilytics> mobilytics;

    public MetricsHelper(Lazy<Mobilytics> lazy) {
        this.mobilytics = lazy;
    }

    public static MetricsHelper getInstance(Lazy<Mobilytics> lazy) {
        if (instance == null) {
            synchronized (MetricsHelper.class) {
                instance = new MetricsHelper(lazy);
            }
        }
        return instance;
    }

    public MobilyticsMetricsTimer createTimerEvent(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        return this.mobilytics.get().createTimer(str, str2, str3, OwnerIdentifier.ALEXA_MOBILE_PLATFORM_MOSAIC);
    }

    public void recordErrorMetricsEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @Nullable Exception exc) {
        this.mobilytics.get().recordCriticalEvent(a$$ExternalSyntheticOutline0.m(GetAssetURLServiceMetricsConstants.METRICS_NAME_PREFIX, str), a$$ExternalSyntheticOutline0.m(GetAssetURLServiceMetricsConstants.METRICS_NAME_PREFIX, str2), str3, str4, exc, OwnerIdentifier.ALEXA_MOBILE_PLATFORM_MOSAIC);
    }

    public void recordOccurrenceMetricsEvent(@NonNull String str, @NonNull boolean z, @NonNull String str2, @NonNull String str3) {
        this.mobilytics.get().recordOccurrence(str, z, str2, str3, OwnerIdentifier.ALEXA_MOBILE_PLATFORM_MOSAIC);
    }
}
