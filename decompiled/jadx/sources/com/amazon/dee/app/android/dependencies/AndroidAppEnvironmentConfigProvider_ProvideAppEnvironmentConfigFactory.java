package com.amazon.dee.app.android.dependencies;

import com.amazon.dee.app.config.AppEnvironmentConfig;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AndroidAppEnvironmentConfigProvider_ProvideAppEnvironmentConfigFactory implements Factory<AppEnvironmentConfig> {
    private final AndroidAppEnvironmentConfigProvider module;

    public AndroidAppEnvironmentConfigProvider_ProvideAppEnvironmentConfigFactory(AndroidAppEnvironmentConfigProvider androidAppEnvironmentConfigProvider) {
        this.module = androidAppEnvironmentConfigProvider;
    }

    public static AndroidAppEnvironmentConfigProvider_ProvideAppEnvironmentConfigFactory create(AndroidAppEnvironmentConfigProvider androidAppEnvironmentConfigProvider) {
        return new AndroidAppEnvironmentConfigProvider_ProvideAppEnvironmentConfigFactory(androidAppEnvironmentConfigProvider);
    }

    public static AppEnvironmentConfig provideAppEnvironmentConfig(AndroidAppEnvironmentConfigProvider androidAppEnvironmentConfigProvider) {
        return (AppEnvironmentConfig) Preconditions.checkNotNullFromProvides(androidAppEnvironmentConfigProvider.provideAppEnvironmentConfig());
    }

    @Override // javax.inject.Provider
    public AppEnvironmentConfig get() {
        return provideAppEnvironmentConfig(this.module);
    }
}
