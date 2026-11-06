package com.amazon.alexa.capabilities;

import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class FireOsCapabilityAgentsModule_MembersInjector implements MembersInjector<FireOsCapabilityAgentsModule> {
    private final Provider<FireOSCapabilitiesMetricsListener> metricListenerProvider;

    public FireOsCapabilityAgentsModule_MembersInjector(Provider<FireOSCapabilitiesMetricsListener> provider) {
        this.metricListenerProvider = provider;
    }

    public static MembersInjector<FireOsCapabilityAgentsModule> create(Provider<FireOSCapabilitiesMetricsListener> provider) {
        return new FireOsCapabilityAgentsModule_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.alexa.capabilities.FireOsCapabilityAgentsModule.metricListener")
    public static void injectMetricListener(FireOsCapabilityAgentsModule fireOsCapabilityAgentsModule, Lazy<FireOSCapabilitiesMetricsListener> lazy) {
        fireOsCapabilityAgentsModule.metricListener = lazy;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FireOsCapabilityAgentsModule fireOsCapabilityAgentsModule) {
        injectMetricListener(fireOsCapabilityAgentsModule, DoubleCheck.lazy(this.metricListenerProvider));
    }
}
