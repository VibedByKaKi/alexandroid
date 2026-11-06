package com.amazon.alexa.mobilytics.integration.ama.resourcestat.memory;

import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class MobilyticsMemoryStatCaptor_Factory implements Factory<MobilyticsMemoryStatCaptor> {
    private final Provider<MemoryStatManager> memoryStatManagerProvider;

    public MobilyticsMemoryStatCaptor_Factory(Provider<MemoryStatManager> provider) {
        this.memoryStatManagerProvider = provider;
    }

    public static MobilyticsMemoryStatCaptor_Factory create(Provider<MemoryStatManager> provider) {
        return new MobilyticsMemoryStatCaptor_Factory(provider);
    }

    public static MobilyticsMemoryStatCaptor newInstance(MemoryStatManager memoryStatManager) {
        return new MobilyticsMemoryStatCaptor(memoryStatManager);
    }

    @Override // javax.inject.Provider
    public MobilyticsMemoryStatCaptor get() {
        return newInstance(this.memoryStatManagerProvider.get());
    }
}
