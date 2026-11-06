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
public final class AudioFocusManager_Factory implements Factory<AudioFocusManager> {
    private final Provider<Context> contextProvider;

    public AudioFocusManager_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static AudioFocusManager_Factory create(Provider<Context> provider) {
        return new AudioFocusManager_Factory(provider);
    }

    public static AudioFocusManager newInstance(Context context) {
        return new AudioFocusManager(context);
    }

    @Override // javax.inject.Provider
    public AudioFocusManager get() {
        return newInstance(this.contextProvider.get());
    }
}
