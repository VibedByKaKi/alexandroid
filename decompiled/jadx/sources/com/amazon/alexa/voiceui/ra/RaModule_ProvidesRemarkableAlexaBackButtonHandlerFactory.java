package com.amazon.alexa.voiceui.ra;

import com.amazon.alexa.voice.ui.ra.RemarkableAlexaBackButtonHandler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class RaModule_ProvidesRemarkableAlexaBackButtonHandlerFactory implements Factory<RemarkableAlexaBackButtonHandler> {
    private final RaModule module;
    private final Provider<RemarkableAlexaBackButtonProvider> remarkableAlexaBackButtonProvider;

    public RaModule_ProvidesRemarkableAlexaBackButtonHandlerFactory(RaModule raModule, Provider<RemarkableAlexaBackButtonProvider> provider) {
        this.module = raModule;
        this.remarkableAlexaBackButtonProvider = provider;
    }

    public static RaModule_ProvidesRemarkableAlexaBackButtonHandlerFactory create(RaModule raModule, Provider<RemarkableAlexaBackButtonProvider> provider) {
        return new RaModule_ProvidesRemarkableAlexaBackButtonHandlerFactory(raModule, provider);
    }

    public static RemarkableAlexaBackButtonHandler providesRemarkableAlexaBackButtonHandler(RaModule raModule, RemarkableAlexaBackButtonProvider remarkableAlexaBackButtonProvider) {
        return (RemarkableAlexaBackButtonHandler) Preconditions.checkNotNullFromProvides(raModule.providesRemarkableAlexaBackButtonHandler(remarkableAlexaBackButtonProvider));
    }

    @Override // javax.inject.Provider
    public RemarkableAlexaBackButtonHandler get() {
        return providesRemarkableAlexaBackButtonHandler(this.module, this.remarkableAlexaBackButtonProvider.get());
    }
}
