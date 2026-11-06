package com.amazon.blueshift.bluefront.android.audio;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface AudioSourceListener {
    void onBeginningOfSpeech();

    void onBufferReceived(byte[] bArr);

    void onMaxSpeechTimeout();

    void onNoSpeechTimeout();

    void onReadyForSpeech();

    void onRmsChanged(float f);

    void onSilenceDetected();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NullListener implements AudioSourceListener {
        @Override // com.amazon.blueshift.bluefront.android.audio.AudioSourceListener
        public void onBeginningOfSpeech() {
        }

        @Override // com.amazon.blueshift.bluefront.android.audio.AudioSourceListener
        public void onMaxSpeechTimeout() {
        }

        @Override // com.amazon.blueshift.bluefront.android.audio.AudioSourceListener
        public void onNoSpeechTimeout() {
        }

        @Override // com.amazon.blueshift.bluefront.android.audio.AudioSourceListener
        public void onReadyForSpeech() {
        }

        @Override // com.amazon.blueshift.bluefront.android.audio.AudioSourceListener
        public void onSilenceDetected() {
        }

        @Override // com.amazon.blueshift.bluefront.android.audio.AudioSourceListener
        public void onBufferReceived(byte[] bArr) {
        }

        @Override // com.amazon.blueshift.bluefront.android.audio.AudioSourceListener
        public void onRmsChanged(float f) {
        }
    }
}
