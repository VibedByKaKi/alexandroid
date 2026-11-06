package com.amazon.alexa.client.alexaservice.base.application;

import android.os.Handler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes17.dex */
public final class ContextModule_ProvidesMainThreadHandlerFactory implements Factory<Handler> {
    private final ContextModule module;

    public ContextModule_ProvidesMainThreadHandlerFactory(ContextModule contextModule) {
        this.module = contextModule;
    }

    public static ContextModule_ProvidesMainThreadHandlerFactory create(ContextModule contextModule) {
        return new ContextModule_ProvidesMainThreadHandlerFactory(contextModule);
    }

    public static Handler providesMainThreadHandler(ContextModule contextModule) {
        return (Handler) Preconditions.checkNotNullFromProvides(contextModule.providesMainThreadHandler());
    }

    @Override // javax.inject.Provider
    public Handler get() {
        return providesMainThreadHandler(this.module);
    }
}
