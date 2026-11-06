package com.amazon.alexa.biloba.dependency;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ApplicationModule_ProvideShortLivedTaskExecutorFactory implements Factory<ExecutorService> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideShortLivedTaskExecutorFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideShortLivedTaskExecutorFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideShortLivedTaskExecutorFactory(applicationModule);
    }

    public static ExecutorService provideShortLivedTaskExecutor(ApplicationModule applicationModule) {
        return (ExecutorService) Preconditions.checkNotNull(applicationModule.provideShortLivedTaskExecutor(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public ExecutorService get() {
        return provideShortLivedTaskExecutor(this.module);
    }
}
