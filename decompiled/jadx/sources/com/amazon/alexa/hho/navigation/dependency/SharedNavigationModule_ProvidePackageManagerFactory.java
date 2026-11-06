package com.amazon.alexa.hho.navigation.dependency;

import android.content.pm.PackageManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes13.dex */
public final class SharedNavigationModule_ProvidePackageManagerFactory implements Factory<PackageManager> {
    private final SharedNavigationModule module;

    public SharedNavigationModule_ProvidePackageManagerFactory(SharedNavigationModule sharedNavigationModule) {
        this.module = sharedNavigationModule;
    }

    public static SharedNavigationModule_ProvidePackageManagerFactory create(SharedNavigationModule sharedNavigationModule) {
        return new SharedNavigationModule_ProvidePackageManagerFactory(sharedNavigationModule);
    }

    public static PackageManager providePackageManager(SharedNavigationModule sharedNavigationModule) {
        return (PackageManager) Preconditions.checkNotNullFromProvides(sharedNavigationModule.providePackageManager());
    }

    @Override // javax.inject.Provider
    public PackageManager get() {
        return providePackageManager(this.module);
    }
}
