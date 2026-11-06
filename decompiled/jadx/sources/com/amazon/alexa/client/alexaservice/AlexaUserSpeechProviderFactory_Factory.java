package com.amazon.alexa.client.alexaservice;

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
/* loaded from: classes17.dex */
public final class AlexaUserSpeechProviderFactory_Factory implements Factory<AlexaUserSpeechProviderFactory> {
    private final Provider<MessageReceiverAuthority> messageReceiverAuthorityProvider;

    public AlexaUserSpeechProviderFactory_Factory(Provider<MessageReceiverAuthority> provider) {
        this.messageReceiverAuthorityProvider = provider;
    }

    public static AlexaUserSpeechProviderFactory_Factory create(Provider<MessageReceiverAuthority> provider) {
        return new AlexaUserSpeechProviderFactory_Factory(provider);
    }

    public static AlexaUserSpeechProviderFactory newInstance(MessageReceiverAuthority messageReceiverAuthority) {
        return new AlexaUserSpeechProviderFactory(messageReceiverAuthority);
    }

    @Override // javax.inject.Provider
    public AlexaUserSpeechProviderFactory get() {
        return newInstance(this.messageReceiverAuthorityProvider.get());
    }
}
