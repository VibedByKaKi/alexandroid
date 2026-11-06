package com.amazon.alexa.client.alexaservice.ui.conversations;

import com.amazon.alexa.client.alexaservice.utils.UniqueIdGenerator;
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
public final class ConversationFragmentsHandler_Factory implements Factory<ConversationFragmentsHandler> {
    private final Provider<UniqueIdGenerator> uniqueIdGeneratorProvider;

    public ConversationFragmentsHandler_Factory(Provider<UniqueIdGenerator> provider) {
        this.uniqueIdGeneratorProvider = provider;
    }

    public static ConversationFragmentsHandler_Factory create(Provider<UniqueIdGenerator> provider) {
        return new ConversationFragmentsHandler_Factory(provider);
    }

    public static ConversationFragmentsHandler newInstance(UniqueIdGenerator uniqueIdGenerator) {
        return new ConversationFragmentsHandler(uniqueIdGenerator);
    }

    @Override // javax.inject.Provider
    public ConversationFragmentsHandler get() {
        return newInstance(this.uniqueIdGeneratorProvider.get());
    }
}
