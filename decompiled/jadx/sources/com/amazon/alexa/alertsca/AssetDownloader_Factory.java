package com.amazon.alexa.alertsca;

import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.io.File;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes16.dex */
public final class AssetDownloader_Factory implements Factory<AssetDownloader> {
    private final Provider<File> cacheDirectoryProvider;

    public AssetDownloader_Factory(Provider<File> provider) {
        this.cacheDirectoryProvider = provider;
    }

    public static AssetDownloader_Factory create(Provider<File> provider) {
        return new AssetDownloader_Factory(provider);
    }

    public static AssetDownloader newInstance(Lazy<File> lazy) {
        return new AssetDownloader(lazy);
    }

    @Override // javax.inject.Provider
    public AssetDownloader get() {
        return newInstance(DoubleCheck.lazy(this.cacheDirectoryProvider));
    }
}
