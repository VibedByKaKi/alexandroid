package com.amazon.alexa.client.core.marketplace;

import com.amazon.alexa.auth.AccountManager;
import com.amazon.alexa.client.core.device.PersistentStorage;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class MarketplaceAuthority_Factory implements Factory<MarketplaceAuthority> {
    private final Provider<AccountManager> accountManagerProvider;
    private final Provider<PersistentStorage> persistentStorageProvider;

    public MarketplaceAuthority_Factory(Provider<AccountManager> provider, Provider<PersistentStorage> provider2) {
        this.accountManagerProvider = provider;
        this.persistentStorageProvider = provider2;
    }

    public static MarketplaceAuthority_Factory create(Provider<AccountManager> provider, Provider<PersistentStorage> provider2) {
        return new MarketplaceAuthority_Factory(provider, provider2);
    }

    public static MarketplaceAuthority newInstance(AccountManager accountManager, Lazy<PersistentStorage> lazy) {
        return new MarketplaceAuthority(accountManager, lazy);
    }

    @Override // javax.inject.Provider
    public MarketplaceAuthority get() {
        return newInstance(this.accountManagerProvider.get(), DoubleCheck.lazy(this.persistentStorageProvider));
    }
}
