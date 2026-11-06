package com.amazon.alexa.alertsca.dependencies;

import android.media.AudioManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class ApplicationModule_ProvidesAudioManagerFactory implements Factory<AudioManager> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAudioManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesAudioManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesAudioManagerFactory(applicationModule);
    }

    public static AudioManager providesAudioManager(ApplicationModule applicationModule) {
        return (AudioManager) Preconditions.checkNotNullFromProvides(applicationModule.providesAudioManager());
    }

    @Override // javax.inject.Provider
    public AudioManager get() {
        return providesAudioManager(this.module);
    }
}
