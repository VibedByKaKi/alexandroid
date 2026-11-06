package com.amazon.alexa.voice.ui.onedesign.tta;

import com.amazon.alexa.voice.ui.suggestions.SuggestionsHandler;
import com.amazon.alexa.voice.ui.tta.TtaMessageHandler;
import com.amazon.alexa.voice.ui.tta.search.TtaResultHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TtaHandlerProvider {
    private final SuggestionsHandler suggestionsHandler;
    private final TtaMessageHandler ttaMessageHandler;
    private final TtaResultHandler ttaResultHandler;

    public TtaHandlerProvider(TtaMessageHandler ttaMessageHandler, TtaResultHandler ttaResultHandler, SuggestionsHandler suggestionsHandler) {
        this.ttaMessageHandler = ttaMessageHandler;
        this.ttaResultHandler = ttaResultHandler;
        this.suggestionsHandler = suggestionsHandler;
    }

    public SuggestionsHandler getSuggestionsHandler() {
        return this.suggestionsHandler;
    }

    public TtaMessageHandler getTtaMessageHandler() {
        return this.ttaMessageHandler;
    }

    public TtaResultHandler getTtaResultHandler() {
        return this.ttaResultHandler;
    }
}
