package com.amazon.dee.app.dependencies;

import android.content.Context;
import com.amazon.alexa.protocols.ui.appcomponent.AlexaAppUIComponent;
import com.amazon.dee.app.ui.main.appcomponent.BuildTagProvider;
import com.amazon.dee.app.ui.main.appcomponent.GlobalHeaderEventPublisher;
import com.amazon.dee.app.ui.main.appcomponent.GlobalHeaderState;
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
public final class AlexaAppUIComponentModule_ProvidesAlexaAppUIComponentFactory implements Factory<AlexaAppUIComponent> {
    private final Provider<BuildTagProvider> buildTagProvider;
    private final Provider<Context> contextProvider;
    private final Provider<GlobalHeaderEventPublisher> globalHeaderEventPublisherProvider;
    private final Provider<GlobalHeaderState> globalHeaderStateProvider;
    private final AlexaAppUIComponentModule module;

    public AlexaAppUIComponentModule_ProvidesAlexaAppUIComponentFactory(AlexaAppUIComponentModule alexaAppUIComponentModule, Provider<BuildTagProvider> provider, Provider<Context> provider2, Provider<GlobalHeaderEventPublisher> provider3, Provider<GlobalHeaderState> provider4) {
        this.module = alexaAppUIComponentModule;
        this.buildTagProvider = provider;
        this.contextProvider = provider2;
        this.globalHeaderEventPublisherProvider = provider3;
        this.globalHeaderStateProvider = provider4;
    }

    public static AlexaAppUIComponentModule_ProvidesAlexaAppUIComponentFactory create(AlexaAppUIComponentModule alexaAppUIComponentModule, Provider<BuildTagProvider> provider, Provider<Context> provider2, Provider<GlobalHeaderEventPublisher> provider3, Provider<GlobalHeaderState> provider4) {
        return new AlexaAppUIComponentModule_ProvidesAlexaAppUIComponentFactory(alexaAppUIComponentModule, provider, provider2, provider3, provider4);
    }

    public static AlexaAppUIComponent providesAlexaAppUIComponent(AlexaAppUIComponentModule alexaAppUIComponentModule, BuildTagProvider buildTagProvider, Context context, GlobalHeaderEventPublisher globalHeaderEventPublisher, GlobalHeaderState globalHeaderState) {
        return (AlexaAppUIComponent) Preconditions.checkNotNullFromProvides(alexaAppUIComponentModule.providesAlexaAppUIComponent(buildTagProvider, context, globalHeaderEventPublisher, globalHeaderState));
    }

    @Override // javax.inject.Provider
    public AlexaAppUIComponent get() {
        return providesAlexaAppUIComponent(this.module, this.buildTagProvider.get(), this.contextProvider.get(), this.globalHeaderEventPublisherProvider.get(), this.globalHeaderStateProvider.get());
    }
}
