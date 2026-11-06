package com.amazon.alexa.client.alexaservice.base.application;

import android.app.AlarmManager;
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
@QualifierMetadata
/* loaded from: classes17.dex */
public final class ContextModule_ProvidesAlarmManagerFactory implements Factory<AlarmManager> {
    private final Provider<Context> contextProvider;
    private final ContextModule module;

    public ContextModule_ProvidesAlarmManagerFactory(ContextModule contextModule, Provider<Context> provider) {
        this.module = contextModule;
        this.contextProvider = provider;
    }

    public static ContextModule_ProvidesAlarmManagerFactory create(ContextModule contextModule, Provider<Context> provider) {
        return new ContextModule_ProvidesAlarmManagerFactory(contextModule, provider);
    }

    public static AlarmManager providesAlarmManager(ContextModule contextModule, Context context) {
        return (AlarmManager) Preconditions.checkNotNullFromProvides(contextModule.providesAlarmManager(context));
    }

    @Override // javax.inject.Provider
    public AlarmManager get() {
        return providesAlarmManager(this.module, this.contextProvider.get());
    }
}
