package com.dee.app.contacts.common.dagger.modules;

import com.dee.app.contacts.common.utils.ActivityLifecycleUtil;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class AppModule_ProvideActivityLifecycleUtilFactory implements Factory<ActivityLifecycleUtil> {
    private final AppModule module;

    public AppModule_ProvideActivityLifecycleUtilFactory(AppModule appModule) {
        this.module = appModule;
    }

    public static AppModule_ProvideActivityLifecycleUtilFactory create(AppModule appModule) {
        return new AppModule_ProvideActivityLifecycleUtilFactory(appModule);
    }

    public static ActivityLifecycleUtil provideActivityLifecycleUtil(AppModule appModule) {
        return (ActivityLifecycleUtil) Preconditions.checkNotNullFromProvides(appModule.provideActivityLifecycleUtil());
    }

    @Override // javax.inject.Provider
    public ActivityLifecycleUtil get() {
        return provideActivityLifecycleUtil(this.module);
    }
}
