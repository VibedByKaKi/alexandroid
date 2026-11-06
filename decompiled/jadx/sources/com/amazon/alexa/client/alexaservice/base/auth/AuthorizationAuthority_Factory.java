package com.amazon.alexa.client.alexaservice.base.auth;

import com.amazon.alexa.auth.AccountManager;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
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
public final class AuthorizationAuthority_Factory implements Factory<AuthorizationAuthority> {
    private final Provider<AccountManager> accountManagerProvider;
    private final Provider<AlexaClientEventBus> eventBusProvider;

    public AuthorizationAuthority_Factory(Provider<AlexaClientEventBus> provider, Provider<AccountManager> provider2) {
        this.eventBusProvider = provider;
        this.accountManagerProvider = provider2;
    }

    public static AuthorizationAuthority_Factory create(Provider<AlexaClientEventBus> provider, Provider<AccountManager> provider2) {
        return new AuthorizationAuthority_Factory(provider, provider2);
    }

    public static AuthorizationAuthority newInstance(AlexaClientEventBus alexaClientEventBus, AccountManager accountManager) {
        return new AuthorizationAuthority(alexaClientEventBus, accountManager);
    }

    @Override // javax.inject.Provider
    public AuthorizationAuthority get() {
        return newInstance(this.eventBusProvider.get(), this.accountManagerProvider.get());
    }
}
