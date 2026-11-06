package com.amazon.alexa.accessory.capabilities.speech;

import com.amazon.alexa.accessory.protocol.Speech;
import com.amazon.alexa.accessory.repositories.device.DeviceFeature;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface SpeechSettings {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Callback {
        void onSpeechCompleted();

        void onSpeechProcessingStarted();

        void onSpeechRecognitionCancelled();

        void onSpeechRecognitionDenied();

        void onSpeechRecognitionFailed(Throwable th);

        void onSpeechRecognitionFinished();

        void onSpeechRecognitionStarted();

        void onSpeechRequest(SpeechRequest speechRequest);

        void onSpeechStarted();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SpeechRequest {
        void cancel();

        SpeechSession proceed(SpeechSettings speechSettings);
    }

    AccessoryIdentifierProvider getAccessoryIdentifierProvider();

    Speech.AudioFormat getAudioFormat();

    Speech.AudioProfile getAudioProfile();

    Callback getCallback();

    String getDeviceFirmwareVersion();

    String getDeviceName();

    String getDeviceSerialNumber();

    String getDeviceType();

    int getDialogId();

    Speech.SpeechInitiator getInitiator();

    String getLocale();

    SessionIdentifierProvider getSessionIdentifierProvider();

    Set<DeviceFeature> getSpeechRelatedFeatures();

    boolean getSuppressEndpointEarcon();

    boolean getSuppressStartEarcon();
}
