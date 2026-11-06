package com.amazon.alexa.client.alexaservice.vad.audio.device;

import android.os.Handler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes17.dex */
public final class CommunicationDeviceModule_ProvidesCommunicationDeviceHandlerFactory implements Factory<Handler> {
    private final CommunicationDeviceModule module;

    public CommunicationDeviceModule_ProvidesCommunicationDeviceHandlerFactory(CommunicationDeviceModule communicationDeviceModule) {
        this.module = communicationDeviceModule;
    }

    public static CommunicationDeviceModule_ProvidesCommunicationDeviceHandlerFactory create(CommunicationDeviceModule communicationDeviceModule) {
        return new CommunicationDeviceModule_ProvidesCommunicationDeviceHandlerFactory(communicationDeviceModule);
    }

    public static Handler providesCommunicationDeviceHandler(CommunicationDeviceModule communicationDeviceModule) {
        return (Handler) Preconditions.checkNotNullFromProvides(communicationDeviceModule.providesCommunicationDeviceHandler());
    }

    @Override // javax.inject.Provider
    public Handler get() {
        return providesCommunicationDeviceHandler(this.module);
    }
}
