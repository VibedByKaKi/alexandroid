package com.amazon.dee.app.dependencies;

import com.amazon.dee.app.config.AppEnvironmentConfig;
import com.amazon.dee.app.services.marketplace.MarketplaceConfigProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class MarketplaceModule_ProvideMarketplaceConfigProviderFactory implements Factory<MarketplaceConfigProvider> {
    private final Provider<AppEnvironmentConfig> environmentConfigProvider;
    private final MarketplaceModule module;

    public MarketplaceModule_ProvideMarketplaceConfigProviderFactory(MarketplaceModule marketplaceModule, Provider<AppEnvironmentConfig> provider) {
        this.module = marketplaceModule;
        this.environmentConfigProvider = provider;
    }

    public static MarketplaceModule_ProvideMarketplaceConfigProviderFactory create(MarketplaceModule marketplaceModule, Provider<AppEnvironmentConfig> provider) {
        return new MarketplaceModule_ProvideMarketplaceConfigProviderFactory(marketplaceModule, provider);
    }

    public static MarketplaceConfigProvider provideMarketplaceConfigProvider(MarketplaceModule marketplaceModule, AppEnvironmentConfig appEnvironmentConfig) {
        return (MarketplaceConfigProvider) Preconditions.checkNotNullFromProvides(marketplaceModule.provideMarketplaceConfigProvider(appEnvironmentConfig));
    }

    @Override // javax.inject.Provider
    public MarketplaceConfigProvider get() {
        return provideMarketplaceConfigProvider(this.module, this.environmentConfigProvider.get());
    }
}
