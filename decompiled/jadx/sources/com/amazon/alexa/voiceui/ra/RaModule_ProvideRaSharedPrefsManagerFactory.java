package com.amazon.alexa.voiceui.ra;

import android.content.Context;
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
/* loaded from: classes20.dex */
public final class RaModule_ProvideRaSharedPrefsManagerFactory implements Factory<RaPreferenceStorage> {
    private final Provider<Context> contextProvider;

    public RaModule_ProvideRaSharedPrefsManagerFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static RaModule_ProvideRaSharedPrefsManagerFactory create(Provider<Context> provider) {
        return new RaModule_ProvideRaSharedPrefsManagerFactory(provider);
    }

    public static RaPreferenceStorage provideRaSharedPrefsManager(Context context) {
        return (RaPreferenceStorage) Preconditions.checkNotNullFromProvides(RaModule.provideRaSharedPrefsManager(context));
    }

    @Override // javax.inject.Provider
    public RaPreferenceStorage get() {
        return provideRaSharedPrefsManager(this.contextProvider.get());
    }
}
