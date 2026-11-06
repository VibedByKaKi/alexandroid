package com.amazon.alexa.voice.tta.suggestions;

import androidx.annotation.NonNull;
import com.amazon.alexa.utils.validation.Preconditions;
import com.amazon.alexa.voice.ui.suggestions.SuggestionsHandler;
import com.amazon.alexa.voice.ui.tta.TtaSuggestionsListener;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class TtaSuggestionHandler implements SuggestionsHandler {
    private boolean showKidsSuggestions = false;
    private WeakReference<TtaSuggestionsInteractor> ttaSuggestionsInteractorReference;

    @Override // com.amazon.alexa.voice.ui.suggestions.SuggestionsHandler
    public void getSuggestions(String str) {
        Preconditions.notNull(this.ttaSuggestionsInteractorReference, "TtaSuggestionsHandler is not initialized");
        TtaSuggestionsInteractor ttaSuggestionsInteractor = this.ttaSuggestionsInteractorReference.get();
        if (ttaSuggestionsInteractor == null || this.showKidsSuggestions) {
            return;
        }
        ttaSuggestionsInteractor.getSuggestions(str);
    }

    public void initialize(@NonNull TtaSuggestionsInteractor ttaSuggestionsInteractor, boolean z) {
        this.showKidsSuggestions = z;
        this.ttaSuggestionsInteractorReference = new WeakReference<>(ttaSuggestionsInteractor);
    }

    @Override // com.amazon.alexa.voice.ui.suggestions.SuggestionsHandler
    public void onSuggestionSelected(String str, String str2, String str3) {
        Preconditions.notNull(this.ttaSuggestionsInteractorReference, "TtaSuggestionsHandler is not initialized");
        TtaSuggestionsInteractor ttaSuggestionsInteractor = this.ttaSuggestionsInteractorReference.get();
        if (ttaSuggestionsInteractor != null) {
            ttaSuggestionsInteractor.onSuggestionSelected(str, str2, str3);
        }
    }

    @Override // com.amazon.alexa.voice.ui.suggestions.SuggestionsHandler
    public void setSuggestionListener(TtaSuggestionsListener ttaSuggestionsListener) {
        Preconditions.notNull(this.ttaSuggestionsInteractorReference, "TtaSuggestionsHandler is not initialized");
        TtaSuggestionsInteractor ttaSuggestionsInteractor = this.ttaSuggestionsInteractorReference.get();
        if (ttaSuggestionsInteractor != null) {
            ttaSuggestionsInteractor.setSuggestionListener(ttaSuggestionsListener);
        }
    }
}
