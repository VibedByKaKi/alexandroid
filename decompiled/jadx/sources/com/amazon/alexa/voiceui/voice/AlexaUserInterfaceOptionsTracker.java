package com.amazon.alexa.voiceui.voice;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaUserInterfaceOptions;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes20.dex */
public class AlexaUserInterfaceOptionsTracker {
    private static AlexaUserInterfaceOptions alexaUserInterfaceOptions;

    @Inject
    public AlexaUserInterfaceOptionsTracker() {
    }

    @Nullable
    public AlexaUserInterfaceOptions getAlexaUserInterfaceOptions() {
        AlexaUserInterfaceOptions alexaUserInterfaceOptions2 = alexaUserInterfaceOptions;
        return alexaUserInterfaceOptions2 == null ? alexaUserInterfaceOptions2 : AlexaUserInterfaceOptions.builder().setTheme(alexaUserInterfaceOptions.getTheme()).setTypingEnabled(alexaUserInterfaceOptions.getTypingEnabled()).setAplEnabled(alexaUserInterfaceOptions.getAplEnabled()).setBottomSheetEnabled(alexaUserInterfaceOptions.getBottomSheetEnabled()).setShowRemarkableAlexa(alexaUserInterfaceOptions.getShowRemarkableAlexa()).setSuggestionTheme(alexaUserInterfaceOptions.getSuggestionTheme()).setHideOverflowMenu(alexaUserInterfaceOptions.getHideOverflowMenu()).setEnableSpeechResponseAlways(alexaUserInterfaceOptions.getEnableSpeechResponseAlways()).build();
    }

    public void setAlexaUserInterfaceOptions(AlexaUserInterfaceOptions alexaUserInterfaceOptions2) {
        alexaUserInterfaceOptions = alexaUserInterfaceOptions2;
    }
}
