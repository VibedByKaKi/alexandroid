package com.amazon.comms.calling.dependency.modules;

import android.content.Context;
import android.content.pm.PackageManager;
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
/* loaded from: classes20.dex */
public final class FoundationModule_ProvidesPackageManagerFactory implements Factory<PackageManager> {
    private final Provider<Context> contextProvider;
    private final FoundationModule module;

    public FoundationModule_ProvidesPackageManagerFactory(FoundationModule foundationModule, Provider<Context> provider) {
        this.module = foundationModule;
        this.contextProvider = provider;
    }

    public static FoundationModule_ProvidesPackageManagerFactory create(FoundationModule foundationModule, Provider<Context> provider) {
        return new FoundationModule_ProvidesPackageManagerFactory(foundationModule, provider);
    }

    public static PackageManager providesPackageManager(FoundationModule foundationModule, Context context) {
        return (PackageManager) Preconditions.checkNotNullFromProvides(foundationModule.providesPackageManager(context));
    }

    @Override // javax.inject.Provider
    public PackageManager get() {
        return providesPackageManager(this.module, this.contextProvider.get());
    }
}
