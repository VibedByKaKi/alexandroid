package com.amazon.alexa.benefits.dependency;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ApplicationModule_ProvideContextFactory implements Factory<Context> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideContextFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideContextFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideContextFactory(applicationModule);
    }

    public static Context provideContext(ApplicationModule applicationModule) {
        return (Context) Preconditions.checkNotNull(applicationModule.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public Context get() {
        return provideContext(this.module);
    }
}
