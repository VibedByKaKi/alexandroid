package com.amazon.alexa.api.compat.model.assistant;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class VoiceActivityDetectionListenerSender {
    private static final String TAG = "VoiceActivityDetectionListenerSender";
    private final Messenger messenger;
    private final int specIndex;

    public VoiceActivityDetectionListenerSender(Messenger messenger, int i) {
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

    public boolean onSilenceDetected(long j, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong(VoiceActivityDetectionListenerArgumentType.TIMESTAMP.name(), j);
        bundle.putLong(VoiceActivityDetectionListenerArgumentType.DURATION.name(), j2);
        return sendMessage(VoiceActivityDetectionListenerMessageType.ON_SILENCE_DETECTED.ordinal(), bundle);
    }

    public boolean onSpeechDetected(long j, float f) {
        Bundle bundle = new Bundle();
        bundle.putLong(VoiceActivityDetectionListenerArgumentType.TIMESTAMP.name(), j);
        bundle.putFloat(VoiceActivityDetectionListenerArgumentType.CONFIDENCE_LEVEL.name(), f);
        return sendMessage(VoiceActivityDetectionListenerMessageType.ON_SPEECH_DETECTED.ordinal(), bundle);
    }

    public boolean onVoiceChatModeStateChanged(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(VoiceActivityDetectionListenerArgumentType.STATE.name(), str);
        bundle.putString(VoiceActivityDetectionListenerArgumentType.REASON.name(), str2);
        return sendMessage(VoiceActivityDetectionListenerMessageType.ON_VOICE_CHAT_MODE_STATE_CHANGED.ordinal(), bundle);
    }
}
