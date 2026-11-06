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
public final class FABModule_ProvidesTtaMessageSanitizerFactory implements Factory<TtaMessageSanitizer> {
    private final FABModule module;

    public FABModule_ProvidesTtaMessageSanitizerFactory(FABModule fABModule) {
        this.module = fABModule;
    }

    public static FABModule_ProvidesTtaMessageSanitizerFactory create(FABModule fABModule) {
        return new FABModule_ProvidesTtaMessageSanitizerFactory(fABModule);
    }

    public static TtaMessageSanitizer providesTtaMessageSanitizer(FABModule fABModule) {
        return (TtaMessageSanitizer) Preconditions.checkNotNullFromProvides(fABModule.providesTtaMessageSanitizer());
    }

    @Override // javax.inject.Provider
    public TtaMessageSanitizer get() {
        return providesTtaMessageSanitizer(this.module);
    }
}
