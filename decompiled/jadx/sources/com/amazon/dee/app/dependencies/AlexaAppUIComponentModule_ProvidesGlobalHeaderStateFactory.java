package com.amazon.dee.app.dependencies;

import com.amazon.dee.app.ui.main.appcomponent.GlobalHeaderState;
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
public final class AlexaAppUIComponentModule_ProvidesGlobalHeaderStateFactory implements Factory<GlobalHeaderState> {
    private final AlexaAppUIComponentModule module;

    public AlexaAppUIComponentModule_ProvidesGlobalHeaderStateFactory(AlexaAppUIComponentModule alexaAppUIComponentModule) {
        this.module = alexaAppUIComponentModule;
    }

    public static AlexaAppUIComponentModule_ProvidesGlobalHeaderStateFactory create(AlexaAppUIComponentModule alexaAppUIComponentModule) {
        return new AlexaAppUIComponentModule_ProvidesGlobalHeaderStateFactory(alexaAppUIComponentModule);
    }

    public static GlobalHeaderState providesGlobalHeaderState(AlexaAppUIComponentModule alexaAppUIComponentModule) {
        return (GlobalHeaderState) Preconditions.checkNotNullFromProvides(alexaAppUIComponentModule.providesGlobalHeaderState());
    }

    @Override // javax.inject.Provider
    public GlobalHeaderState get() {
        return providesGlobalHeaderState(this.module);
    }
}
