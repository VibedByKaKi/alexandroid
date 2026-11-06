package com.amazon.dee.app.dependencies;

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
/* loaded from: classes3.dex */
public final class AccessoryModule_ProvideContextFactory implements Factory<Context> {
    private final AccessoryModule module;

    public AccessoryModule_ProvideContextFactory(AccessoryModule accessoryModule) {
        this.module = accessoryModule;
    }

    public static AccessoryModule_ProvideContextFactory create(AccessoryModule accessoryModule) {
        return new AccessoryModule_ProvideContextFactory(accessoryModule);
    }

    public static Context provideContext(AccessoryModule accessoryModule) {
        return (Context) Preconditions.checkNotNullFromProvides(accessoryModule.provideContext());
    }

    @Override // javax.inject.Provider
    public Context get() {
        return provideContext(this.module);
    }
}
