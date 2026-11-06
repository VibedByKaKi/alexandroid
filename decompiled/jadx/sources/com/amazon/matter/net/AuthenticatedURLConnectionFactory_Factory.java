package com.amazon.matter.net;

import android.content.Context;
import com.amazon.alexa.identity.api.IdentityService;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class AuthenticatedURLConnectionFactory_Factory implements Factory<AuthenticatedURLConnectionFactory> {
    private final Provider<Context> contextProvider;
    private final Provider<IdentityService> identityServiceProvider;

    public AuthenticatedURLConnectionFactory_Factory(Provider<Context> provider, Provider<IdentityService> provider2) {
        this.contextProvider = provider;
        this.identityServiceProvider = provider2;
    }

    public static AuthenticatedURLConnectionFactory_Factory create(Provider<Context> provider, Provider<IdentityService> provider2) {
        return new AuthenticatedURLConnectionFactory_Factory(provider, provider2);
    }

    public static AuthenticatedURLConnectionFactory newInstance(Context context, IdentityService identityService) {
        return new AuthenticatedURLConnectionFactory(context, identityService);
    }

    @Override // javax.inject.Provider
    public AuthenticatedURLConnectionFactory get() {
        return newInstance(this.contextProvider.get(), this.identityServiceProvider.get());
    }
}
