package com.amazon.alexa.client.metrics.minerva;

import android.content.Context;
import com.amazon.alexa.auth.TokenProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class MinervaOAuthProvider_Factory implements Factory<MinervaOAuthProvider> {
    private final Provider<Context> contextProvider;
    private final Provider<TokenProvider> tokenProvider;

    public MinervaOAuthProvider_Factory(Provider<Context> provider, Provider<TokenProvider> provider2) {
        this.contextProvider = provider;
        this.tokenProvider = provider2;
    }

    public static MinervaOAuthProvider_Factory create(Provider<Context> provider, Provider<TokenProvider> provider2) {
        return new MinervaOAuthProvider_Factory(provider, provider2);
    }

    public static MinervaOAuthProvider newInstance(Context context, TokenProvider tokenProvider) {
        return new MinervaOAuthProvider(context, tokenProvider);
    }

    @Override // javax.inject.Provider
    public MinervaOAuthProvider get() {
        return newInstance(this.contextProvider.get(), this.tokenProvider.get());
    }
}
