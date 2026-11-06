package com.amazon.blueshift.bluefront.android;

import android.os.Bundle;
import android.speech.RecognitionListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface SpeechRequestListener<T> extends RecognitionListener {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NullSpeechRequestListener<T> implements SpeechRequestListener<T> {
        @Override // com.amazon.blueshift.bluefront.android.SpeechRequestListener
        public void onError(SpeechClientException speechClientException) {
        }

        @Override // android.speech.RecognitionListener
        public void onBeginningOfSpeech() {
        }

        @Override // com.amazon.blueshift.bluefront.android.SpeechRequestListener, android.speech.RecognitionListener
        public void onEndOfSpeech() {
        }

        @Override // com.amazon.blueshift.bluefront.android.SpeechRequestListener
        public void onMaxSpeechTimeout() {
        }

        @Override // com.amazon.blueshift.bluefront.android.SpeechRequestListener
        public void onNoSpeechTimeout() {
        }

        @Override // com.amazon.blueshift.bluefront.android.SpeechRequestListener
        public void onSilenceDetected() {
        }

        @Override // com.amazon.blueshift.bluefront.android.SpeechRequestListener
        public void onBluefrontResults(T t) {
        }

        @Override // android.speech.RecognitionListener
        public void onBufferReceived(byte[] bArr) {
        }

        @Override // android.speech.RecognitionListener
        public void onError(int i) {
        }

        @Override // android.speech.RecognitionListener
        public void onPartialResults(Bundle bundle) {
        }

        @Override // android.speech.RecognitionListener
        public void onReadyForSpeech(Bundle bundle) {
        }

        @Override // android.speech.RecognitionListener
        public void onResults(Bundle bundle) {
        }

        @Override // android.speech.RecognitionListener
        public void onRmsChanged(float f) {
        }

        @Override // android.speech.RecognitionListener
        public void onEvent(int i, Bundle bundle) {
        }
    }

    void onBluefrontResults(T t);

    @Override // android.speech.RecognitionListener
    void onEndOfSpeech();

    void onError(SpeechClientException speechClientException);

    void onMaxSpeechTimeout();

    void onNoSpeechTimeout();

    void onSilenceDetected();
}
