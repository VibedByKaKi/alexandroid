package com.amazon.alexa.client.alexaservice.base.metrics.tracking;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.crashreporting.CrashReporter;
import com.amazon.alexa.client.metrics.mobilytics.MetricsSessionTracker;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class MetricsSessionTrackerImpl implements MetricsSessionTracker {
    private final CrashReporter crashReporter;

    @Inject
    public MetricsSessionTrackerImpl(CrashReporter crashReporter) {
        this.crashReporter = crashReporter;
    }

    @Override // com.amazon.alexa.client.metrics.mobilytics.MetricsSessionTracker
    public void onIdUpdated(@NonNull String str) {
        this.crashReporter.putMetadata("mobilyticsSessionId", str);
    }
}
