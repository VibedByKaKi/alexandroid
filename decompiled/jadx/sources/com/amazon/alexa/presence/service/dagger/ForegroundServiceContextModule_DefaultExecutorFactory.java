package com.amazon.alexa.presence.service.dagger;

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
/* loaded from: classes18.dex */
public final class ForegroundServiceContextModule_DefaultExecutorFactory implements Factory<Context> {
    private final ForegroundServiceContextModule module;

    public ForegroundServiceContextModule_DefaultExecutorFactory(ForegroundServiceContextModule foregroundServiceContextModule) {
        this.module = foregroundServiceContextModule;
    }

    public static ForegroundServiceContextModule_DefaultExecutorFactory create(ForegroundServiceContextModule foregroundServiceContextModule) {
        return new ForegroundServiceContextModule_DefaultExecutorFactory(foregroundServiceContextModule);
    }

    public static Context defaultExecutor(ForegroundServiceContextModule foregroundServiceContextModule) {
        return (Context) Preconditions.checkNotNullFromProvides(foregroundServiceContextModule.getApplicationContext());
    }

    @Override // javax.inject.Provider
    public Context get() {
        return defaultExecutor(this.module);
    }
}
