package com.amazon.alexa.voiceui.chrome;

import android.view.ViewGroup;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes20.dex */
public final class VoiceChromeModule_ProvidesVoiceChromeContainerFactory implements Factory<ViewGroup> {
    private final VoiceChromeModule module;

    public VoiceChromeModule_ProvidesVoiceChromeContainerFactory(VoiceChromeModule voiceChromeModule) {
        this.module = voiceChromeModule;
    }

    public static VoiceChromeModule_ProvidesVoiceChromeContainerFactory create(VoiceChromeModule voiceChromeModule) {
        return new VoiceChromeModule_ProvidesVoiceChromeContainerFactory(voiceChromeModule);
    }

    public static ViewGroup providesVoiceChromeContainer(VoiceChromeModule voiceChromeModule) {
        return (ViewGroup) Preconditions.checkNotNullFromProvides(voiceChromeModule.providesVoiceChromeContainer());
    }

    @Override // javax.inject.Provider
    public ViewGroup get() {
        return providesVoiceChromeContainer(this.module);
    }
}
