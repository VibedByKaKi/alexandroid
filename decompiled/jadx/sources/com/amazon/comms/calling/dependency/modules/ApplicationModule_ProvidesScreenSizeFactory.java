package com.amazon.comms.calling.dependency.modules;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes20.dex */
public final class ApplicationModule_ProvidesScreenSizeFactory implements Factory<Double> {
    private final Provider<Context> contextProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesScreenSizeFactory(ApplicationModule applicationModule, Provider<Context> provider) {
        this.module = applicationModule;
        this.contextProvider = provider;
    }

    public static ApplicationModule_ProvidesScreenSizeFactory create(ApplicationModule applicationModule, Provider<Context> provider) {
        return new ApplicationModule_ProvidesScreenSizeFactory(applicationModule, provider);
    }

    public static double providesScreenSize(ApplicationModule applicationModule, Context context) {
        return applicationModule.providesScreenSize(context);
    }

    @Override // javax.inject.Provider
    public Double get() {
        return Double.valueOf(providesScreenSize(this.module, this.contextProvider.get()));
    }
}
