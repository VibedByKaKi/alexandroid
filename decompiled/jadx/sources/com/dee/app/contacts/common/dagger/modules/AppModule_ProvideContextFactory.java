package com.dee.app.contacts.common.dagger.modules;

import android.content.Context;
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
public final class AppModule_ProvideContextFactory implements Factory<Context> {
    private final AppModule module;

    public AppModule_ProvideContextFactory(AppModule appModule) {
        this.module = appModule;
    }

    public static AppModule_ProvideContextFactory create(AppModule appModule) {
        return new AppModule_ProvideContextFactory(appModule);
    }

    public static Context provideContext(AppModule appModule) {
        return (Context) Preconditions.checkNotNullFromProvides(appModule.provideContext());
    }

    @Override // javax.inject.Provider
    public Context get() {
        return provideContext(this.module);
    }
}
