package com.amazon.alexa.client.alexaservice.base.concurrent;

import com.amazon.alexa.utils.concurrent.ManagedExecutorFactory;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class ExecutorModule {
    private static final int CORE_POOL_SIZE = 3;
    public static final String SHARED_SCHEDULER = "shared_scheduler";

    @Provides
    @Singleton
    @Named("shared_scheduler")
    public ScheduledExecutorService providesSharedScheduler() {
        return ManagedExecutorFactory.newScheduledExecutor(3, "shared_scheduler");
    }
}
