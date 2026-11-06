package com.amazon.alexa.client.alexaservice.audio.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes17.dex */
public final class SoundAuthority_Factory implements Factory<SoundAuthority> {
    private final Provider<SoundWrapper> scoSoundWrapperProvider;
    private final Provider<SoundWrapper> soundWrapperProvider;

    public SoundAuthority_Factory(Provider<SoundWrapper> provider, Provider<SoundWrapper> provider2) {
        this.soundWrapperProvider = provider;
        this.scoSoundWrapperProvider = provider2;
    }

    public static SoundAuthority_Factory create(Provider<SoundWrapper> provider, Provider<SoundWrapper> provider2) {
        return new SoundAuthority_Factory(provider, provider2);
    }

    public static SoundAuthority newInstance(Object obj, Object obj2) {
        return new SoundAuthority((SoundWrapper) obj, (SoundWrapper) obj2);
    }

    @Override // javax.inject.Provider
    public SoundAuthority get() {
        return newInstance(this.soundWrapperProvider.get(), this.scoSoundWrapperProvider.get());
    }
}
