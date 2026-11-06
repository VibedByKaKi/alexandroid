package com.amazon.alexa.auth;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class AccountManagerModule_ProvidesAccountManagerFactory implements Factory<AccountManager> {
    private final Provider<Context> contextProvider;
    private final AccountManagerModule module;

    public AccountManagerModule_ProvidesAccountManagerFactory(AccountManagerModule accountManagerModule, Provider<Context> provider) {
        this.module = accountManagerModule;
        this.contextProvider = provider;
    }

    public static AccountManagerModule_ProvidesAccountManagerFactory create(AccountManagerModule accountManagerModule, Provider<Context> provider) {
        return new AccountManagerModule_ProvidesAccountManagerFactory(accountManagerModule, provider);
    }

    public static AccountManager providesAccountManager(AccountManagerModule accountManagerModule, Context context) {
        return (AccountManager) Preconditions.checkNotNullFromProvides(accountManagerModule.providesAccountManager(context));
    }

    @Override // javax.inject.Provider
    public AccountManager get() {
        return providesAccountManager(this.module, this.contextProvider.get());
    }
}
