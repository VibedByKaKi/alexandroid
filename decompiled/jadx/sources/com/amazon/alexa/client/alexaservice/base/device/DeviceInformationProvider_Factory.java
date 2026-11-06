package com.amazon.alexa.client.alexaservice.base.device;

import android.content.Context;
import com.amazon.alexa.client.alexaservice.base.auth.AuthorizationAuthority;
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
public final class DeviceInformationProvider_Factory implements Factory<DeviceInformationProvider> {
    private final Provider<AuthorizationAuthority> authorizationAuthorityProvider;
    private final Provider<Context> contextProvider;

    public DeviceInformationProvider_Factory(Provider<Context> provider, Provider<AuthorizationAuthority> provider2) {
        this.contextProvider = provider;
        this.authorizationAuthorityProvider = provider2;
    }

    public static DeviceInformationProvider_Factory create(Provider<Context> provider, Provider<AuthorizationAuthority> provider2) {
        return new DeviceInformationProvider_Factory(provider, provider2);
    }

    public static DeviceInformationProvider newInstance(Context context, AuthorizationAuthority authorizationAuthority) {
        return new DeviceInformationProvider(context, authorizationAuthority);
    }

    @Override // javax.inject.Provider
    public DeviceInformationProvider get() {
        return newInstance(this.contextProvider.get(), this.authorizationAuthorityProvider.get());
    }
}
