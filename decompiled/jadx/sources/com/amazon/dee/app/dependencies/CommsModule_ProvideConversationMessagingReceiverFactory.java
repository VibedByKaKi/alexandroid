package com.amazon.dee.app.dependencies;

import com.amazon.alexa.protocols.messaging.MessagingReceiver;
import com.amazon.deecomms.api.CommsServiceV2;
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
public final class CommsModule_ProvideConversationMessagingReceiverFactory implements Factory<MessagingReceiver> {
    private final Provider<CommsServiceV2> commsServiceV2Provider;
    private final CommsModule module;

    public CommsModule_ProvideConversationMessagingReceiverFactory(CommsModule commsModule, Provider<CommsServiceV2> provider) {
        this.module = commsModule;
        this.commsServiceV2Provider = provider;
    }

    public static CommsModule_ProvideConversationMessagingReceiverFactory create(CommsModule commsModule, Provider<CommsServiceV2> provider) {
        return new CommsModule_ProvideConversationMessagingReceiverFactory(commsModule, provider);
    }

    public static MessagingReceiver provideConversationMessagingReceiver(CommsModule commsModule, CommsServiceV2 commsServiceV2) {
        return (MessagingReceiver) Preconditions.checkNotNullFromProvides(commsModule.provideConversationMessagingReceiver(commsServiceV2));
    }

    @Override // javax.inject.Provider
    public MessagingReceiver get() {
        return provideConversationMessagingReceiver(this.module, this.commsServiceV2Provider.get());
    }
}
