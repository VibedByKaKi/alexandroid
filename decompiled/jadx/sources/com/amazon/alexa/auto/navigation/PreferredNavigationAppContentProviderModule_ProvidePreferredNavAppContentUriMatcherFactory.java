package com.amazon.alexa.auto.navigation;

import android.content.UriMatcher;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes17.dex */
public final class PreferredNavigationAppContentProviderModule_ProvidePreferredNavAppContentUriMatcherFactory implements Factory<UriMatcher> {
    private final PreferredNavigationAppContentProviderModule module;

    public PreferredNavigationAppContentProviderModule_ProvidePreferredNavAppContentUriMatcherFactory(PreferredNavigationAppContentProviderModule preferredNavigationAppContentProviderModule) {
        this.module = preferredNavigationAppContentProviderModule;
    }

    public static PreferredNavigationAppContentProviderModule_ProvidePreferredNavAppContentUriMatcherFactory create(PreferredNavigationAppContentProviderModule preferredNavigationAppContentProviderModule) {
        return new PreferredNavigationAppContentProviderModule_ProvidePreferredNavAppContentUriMatcherFactory(preferredNavigationAppContentProviderModule);
    }

    public static UriMatcher providePreferredNavAppContentUriMatcher(PreferredNavigationAppContentProviderModule preferredNavigationAppContentProviderModule) {
        return (UriMatcher) Preconditions.checkNotNullFromProvides(preferredNavigationAppContentProviderModule.providePreferredNavAppContentUriMatcher());
    }

    @Override // javax.inject.Provider
    public UriMatcher get() {
        return providePreferredNavAppContentUriMatcher(this.module);
    }
}
