package com.amazon.alexa.alertsca.dependencies;

import com.amazon.alexa.utils.concurrent.ManagedExecutorFactory;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes16.dex */
public class ExecutorModule {
    public static final String ALEXA_CONNECTION_EXECUTOR = "alexa_connection_executor";
    public static final String SHARED_SCHEDULER = "shared_scheduler";

    @Provides
    @Singleton
    @Named(ALEXA_CONNECTION_EXECUTOR)
    public ScheduledExecutorService providesConnectionExecutor() {
        return ManagedExecutorFactory.newSingleThreadScheduledExecutor(ALEXA_CONNECTION_EXECUTOR, ManagedExecutorFactory.Group.SERVICE_CONNECTION);
    }

    @Provides
    @Singleton
    @Named("shared_scheduler")
    public ScheduledExecutorService providesSharedScheduler() {
        return ManagedExecutorFactory.newSingleThreadScheduledExecutor("shared_scheduler");
    }
}
