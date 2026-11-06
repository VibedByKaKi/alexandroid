package com.amazon.alexa.alertsca.dependencies;

import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes16.dex */
public final class ApplicationModule_ProvidesSharedPreferencesFactory implements Factory<SharedPreferences> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesSharedPreferencesFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesSharedPreferencesFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesSharedPreferencesFactory(applicationModule);
    }

    public static SharedPreferences providesSharedPreferences(ApplicationModule applicationModule) {
        return (SharedPreferences) Preconditions.checkNotNullFromProvides(applicationModule.providesSharedPreferences());
    }

    @Override // javax.inject.Provider
    public SharedPreferences get() {
        return providesSharedPreferences(this.module);
    }
}
