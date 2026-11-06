package com.amazon.alexa.voice.tta.sdk;

import com.amazon.alexa.voice.tta.typing.TtaMessageSanitizer;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class SdkModule_ProvidesAlexaTextResponseTrackerFactory implements Factory<AlexaTextResponseTracker> {
    private final Provider<TtaMessageSanitizer> messageSanitizerProvider;
    private final SdkModule module;

    public SdkModule_ProvidesAlexaTextResponseTrackerFactory(SdkModule sdkModule, Provider<TtaMessageSanitizer> provider) {
        this.module = sdkModule;
        this.messageSanitizerProvider = provider;
    }

    public static SdkModule_ProvidesAlexaTextResponseTrackerFactory create(SdkModule sdkModule, Provider<TtaMessageSanitizer> provider) {
        return new SdkModule_ProvidesAlexaTextResponseTrackerFactory(sdkModule, provider);
    }

    public static AlexaTextResponseTracker providesAlexaTextResponseTracker(SdkModule sdkModule, TtaMessageSanitizer ttaMessageSanitizer) {
        return (AlexaTextResponseTracker) Preconditions.checkNotNullFromProvides(sdkModule.providesAlexaTextResponseTracker(ttaMessageSanitizer));
    }

    @Override // javax.inject.Provider
    public AlexaTextResponseTracker get() {
        return providesAlexaTextResponseTracker(this.module, this.messageSanitizerProvider.get());
    }
}
