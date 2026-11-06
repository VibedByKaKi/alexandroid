package com.amazon.alexa.dnssd.dependencies;

import com.amazon.alexa.eventbus.api.EventBus;
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
public final class DnssdModule_ProvideEventBusFactory implements Factory<EventBus> {
    private final DnssdModule module;

    public DnssdModule_ProvideEventBusFactory(DnssdModule dnssdModule) {
        this.module = dnssdModule;
    }

    public static DnssdModule_ProvideEventBusFactory create(DnssdModule dnssdModule) {
        return new DnssdModule_ProvideEventBusFactory(dnssdModule);
    }

    public static EventBus provideEventBus(DnssdModule dnssdModule) {
        return (EventBus) Preconditions.checkNotNullFromProvides(dnssdModule.provideEventBus());
    }

    @Override // javax.inject.Provider
    public EventBus get() {
        return provideEventBus(this.module);
    }
}
