package com.amazon.alexa.auto.navigation;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class PreferredNavigationAppContentProviderModule_ProvideContextFactory implements Factory<Context> {
    private final PreferredNavigationAppContentProviderModule module;

    public PreferredNavigationAppContentProviderModule_ProvideContextFactory(PreferredNavigationAppContentProviderModule preferredNavigationAppContentProviderModule) {
        this.module = preferredNavigationAppContentProviderModule;
    }

    public static PreferredNavigationAppContentProviderModule_ProvideContextFactory create(PreferredNavigationAppContentProviderModule preferredNavigationAppContentProviderModule) {
        return new PreferredNavigationAppContentProviderModule_ProvideContextFactory(preferredNavigationAppContentProviderModule);
    }

    public static Context provideContext(PreferredNavigationAppContentProviderModule preferredNavigationAppContentProviderModule) {
        return (Context) Preconditions.checkNotNullFromProvides(preferredNavigationAppContentProviderModule.provideContext());
    }

    @Override // javax.inject.Provider
    public Context get() {
        return provideContext(this.module);
    }
}
