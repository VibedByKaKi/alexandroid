package com.amazon.alexa.voice.ui.suggestions;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface GetSuggestionsCallback {
    void onError(String str, Exception exc);

    void onResult(String str, List<SuggestionItem> list);
}
