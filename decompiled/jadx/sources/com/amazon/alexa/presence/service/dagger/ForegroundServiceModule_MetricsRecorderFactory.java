package com.amazon.alexa.presence.service.dagger;

import com.amazon.alexa.presence.library.MetricsRecorder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes18.dex */
public final class ForegroundServiceModule_MetricsRecorderFactory implements Factory<MetricsRecorder> {
    private final ForegroundServiceModule module;

    public ForegroundServiceModule_MetricsRecorderFactory(ForegroundServiceModule foregroundServiceModule) {
        this.module = foregroundServiceModule;
    }

    public static ForegroundServiceModule_MetricsRecorderFactory create(ForegroundServiceModule foregroundServiceModule) {
        return new ForegroundServiceModule_MetricsRecorderFactory(foregroundServiceModule);
    }

    public static MetricsRecorder metricsRecorder(ForegroundServiceModule foregroundServiceModule) {
        return (MetricsRecorder) Preconditions.checkNotNullFromProvides(foregroundServiceModule.metricsRecorder());
    }

    @Override // javax.inject.Provider
    public MetricsRecorder get() {
        return metricsRecorder(this.module);
    }
}
