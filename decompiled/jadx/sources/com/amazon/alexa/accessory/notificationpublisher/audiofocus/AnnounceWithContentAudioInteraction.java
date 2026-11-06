package com.amazon.alexa.accessory.notificationpublisher.audiofocus;

import androidx.annotation.NonNull;
import com.amazon.alexa.api.AlexaAudioChannel;
import com.amazon.alexa.api.AlexaAudioInteraction;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class AnnounceWithContentAudioInteraction implements AlexaAudioInteraction {
    private static final String TAG = "AnnounceWithContentAudioInteraction";
    private final AudioFocusChangeListener audioFocusChangeListener;
    private volatile AtomicBoolean foreground = new AtomicBoolean(false);

    public AnnounceWithContentAudioInteraction(@NonNull AudioFocusChangeListener audioFocusChangeListener) {
        this.audioFocusChangeListener = audioFocusChangeListener;
    }

    private void onBackgroundState() {
        this.foreground.set(false);
        this.audioFocusChangeListener.audioFocusLost();
    }

    @Override // com.amazon.alexa.api.AlexaAudioInteraction
    public AlexaAudioChannel getAlexaAudioChannel() {
        return AlexaAudioChannel.ALERTS;
    }

    @Override // com.amazon.alexa.api.AlexaAudioInteraction
    public String getInteractionComponentName() {
        return "Alexa.Notifications.Multipart";
    }

    public boolean isForeground() {
        return this.foreground.get();
    }

    @Override // com.amazon.alexa.api.AlexaAudioInteraction
    public void onBackground() {
        onBackgroundState();
    }

    @Override // com.amazon.alexa.api.AlexaAudioInteraction
    public void onForeground() {
        this.foreground.set(true);
        this.audioFocusChangeListener.audioFocusAcquired();
    }

    @Override // com.amazon.alexa.api.AlexaAudioInteraction
    public void onStop() {
        onBackgroundState();
    }

    @Override // com.amazon.alexa.api.AlexaAudioInteraction
    public void onPause() {
    }

    @Override // com.amazon.alexa.api.AlexaAudioInteraction
    public void onResume() {
    }
}
