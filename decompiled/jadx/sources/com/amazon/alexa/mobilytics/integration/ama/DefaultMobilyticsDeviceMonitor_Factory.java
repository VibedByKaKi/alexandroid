package com.amazon.alexa.mobilytics.integration.ama;

import android.content.Context;
import com.amazon.alexa.mobilytics.integration.ama.resourcestat.cpu.MobilyticsCPUStatCaptor;
import com.amazon.alexa.mobilytics.integration.ama.resourcestat.memory.MobilyticsMemoryStatCaptor;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class DefaultMobilyticsDeviceMonitor_Factory implements Factory<DefaultMobilyticsDeviceMonitor> {
    private final Provider<Context> contextProvider;
    private final Provider<MobilyticsCPUStatCaptor> cpuStatCaptorProvider;
    private final Provider<MobilyticsMemoryStatCaptor> memoryStatCaptorProvider;

    public DefaultMobilyticsDeviceMonitor_Factory(Provider<Context> provider, Provider<MobilyticsMemoryStatCaptor> provider2, Provider<MobilyticsCPUStatCaptor> provider3) {
        this.contextProvider = provider;
        this.memoryStatCaptorProvider = provider2;
        this.cpuStatCaptorProvider = provider3;
    }

    public static DefaultMobilyticsDeviceMonitor_Factory create(Provider<Context> provider, Provider<MobilyticsMemoryStatCaptor> provider2, Provider<MobilyticsCPUStatCaptor> provider3) {
        return new DefaultMobilyticsDeviceMonitor_Factory(provider, provider2, provider3);
    }

    public static DefaultMobilyticsDeviceMonitor newInstance(Context context, MobilyticsMemoryStatCaptor mobilyticsMemoryStatCaptor, MobilyticsCPUStatCaptor mobilyticsCPUStatCaptor) {
        return new DefaultMobilyticsDeviceMonitor(context, mobilyticsMemoryStatCaptor, mobilyticsCPUStatCaptor);
    }

    @Override // javax.inject.Provider
    public DefaultMobilyticsDeviceMonitor get() {
        return newInstance(this.contextProvider.get(), this.memoryStatCaptorProvider.get(), this.cpuStatCaptorProvider.get());
    }
}
