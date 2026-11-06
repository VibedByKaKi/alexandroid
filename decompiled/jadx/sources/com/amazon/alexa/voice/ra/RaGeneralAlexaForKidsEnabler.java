package com.amazon.alexa.voice.ra;

import com.amazon.alexa.api.compat.model.AlexaUserInterfaceOptions;
import com.amazon.alexa.voice.ui.ra.SuggestionTheme;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class RaGeneralAlexaForKidsEnabler {
    private RaGeneralAlexaForKidsEnabler() {
    }

    public static SuggestionTheme getRaSuggestionTheme(boolean z) {
        return z ? SuggestionTheme.KID_FRIENDLY : SuggestionTheme.ADULT;
    }

    public static AlexaUserInterfaceOptions.SuggestionTheme getSuggestionTheme(boolean z) {
        return z ? AlexaUserInterfaceOptions.SuggestionTheme.KID_FRIENDLY : AlexaUserInterfaceOptions.SuggestionTheme.ADULT;
    }
}
