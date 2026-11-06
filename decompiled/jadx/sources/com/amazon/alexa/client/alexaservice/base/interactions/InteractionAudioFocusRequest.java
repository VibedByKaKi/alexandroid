package com.amazon.alexa.client.alexaservice.base.interactions;

import android.annotation.TargetApi;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.util.Log;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@TargetApi(26)
/* loaded from: classes17.dex */
public class InteractionAudioFocusRequest {
    private static final String TAG = "InteractionAudioFocusRequest";
    private final AudioFocusChangeListener listener;
    private final AudioFocusRequest request;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class AudioFocusChangeListener implements AudioManager.OnAudioFocusChangeListener {
        private final AudioManager.OnAudioFocusChangeListener delegateListener;
        private boolean isEnabled = true;

        public AudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            this.delegateListener = onAudioFocusChangeListener;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public synchronized void onAudioFocusChange(int i) {
            try {
                if (this.isEnabled) {
                    this.delegateListener.onAudioFocusChange(i);
                } else {
                    Log.i(InteractionAudioFocusRequest.TAG, "Ignoring focus change to old AudioFocusRequest: " + i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized void setEnabled(boolean z) {
            this.isEnabled = z;
        }
    }

    public InteractionAudioFocusRequest(AudioMetadata audioMetadata, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        AudioFocusChangeListener audioFocusChangeListener = new AudioFocusChangeListener(onAudioFocusChangeListener);
        this.listener = audioFocusChangeListener;
        this.request = new AudioFocusRequest.Builder(audioMetadata.getDuration().getValue()).setAudioAttributes(AudioAttributesProvider.provideAndroidAudioAttributes(audioMetadata)).setOnAudioFocusChangeListener(audioFocusChangeListener).setAcceptsDelayedFocusGain(true).setWillPauseWhenDucked(true).build();
    }

    @VisibleForTesting
    public AudioManager.OnAudioFocusChangeListener getListener() {
        return this.listener;
    }

    public AudioFocusRequest getRequest() {
        return this.request;
    }

    public void setInactive() {
        this.listener.setEnabled(false);
    }
}
