package com.amazon.dee.app.dependencies;

import com.amazon.dee.app.services.tcomm.TCommServiceManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class TCommServiceModule_ProvideTCommServiceManagerFactory implements Factory<TCommServiceManager> {
    private final TCommServiceModule module;

    public TCommServiceModule_ProvideTCommServiceManagerFactory(TCommServiceModule tCommServiceModule) {
        this.module = tCommServiceModule;
    }

    public static TCommServiceModule_ProvideTCommServiceManagerFactory create(TCommServiceModule tCommServiceModule) {
        return new TCommServiceModule_ProvideTCommServiceManagerFactory(tCommServiceModule);
    }

    public static TCommServiceManager provideTCommServiceManager(TCommServiceModule tCommServiceModule) {
        return (TCommServiceManager) Preconditions.checkNotNullFromProvides(tCommServiceModule.provideTCommServiceManager());
    }

    @Override // javax.inject.Provider
    public TCommServiceManager get() {
        return provideTCommServiceManager(this.module);
    }
}
