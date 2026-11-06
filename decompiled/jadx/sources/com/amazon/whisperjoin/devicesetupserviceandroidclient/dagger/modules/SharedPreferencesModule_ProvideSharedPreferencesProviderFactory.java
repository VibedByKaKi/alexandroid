package com.amazon.whisperjoin.devicesetupserviceandroidclient.dagger.modules;

import android.content.Context;
import com.amazon.whisperjoin.devicesetupserviceandroidclient.util.SharedPreferencesProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class SharedPreferencesModule_ProvideSharedPreferencesProviderFactory implements Factory<SharedPreferencesProvider> {
    private final Provider<Context> contextProvider;
    private final SharedPreferencesModule module;

    public SharedPreferencesModule_ProvideSharedPreferencesProviderFactory(SharedPreferencesModule sharedPreferencesModule, Provider<Context> provider) {
        this.module = sharedPreferencesModule;
        this.contextProvider = provider;
    }

    public static SharedPreferencesModule_ProvideSharedPreferencesProviderFactory create(SharedPreferencesModule sharedPreferencesModule, Provider<Context> provider) {
        return new SharedPreferencesModule_ProvideSharedPreferencesProviderFactory(sharedPreferencesModule, provider);
    }

    public static SharedPreferencesProvider provideSharedPreferencesProvider(SharedPreferencesModule sharedPreferencesModule, Context context) {
        return (SharedPreferencesProvider) Preconditions.checkNotNull(sharedPreferencesModule.provideSharedPreferencesProvider(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public SharedPreferencesProvider get() {
        return provideSharedPreferencesProvider(this.module, this.contextProvider.get());
    }
}
