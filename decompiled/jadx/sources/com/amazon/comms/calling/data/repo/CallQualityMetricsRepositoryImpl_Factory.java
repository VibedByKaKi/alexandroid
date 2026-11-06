package com.amazon.comms.calling.data.repo;

import com.amazon.comms.calling.data.network.CallQualityMetricsProvider;
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
public final class CallQualityMetricsRepositoryImpl_Factory implements Factory<CallQualityMetricsRepositoryImpl> {
    private final Provider<CallQualityMetricsProvider> callQualityMetricsProvider;

    public CallQualityMetricsRepositoryImpl_Factory(Provider<CallQualityMetricsProvider> provider) {
        this.callQualityMetricsProvider = provider;
    }

    public static CallQualityMetricsRepositoryImpl_Factory create(Provider<CallQualityMetricsProvider> provider) {
        return new CallQualityMetricsRepositoryImpl_Factory(provider);
    }

    public static CallQualityMetricsRepositoryImpl newInstance(CallQualityMetricsProvider callQualityMetricsProvider) {
        return new CallQualityMetricsRepositoryImpl(callQualityMetricsProvider);
    }

    @Override // javax.inject.Provider
    public CallQualityMetricsRepositoryImpl get() {
        return newInstance(this.callQualityMetricsProvider.get());
    }
}
