package com.amazon.alexa.growthcore.service.metadata;

import com.amazon.alexa.protocols.environment.EnvironmentService;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class MetadataProvider_Factory implements Factory<MetadataProvider> {
    private final Provider<EnvironmentService> environmentServiceProvider;

    public MetadataProvider_Factory(Provider<EnvironmentService> provider) {
        this.environmentServiceProvider = provider;
    }

    public static MetadataProvider_Factory create(Provider<EnvironmentService> provider) {
        return new MetadataProvider_Factory(provider);
    }

    public static MetadataProvider newInstance(Lazy<EnvironmentService> lazy) {
        return new MetadataProvider(lazy);
    }

    @Override // javax.inject.Provider
    public MetadataProvider get() {
        return newInstance(DoubleCheck.lazy(this.environmentServiceProvider));
    }
}
