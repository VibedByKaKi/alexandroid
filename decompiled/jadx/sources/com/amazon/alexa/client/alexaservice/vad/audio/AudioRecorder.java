package com.amazon.alexa.client.alexaservice.vad.audio;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface AudioRecorder {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AudioFrameListener {
        void onAudioFrame(@NonNull short[] sArr);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ReadErrorListener {
        void onReadError(int i);

        void onReadTimeout();
    }

    boolean isRecording();

    void prepareSession(@NonNull AudioCaptureFormat audioCaptureFormat);

    void setReadErrorListener(@Nullable ReadErrorListener readErrorListener);

    void startRecording(@NonNull AudioFrameListener audioFrameListener);

    void stopRecording();

    void teardownSession();
}
