package com.amazon.dee.app.elements.bridges;

import com.amazon.dee.app.services.language.AppLanguageManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.MainScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AppLanguageModuleDelegate_Factory implements Factory<AppLanguageModuleDelegate> {
    private final Provider<AppLanguageManager> appLanguageManagerProvider;

    public AppLanguageModuleDelegate_Factory(Provider<AppLanguageManager> provider) {
        this.appLanguageManagerProvider = provider;
    }

    public static AppLanguageModuleDelegate_Factory create(Provider<AppLanguageManager> provider) {
        return new AppLanguageModuleDelegate_Factory(provider);
    }

    public static AppLanguageModuleDelegate newInstance(AppLanguageManager appLanguageManager) {
        return new AppLanguageModuleDelegate(appLanguageManager);
    }

    @Override // javax.inject.Provider
    public AppLanguageModuleDelegate get() {
        return newInstance(this.appLanguageManagerProvider.get());
    }
}
