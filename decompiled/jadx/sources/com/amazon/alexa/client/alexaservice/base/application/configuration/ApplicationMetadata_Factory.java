package com.amazon.alexa.client.alexaservice.base.application.configuration;

import android.content.Context;
import android.content.pm.PackageManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class ApplicationMetadata_Factory implements Factory<ApplicationMetadata> {
    private final Provider<Context> contextProvider;
    private final Provider<PackageManager> packageManagerProvider;

    public ApplicationMetadata_Factory(Provider<Context> provider, Provider<PackageManager> provider2) {
        this.contextProvider = provider;
        this.packageManagerProvider = provider2;
    }

    public static ApplicationMetadata_Factory create(Provider<Context> provider, Provider<PackageManager> provider2) {
        return new ApplicationMetadata_Factory(provider, provider2);
    }

    public static ApplicationMetadata newInstance(Context context, PackageManager packageManager) {
        return new ApplicationMetadata(context, packageManager);
    }

    @Override // javax.inject.Provider
    public ApplicationMetadata get() {
        return newInstance(this.contextProvider.get(), this.packageManagerProvider.get());
    }
}
