package com.amazon.comms.calling.dependency;

import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.comms.calling.data.network.ApiService;
import com.amazon.comms.calling.foundation.features.providers.IdentityServiceProvider;
import com.amazon.comms.calling.foundation.features.providers.IdentityServiceProviderImpl;
import com.amazon.comms.calling.foundation.metrics.MetricsManager;
import com.amazon.comms.calling.foundation.metrics.implementation.MetricsManagerImpl;
import com.amazon.comms.calling.foundation.metrics.providers.AlexaAppMetricsProvider;
import com.amazon.comms.calling.foundation.metrics.providers.MetricsProvider;
import com.amazon.commscore.api.identity.AlexaCommsCoreIdentityService;
import com.amazon.commscore.api.identity.CommsCoreIdentity;
import com.amazon.commscore.api.metrics.AlexaCommsCoreMetricsService;
import com.amazon.commscore.api.remoteconfiguration.AlexaCommsCoreRemoteConfigurationService;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\tH\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0007J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u001f"}, d2 = {"Lcom/amazon/comms/calling/dependency/CommsCoreModule;", "", "<init>", "()V", "providesArcusConfig", "Lcom/amazon/commscore/api/remoteconfiguration/AlexaCommsCoreRemoteConfigurationService;", "componentRegistry", "Lcom/amazon/alexa/protocols/service/api/ComponentRegistry;", "providesIdentityService", "Lcom/amazon/commscore/api/identity/AlexaCommsCoreIdentityService;", "providesIdentity", "Lcom/amazon/commscore/api/identity/CommsCoreIdentity;", "identityService", "providesIdentityServiceProvider", "Lcom/amazon/comms/calling/foundation/features/providers/IdentityServiceProvider;", "apiService", "Lcom/amazon/comms/calling/data/network/ApiService;", "metricsManager", "Lcom/amazon/comms/calling/foundation/metrics/MetricsManager;", "providesMetricsService", "Lcom/amazon/commscore/api/metrics/AlexaCommsCoreMetricsService;", "provideMobilytics", "Lcom/amazon/alexa/mobilytics/Mobilytics;", "provideMetrics", "Lcom/amazon/comms/calling/foundation/metrics/providers/MetricsProvider;", "mobilytics", "provideMetricsManager", "metricsManagerImpl", "Lcom/amazon/comms/calling/foundation/metrics/implementation/MetricsManagerImpl;", "providesEnvironmentService", "Lcom/amazon/alexa/protocols/environment/EnvironmentService;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes20.dex */
public final class CommsCoreModule {
    @Provides
    @Singleton
    @NotNull
    public final MetricsProvider provideMetrics(@NotNull Mobilytics mobilytics) {
        mobilytics.getClass();
        return new AlexaAppMetricsProvider(mobilytics);
    }

    @Provides
    @Singleton
    @NotNull
    public final MetricsManager provideMetricsManager(@NotNull MetricsManagerImpl metricsManagerImpl) {
        metricsManagerImpl.getClass();
        return metricsManagerImpl;
    }

    @Provides
    @Singleton
    @NotNull
    public final Mobilytics provideMobilytics() {
        Object obj = ComponentRegistry.getInstance().getLazy(Mobilytics.class).get();
        obj.getClass();
        return (Mobilytics) obj;
    }

    @Provides
    @Singleton
    @NotNull
    public final AlexaCommsCoreRemoteConfigurationService providesArcusConfig(@NotNull ComponentRegistry componentRegistry) {
        componentRegistry.getClass();
        Object obj = componentRegistry.getLazy(AlexaCommsCoreRemoteConfigurationService.class).get();
        obj.getClass();
        return (AlexaCommsCoreRemoteConfigurationService) obj;
    }

    @Provides
    @Singleton
    @NotNull
    public final EnvironmentService providesEnvironmentService(@NotNull ComponentRegistry componentRegistry) {
        componentRegistry.getClass();
        Object obj = componentRegistry.getLazy(EnvironmentService.class).get();
        obj.getClass();
        return (EnvironmentService) obj;
    }

    @Provides
    @Nullable
    @androidx.annotation.Nullable
    @Singleton
    public final CommsCoreIdentity providesIdentity(@NotNull AlexaCommsCoreIdentityService identityService) {
        identityService.getClass();
        return identityService.getIdentity();
    }

    @Provides
    @Singleton
    @NotNull
    public final AlexaCommsCoreIdentityService providesIdentityService(@NotNull ComponentRegistry componentRegistry) {
        componentRegistry.getClass();
        Object obj = componentRegistry.getLazy(AlexaCommsCoreIdentityService.class).get();
        obj.getClass();
        return (AlexaCommsCoreIdentityService) obj;
    }

    @Provides
    @Singleton
    @NotNull
    public final IdentityServiceProvider providesIdentityServiceProvider(@NotNull AlexaCommsCoreIdentityService identityService, @NotNull ApiService apiService, @NotNull MetricsManager metricsManager) {
        identityService.getClass();
        apiService.getClass();
        metricsManager.getClass();
        return new IdentityServiceProviderImpl(identityService, apiService, metricsManager);
    }

    @Provides
    @Singleton
    @NotNull
    public final AlexaCommsCoreMetricsService providesMetricsService(@NotNull ComponentRegistry componentRegistry) {
        componentRegistry.getClass();
        Object obj = componentRegistry.getLazy(AlexaCommsCoreMetricsService.class).get();
        obj.getClass();
        return (AlexaCommsCoreMetricsService) obj;
    }
}
