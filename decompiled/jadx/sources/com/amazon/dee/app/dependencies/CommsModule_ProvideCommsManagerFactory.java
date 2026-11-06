package com.amazon.dee.app.dependencies;

import com.amazon.deecomms.api.CommsManager;
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
public final class CommsModule_ProvideCommsManagerFactory implements Factory<CommsManager> {
    private final Provider<AlexaCommsService> commsServiceProvider;
    private final CommsModule module;

    public CommsModule_ProvideCommsManagerFactory(CommsModule commsModule, Provider<AlexaCommsService> provider) {
        this.module = commsModule;
        this.commsServiceProvider = provider;
    }

    public static CommsModule_ProvideCommsManagerFactory create(CommsModule commsModule, Provider<AlexaCommsService> provider) {
        return new CommsModule_ProvideCommsManagerFactory(commsModule, provider);
    }

    public static CommsManager provideCommsManager(CommsModule commsModule, AlexaCommsService alexaCommsService) {
        return (CommsManager) Preconditions.checkNotNullFromProvides(commsModule.provideCommsManager(alexaCommsService));
    }

    @Override // javax.inject.Provider
    public CommsManager get() {
        return provideCommsManager(this.module, this.commsServiceProvider.get());
    }
}
