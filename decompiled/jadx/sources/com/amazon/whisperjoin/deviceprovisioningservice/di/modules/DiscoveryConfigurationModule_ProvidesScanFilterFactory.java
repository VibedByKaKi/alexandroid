package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import android.bluetooth.le.ScanFilter;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class DiscoveryConfigurationModule_ProvidesScanFilterFactory implements Factory<List<ScanFilter>> {
    private final Provider<Context> contextProvider;
    private final DiscoveryConfigurationModule module;

    public DiscoveryConfigurationModule_ProvidesScanFilterFactory(DiscoveryConfigurationModule discoveryConfigurationModule, Provider<Context> provider) {
        this.module = discoveryConfigurationModule;
        this.contextProvider = provider;
    }

    public static DiscoveryConfigurationModule_ProvidesScanFilterFactory create(DiscoveryConfigurationModule discoveryConfigurationModule, Provider<Context> provider) {
        return new DiscoveryConfigurationModule_ProvidesScanFilterFactory(discoveryConfigurationModule, provider);
    }

    public static List<ScanFilter> providesScanFilter(DiscoveryConfigurationModule discoveryConfigurationModule, Context context) {
        return (List) Preconditions.checkNotNull(discoveryConfigurationModule.providesScanFilter(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public List<ScanFilter> get() {
        return providesScanFilter(this.module, this.contextProvider.get());
    }
}
