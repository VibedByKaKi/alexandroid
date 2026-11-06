package com.amazon.commscore.commsbridge.dependencies;

import com.amazon.commscore.api.commsbridge.CommsBridgeService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class CommsBridgeServiceModule_ProvidesCommsBridgeServiceFactory implements Factory<CommsBridgeService> {
    private final CommsBridgeServiceModule module;

    public CommsBridgeServiceModule_ProvidesCommsBridgeServiceFactory(CommsBridgeServiceModule commsBridgeServiceModule) {
        this.module = commsBridgeServiceModule;
    }

    public static CommsBridgeServiceModule_ProvidesCommsBridgeServiceFactory create(CommsBridgeServiceModule commsBridgeServiceModule) {
        return new CommsBridgeServiceModule_ProvidesCommsBridgeServiceFactory(commsBridgeServiceModule);
    }

    public static CommsBridgeService providesCommsBridgeService(CommsBridgeServiceModule commsBridgeServiceModule) {
        return (CommsBridgeService) Preconditions.checkNotNullFromProvides(commsBridgeServiceModule.providesCommsBridgeService());
    }

    @Override // javax.inject.Provider
    public CommsBridgeService get() {
        return providesCommsBridgeService(this.module);
    }
}
