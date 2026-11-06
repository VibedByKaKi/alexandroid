package com.amazon.dee.app.dependencies;

import com.amazon.alexa.voice.app.LatencyReportingDelegate;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class VoiceModule_ProvideLatencyReportingDelegateFactory implements Factory<LatencyReportingDelegate> {
    private final VoiceModule module;

    public VoiceModule_ProvideLatencyReportingDelegateFactory(VoiceModule voiceModule) {
        this.module = voiceModule;
    }

    public static VoiceModule_ProvideLatencyReportingDelegateFactory create(VoiceModule voiceModule) {
        return new VoiceModule_ProvideLatencyReportingDelegateFactory(voiceModule);
    }

    public static LatencyReportingDelegate provideLatencyReportingDelegate(VoiceModule voiceModule) {
        return (LatencyReportingDelegate) Preconditions.checkNotNullFromProvides(voiceModule.provideLatencyReportingDelegate());
    }

    @Override // javax.inject.Provider
    public LatencyReportingDelegate get() {
        return provideLatencyReportingDelegate(this.module);
    }
}
