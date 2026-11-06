package com.amazon.alexa.voiceui.chrome;

import com.amazon.alexa.voice.ui.tta.TypingPrimerDisplayer;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class VoiceChromeModule_ProvidesTypingPrimerDisplayerFactory implements Factory<TypingPrimerDisplayer> {
    private final VoiceChromeModule module;

    public VoiceChromeModule_ProvidesTypingPrimerDisplayerFactory(VoiceChromeModule voiceChromeModule) {
        this.module = voiceChromeModule;
    }

    public static VoiceChromeModule_ProvidesTypingPrimerDisplayerFactory create(VoiceChromeModule voiceChromeModule) {
        return new VoiceChromeModule_ProvidesTypingPrimerDisplayerFactory(voiceChromeModule);
    }

    public static TypingPrimerDisplayer providesTypingPrimerDisplayer(VoiceChromeModule voiceChromeModule) {
        return (TypingPrimerDisplayer) Preconditions.checkNotNullFromProvides(voiceChromeModule.providesTypingPrimerDisplayer());
    }

    @Override // javax.inject.Provider
    public TypingPrimerDisplayer get() {
        return providesTypingPrimerDisplayer(this.module);
    }
}
