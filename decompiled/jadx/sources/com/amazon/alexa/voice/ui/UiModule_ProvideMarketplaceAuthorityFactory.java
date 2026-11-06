package com.amazon.alexa.voice.ui;

import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.voice.ui.marketplace.MarketplaceAuthority;
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
/* loaded from: classes20.dex */
public final class UiModule_ProvideMarketplaceAuthorityFactory implements Factory<MarketplaceAuthority> {
    private final Provider<IdentityService> identityServiceProvider;

    public UiModule_ProvideMarketplaceAuthorityFactory(Provider<IdentityService> provider) {
        this.identityServiceProvider = provider;
    }

    public static UiModule_ProvideMarketplaceAuthorityFactory create(Provider<IdentityService> provider) {
        return new UiModule_ProvideMarketplaceAuthorityFactory(provider);
    }

    public static MarketplaceAuthority provideMarketplaceAuthority(IdentityService identityService) {
        return (MarketplaceAuthority) Preconditions.checkNotNullFromProvides(UiModule.provideMarketplaceAuthority(identityService));
    }

    @Override // javax.inject.Provider
    public MarketplaceAuthority get() {
        return provideMarketplaceAuthority(this.identityServiceProvider.get());
    }
}
