package com.amazon.alexa.app.notification.dagger;

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
/* loaded from: classes.dex */
public final class CoreModule_ProvideApplicationContextFactory implements Factory<Context> {
    private final CoreModule module;

    public CoreModule_ProvideApplicationContextFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_ProvideApplicationContextFactory create(CoreModule coreModule) {
        return new CoreModule_ProvideApplicationContextFactory(coreModule);
    }

    public static Context provideApplicationContext(CoreModule coreModule) {
        return (Context) Preconditions.checkNotNullFromProvides(coreModule.provideApplicationContext());
    }

    @Override // javax.inject.Provider
    public Context get() {
        return provideApplicationContext(this.module);
    }
}
