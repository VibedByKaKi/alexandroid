package com.amazon.alexa.client.alexaservice.base.auth;

import com.amazon.alexa.auth.AccountManager;
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
public final class ActorTokenAuthority_Factory implements Factory<ActorTokenAuthority> {
    private final Provider<AccountManager> accountManagerProvider;

    public ActorTokenAuthority_Factory(Provider<AccountManager> provider) {
        this.accountManagerProvider = provider;
    }

    public static ActorTokenAuthority_Factory create(Provider<AccountManager> provider) {
        return new ActorTokenAuthority_Factory(provider);
    }

    public static ActorTokenAuthority newInstance(AccountManager accountManager) {
        return new ActorTokenAuthority(accountManager);
    }

    @Override // javax.inject.Provider
    public ActorTokenAuthority get() {
        return newInstance(this.accountManagerProvider.get());
    }
}
