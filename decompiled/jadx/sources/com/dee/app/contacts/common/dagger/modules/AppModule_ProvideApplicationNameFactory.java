package com.dee.app.contacts.common.dagger.modules;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes6.dex */
public final class AppModule_ProvideApplicationNameFactory implements Factory<String> {
    private final Provider<Context> contextProvider;
    private final AppModule module;

    public AppModule_ProvideApplicationNameFactory(AppModule appModule, Provider<Context> provider) {
        this.module = appModule;
        this.contextProvider = provider;
    }

    public static AppModule_ProvideApplicationNameFactory create(AppModule appModule, Provider<Context> provider) {
        return new AppModule_ProvideApplicationNameFactory(appModule, provider);
    }

    public static String provideApplicationName(AppModule appModule, Context context) {
        return (String) Preconditions.checkNotNullFromProvides(appModule.provideApplicationName(context));
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideApplicationName(this.module, this.contextProvider.get());
    }
}
