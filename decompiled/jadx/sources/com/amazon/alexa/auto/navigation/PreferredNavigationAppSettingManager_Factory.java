package com.amazon.alexa.auto.navigation;

import android.content.pm.PackageManager;
import com.amazon.alexa.protocols.storage.PersistentStorage;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes17.dex */
public final class PreferredNavigationAppSettingManager_Factory implements Factory<PreferredNavigationAppSettingManager> {
    private final Provider<PackageManager> packageManagerProvider;
    private final Provider<PersistentStorage> persistentStorageProvider;

    public PreferredNavigationAppSettingManager_Factory(Provider<PackageManager> provider, Provider<PersistentStorage> provider2) {
        this.packageManagerProvider = provider;
        this.persistentStorageProvider = provider2;
    }

    public static PreferredNavigationAppSettingManager_Factory create(Provider<PackageManager> provider, Provider<PersistentStorage> provider2) {
        return new PreferredNavigationAppSettingManager_Factory(provider, provider2);
    }

    public static PreferredNavigationAppSettingManager newInstance(PackageManager packageManager, Lazy<PersistentStorage> lazy) {
        return new PreferredNavigationAppSettingManager(packageManager, lazy);
    }

    @Override // javax.inject.Provider
    public PreferredNavigationAppSettingManager get() {
        return newInstance(this.packageManagerProvider.get(), DoubleCheck.lazy(this.persistentStorageProvider));
    }
}
