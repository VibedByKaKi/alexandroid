package com.amazon.alexa.voice.tta.suggestions;

import com.amazon.alexa.voice.ui.suggestions.SuggestionsHandler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class SuggestionsModule_ProvidesSuggestionsHandlerFactory implements Factory<SuggestionsHandler> {
    private final SuggestionsModule module;
    private final Provider<TtaSuggestionHandler> ttaSuggestionHandlerProvider;

    public SuggestionsModule_ProvidesSuggestionsHandlerFactory(SuggestionsModule suggestionsModule, Provider<TtaSuggestionHandler> provider) {
        this.module = suggestionsModule;
        this.ttaSuggestionHandlerProvider = provider;
    }

    public static SuggestionsModule_ProvidesSuggestionsHandlerFactory create(SuggestionsModule suggestionsModule, Provider<TtaSuggestionHandler> provider) {
        return new SuggestionsModule_ProvidesSuggestionsHandlerFactory(suggestionsModule, provider);
    }

    public static SuggestionsHandler providesSuggestionsHandler(SuggestionsModule suggestionsModule, TtaSuggestionHandler ttaSuggestionHandler) {
        return (SuggestionsHandler) Preconditions.checkNotNullFromProvides(suggestionsModule.providesSuggestionsHandler(ttaSuggestionHandler));
    }

    @Override // javax.inject.Provider
    public SuggestionsHandler get() {
        return providesSuggestionsHandler(this.module, this.ttaSuggestionHandlerProvider.get());
    }
}
