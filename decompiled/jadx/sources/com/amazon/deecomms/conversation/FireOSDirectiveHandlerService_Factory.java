package com.amazon.deecomms.conversation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class FireOSDirectiveHandlerService_Factory implements Factory<FireOSDirectiveHandlerService> {
    private final Provider<ConversationService> commsConversationServiceProvider;

    public FireOSDirectiveHandlerService_Factory(Provider<ConversationService> provider) {
        this.commsConversationServiceProvider = provider;
    }

    public static FireOSDirectiveHandlerService_Factory create(Provider<ConversationService> provider) {
        return new FireOSDirectiveHandlerService_Factory(provider);
    }

    public static FireOSDirectiveHandlerService newInstance() {
        return new FireOSDirectiveHandlerService();
    }

    @Override // javax.inject.Provider
    public FireOSDirectiveHandlerService get() {
        FireOSDirectiveHandlerService newInstance = newInstance();
        FireOSDirectiveHandlerService_MembersInjector.injectCommsConversationService(newInstance, this.commsConversationServiceProvider.get());
        return newInstance;
    }
}
