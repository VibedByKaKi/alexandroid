package com.amazon.alexa.featureservice.dependencies;

import com.amazon.alexa.featureservice.util.SafeEventBus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class BaseModule_ProvidesSafeEventBusFactory implements Factory<SafeEventBus> {
    private final BaseModule module;

    public BaseModule_ProvidesSafeEventBusFactory(BaseModule baseModule) {
        this.module = baseModule;
    }

    public static BaseModule_ProvidesSafeEventBusFactory create(BaseModule baseModule) {
        return new BaseModule_ProvidesSafeEventBusFactory(baseModule);
    }

    public static SafeEventBus providesSafeEventBus(BaseModule baseModule) {
        return (SafeEventBus) Preconditions.checkNotNullFromProvides(baseModule.providesSafeEventBus());
    }

    @Override // javax.inject.Provider
    public SafeEventBus get() {
        return providesSafeEventBus(this.module);
    }
}
