package com.amazon.comms.calling.dependency;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class CoroutineModule_ProvidesAppScopeFactory implements Factory<CoroutineScope> {
    private final CoroutineModule module;

    public CoroutineModule_ProvidesAppScopeFactory(CoroutineModule coroutineModule) {
        this.module = coroutineModule;
    }

    public static CoroutineModule_ProvidesAppScopeFactory create(CoroutineModule coroutineModule) {
        return new CoroutineModule_ProvidesAppScopeFactory(coroutineModule);
    }

    public static CoroutineScope providesAppScope(CoroutineModule coroutineModule) {
        return (CoroutineScope) Preconditions.checkNotNullFromProvides(coroutineModule.providesAppScope());
    }

    @Override // javax.inject.Provider
    public CoroutineScope get() {
        return providesAppScope(this.module);
    }
}
