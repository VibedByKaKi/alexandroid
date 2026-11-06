package com.amazon.alexa.client.alexaservice.networking.interceptors;

import com.amazon.alexa.auth.TokenProvider;
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
public final class AuthorizationInterceptor_Factory implements Factory<AuthorizationInterceptor> {
    private final Provider<TokenProvider> tokenProvider;

    public AuthorizationInterceptor_Factory(Provider<TokenProvider> provider) {
        this.tokenProvider = provider;
    }

    public static AuthorizationInterceptor_Factory create(Provider<TokenProvider> provider) {
        return new AuthorizationInterceptor_Factory(provider);
    }

    public static AuthorizationInterceptor newInstance(TokenProvider tokenProvider) {
        return new AuthorizationInterceptor(tokenProvider);
    }

    @Override // javax.inject.Provider
    public AuthorizationInterceptor get() {
        return newInstance(this.tokenProvider.get());
    }
}
