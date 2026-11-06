package com.amazon.alexa.apl.dagger.module;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class ContextModule_ProvideContextFactory implements Factory<Context> {
    private final ContextModule module;

    public ContextModule_ProvideContextFactory(ContextModule contextModule) {
        this.module = contextModule;
    }

    public static ContextModule_ProvideContextFactory create(ContextModule contextModule) {
        return new ContextModule_ProvideContextFactory(contextModule);
    }

    public static Context provideContext(ContextModule contextModule) {
        return (Context) Preconditions.checkNotNullFromProvides(contextModule.getMContext());
    }

    @Override // javax.inject.Provider
    public Context get() {
        return provideContext(this.module);
    }
}
