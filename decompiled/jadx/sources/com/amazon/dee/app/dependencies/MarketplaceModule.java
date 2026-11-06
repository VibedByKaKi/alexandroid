package com.amazon.dee.app.dependencies;

import com.amazon.alexa.marketplace.api.Marketplace;
import com.amazon.alexa.marketplace.api.MarketplaceService;
import com.amazon.alexa.protocols.storage.PersistentStorage;
import com.amazon.dee.app.config.AppEnvironmentConfig;
import com.amazon.dee.app.services.marketplace.FullMarketplaceEndpoints;
import com.amazon.dee.app.services.marketplace.MarketplaceConfigProvider;
import com.amazon.dee.app.services.marketplace.MarketplaceConfiguration;
import com.amazon.dee.app.services.marketplace.PreferredMarketplaceService;
import com.amazon.dee.app.services.marketplace.ProtocolsPreferredMarketplaceService;
import com.dee.app.http.CoralService;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes3.dex */
public class MarketplaceModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FullMarketplaceEndpoints lambda$provideMarketplaceConfigProvider$0(AppEnvironmentConfig appEnvironmentConfig, Marketplace marketplace) {
        return MarketplaceConfiguration.forMarketplace(marketplace, appEnvironmentConfig);
    }

    @Provides
    @ApplicationScope
    public MarketplaceConfigProvider provideMarketplaceConfigProvider(final AppEnvironmentConfig appEnvironmentConfig) {
        return new MarketplaceConfigProvider() { // from class: com.amazon.dee.app.dependencies.MarketplaceModule$$ExternalSyntheticLambda0
            @Override // com.amazon.dee.app.services.marketplace.MarketplaceConfigProvider
            public final FullMarketplaceEndpoints forMarketplace(Marketplace marketplace) {
                FullMarketplaceEndpoints lambda$provideMarketplaceConfigProvider$0;
                lambda$provideMarketplaceConfigProvider$0 = MarketplaceModule.lambda$provideMarketplaceConfigProvider$0(AppEnvironmentConfig.this, marketplace);
                return lambda$provideMarketplaceConfigProvider$0;
            }
        };
    }

    @Provides
    @ApplicationScope
    public MarketplaceService provideMarketplaceService(PersistentStorage.Factory factory, Lazy<CoralService> lazy) {
        return new PreferredMarketplaceService(factory, lazy);
    }

    @Provides
    @ApplicationScope
    public com.amazon.alexa.protocols.marketplace.MarketplaceService provideProtocolsMarketplaceService(PersistentStorage.Factory factory, Lazy<CoralService> lazy) {
        return new ProtocolsPreferredMarketplaceService(factory, lazy);
    }
}
