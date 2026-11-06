package com.amazon.alexa.voice.tta.typing;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class FABModule_ProvidesConversationSessionTimerFactory implements Factory<ConversationSessionTimer> {
    private final FABModule module;

    public FABModule_ProvidesConversationSessionTimerFactory(FABModule fABModule) {
        this.module = fABModule;
    }

    public static FABModule_ProvidesConversationSessionTimerFactory create(FABModule fABModule) {
        return new FABModule_ProvidesConversationSessionTimerFactory(fABModule);
    }

    public static ConversationSessionTimer providesConversationSessionTimer(FABModule fABModule) {
        return (ConversationSessionTimer) Preconditions.checkNotNullFromProvides(fABModule.providesConversationSessionTimer());
    }

    @Override // javax.inject.Provider
    public ConversationSessionTimer get() {
        return providesConversationSessionTimer(this.module);
    }
}
