package com.amazon.alexa.smarthomecameras.service;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.alexa.smarthomecameras.constants.MobilyticsConstants;
import org.apache.commons.lang3.LocaleUtils$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class CamerasMobilyticsService {
    private static final String TAG = "CamerasMobilyticsService";
    private final Mobilytics mobilytics;

    public CamerasMobilyticsService(Mobilytics mobilytics) {
        this.mobilytics = mobilytics;
    }

    public static String buildMetricName(String... strArr) {
        return String.join("_", strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$recordDurationProviderMetric$2(String str, String str2) {
        return str2.equalsIgnoreCase(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$recordOccurrenceProviderMetric$0(String str, String str2) {
        return str2.equalsIgnoreCase(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$recordProviderMetric$1(String str, String str2) {
        return str2.equalsIgnoreCase(str);
    }

    private void recordDuration(String str, long j, @Nullable String str2) {
        ParcelCompat$$ExternalSyntheticOutline0.m("ms", TAG, Automotive$$ExternalSyntheticOutline0.m("Recording duration metric ", str, ": ", j));
        MobilyticsMetricsTimer createTimer = this.mobilytics.createTimer(str, MobilyticsConstants.COMPONENT, MobilyticsConstants.SUBCOMPONENT, j, true, OwnerIdentifier.SH_CAMERAS);
        if (!TextUtils.isEmpty(str2)) {
            createTimer.setContentProvider(str2);
        }
        createTimer.finishTimer();
        this.mobilytics.recordTimer(createTimer);
    }

    public void recordDurationProviderMetric(String str, long j, String str2, @Nullable String str3) {
        recordDuration(str, j, null);
        if (!TextUtils.isEmpty(str2)) {
            recordDuration(buildMetricName(str, str2), j, str2);
        }
        boolean z = str2 != null && MobilyticsConstants.PROVIDERS_1P.stream().anyMatch(new LocaleUtils$$ExternalSyntheticLambda0(str2, 9));
        recordDuration(buildMetricName(str, z ? MobilyticsConstants.PROVIDER_1P_SUFFIX : MobilyticsConstants.PROVIDER_3P_SUFFIX), j, null);
        if (!z || str3 == null) {
            return;
        }
        recordDuration(buildMetricName(str, str3), j, null);
    }

    public void recordOccurrenceEvent(String str, boolean z, String str2) {
        recordOccurrenceEvent(str, z);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        MobilyticsMetricsCounter createCounter = this.mobilytics.createCounter(buildMetricName(str, str2), MobilyticsConstants.COMPONENT, MobilyticsConstants.SUBCOMPONENT, OwnerIdentifier.SH_CAMERAS);
        if (z) {
            createCounter.incrementCounter();
        }
        createCounter.setContentProvider(str2);
        this.mobilytics.recordCounter(createCounter);
    }

    public void recordOccurrenceProviderMetric(String str, boolean z, String str2, @Nullable String str3) {
        boolean z2 = str2 != null && MobilyticsConstants.PROVIDERS_1P.stream().anyMatch(new LocaleUtils$$ExternalSyntheticLambda0(str2, 8));
        recordOccurrenceEvent(buildMetricName(str, z2 ? MobilyticsConstants.PROVIDER_1P_SUFFIX : MobilyticsConstants.PROVIDER_3P_SUFFIX), z);
        if (!z2 || str3 == null) {
            return;
        }
        recordOccurrenceEvent(buildMetricName(str, str3), z);
    }

    public void recordOperationalEvent(String str, String str2) {
        MobilyticsMetricsCounter createCounter = this.mobilytics.createCounter(str, MobilyticsConstants.COMPONENT, MobilyticsConstants.SUBCOMPONENT, OwnerIdentifier.SH_CAMERAS);
        createCounter.incrementCounter();
        this.mobilytics.recordCounter(createCounter);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        MobilyticsMetricsCounter createCounter2 = this.mobilytics.createCounter(buildMetricName(str, str2), MobilyticsConstants.COMPONENT, MobilyticsConstants.SUBCOMPONENT, OwnerIdentifier.SH_CAMERAS);
        createCounter2.incrementCounter();
        createCounter2.setContentProvider(str2);
        this.mobilytics.recordCounter(createCounter2);
    }

    public void recordProviderMetric(String str, @Nullable String str2, String... strArr) {
        boolean z = str != null && MobilyticsConstants.PROVIDERS_1P.stream().anyMatch(new LocaleUtils$$ExternalSyntheticLambda0(str, 10));
        String str3 = z ? MobilyticsConstants.PROVIDER_1P_SUFFIX : MobilyticsConstants.PROVIDER_3P_SUFFIX;
        String buildMetricName = buildMetricName(strArr);
        recordOperationalEvent(buildMetricName(buildMetricName, str3));
        if (!z || str2 == null) {
            return;
        }
        recordOperationalEvent(buildMetricName(buildMetricName, str2));
    }

    public void recordTimedOperationalEvent(MobilyticsMetricsTimer mobilyticsMetricsTimer, String str) {
        if (mobilyticsMetricsTimer == null) {
            return;
        }
        mobilyticsMetricsTimer.finishTimer();
        this.mobilytics.recordTimer(mobilyticsMetricsTimer);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        MobilyticsMetricsTimer createTimer = this.mobilytics.createTimer(buildMetricName(mobilyticsMetricsTimer.getEventName(), str), mobilyticsMetricsTimer.getComponent(), mobilyticsMetricsTimer.getSubComponent(), mobilyticsMetricsTimer.getElapsedTime(), true, mobilyticsMetricsTimer.getOwnerIdentifier());
        createTimer.setContentProvider(str);
        createTimer.finishTimer();
        this.mobilytics.recordTimer(createTimer);
    }

    public void recordTimedProviderMetric(MobilyticsMetricsTimer mobilyticsMetricsTimer, String str, @Nullable String str2) {
        if (mobilyticsMetricsTimer == null) {
            return;
        }
        mobilyticsMetricsTimer.finishTimer();
        recordDurationProviderMetric(mobilyticsMetricsTimer.getEventName(), mobilyticsMetricsTimer.getElapsedTime(), str, str2);
    }

    public MobilyticsMetricsTimer startTimedOperationalEvent(String str) {
        return this.mobilytics.createTimer(str, MobilyticsConstants.COMPONENT, MobilyticsConstants.SUBCOMPONENT, OwnerIdentifier.SH_CAMERAS);
    }

    public void recordOccurrenceEvent(String str, boolean z) {
        this.mobilytics.recordOccurrence(str, z, MobilyticsConstants.COMPONENT, MobilyticsConstants.SUBCOMPONENT, OwnerIdentifier.SH_CAMERAS);
    }

    public void recordOperationalEvent(String str) {
        recordOperationalEvent(str, null);
    }
}
