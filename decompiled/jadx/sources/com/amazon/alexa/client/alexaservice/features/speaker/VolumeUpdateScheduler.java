package com.amazon.alexa.client.alexaservice.features.speaker;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
class VolumeUpdateScheduler {
    private static final int DELAY_SECONDS = 1;
    private ScheduledFuture<?> currentUpdateTask;
    private final ScheduledExecutorService sharedScheduledExecutor;
    private final Provider<UpdateVolumeFromSystemCallable> updateVolumeFromSystemCallableProvider;

    @Inject
    public VolumeUpdateScheduler(Provider<UpdateVolumeFromSystemCallable> provider, @Named("shared_scheduler") ScheduledExecutorService scheduledExecutorService) {
        this.updateVolumeFromSystemCallableProvider = provider;
        this.sharedScheduledExecutor = scheduledExecutorService;
    }

    public void scheduleUpdate() {
        ScheduledFuture<?> scheduledFuture = this.currentUpdateTask;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.currentUpdateTask.cancel(true);
        }
        this.currentUpdateTask = this.sharedScheduledExecutor.schedule(this.updateVolumeFromSystemCallableProvider.get(), 1L, TimeUnit.SECONDS);
    }
}
