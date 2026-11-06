package com.amazon.alexa.voice.ui.onedesign.speech;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.voice.ui.onedesign.speech.SpeechControlContract;
import com.amazon.alexa.voice.ui.permissions.AndroidPermissionsChecker;
import com.amazon.alexa.voice.ui.permissions.AndroidPermissionsRequester;
import com.amazon.alexa.voice.ui.speech.SpeechRecognizer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class SpeechControlInteractorV2 implements SpeechControlContract.Interactor {

    @VisibleForTesting
    static final String CARD_INVOCATION = "AlexaApp.Card";
    private final AndroidPermissionsChecker permissionsChecker;
    private final AndroidPermissionsRequester permissionsRequester;
    private final SpeechRecognizer speechRecognizer;

    public SpeechControlInteractorV2(SpeechRecognizer speechRecognizer, AndroidPermissionsChecker androidPermissionsChecker, AndroidPermissionsRequester androidPermissionsRequester) {
        this.speechRecognizer = speechRecognizer;
        this.permissionsChecker = androidPermissionsChecker;
        this.permissionsRequester = androidPermissionsRequester;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.speech.SpeechControlContract.Interactor
    public void cancel() {
        this.speechRecognizer.cancel();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.speech.SpeechControlContract.Interactor
    public void recognizeSpeech() {
        if (this.permissionsChecker.hasMinimumRequiredPermission()) {
            this.speechRecognizer.recognizeSpeech(CARD_INVOCATION);
        } else {
            this.permissionsRequester.requestPermissions();
        }
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.speech.SpeechControlContract.Interactor
    public boolean shouldEmbedVoiceIngress() {
        return this.permissionsChecker.hasMinimumRequiredPermission();
    }
}
