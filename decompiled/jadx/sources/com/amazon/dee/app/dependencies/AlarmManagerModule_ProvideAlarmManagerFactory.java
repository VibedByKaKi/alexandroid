package com.amazon.dee.app.dependencies;

import android.app.AlarmManager;
import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AlarmManagerModule_ProvideAlarmManagerFactory implements Factory<AlarmManager> {
    private final Provider<Context> contextProvider;
    private final AlarmManagerModule module;

    public AlarmManagerModule_ProvideAlarmManagerFactory(AlarmManagerModule alarmManagerModule, Provider<Context> provider) {
        this.module = alarmManagerModule;
        this.contextProvider = provider;
    }

    public static AlarmManagerModule_ProvideAlarmManagerFactory create(AlarmManagerModule alarmManagerModule, Provider<Context> provider) {
        return new AlarmManagerModule_ProvideAlarmManagerFactory(alarmManagerModule, provider);
    }

    public static AlarmManager provideAlarmManager(AlarmManagerModule alarmManagerModule, Context context) {
        return (AlarmManager) Preconditions.checkNotNullFromProvides(alarmManagerModule.provideAlarmManager(context));
    }

    @Override // javax.inject.Provider
    public AlarmManager get() {
        return provideAlarmManager(this.module, this.contextProvider.get());
    }
}
