package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ContextModule_ProvidesContextFactory implements Factory<Context> {
    private final ContextModule module;

    public ContextModule_ProvidesContextFactory(ContextModule contextModule) {
        this.module = contextModule;
    }

    public static ContextModule_ProvidesContextFactory create(ContextModule contextModule) {
        return new ContextModule_ProvidesContextFactory(contextModule);
    }

    public static Context providesContext(ContextModule contextModule) {
        return (Context) Preconditions.checkNotNull(contextModule.providesContext(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public Context get() {
        return providesContext(this.module);
    }
}
