package com.amazon.alexa.voiceui.chrome;

import com.amazon.alexa.voiceui.BackButtonPressHandler;
import com.amazon.alexa.voiceui.RouterDelegate;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes20.dex */
public final class VoiceChromeModule_ProvidesBackButtonPressHandlerFactory implements Factory<BackButtonPressHandler> {
    private final VoiceChromeModule module;
    private final Provider<RouterDelegate> routerDelegateProvider;

    public VoiceChromeModule_ProvidesBackButtonPressHandlerFactory(VoiceChromeModule voiceChromeModule, Provider<RouterDelegate> provider) {
        this.module = voiceChromeModule;
        this.routerDelegateProvider = provider;
    }

    public static VoiceChromeModule_ProvidesBackButtonPressHandlerFactory create(VoiceChromeModule voiceChromeModule, Provider<RouterDelegate> provider) {
        return new VoiceChromeModule_ProvidesBackButtonPressHandlerFactory(voiceChromeModule, provider);
    }

    public static BackButtonPressHandler providesBackButtonPressHandler(VoiceChromeModule voiceChromeModule, RouterDelegate routerDelegate) {
        return (BackButtonPressHandler) Preconditions.checkNotNullFromProvides(voiceChromeModule.providesBackButtonPressHandler(routerDelegate));
    }

    @Override // javax.inject.Provider
    public BackButtonPressHandler get() {
        return providesBackButtonPressHandler(this.module, this.routerDelegateProvider.get());
    }
}
