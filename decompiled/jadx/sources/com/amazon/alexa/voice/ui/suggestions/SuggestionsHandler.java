package com.amazon.alexa.voice.ui.suggestions;

import com.amazon.alexa.voice.ui.tta.TtaSuggestionsListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface SuggestionsHandler {
    void getSuggestions(String str);

    void onSuggestionSelected(String str, String str2, String str3);

    void setSuggestionListener(TtaSuggestionsListener ttaSuggestionsListener);
}
