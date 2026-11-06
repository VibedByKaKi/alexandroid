package com.amazon.alexa.voice.tta.suggestions;

import com.amazon.alexa.voice.ui.suggestions.SuggestionsHandler;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class SuggestionsModule {
    @Provides
    @Singleton
    public TtaSuggestionHandler providesTtaSuggestionHandler() {
        return new TtaSuggestionHandler();
    }

    @Provides
    @Singleton
    public SuggestionsHandler providesSuggestionsHandler(TtaSuggestionHandler ttaSuggestionHandler) {
        return ttaSuggestionHandler;
    }
}
