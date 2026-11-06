package com.amazon.alexa.mobilytics.integration.ama.resourcestat.cpu;

import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class MobilyticsCPUStatCaptor_Factory implements Factory<MobilyticsCPUStatCaptor> {
    private final Provider<CpuStatManager> cpuStatManagerProvider;

    public MobilyticsCPUStatCaptor_Factory(Provider<CpuStatManager> provider) {
        this.cpuStatManagerProvider = provider;
    }

    public static MobilyticsCPUStatCaptor_Factory create(Provider<CpuStatManager> provider) {
        return new MobilyticsCPUStatCaptor_Factory(provider);
    }

    public static MobilyticsCPUStatCaptor newInstance(CpuStatManager cpuStatManager) {
        return new MobilyticsCPUStatCaptor(cpuStatManager);
    }

    @Override // javax.inject.Provider
    public MobilyticsCPUStatCaptor get() {
        return newInstance(this.cpuStatManagerProvider.get());
    }
}
