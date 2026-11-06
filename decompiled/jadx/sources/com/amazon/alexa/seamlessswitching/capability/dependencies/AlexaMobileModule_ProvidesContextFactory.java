package com.amazon.alexa.seamlessswitching.capability.dependencies;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class AlexaMobileModule_ProvidesContextFactory implements Factory<Context> {
    private final AlexaMobileModule module;

    public AlexaMobileModule_ProvidesContextFactory(AlexaMobileModule alexaMobileModule) {
        this.module = alexaMobileModule;
    }

    public static AlexaMobileModule_ProvidesContextFactory create(AlexaMobileModule alexaMobileModule) {
        return new AlexaMobileModule_ProvidesContextFactory(alexaMobileModule);
    }

    public static Context providesContext(AlexaMobileModule alexaMobileModule) {
        return (Context) Preconditions.checkNotNullFromProvides(alexaMobileModule.providesContext());
    }

    @Override // javax.inject.Provider
    public Context get() {
        return providesContext(this.module);
    }
}
