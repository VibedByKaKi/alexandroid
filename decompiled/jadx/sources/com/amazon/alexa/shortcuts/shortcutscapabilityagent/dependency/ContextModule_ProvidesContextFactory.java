package com.amazon.alexa.shortcuts.shortcutscapabilityagent.dependency;

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
/* loaded from: classes19.dex */
public final class ContextModule_ProvidesContextFactory implements Factory<Context> {
    private final ContextModule module;

    public ContextModule_ProvidesContextFactory(ContextModule contextModule) {
        this.module = contextModule;
    }

    public static ContextModule_ProvidesContextFactory create(ContextModule contextModule) {
        return new ContextModule_ProvidesContextFactory(contextModule);
    }

    public static Context providesContext(ContextModule contextModule) {
        return (Context) Preconditions.checkNotNullFromProvides(contextModule.providesContext());
    }

    @Override // javax.inject.Provider
    public Context get() {
        return providesContext(this.module);
    }
}
