package com.amazon.alexa.accessory.repositories.voicestreaming;

import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessory.protocol.Speech;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface VoiceStreamingListener {
    void onVoiceDataReceived(byte[] bArr);

    void onVoiceStreamingDidPause();

    void onVoiceStreamingDidTerminate();

    default void onVoiceStreamingDidTerminate(Common.ErrorCode errorCode) {
        onVoiceStreamingDidTerminate();
    }

    void onVoiceStreamingError(Throwable th);

    void onVoiceStreamingWillResume(Speech.SpeechSettings speechSettings);
}
