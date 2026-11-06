package com.amazon.alexa.voice.navigation;

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
/* loaded from: classes19.dex */
public final class NavigationModule_ProvidePreferredNavigationAppRepositoryFactory implements Factory<PreferredNavigationAppRepository> {
    private final Provider<Context> contextProvider;
    private final Provider<PreferredNavigationAppContentAccessor> preferredNavigationAppContentAccessorProvider;

    public NavigationModule_ProvidePreferredNavigationAppRepositoryFactory(Provider<Context> provider, Provider<PreferredNavigationAppContentAccessor> provider2) {
        this.contextProvider = provider;
        this.preferredNavigationAppContentAccessorProvider = provider2;
    }

    public static NavigationModule_ProvidePreferredNavigationAppRepositoryFactory create(Provider<Context> provider, Provider<PreferredNavigationAppContentAccessor> provider2) {
        return new NavigationModule_ProvidePreferredNavigationAppRepositoryFactory(provider, provider2);
    }

    public static PreferredNavigationAppRepository providePreferredNavigationAppRepository(Context context, Object obj) {
        return (PreferredNavigationAppRepository) Preconditions.checkNotNullFromProvides(NavigationModule.providePreferredNavigationAppRepository(context, (PreferredNavigationAppContentAccessor) obj));
    }

    @Override // javax.inject.Provider
    public PreferredNavigationAppRepository get() {
        return providePreferredNavigationAppRepository(this.contextProvider.get(), this.preferredNavigationAppContentAccessorProvider.get());
    }
}
