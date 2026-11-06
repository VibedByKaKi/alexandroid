package com.amazon.dee.app.dependencies;

import com.amazon.deecomms.conversation.CommsDeviceSupport;
import com.amazon.deecomms.core.decoupling.AlexaCommsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class CommsModule_ProvideCommsDeviceSupportFactory implements Factory<CommsDeviceSupport> {
    private final Provider<AlexaCommsService> commsServiceProvider;
    private final CommsModule module;

    public CommsModule_ProvideCommsDeviceSupportFactory(CommsModule commsModule, Provider<AlexaCommsService> provider) {
        this.module = commsModule;
        this.commsServiceProvider = provider;
    }

    public static CommsModule_ProvideCommsDeviceSupportFactory create(CommsModule commsModule, Provider<AlexaCommsService> provider) {
        return new CommsModule_ProvideCommsDeviceSupportFactory(commsModule, provider);
    }

    public static CommsDeviceSupport provideCommsDeviceSupport(CommsModule commsModule, AlexaCommsService alexaCommsService) {
        return (CommsDeviceSupport) Preconditions.checkNotNullFromProvides(commsModule.provideCommsDeviceSupport(alexaCommsService));
    }

    @Override // javax.inject.Provider
    public CommsDeviceSupport get() {
        return provideCommsDeviceSupport(this.module, this.commsServiceProvider.get());
    }
}
