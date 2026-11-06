package com.amazon.dee.app.dependencies;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ApplicationModule_ProvideApplicationFactory implements Factory<Application> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideApplicationFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideApplicationFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideApplicationFactory(applicationModule);
    }

    public static Application provideApplication(ApplicationModule applicationModule) {
        return (Application) Preconditions.checkNotNullFromProvides(applicationModule.provideApplication());
    }

    @Override // javax.inject.Provider
    public Application get() {
        return provideApplication(this.module);
    }
}
