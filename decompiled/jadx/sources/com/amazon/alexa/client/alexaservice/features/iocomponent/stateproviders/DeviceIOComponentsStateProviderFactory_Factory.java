package com.amazon.alexa.client.alexaservice.features.iocomponent.stateproviders;

import android.content.pm.PackageManager;
import com.amazon.alexa.client.alexaservice.base.auth.AuthorizationAuthority;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes17.dex */
public final class DeviceIOComponentsStateProviderFactory_Factory implements Factory<DeviceIOComponentsStateProviderFactory> {
    private final Provider<String> androidIdProvider;
    private final Provider<AuthorizationAuthority> authorizationAuthorityProvider;
    private final Provider<PackageManager> packageManagerProvider;

    public DeviceIOComponentsStateProviderFactory_Factory(Provider<String> provider, Provider<PackageManager> provider2, Provider<AuthorizationAuthority> provider3) {
        this.androidIdProvider = provider;
        this.packageManagerProvider = provider2;
        this.authorizationAuthorityProvider = provider3;
    }

    public static DeviceIOComponentsStateProviderFactory_Factory create(Provider<String> provider, Provider<PackageManager> provider2, Provider<AuthorizationAuthority> provider3) {
        return new DeviceIOComponentsStateProviderFactory_Factory(provider, provider2, provider3);
    }

    public static DeviceIOComponentsStateProviderFactory newInstance(String str, PackageManager packageManager, AuthorizationAuthority authorizationAuthority) {
        return new DeviceIOComponentsStateProviderFactory(str, packageManager, authorizationAuthority);
    }

    @Override // javax.inject.Provider
    public DeviceIOComponentsStateProviderFactory get() {
        return newInstance(this.androidIdProvider.get(), this.packageManagerProvider.get(), this.authorizationAuthorityProvider.get());
    }
}
