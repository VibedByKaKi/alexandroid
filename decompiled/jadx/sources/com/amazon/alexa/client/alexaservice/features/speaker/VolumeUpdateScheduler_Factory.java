package com.amazon.alexa.client.alexaservice.features.speaker;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes17.dex */
public final class VolumeUpdateScheduler_Factory implements Factory<VolumeUpdateScheduler> {
    private final Provider<ScheduledExecutorService> sharedScheduledExecutorProvider;
    private final Provider<UpdateVolumeFromSystemCallable> updateVolumeFromSystemCallableProvider;

    public VolumeUpdateScheduler_Factory(Provider<UpdateVolumeFromSystemCallable> provider, Provider<ScheduledExecutorService> provider2) {
        this.updateVolumeFromSystemCallableProvider = provider;
        this.sharedScheduledExecutorProvider = provider2;
    }

    public static VolumeUpdateScheduler_Factory create(Provider<UpdateVolumeFromSystemCallable> provider, Provider<ScheduledExecutorService> provider2) {
        return new VolumeUpdateScheduler_Factory(provider, provider2);
    }

    public static VolumeUpdateScheduler newInstance(Provider<UpdateVolumeFromSystemCallable> provider, ScheduledExecutorService scheduledExecutorService) {
        return new VolumeUpdateScheduler(provider, scheduledExecutorService);
    }

    @Override // javax.inject.Provider
    public VolumeUpdateScheduler get() {
        return newInstance(this.updateVolumeFromSystemCallableProvider, this.sharedScheduledExecutorProvider.get());
    }
}
