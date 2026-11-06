package com.amazon.alexa.client.alexaservice.features.instrumentation;

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
/* loaded from: classes17.dex */
public final class ReleaseInstrumentationModule_ProvidesInstrumentationBroadcastReceiverFactory implements Factory<InstrumentationBroadcastReceiver> {
    private final Provider<FakeInstrumentationReceiver> instrumentationReceiverProvider;
    private final ReleaseInstrumentationModule module;

    public ReleaseInstrumentationModule_ProvidesInstrumentationBroadcastReceiverFactory(ReleaseInstrumentationModule releaseInstrumentationModule, Provider<FakeInstrumentationReceiver> provider) {
        this.module = releaseInstrumentationModule;
        this.instrumentationReceiverProvider = provider;
    }

    public static ReleaseInstrumentationModule_ProvidesInstrumentationBroadcastReceiverFactory create(ReleaseInstrumentationModule releaseInstrumentationModule, Provider<FakeInstrumentationReceiver> provider) {
        return new ReleaseInstrumentationModule_ProvidesInstrumentationBroadcastReceiverFactory(releaseInstrumentationModule, provider);
    }

    public static InstrumentationBroadcastReceiver providesInstrumentationBroadcastReceiver(ReleaseInstrumentationModule releaseInstrumentationModule, FakeInstrumentationReceiver fakeInstrumentationReceiver) {
        return (InstrumentationBroadcastReceiver) Preconditions.checkNotNullFromProvides(releaseInstrumentationModule.providesInstrumentationBroadcastReceiver(fakeInstrumentationReceiver));
    }

    @Override // javax.inject.Provider
    public InstrumentationBroadcastReceiver get() {
        return providesInstrumentationBroadcastReceiver(this.module, this.instrumentationReceiverProvider.get());
    }
}
