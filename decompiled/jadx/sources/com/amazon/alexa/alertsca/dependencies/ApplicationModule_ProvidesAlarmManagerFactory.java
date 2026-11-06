package com.amazon.alexa.alertsca.dependencies;

import android.app.AlarmManager;
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
public final class ApplicationModule_ProvidesAlarmManagerFactory implements Factory<AlarmManager> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAlarmManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesAlarmManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesAlarmManagerFactory(applicationModule);
    }

    public static AlarmManager providesAlarmManager(ApplicationModule applicationModule) {
        return (AlarmManager) Preconditions.checkNotNullFromProvides(applicationModule.providesAlarmManager());
    }

    @Override // javax.inject.Provider
    public AlarmManager get() {
        return providesAlarmManager(this.module);
    }
}
