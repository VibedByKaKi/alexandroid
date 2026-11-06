package com.amazon.comms.calling.data.repo;

import com.amazon.alexa.protocols.environment.EnvironmentService;
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
public final class EndPointRepositoryImpl_Factory implements Factory<EndPointRepositoryImpl> {
    private final Provider<EnvironmentService> environmentServiceProvider;

    public EndPointRepositoryImpl_Factory(Provider<EnvironmentService> provider) {
        this.environmentServiceProvider = provider;
    }

    public static EndPointRepositoryImpl_Factory create(Provider<EnvironmentService> provider) {
        return new EndPointRepositoryImpl_Factory(provider);
    }

    public static EndPointRepositoryImpl newInstance(EnvironmentService environmentService) {
        return new EndPointRepositoryImpl(environmentService);
    }

    @Override // javax.inject.Provider
    public EndPointRepositoryImpl get() {
        return newInstance(this.environmentServiceProvider.get());
    }
}
