package com.amazon.photos.discovery.internal.dagger.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes5.dex */
public final class DiscoveryModule_ProvideScanBatchSizeFactory implements Factory<Integer> {
    private final DiscoveryModule module;

    public DiscoveryModule_ProvideScanBatchSizeFactory(DiscoveryModule discoveryModule) {
        this.module = discoveryModule;
    }

    public static DiscoveryModule_ProvideScanBatchSizeFactory create(DiscoveryModule discoveryModule) {
        return new DiscoveryModule_ProvideScanBatchSizeFactory(discoveryModule);
    }

    public static int provideScanBatchSize(DiscoveryModule discoveryModule) {
        return discoveryModule.provideScanBatchSize();
    }

    @Override // javax.inject.Provider
    public Integer get() {
        return Integer.valueOf(provideScanBatchSize(this.module));
    }
}
