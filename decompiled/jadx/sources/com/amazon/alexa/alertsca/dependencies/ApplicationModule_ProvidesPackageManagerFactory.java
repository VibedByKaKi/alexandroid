package com.amazon.alexa.alertsca.dependencies;

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
/* loaded from: classes16.dex */
public final class ApplicationModule_ProvidesPackageManagerFactory implements Factory<PackageManager> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesPackageManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesPackageManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesPackageManagerFactory(applicationModule);
    }

    public static PackageManager providesPackageManager(ApplicationModule applicationModule) {
        return (PackageManager) Preconditions.checkNotNullFromProvides(applicationModule.providesPackageManager());
    }

    @Override // javax.inject.Provider
    public PackageManager get() {
        return providesPackageManager(this.module);
    }
}
