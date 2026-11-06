package com.amazon.alexa.voice.tta.suggestions;

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
public final class SuggestionsModule_ProvidesTtaSuggestionHandlerFactory implements Factory<TtaSuggestionHandler> {
    private final SuggestionsModule module;

    public SuggestionsModule_ProvidesTtaSuggestionHandlerFactory(SuggestionsModule suggestionsModule) {
        this.module = suggestionsModule;
    }

    public static SuggestionsModule_ProvidesTtaSuggestionHandlerFactory create(SuggestionsModule suggestionsModule) {
        return new SuggestionsModule_ProvidesTtaSuggestionHandlerFactory(suggestionsModule);
    }

    public static TtaSuggestionHandler providesTtaSuggestionHandler(SuggestionsModule suggestionsModule) {
        return (TtaSuggestionHandler) Preconditions.checkNotNullFromProvides(suggestionsModule.providesTtaSuggestionHandler());
    }

    @Override // javax.inject.Provider
    public TtaSuggestionHandler get() {
        return providesTtaSuggestionHandler(this.module);
    }
}
