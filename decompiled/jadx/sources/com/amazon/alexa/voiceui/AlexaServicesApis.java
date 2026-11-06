package com.amazon.alexa.voiceui;

import androidx.annotation.RequiresPermission;
import com.amazon.alexa.api.AlexaAplCommandListener;
import com.amazon.alexa.api.AlexaCaptionListener;
import com.amazon.alexa.api.AlexaCardListener;
import com.amazon.alexa.api.AlexaEvent;
import com.amazon.alexa.api.AlexaLivePreviewListener;
import com.amazon.alexa.api.AlexaLocalesListener;
import com.amazon.alexa.api.AlexaStateListener;
import com.amazon.alexa.api.AlexaTextResponseListener;
import com.amazon.alexa.api.AlexaUserInterfaceOptions;
import com.amazon.alexa.api.AlexaUserSpeechListener;
import com.amazon.alexa.api.TextAlexaDialogExtras;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface AlexaServicesApis {
    void cancelDialog();

    void deregisterAlexaCaptionListener(AlexaCaptionListener alexaCaptionListener);

    void deregisterAlexaRequestListener(AlexaLivePreviewListener alexaLivePreviewListener);

    void deregisterAlexaResponseListener(AlexaTextResponseListener alexaTextResponseListener);

    void deregisterAlexaStateListener(AlexaStateListener alexaStateListener);

    void deregisterAplCommandListener(AlexaAplCommandListener alexaAplCommandListener);

    void deregisterCardListener(AlexaCardListener alexaCardListener);

    void deregisterLocalesListener(AlexaLocalesListener alexaLocalesListener);

    void deregisterUserSpeechListener(AlexaUserSpeechListener alexaUserSpeechListener);

    void destroy();

    boolean isStarted();

    void registerAlexaCaptionListener(AlexaCaptionListener alexaCaptionListener);

    void registerAlexaRequestListener(AlexaLivePreviewListener alexaLivePreviewListener);

    void registerAlexaResponseListener(AlexaTextResponseListener alexaTextResponseListener);

    void registerAlexaStateListener(AlexaStateListener alexaStateListener);

    void registerAplCommandListener(AlexaAplCommandListener alexaAplCommandListener);

    void registerCardListener(AlexaCardListener alexaCardListener);

    void registerLocalesListener(AlexaLocalesListener alexaLocalesListener);

    void registerUserSpeechListener(AlexaUserSpeechListener alexaUserSpeechListener);

    void sendEvent(AlexaEvent alexaEvent, boolean z);

    void sendText(String str, TextAlexaDialogExtras textAlexaDialogExtras);

    void start();

    @RequiresPermission("android.permission.RECORD_AUDIO")
    void startDialog(String str);

    @RequiresPermission("android.permission.RECORD_AUDIO")
    void startDialog(String str, AlexaUserInterfaceOptions alexaUserInterfaceOptions);

    void stop();

    void stopAudioTask();
}
