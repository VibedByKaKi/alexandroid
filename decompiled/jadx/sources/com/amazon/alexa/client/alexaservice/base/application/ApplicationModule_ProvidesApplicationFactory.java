package com.amazon.alexa.client.alexaservice.base.application;

import android.app.Application;
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
public final class ApplicationModule_ProvidesApplicationFactory implements Factory<Application> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesApplicationFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesApplicationFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesApplicationFactory(applicationModule);
    }

    public static Application providesApplication(ApplicationModule applicationModule) {
        return (Application) Preconditions.checkNotNullFromProvides(applicationModule.providesApplication());
    }

    @Override // javax.inject.Provider
    public Application get() {
        return providesApplication(this.module);
    }
}
