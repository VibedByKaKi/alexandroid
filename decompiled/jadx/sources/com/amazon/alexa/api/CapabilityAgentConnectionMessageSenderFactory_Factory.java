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
public final class CapabilityAgentConnectionMessageSenderFactory_Factory implements Factory<CapabilityAgentConnectionMessageSenderFactory> {
    private final Provider<MessageReceiverAuthority> messageReceiverAuthorityProvider;

    public CapabilityAgentConnectionMessageSenderFactory_Factory(Provider<MessageReceiverAuthority> provider) {
        this.messageReceiverAuthorityProvider = provider;
    }

    public static CapabilityAgentConnectionMessageSenderFactory_Factory create(Provider<MessageReceiverAuthority> provider) {
        return new CapabilityAgentConnectionMessageSenderFactory_Factory(provider);
    }

    public static CapabilityAgentConnectionMessageSenderFactory newInstance(MessageReceiverAuthority messageReceiverAuthority) {
        return new CapabilityAgentConnectionMessageSenderFactory(messageReceiverAuthority);
    }

    @Override // javax.inject.Provider
    public CapabilityAgentConnectionMessageSenderFactory get() {
        return newInstance(this.messageReceiverAuthorityProvider.get());
    }
}
