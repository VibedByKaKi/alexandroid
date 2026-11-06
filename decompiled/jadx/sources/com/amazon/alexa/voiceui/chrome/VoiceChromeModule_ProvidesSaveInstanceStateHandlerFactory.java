package com.amazon.alexa.voiceui.chrome;

import com.amazon.alexa.voiceui.RouterDelegate;
import com.amazon.alexa.voiceui.SaveInstanceStateHandler;
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
public final class VoiceChromeModule_ProvidesSaveInstanceStateHandlerFactory implements Factory<SaveInstanceStateHandler> {
    private final VoiceChromeModule module;
    private final Provider<RouterDelegate> routerDelegateProvider;

    public VoiceChromeModule_ProvidesSaveInstanceStateHandlerFactory(VoiceChromeModule voiceChromeModule, Provider<RouterDelegate> provider) {
        this.module = voiceChromeModule;
        this.routerDelegateProvider = provider;
    }

    public static VoiceChromeModule_ProvidesSaveInstanceStateHandlerFactory create(VoiceChromeModule voiceChromeModule, Provider<RouterDelegate> provider) {
        return new VoiceChromeModule_ProvidesSaveInstanceStateHandlerFactory(voiceChromeModule, provider);
    }

    public static SaveInstanceStateHandler providesSaveInstanceStateHandler(VoiceChromeModule voiceChromeModule, RouterDelegate routerDelegate) {
        return (SaveInstanceStateHandler) Preconditions.checkNotNullFromProvides(voiceChromeModule.providesSaveInstanceStateHandler(routerDelegate));
    }

    @Override // javax.inject.Provider
    public SaveInstanceStateHandler get() {
        return providesSaveInstanceStateHandler(this.module, this.routerDelegateProvider.get());
    }
}
