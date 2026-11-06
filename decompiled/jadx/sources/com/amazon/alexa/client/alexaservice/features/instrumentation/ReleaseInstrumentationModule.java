package com.amazon.alexa.client.alexaservice.features.instrumentation;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class ReleaseInstrumentationModule {
    @Provides
    @Singleton
    public ExoAudioPlayerInitializer providesExoAudioPlayerInitializer() {
        return new ReleaseInstrumentationModule$$ExternalSyntheticLambda1();
    }

    @Provides
    @Singleton
    public StrictModeInitializer providesStrictModeInitializer() {
        return new ReleaseInstrumentationModule$$ExternalSyntheticLambda0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$providesExoAudioPlayerInitializer$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$providesStrictModeInitializer$0() {
    }

    @Provides
    @Singleton
    public InstrumentationBroadcastReceiver providesInstrumentationBroadcastReceiver(FakeInstrumentationReceiver fakeInstrumentationReceiver) {
        return fakeInstrumentationReceiver;
    }
}
