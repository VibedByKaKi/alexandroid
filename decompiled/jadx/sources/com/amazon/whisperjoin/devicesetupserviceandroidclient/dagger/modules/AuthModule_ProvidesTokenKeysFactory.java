package com.amazon.whisperjoin.devicesetupserviceandroidclient.dagger.modules;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class AuthModule_ProvidesTokenKeysFactory implements Factory<String> {
    private final Provider<Context> contextProvider;
    private final AuthModule module;

    public AuthModule_ProvidesTokenKeysFactory(AuthModule authModule, Provider<Context> provider) {
        this.module = authModule;
        this.contextProvider = provider;
    }

    public static AuthModule_ProvidesTokenKeysFactory create(AuthModule authModule, Provider<Context> provider) {
        return new AuthModule_ProvidesTokenKeysFactory(authModule, provider);
    }

    public static String providesTokenKeys(AuthModule authModule, Context context) {
        return (String) Preconditions.checkNotNull(authModule.providesTokenKeys(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public String get() {
        return providesTokenKeys(this.module, this.contextProvider.get());
    }
}
