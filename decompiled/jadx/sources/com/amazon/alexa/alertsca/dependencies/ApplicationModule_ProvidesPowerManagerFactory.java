package com.amazon.alexa.alertsca.dependencies;

import android.os.PowerManager;
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
public final class ApplicationModule_ProvidesPowerManagerFactory implements Factory<PowerManager> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesPowerManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesPowerManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesPowerManagerFactory(applicationModule);
    }

    public static PowerManager providesPowerManager(ApplicationModule applicationModule) {
        return (PowerManager) Preconditions.checkNotNullFromProvides(applicationModule.providesPowerManager());
    }

    @Override // javax.inject.Provider
    public PowerManager get() {
        return providesPowerManager(this.module);
    }
}
