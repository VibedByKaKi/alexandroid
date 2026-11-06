package com.amazon.alexa.client.alexaservice.dialog.voice.metrics;

import com.amazon.alexa.utils.TimeProvider;
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
public final class AudioLatencyTimestampRepository_Factory implements Factory<AudioLatencyTimestampRepository> {
    private final Provider<AlexaHandsFreeDeviceInformation> alexaHandsFreeDeviceInformationProvider;
    private final Provider<HandsFreeTimestampSender> handsFreeTimestampSenderProvider;
    private final Provider<TimeProvider> timeProvider;

    public AudioLatencyTimestampRepository_Factory(Provider<HandsFreeTimestampSender> provider, Provider<TimeProvider> provider2, Provider<AlexaHandsFreeDeviceInformation> provider3) {
        this.handsFreeTimestampSenderProvider = provider;
        this.timeProvider = provider2;
        this.alexaHandsFreeDeviceInformationProvider = provider3;
    }

    public static AudioLatencyTimestampRepository_Factory create(Provider<HandsFreeTimestampSender> provider, Provider<TimeProvider> provider2, Provider<AlexaHandsFreeDeviceInformation> provider3) {
        return new AudioLatencyTimestampRepository_Factory(provider, provider2, provider3);
    }

    public static AudioLatencyTimestampRepository newInstance(HandsFreeTimestampSender handsFreeTimestampSender, TimeProvider timeProvider, AlexaHandsFreeDeviceInformation alexaHandsFreeDeviceInformation) {
        return new AudioLatencyTimestampRepository(handsFreeTimestampSender, timeProvider, alexaHandsFreeDeviceInformation);
    }

    @Override // javax.inject.Provider
    public AudioLatencyTimestampRepository get() {
        return newInstance(this.handsFreeTimestampSenderProvider.get(), this.timeProvider.get(), this.alexaHandsFreeDeviceInformationProvider.get());
    }
}
