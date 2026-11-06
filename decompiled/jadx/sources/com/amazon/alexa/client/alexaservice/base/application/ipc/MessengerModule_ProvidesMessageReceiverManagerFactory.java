package com.amazon.alexa.client.alexaservice.base.application.ipc;

import com.amazon.alexa.api.messages.MessageReceiversManager;
import com.amazon.alexa.utils.security.SignatureVerifier;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class MessengerModule_ProvidesMessageReceiverManagerFactory implements Factory<MessageReceiversManager> {
    private final MessengerModule module;
    private final Provider<SignatureVerifier> signatureVerifierProvider;

    public MessengerModule_ProvidesMessageReceiverManagerFactory(MessengerModule messengerModule, Provider<SignatureVerifier> provider) {
        this.module = messengerModule;
        this.signatureVerifierProvider = provider;
    }

    public static MessengerModule_ProvidesMessageReceiverManagerFactory create(MessengerModule messengerModule, Provider<SignatureVerifier> provider) {
        return new MessengerModule_ProvidesMessageReceiverManagerFactory(messengerModule, provider);
    }

    public static MessageReceiversManager providesMessageReceiverManager(MessengerModule messengerModule, SignatureVerifier signatureVerifier) {
        return (MessageReceiversManager) Preconditions.checkNotNullFromProvides(messengerModule.providesMessageReceiverManager(signatureVerifier));
    }

    @Override // javax.inject.Provider
    public MessageReceiversManager get() {
        return providesMessageReceiverManager(this.module, this.signatureVerifierProvider.get());
    }
}
