package com.amazon.alexa.dnssd.dependencies;

import android.net.wifi.WifiManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class DnssdModule_ProvidesMulticastLockFactory implements Factory<WifiManager.MulticastLock> {
    private final DnssdModule module;
    private final Provider<WifiManager> wifiProvider;

    public DnssdModule_ProvidesMulticastLockFactory(DnssdModule dnssdModule, Provider<WifiManager> provider) {
        this.module = dnssdModule;
        this.wifiProvider = provider;
    }

    public static DnssdModule_ProvidesMulticastLockFactory create(DnssdModule dnssdModule, Provider<WifiManager> provider) {
        return new DnssdModule_ProvidesMulticastLockFactory(dnssdModule, provider);
    }

    public static WifiManager.MulticastLock providesMulticastLock(DnssdModule dnssdModule, WifiManager wifiManager) {
        return (WifiManager.MulticastLock) Preconditions.checkNotNullFromProvides(dnssdModule.providesMulticastLock(wifiManager));
    }

    @Override // javax.inject.Provider
    public WifiManager.MulticastLock get() {
        return providesMulticastLock(this.module, this.wifiProvider.get());
    }
}
