package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import android.net.wifi.WifiManager;
import com.amazon.whisperjoin.deviceprovisioningservice.wifi.CurrentWifiNetworkProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class UtilModule_ProvidesCurrentWifiNetworkProviderFactory implements Factory<CurrentWifiNetworkProvider> {
    private final UtilModule module;
    private final Provider<WifiManager> wifiManagerProvider;

    public UtilModule_ProvidesCurrentWifiNetworkProviderFactory(UtilModule utilModule, Provider<WifiManager> provider) {
        this.module = utilModule;
        this.wifiManagerProvider = provider;
    }

    public static UtilModule_ProvidesCurrentWifiNetworkProviderFactory create(UtilModule utilModule, Provider<WifiManager> provider) {
        return new UtilModule_ProvidesCurrentWifiNetworkProviderFactory(utilModule, provider);
    }

    public static CurrentWifiNetworkProvider providesCurrentWifiNetworkProvider(UtilModule utilModule, WifiManager wifiManager) {
        return (CurrentWifiNetworkProvider) Preconditions.checkNotNull(utilModule.providesCurrentWifiNetworkProvider(wifiManager), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public CurrentWifiNetworkProvider get() {
        return providesCurrentWifiNetworkProvider(this.module, this.wifiManagerProvider.get());
    }
}
