package com.amazon.alexa.api;

import com.amazon.alexa.client.alexaservice.base.application.ipc.MessageReceiverAuthority;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class AlexaVisualTaskFactory_Factory implements Factory<AlexaVisualTaskFactory> {
    private final Provider<MessageReceiverAuthority> messageReceiverAuthorityProvider;

    public AlexaVisualTaskFactory_Factory(Provider<MessageReceiverAuthority> provider) {
        this.messageReceiverAuthorityProvider = provider;
    }

    public static AlexaVisualTaskFactory_Factory create(Provider<MessageReceiverAuthority> provider) {
        return new AlexaVisualTaskFactory_Factory(provider);
    }

    public static AlexaVisualTaskFactory newInstance(MessageReceiverAuthority messageReceiverAuthority) {
        return new AlexaVisualTaskFactory(messageReceiverAuthority);
    }

    @Override // javax.inject.Provider
    public AlexaVisualTaskFactory get() {
        return newInstance(this.messageReceiverAuthorityProvider.get());
    }
}
