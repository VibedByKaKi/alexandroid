package com.dee.app.contacts.common.dagger.modules;

import android.content.Context;
import android.content.SharedPreferences;
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
/* loaded from: classes6.dex */
public final class AppModule_ProvideSharedPreferencesFactory implements Factory<SharedPreferences> {
    private final Provider<Context> contextProvider;
    private final AppModule module;

    public AppModule_ProvideSharedPreferencesFactory(AppModule appModule, Provider<Context> provider) {
        this.module = appModule;
        this.contextProvider = provider;
    }

    public static AppModule_ProvideSharedPreferencesFactory create(AppModule appModule, Provider<Context> provider) {
        return new AppModule_ProvideSharedPreferencesFactory(appModule, provider);
    }

    public static SharedPreferences provideSharedPreferences(AppModule appModule, Context context) {
        return (SharedPreferences) Preconditions.checkNotNullFromProvides(appModule.provideSharedPreferences(context));
    }

    @Override // javax.inject.Provider
    public SharedPreferences get() {
        return provideSharedPreferences(this.module, this.contextProvider.get());
    }
}
