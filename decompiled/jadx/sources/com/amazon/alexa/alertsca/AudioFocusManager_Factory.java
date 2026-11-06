package com.amazon.alexa.alertsca;

import android.media.AudioManager;
import com.amazon.alexa.alertsca.metrics.service.MetricsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class AudioFocusManager_Factory implements Factory<AudioFocusManager> {
    private final Provider<AudioManager> audioManagerProvider;
    private final Provider<MetricsService> metricsServiceProvider;

    public AudioFocusManager_Factory(Provider<AudioManager> provider, Provider<MetricsService> provider2) {
        this.audioManagerProvider = provider;
        this.metricsServiceProvider = provider2;
    }

    public static AudioFocusManager_Factory create(Provider<AudioManager> provider, Provider<MetricsService> provider2) {
        return new AudioFocusManager_Factory(provider, provider2);
    }

    public static AudioFocusManager newInstance(AudioManager audioManager, MetricsService metricsService) {
        return new AudioFocusManager(audioManager, metricsService);
    }

    @Override // javax.inject.Provider
    public AudioFocusManager get() {
        return newInstance(this.audioManagerProvider.get(), this.metricsServiceProvider.get());
    }
}
