package com.amazon.alexa.voice.ftue;

import com.amazon.alexa.protocols.storage.PersistentStorage;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class FtueModule_ProvideUserFtuePreferenceFactory implements Factory<UserFtuePreference> {
    private final Provider<PersistentStorage.Factory> factoryProvider;

    public FtueModule_ProvideUserFtuePreferenceFactory(Provider<PersistentStorage.Factory> provider) {
        this.factoryProvider = provider;
    }

    public static FtueModule_ProvideUserFtuePreferenceFactory create(Provider<PersistentStorage.Factory> provider) {
        return new FtueModule_ProvideUserFtuePreferenceFactory(provider);
    }

    public static UserFtuePreference provideUserFtuePreference(PersistentStorage.Factory factory) {
        return (UserFtuePreference) Preconditions.checkNotNullFromProvides(FtueModule.provideUserFtuePreference(factory));
    }

    @Override // javax.inject.Provider
    public UserFtuePreference get() {
        return provideUserFtuePreference(this.factoryProvider.get());
    }
}
