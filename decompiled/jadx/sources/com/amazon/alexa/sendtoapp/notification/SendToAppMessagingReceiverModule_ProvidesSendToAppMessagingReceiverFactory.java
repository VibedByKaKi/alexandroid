package com.amazon.alexa.sendtoapp.notification;

import android.content.Context;
import com.amazon.alexa.protocols.messaging.MessagingReceiver;
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
/* loaded from: classes19.dex */
public final class SendToAppMessagingReceiverModule_ProvidesSendToAppMessagingReceiverFactory implements Factory<MessagingReceiver> {
    private final Provider<Context> contextProvider;
    private final SendToAppMessagingReceiverModule module;

    public SendToAppMessagingReceiverModule_ProvidesSendToAppMessagingReceiverFactory(SendToAppMessagingReceiverModule sendToAppMessagingReceiverModule, Provider<Context> provider) {
        this.module = sendToAppMessagingReceiverModule;
        this.contextProvider = provider;
    }

    public static SendToAppMessagingReceiverModule_ProvidesSendToAppMessagingReceiverFactory create(SendToAppMessagingReceiverModule sendToAppMessagingReceiverModule, Provider<Context> provider) {
        return new SendToAppMessagingReceiverModule_ProvidesSendToAppMessagingReceiverFactory(sendToAppMessagingReceiverModule, provider);
    }

    public static MessagingReceiver providesSendToAppMessagingReceiver(SendToAppMessagingReceiverModule sendToAppMessagingReceiverModule, Context context) {
        return (MessagingReceiver) Preconditions.checkNotNullFromProvides(sendToAppMessagingReceiverModule.providesSendToAppMessagingReceiver(context));
    }

    @Override // javax.inject.Provider
    public MessagingReceiver get() {
        return providesSendToAppMessagingReceiver(this.module, this.contextProvider.get());
    }
}
