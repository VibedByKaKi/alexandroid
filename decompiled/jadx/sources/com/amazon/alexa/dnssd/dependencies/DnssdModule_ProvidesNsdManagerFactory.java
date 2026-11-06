package com.amazon.alexa.dnssd.dependencies;

import android.net.nsd.NsdManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class DnssdModule_ProvidesNsdManagerFactory implements Factory<NsdManager> {
    private final DnssdModule module;

    public DnssdModule_ProvidesNsdManagerFactory(DnssdModule dnssdModule) {
        this.module = dnssdModule;
    }

    public static DnssdModule_ProvidesNsdManagerFactory create(DnssdModule dnssdModule) {
        return new DnssdModule_ProvidesNsdManagerFactory(dnssdModule);
    }

    public static NsdManager providesNsdManager(DnssdModule dnssdModule) {
        return (NsdManager) Preconditions.checkNotNullFromProvides(dnssdModule.providesNsdManager());
    }

    @Override // javax.inject.Provider
    public NsdManager get() {
        return providesNsdManager(this.module);
    }
}
