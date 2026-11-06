package com.amazon.alexa.dnssd.dependencies;

import com.amazon.alexa.dnssd.util.ObjectMapperFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class DnssdModule_ProvideObjectMapperFactoryFactory implements Factory<ObjectMapperFactory> {
    private final DnssdModule module;

    public DnssdModule_ProvideObjectMapperFactoryFactory(DnssdModule dnssdModule) {
        this.module = dnssdModule;
    }

    public static DnssdModule_ProvideObjectMapperFactoryFactory create(DnssdModule dnssdModule) {
        return new DnssdModule_ProvideObjectMapperFactoryFactory(dnssdModule);
    }

    public static ObjectMapperFactory provideObjectMapperFactory(DnssdModule dnssdModule) {
        return (ObjectMapperFactory) Preconditions.checkNotNullFromProvides(dnssdModule.provideObjectMapperFactory());
    }

    @Override // javax.inject.Provider
    public ObjectMapperFactory get() {
        return provideObjectMapperFactory(this.module);
    }
}
