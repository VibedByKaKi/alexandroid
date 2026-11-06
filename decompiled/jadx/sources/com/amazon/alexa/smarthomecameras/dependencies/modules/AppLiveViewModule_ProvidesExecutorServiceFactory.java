package com.amazon.alexa.smarthomecameras.dependencies.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AppLiveViewModule_ProvidesExecutorServiceFactory implements Factory<ScheduledExecutorService> {
    private static final AppLiveViewModule_ProvidesExecutorServiceFactory INSTANCE = new AppLiveViewModule_ProvidesExecutorServiceFactory();

    public static AppLiveViewModule_ProvidesExecutorServiceFactory create() {
        return INSTANCE;
    }

    public static ScheduledExecutorService providesExecutorService() {
        return (ScheduledExecutorService) Preconditions.checkNotNull(AppLiveViewModule.providesExecutorService(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public ScheduledExecutorService get() {
        return providesExecutorService();
    }
}
