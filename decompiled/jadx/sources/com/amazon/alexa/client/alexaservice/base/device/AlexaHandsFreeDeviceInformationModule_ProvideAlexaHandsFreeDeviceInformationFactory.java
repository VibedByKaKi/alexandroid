package com.amazon.alexa.client.alexaservice.base.device;

import android.content.Context;
import com.amazon.alexa.utils.device.AlexaHandsFreeDeviceInformation;
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
public final class AlexaHandsFreeDeviceInformationModule_ProvideAlexaHandsFreeDeviceInformationFactory implements Factory<AlexaHandsFreeDeviceInformation> {
    private final Provider<Context> contextProvider;
    private final AlexaHandsFreeDeviceInformationModule module;

    public AlexaHandsFreeDeviceInformationModule_ProvideAlexaHandsFreeDeviceInformationFactory(AlexaHandsFreeDeviceInformationModule alexaHandsFreeDeviceInformationModule, Provider<Context> provider) {
        this.module = alexaHandsFreeDeviceInformationModule;
        this.contextProvider = provider;
    }

    public static AlexaHandsFreeDeviceInformationModule_ProvideAlexaHandsFreeDeviceInformationFactory create(AlexaHandsFreeDeviceInformationModule alexaHandsFreeDeviceInformationModule, Provider<Context> provider) {
        return new AlexaHandsFreeDeviceInformationModule_ProvideAlexaHandsFreeDeviceInformationFactory(alexaHandsFreeDeviceInformationModule, provider);
    }

    public static AlexaHandsFreeDeviceInformation provideAlexaHandsFreeDeviceInformation(AlexaHandsFreeDeviceInformationModule alexaHandsFreeDeviceInformationModule, Context context) {
        return (AlexaHandsFreeDeviceInformation) Preconditions.checkNotNullFromProvides(alexaHandsFreeDeviceInformationModule.provideAlexaHandsFreeDeviceInformation(context));
    }

    @Override // javax.inject.Provider
    public AlexaHandsFreeDeviceInformation get() {
        return provideAlexaHandsFreeDeviceInformation(this.module, this.contextProvider.get());
    }
}
