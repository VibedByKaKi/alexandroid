package com.amazon.comms.calling.data.dataSource;

import com.amazon.comms.calling.foundation.features.FeatureCheck;
import com.amazon.comms.calling.foundation.features.providers.IdentityServiceProvider;
import com.amazon.comms.calling.foundation.storage.providers.StorageProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes20.dex */
public final class AORDataSource_Factory implements Factory<AORDataSource> {
    private final Provider<String> baseUrlProvider;
    private final Provider<FeatureCheck> featureCheckProvider;
    private final Provider<IdentityServiceProvider> identityServiceProvider;
    private final Provider<StorageProvider> sharedPreferenceStorageProvider;

    public AORDataSource_Factory(Provider<IdentityServiceProvider> provider, Provider<StorageProvider> provider2, Provider<FeatureCheck> provider3, Provider<String> provider4) {
        this.identityServiceProvider = provider;
        this.sharedPreferenceStorageProvider = provider2;
        this.featureCheckProvider = provider3;
        this.baseUrlProvider = provider4;
    }

    public static AORDataSource_Factory create(Provider<IdentityServiceProvider> provider, Provider<StorageProvider> provider2, Provider<FeatureCheck> provider3, Provider<String> provider4) {
        return new AORDataSource_Factory(provider, provider2, provider3, provider4);
    }

    public static AORDataSource newInstance(IdentityServiceProvider identityServiceProvider, StorageProvider storageProvider, FeatureCheck featureCheck, String str) {
        return new AORDataSource(identityServiceProvider, storageProvider, featureCheck, str);
    }

    @Override // javax.inject.Provider
    public AORDataSource get() {
        return newInstance(this.identityServiceProvider.get(), this.sharedPreferenceStorageProvider.get(), this.featureCheckProvider.get(), this.baseUrlProvider.get());
    }
}
