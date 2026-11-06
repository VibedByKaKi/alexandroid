package com.amazon.alexa.hho.navigation.transit.audio;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes13.dex */
public final class NavigationAudioManager_Factory implements Factory<NavigationAudioManager> {
    private final Provider<AudioFocusManager> audioFocusManagerProvider;
    private final Provider<Context> contextProvider;

    public NavigationAudioManager_Factory(Provider<Context> provider, Provider<AudioFocusManager> provider2) {
        this.contextProvider = provider;
        this.audioFocusManagerProvider = provider2;
    }

    public static NavigationAudioManager_Factory create(Provider<Context> provider, Provider<AudioFocusManager> provider2) {
        return new NavigationAudioManager_Factory(provider, provider2);
    }

    public static NavigationAudioManager newInstance(Context context, AudioFocusManager audioFocusManager) {
        return new NavigationAudioManager(context, audioFocusManager);
    }

    @Override // javax.inject.Provider
    public NavigationAudioManager get() {
        return newInstance(this.contextProvider.get(), this.audioFocusManagerProvider.get());
    }
}
