package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.domain.repo.ConnectivityRepository;
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
public final class StartConnectivityMonitorUseCase_Factory implements Factory<StartConnectivityMonitorUseCase> {
    private final Provider<ConnectivityRepository> connectivityRepositoryProvider;

    public StartConnectivityMonitorUseCase_Factory(Provider<ConnectivityRepository> provider) {
        this.connectivityRepositoryProvider = provider;
    }

    public static StartConnectivityMonitorUseCase_Factory create(Provider<ConnectivityRepository> provider) {
        return new StartConnectivityMonitorUseCase_Factory(provider);
    }

    public static StartConnectivityMonitorUseCase newInstance(ConnectivityRepository connectivityRepository) {
        return new StartConnectivityMonitorUseCase(connectivityRepository);
    }

    @Override // javax.inject.Provider
    public StartConnectivityMonitorUseCase get() {
        return newInstance(this.connectivityRepositoryProvider.get());
    }
}
