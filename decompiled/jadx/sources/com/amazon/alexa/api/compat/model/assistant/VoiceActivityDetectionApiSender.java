package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class VoiceActivityDetectionApiSender {
    private static final String TAG = "VoiceActivityDetectionApiSender";
    private final Messenger messenger;
    private final int specIndex;

    public VoiceActivityDetectionApiSender(Messenger messenger, int i) {
        this.messenger = messenger;
        this.specIndex = i;
    }

    private boolean sendMessage(int i, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = this.specIndex;
        if (bundle != null) {
            obtain.setData(bundle);
        }
        try {
            this.messenger.send(obtain);
            return true;
        } catch (RemoteException e) {
            AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("Failed to send message: ", i, TAG, e);
            return false;
        }
    }

    public void muteVoiceActivityDetection() {
        sendMessage(VoiceActivityDetectionApiMessageType.MUTE_VOICE_ACTIVITY_DETECTION.ordinal(), null);
    }

    public void startVoiceActivityDetection() {
        sendMessage(VoiceActivityDetectionApiMessageType.START_VOICE_ACTIVITY_DETECTION.ordinal(), null);
    }

    public void stopVoiceActivityDetection() {
        sendMessage(VoiceActivityDetectionApiMessageType.STOP_VOICE_ACTIVITY_DETECTION.ordinal(), null);
    }

    public void stopVoiceActivityDetectionIfSilenced() {
        sendMessage(VoiceActivityDetectionApiMessageType.STOP_VOICE_ACTIVITY_DETECTION_IF_SILENCED.ordinal(), null);
    }

    public void stopVoiceActivityDetectionWithReason(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(VoiceActivityDetectionApiArgumentType.REASON.name(), str);
        sendMessage(VoiceActivityDetectionApiMessageType.STOP_VOICE_ACTIVITY_DETECTION_WITH_REASON.ordinal(), bundle);
    }

    public void unmuteVoiceActivityDetection() {
        sendMessage(VoiceActivityDetectionApiMessageType.UNMUTE_VOICE_ACTIVITY_DETECTION.ordinal(), null);
    }
}
