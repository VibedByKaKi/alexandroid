package com.amazon.deecomms.calling.ui;

import com.amazon.deecomms.conversation.ConversationService;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class DirectiveReceiverActivity_MembersInjector implements MembersInjector<DirectiveReceiverActivity> {
    private final Provider<ConversationService> commsConversationServiceProvider;

    public DirectiveReceiverActivity_MembersInjector(Provider<ConversationService> provider) {
        this.commsConversationServiceProvider = provider;
    }

    public static MembersInjector<DirectiveReceiverActivity> create(Provider<ConversationService> provider) {
        return new DirectiveReceiverActivity_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.deecomms.calling.ui.DirectiveReceiverActivity.commsConversationService")
    public static void injectCommsConversationService(DirectiveReceiverActivity directiveReceiverActivity, ConversationService conversationService) {
        directiveReceiverActivity.commsConversationService = conversationService;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DirectiveReceiverActivity directiveReceiverActivity) {
        injectCommsConversationService(directiveReceiverActivity, this.commsConversationServiceProvider.get());
    }
}
