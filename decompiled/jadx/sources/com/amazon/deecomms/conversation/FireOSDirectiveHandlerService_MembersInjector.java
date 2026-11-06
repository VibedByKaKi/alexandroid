package com.amazon.deecomms.conversation;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class FireOSDirectiveHandlerService_MembersInjector implements MembersInjector<FireOSDirectiveHandlerService> {
    private final Provider<ConversationService> commsConversationServiceProvider;

    public FireOSDirectiveHandlerService_MembersInjector(Provider<ConversationService> provider) {
        this.commsConversationServiceProvider = provider;
    }

    public static MembersInjector<FireOSDirectiveHandlerService> create(Provider<ConversationService> provider) {
        return new FireOSDirectiveHandlerService_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.deecomms.conversation.FireOSDirectiveHandlerService.commsConversationService")
    public static void injectCommsConversationService(FireOSDirectiveHandlerService fireOSDirectiveHandlerService, ConversationService conversationService) {
        fireOSDirectiveHandlerService.commsConversationService = conversationService;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FireOSDirectiveHandlerService fireOSDirectiveHandlerService) {
        injectCommsConversationService(fireOSDirectiveHandlerService, this.commsConversationServiceProvider.get());
    }
}
