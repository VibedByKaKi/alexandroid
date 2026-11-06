package com.amazon.apl.android.providers.impl;

import com.amazon.apl.android.providers.ITelemetryProvider;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class NoOpTelemetryProvider implements ITelemetryProvider {
    private static NoOpTelemetryProvider mSingletonInstance;

    private NoOpTelemetryProvider() {
    }

    public static NoOpTelemetryProvider getInstance() {
        if (mSingletonInstance == null) {
            mSingletonInstance = new NoOpTelemetryProvider();
        }
        return mSingletonInstance;
    }

    @Override // com.amazon.apl.android.providers.ITelemetryProvider
    public int createMetricId(String str, String str2, ITelemetryProvider.Type type) {
        return 0;
    }

    @Override // com.amazon.apl.android.providers.ITelemetryProvider
    public int getMetricId(String str, String str2) {
        return 0;
    }

    @Override // com.amazon.apl.android.providers.ITelemetryProvider
    public void incrementCount(int i, int i2) {
    }

    @Override // com.amazon.apl.android.providers.ITelemetryProvider
    public void startTimer(int i, TimeUnit timeUnit, long j) {
    }

    @Override // com.amazon.apl.android.IDocumentLifecycleListener
    public void onDocumentFinish() {
    }

    @Override // com.amazon.apl.android.providers.ITelemetryProvider
    public void fail(int i) {
    }

    @Override // com.amazon.apl.android.providers.ITelemetryProvider
    public void incrementCount(int i) {
    }

    @Override // com.amazon.apl.android.providers.ITelemetryProvider
    public void startTimer(int i) {
    }

    @Override // com.amazon.apl.android.providers.ITelemetryProvider
    public void stopTimer(int i) {
    }
}
