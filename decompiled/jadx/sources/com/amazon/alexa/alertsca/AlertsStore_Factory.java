package com.amazon.alexa.alertsca;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class AlertsStore_Factory implements Factory<AlertsStore> {
    private final Provider<AlertsDatabaseHelper> alertsDatabaseHelperProvider;
    private final Provider<AssetDownloader> assetDownloaderProvider;

    public AlertsStore_Factory(Provider<AlertsDatabaseHelper> provider, Provider<AssetDownloader> provider2) {
        this.alertsDatabaseHelperProvider = provider;
        this.assetDownloaderProvider = provider2;
    }

    public static AlertsStore_Factory create(Provider<AlertsDatabaseHelper> provider, Provider<AssetDownloader> provider2) {
        return new AlertsStore_Factory(provider, provider2);
    }

    public static AlertsStore newInstance(AlertsDatabaseHelper alertsDatabaseHelper, AssetDownloader assetDownloader) {
        return new AlertsStore(alertsDatabaseHelper, assetDownloader);
    }

    @Override // javax.inject.Provider
    public AlertsStore get() {
        return newInstance(this.alertsDatabaseHelperProvider.get(), this.assetDownloaderProvider.get());
    }
}
