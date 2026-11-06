package com.amazon.alexa.auto.navigation;

import android.content.Context;
import android.content.pm.PackageManager;
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
/* loaded from: classes17.dex */
public final class PreferredNavigationAppContentProviderModule_ProvidePackageManagerFactory implements Factory<PackageManager> {
    private final Provider<Context> contextProvider;
    private final PreferredNavigationAppContentProviderModule module;

    public PreferredNavigationAppContentProviderModule_ProvidePackageManagerFactory(PreferredNavigationAppContentProviderModule preferredNavigationAppContentProviderModule, Provider<Context> provider) {
        this.module = preferredNavigationAppContentProviderModule;
        this.contextProvider = provider;
    }

    public static PreferredNavigationAppContentProviderModule_ProvidePackageManagerFactory create(PreferredNavigationAppContentProviderModule preferredNavigationAppContentProviderModule, Provider<Context> provider) {
        return new PreferredNavigationAppContentProviderModule_ProvidePackageManagerFactory(preferredNavigationAppContentProviderModule, provider);
    }

    public static PackageManager providePackageManager(PreferredNavigationAppContentProviderModule preferredNavigationAppContentProviderModule, Context context) {
        return (PackageManager) Preconditions.checkNotNullFromProvides(preferredNavigationAppContentProviderModule.providePackageManager(context));
    }

    @Override // javax.inject.Provider
    public PackageManager get() {
        return providePackageManager(this.module, this.contextProvider.get());
    }
}
