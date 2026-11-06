package com.amazon.alexa.growth.metrics;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.growth.coachmark.Utils;
import com.amazon.alexa.mobilytics.Mobilytics;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class BIMetricsRecorder {

    @VisibleForTesting
    static final String APP_COMPONENT = "AndroidCoachMarks";
    private static final String OWNER_IDENTIFIER = "5769ad1c-2ea1-4551-ba9a-e55d468fa768";
    private final Provider<Mobilytics> mobilyticsProvider;

    public BIMetricsRecorder(Provider<Mobilytics> provider) {
        this.mobilyticsProvider = provider;
    }

    public void recordEventOccurrence(String[] strArr, String str) {
        this.mobilyticsProvider.get().recordOccurrence(Utils.generateMetricEventName(strArr), true, APP_COMPONENT, str, "5769ad1c-2ea1-4551-ba9a-e55d468fa768");
    }
}
