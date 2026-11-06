package com.amazon.alexa.client.alexaservice.vad.audio.mode;

import com.amazon.alexa.client.alexaservice.base.metrics.MetricsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class AudioModeController_Factory implements Factory<AudioModeController> {
    private final Provider<MetricsService> metricsServiceProvider;
    private final Provider<AudioModeProvider> providerProvider;

    public AudioModeController_Factory(Provider<AudioModeProvider> provider, Provider<MetricsService> provider2) {
        this.providerProvider = provider;
        this.metricsServiceProvider = provider2;
    }

    public static AudioModeController_Factory create(Provider<AudioModeProvider> provider, Provider<MetricsService> provider2) {
        return new AudioModeController_Factory(provider, provider2);
    }

    public static AudioModeController newInstance(AudioModeProvider audioModeProvider, MetricsService metricsService) {
        return new AudioModeController(audioModeProvider, metricsService);
    }

    @Override // javax.inject.Provider
    public AudioModeController get() {
        return newInstance(this.providerProvider.get(), this.metricsServiceProvider.get());
    }
}
