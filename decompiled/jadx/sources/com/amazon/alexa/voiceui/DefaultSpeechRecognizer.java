package com.amazon.alexa.voiceui;

import com.amazon.alexa.api.AlexaUserInterfaceOptions;
import com.amazon.alexa.voice.ui.onedesign.remarkable.RemarkableAlexaConversationMediator;
import com.amazon.alexa.voice.ui.permissions.AndroidPermissionsChecker;
import com.amazon.alexa.voice.ui.permissions.AndroidPermissionsRequester;
import com.amazon.alexa.voice.ui.speech.SpeechRecognizer;
import com.amazon.alexa.voiceui.voice.AlexaUserInterfaceOptionsTracker;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes20.dex */
class DefaultSpeechRecognizer implements SpeechRecognizer {
    private final AlexaServicesApis alexaServicesApis;
    private final AlexaUserInterfaceOptionsTracker alexaUserInterfaceOptionsTracker;
    private final AndroidPermissionsChecker androidPermissionsChecker;
    private final AndroidPermissionsRequester permissionsRequester;

    @Inject
    public DefaultSpeechRecognizer(AndroidPermissionsChecker androidPermissionsChecker, AlexaServicesApis alexaServicesApis, AlexaUserInterfaceOptionsTracker alexaUserInterfaceOptionsTracker, @Named("bottomSheet") AndroidPermissionsRequester androidPermissionsRequester) {
        this.androidPermissionsChecker = androidPermissionsChecker;
        this.alexaServicesApis = alexaServicesApis;
        this.alexaUserInterfaceOptionsTracker = alexaUserInterfaceOptionsTracker;
        this.permissionsRequester = androidPermissionsRequester;
    }

    @Override // com.amazon.alexa.voice.ui.speech.SpeechRecognizer
    public void cancel() {
        this.alexaServicesApis.cancelDialog();
    }

    @Override // com.amazon.alexa.voice.ui.speech.SpeechRecognizer
    public boolean recognizeSpeech(String str) {
        if (!this.alexaServicesApis.isStarted()) {
            return false;
        }
        AlexaUserInterfaceOptions alexaUserInterfaceOptions = this.alexaUserInterfaceOptionsTracker.getAlexaUserInterfaceOptions();
        if (this.androidPermissionsChecker.hasMinimumRequiredPermission()) {
            this.alexaServicesApis.startDialog(str, alexaUserInterfaceOptions);
            return true;
        }
        if (RemarkableAlexaConversationMediator.INVOCATION_TYPE.equals(str)) {
            BottomSheetAndroidPermissionsRequester bottomSheetAndroidPermissionsRequester = (BottomSheetAndroidPermissionsRequester) this.permissionsRequester;
            bottomSheetAndroidPermissionsRequester.setRequestFromRemarkableAlexa(true);
            bottomSheetAndroidPermissionsRequester.requestPermissions();
            return false;
        }
        if (!alexaUserInterfaceOptions.getBottomSheetEnabled()) {
            return false;
        }
        this.permissionsRequester.requestPermissions();
        return false;
    }

    @Override // com.amazon.alexa.voice.ui.speech.SpeechRecognizer
    public void stopAudioTask() {
        this.alexaServicesApis.stopAudioTask();
    }
}
