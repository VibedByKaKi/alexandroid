package com.amazon.comms.calling.data.network;

import com.amazon.comms.ringservice.dagger.RingService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class CallQualityMetricsProviderImpl_Factory implements Factory<CallQualityMetricsProviderImpl> {
    private final Provider<RingService> ringServiceProvider;

    public CallQualityMetricsProviderImpl_Factory(Provider<RingService> provider) {
        this.ringServiceProvider = provider;
    }

    public static CallQualityMetricsProviderImpl_Factory create(Provider<RingService> provider) {
        return new CallQualityMetricsProviderImpl_Factory(provider);
    }

    public static CallQualityMetricsProviderImpl newInstance(RingService ringService) {
        return new CallQualityMetricsProviderImpl(ringService);
    }

    @Override // javax.inject.Provider
    public CallQualityMetricsProviderImpl get() {
        return newInstance(this.ringServiceProvider.get());
    }
}
