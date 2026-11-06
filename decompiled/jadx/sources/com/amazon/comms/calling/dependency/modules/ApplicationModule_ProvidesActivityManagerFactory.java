package com.amazon.comms.calling.dependency.modules;

import android.app.ActivityManager;
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
/* loaded from: classes20.dex */
public final class ApplicationModule_ProvidesActivityManagerFactory implements Factory<ActivityManager> {
    private final Provider<Context> contextProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesActivityManagerFactory(ApplicationModule applicationModule, Provider<Context> provider) {
        this.module = applicationModule;
        this.contextProvider = provider;
    }

    public static ApplicationModule_ProvidesActivityManagerFactory create(ApplicationModule applicationModule, Provider<Context> provider) {
        return new ApplicationModule_ProvidesActivityManagerFactory(applicationModule, provider);
    }

    public static ActivityManager providesActivityManager(ApplicationModule applicationModule, Context context) {
        return (ActivityManager) Preconditions.checkNotNullFromProvides(applicationModule.providesActivityManager(context));
    }

    @Override // javax.inject.Provider
    public ActivityManager get() {
        return providesActivityManager(this.module, this.contextProvider.get());
    }
}
