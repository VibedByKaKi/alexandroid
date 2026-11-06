package com.amazon.alexa.client.alexaservice.vad;

import com.amazon.alexa.client.alexaservice.vad.audio.VADAudioRecorderConfig;
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
public final class VADModule_ProvidesVADAudioRecorderConfigFactory implements Factory<VADAudioRecorderConfig> {
    private final VADModule module;

    public VADModule_ProvidesVADAudioRecorderConfigFactory(VADModule vADModule) {
        this.module = vADModule;
    }

    public static VADModule_ProvidesVADAudioRecorderConfigFactory create(VADModule vADModule) {
        return new VADModule_ProvidesVADAudioRecorderConfigFactory(vADModule);
    }

    public static VADAudioRecorderConfig providesVADAudioRecorderConfig(VADModule vADModule) {
        return (VADAudioRecorderConfig) Preconditions.checkNotNullFromProvides(vADModule.providesVADAudioRecorderConfig());
    }

    @Override // javax.inject.Provider
    public VADAudioRecorderConfig get() {
        return providesVADAudioRecorderConfig(this.module);
    }
}
