package com.amazon.comms.calling.infrastructure.telecom;

import com.amazon.comms.calling.foundation.metrics.MetricsManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class CallConnectionService_MembersInjector implements MembersInjector<CallConnectionService> {
    private final Provider<MetricsManager> metricsManagerProvider;
    private final Provider<TelecomProviderService> telecomProviderServiceProvider;

    public CallConnectionService_MembersInjector(Provider<TelecomProviderService> provider, Provider<MetricsManager> provider2) {
        this.telecomProviderServiceProvider = provider;
        this.metricsManagerProvider = provider2;
    }

    public static MembersInjector<CallConnectionService> create(Provider<TelecomProviderService> provider, Provider<MetricsManager> provider2) {
        return new CallConnectionService_MembersInjector(provider, provider2);
    }

    @InjectedFieldSignature("com.amazon.comms.calling.infrastructure.telecom.CallConnectionService.metricsManager")
    public static void injectMetricsManager(CallConnectionService callConnectionService, MetricsManager metricsManager) {
        callConnectionService.metricsManager = metricsManager;
    }

    @InjectedFieldSignature("com.amazon.comms.calling.infrastructure.telecom.CallConnectionService.telecomProviderService")
    public static void injectTelecomProviderService(CallConnectionService callConnectionService, TelecomProviderService telecomProviderService) {
        callConnectionService.telecomProviderService = telecomProviderService;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CallConnectionService callConnectionService) {
        injectTelecomProviderService(callConnectionService, this.telecomProviderServiceProvider.get());
        injectMetricsManager(callConnectionService, this.metricsManagerProvider.get());
    }
}
