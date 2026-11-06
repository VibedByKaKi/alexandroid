package com.amazon.dee.app.dependencies;

import com.amazon.deecomms.conversation.ConversationRouting;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.MainScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ConversationModule_ProvideConversationRoutingFactory implements Factory<ConversationRouting> {
    private final ConversationModule module;

    public ConversationModule_ProvideConversationRoutingFactory(ConversationModule conversationModule) {
        this.module = conversationModule;
    }

    public static ConversationModule_ProvideConversationRoutingFactory create(ConversationModule conversationModule) {
        return new ConversationModule_ProvideConversationRoutingFactory(conversationModule);
    }

    public static ConversationRouting provideConversationRouting(ConversationModule conversationModule) {
        return (ConversationRouting) Preconditions.checkNotNullFromProvides(conversationModule.provideConversationRouting());
    }

    @Override // javax.inject.Provider
    public ConversationRouting get() {
        return provideConversationRouting(this.module);
    }
}
