package com.amazon.alexa.voice.ftue;

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
public final class FtueModule_ProvideFtuePreferenceFactory implements Factory<FtuePreference> {
    private final Provider<UserFtuePreference> userFtuePreferenceProvider;

    public FtueModule_ProvideFtuePreferenceFactory(Provider<UserFtuePreference> provider) {
        this.userFtuePreferenceProvider = provider;
    }

    public static FtueModule_ProvideFtuePreferenceFactory create(Provider<UserFtuePreference> provider) {
        return new FtueModule_ProvideFtuePreferenceFactory(provider);
    }

    public static FtuePreference provideFtuePreference(UserFtuePreference userFtuePreference) {
        return (FtuePreference) Preconditions.checkNotNullFromProvides(FtueModule.provideFtuePreference(userFtuePreference));
    }

    @Override // javax.inject.Provider
    public FtuePreference get() {
        return provideFtuePreference(this.userFtuePreferenceProvider.get());
    }
}
