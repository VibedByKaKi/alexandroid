package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import android.content.Context;
import com.amazon.whisperjoin.deviceprovisioningservice.util.SharedPreferencesProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ContextModule_ProvidesSharedPreferencesProviderFactory implements Factory<SharedPreferencesProvider> {
    private final Provider<Context> contextProvider;
    private final ContextModule module;

    public ContextModule_ProvidesSharedPreferencesProviderFactory(ContextModule contextModule, Provider<Context> provider) {
        this.module = contextModule;
        this.contextProvider = provider;
    }

    public static ContextModule_ProvidesSharedPreferencesProviderFactory create(ContextModule contextModule, Provider<Context> provider) {
        return new ContextModule_ProvidesSharedPreferencesProviderFactory(contextModule, provider);
    }

    public static SharedPreferencesProvider providesSharedPreferencesProvider(ContextModule contextModule, Context context) {
        return (SharedPreferencesProvider) Preconditions.checkNotNull(contextModule.providesSharedPreferencesProvider(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public SharedPreferencesProvider get() {
        return providesSharedPreferencesProvider(this.module, this.contextProvider.get());
    }
}
