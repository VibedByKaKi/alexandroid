package com.amazon.alexa.api;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaUserInterfaceOptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class UserInterfaceOptionsHelper {
    private UserInterfaceOptionsHelper() {
        throw new UnsupportedOperationException("Do not instantiate this class");
    }

    public static AlexaUserInterfaceOptions fromBundle(@Nullable Bundle bundle) {
        return bundle == null ? AlexaUserInterfaceOptions.builder().build() : new AlexaUserInterfaceOptions(bundle);
    }

    public static AlexaUserInterfaceOptions getAlexaUserInterfaceOptionsWithShowRemarkableAlexaDisabled(AlexaUserInterfaceOptions alexaUserInterfaceOptions) {
        AlexaUserInterfaceOptions.Builder showRemarkableAlexa = AlexaUserInterfaceOptions.builder().setHintsEnabled(alexaUserInterfaceOptions.getHintsEnabled()).setTheme(alexaUserInterfaceOptions.getTheme()).setTypingEnabled(alexaUserInterfaceOptions.getTypingEnabled()).setAplEnabled(alexaUserInterfaceOptions.getAplEnabled()).setBottomSheetEnabled(alexaUserInterfaceOptions.getBottomSheetEnabled()).setSuggestionTheme(alexaUserInterfaceOptions.getSuggestionTheme()).setHideOverflowMenu(alexaUserInterfaceOptions.getHideOverflowMenu()).setEnableSpeechResponseAlways(alexaUserInterfaceOptions.getEnableSpeechResponseAlways()).setShowRemarkableAlexa(false);
        if (alexaUserInterfaceOptions.getHintsEnabled()) {
            showRemarkableAlexa.setHintText(alexaUserInterfaceOptions.getHintText());
        }
        return showRemarkableAlexa.build();
    }

    public static Bundle getBundle(AlexaUserInterfaceOptions alexaUserInterfaceOptions) {
        return alexaUserInterfaceOptions.getBundle();
    }
}
