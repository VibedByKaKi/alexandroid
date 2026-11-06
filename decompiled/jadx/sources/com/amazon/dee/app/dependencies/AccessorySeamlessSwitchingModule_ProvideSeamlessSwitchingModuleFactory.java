package com.amazon.dee.app.dependencies;

import android.content.Context;
import com.amazon.alexa.seamlessswitching.SeamlessSwitchingModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AccessorySeamlessSwitchingModule_ProvideSeamlessSwitchingModuleFactory implements Factory<SeamlessSwitchingModule> {
    private final Provider<Context> contextProvider;
    private final AccessorySeamlessSwitchingModule module;

    public AccessorySeamlessSwitchingModule_ProvideSeamlessSwitchingModuleFactory(AccessorySeamlessSwitchingModule accessorySeamlessSwitchingModule, Provider<Context> provider) {
        this.module = accessorySeamlessSwitchingModule;
        this.contextProvider = provider;
    }

    public static AccessorySeamlessSwitchingModule_ProvideSeamlessSwitchingModuleFactory create(AccessorySeamlessSwitchingModule accessorySeamlessSwitchingModule, Provider<Context> provider) {
        return new AccessorySeamlessSwitchingModule_ProvideSeamlessSwitchingModuleFactory(accessorySeamlessSwitchingModule, provider);
    }

    public static SeamlessSwitchingModule provideSeamlessSwitchingModule(AccessorySeamlessSwitchingModule accessorySeamlessSwitchingModule, Context context) {
        return (SeamlessSwitchingModule) Preconditions.checkNotNullFromProvides(accessorySeamlessSwitchingModule.provideSeamlessSwitchingModule(context));
    }

    @Override // javax.inject.Provider
    public SeamlessSwitchingModule get() {
        return provideSeamlessSwitchingModule(this.module, this.contextProvider.get());
    }
}
