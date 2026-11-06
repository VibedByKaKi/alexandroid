package com.amazon.alexa.client.alexaservice.dialog.voice.wakeword;

import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class VadStateWakeWordPrecondition_Factory implements Factory<VadStateWakeWordPrecondition> {
    private final Provider<AlexaClientEventBus> alexaClientEventBusProvider;

    public VadStateWakeWordPrecondition_Factory(Provider<AlexaClientEventBus> provider) {
        this.alexaClientEventBusProvider = provider;
    }

    public static VadStateWakeWordPrecondition_Factory create(Provider<AlexaClientEventBus> provider) {
        return new VadStateWakeWordPrecondition_Factory(provider);
    }

    public static VadStateWakeWordPrecondition newInstance(AlexaClientEventBus alexaClientEventBus) {
        return new VadStateWakeWordPrecondition(alexaClientEventBus);
    }

    @Override // javax.inject.Provider
    public VadStateWakeWordPrecondition get() {
        return newInstance(this.alexaClientEventBusProvider.get());
    }
}
