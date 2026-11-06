package com.amazon.comms.calling.dependency.modules;

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
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes20.dex */
public final class ApplicationModule_ProvidesAppVersionFactory implements Factory<String> {
    private final Provider<Context> contextProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppVersionFactory(ApplicationModule applicationModule, Provider<Context> provider) {
        this.module = applicationModule;
        this.contextProvider = provider;
    }

    public static ApplicationModule_ProvidesAppVersionFactory create(ApplicationModule applicationModule, Provider<Context> provider) {
        return new ApplicationModule_ProvidesAppVersionFactory(applicationModule, provider);
    }

    public static String providesAppVersion(ApplicationModule applicationModule, Context context) {
        return (String) Preconditions.checkNotNullFromProvides(applicationModule.providesAppVersion(context));
    }

    @Override // javax.inject.Provider
    public String get() {
        return providesAppVersion(this.module, this.contextProvider.get());
    }
}
