package com.amazon.alexa.featureservice.dependencies;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"com.amazon.alexa.featureservice.dependencies.annotation.ApplicationContext"})
/* loaded from: classes17.dex */
public final class BaseModule_ProvidesContextFactory implements Factory<Context> {
    private final BaseModule module;

    public BaseModule_ProvidesContextFactory(BaseModule baseModule) {
        this.module = baseModule;
    }

    public static BaseModule_ProvidesContextFactory create(BaseModule baseModule) {
        return new BaseModule_ProvidesContextFactory(baseModule);
    }

    public static Context providesContext(BaseModule baseModule) {
        return (Context) Preconditions.checkNotNullFromProvides(baseModule.providesContext());
    }

    @Override // javax.inject.Provider
    public Context get() {
        return providesContext(this.module);
    }
}
