package com.amazon.alexa.client.alexaservice.dialog.voice.metrics;

import android.content.Context;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.utils.device.AlexaHandsFreeDeviceInformation;
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
public final class HandsFreeTimestampSender_Factory implements Factory<HandsFreeTimestampSender> {
    private final Provider<AlexaHandsFreeDeviceInformation> alexaHandsFreeDeviceInformationProvider;
    private final Provider<Context> contextProvider;
    private final Provider<AlexaClientEventBus> eventBusProvider;

    public HandsFreeTimestampSender_Factory(Provider<AlexaClientEventBus> provider, Provider<Context> provider2, Provider<AlexaHandsFreeDeviceInformation> provider3) {
        this.eventBusProvider = provider;
        this.contextProvider = provider2;
        this.alexaHandsFreeDeviceInformationProvider = provider3;
    }

    public static HandsFreeTimestampSender_Factory create(Provider<AlexaClientEventBus> provider, Provider<Context> provider2, Provider<AlexaHandsFreeDeviceInformation> provider3) {
        return new HandsFreeTimestampSender_Factory(provider, provider2, provider3);
    }

    public static HandsFreeTimestampSender newInstance(AlexaClientEventBus alexaClientEventBus, Context context, AlexaHandsFreeDeviceInformation alexaHandsFreeDeviceInformation) {
        return new HandsFreeTimestampSender(alexaClientEventBus, context, alexaHandsFreeDeviceInformation);
    }

    @Override // javax.inject.Provider
    public HandsFreeTimestampSender get() {
        return newInstance(this.eventBusProvider.get(), this.contextProvider.get(), this.alexaHandsFreeDeviceInformationProvider.get());
    }
}
