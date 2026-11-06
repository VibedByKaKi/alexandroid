package com.amazon.ptz.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import org.greenrobot.eventbus.EventBus;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class UtilModule_ProvideEventBusFactory implements Factory<EventBus> {
    private final UtilModule module;

    public UtilModule_ProvideEventBusFactory(UtilModule utilModule) {
        this.module = utilModule;
    }

    public static UtilModule_ProvideEventBusFactory create(UtilModule utilModule) {
        return new UtilModule_ProvideEventBusFactory(utilModule);
    }

    public static EventBus provideEventBus(UtilModule utilModule) {
        return (EventBus) Preconditions.checkNotNullFromProvides(utilModule.provideEventBus());
    }

    @Override // javax.inject.Provider
    public EventBus get() {
        return provideEventBus(this.module);
    }
}
