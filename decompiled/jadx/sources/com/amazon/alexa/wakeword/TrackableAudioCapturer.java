package com.amazon.alexa.wakeword;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaAudioSink;
import com.amazon.alexa.audiocapturer.MetricsListener;
import com.amazon.alexa.audiocapturer.SimpleAudioCapturer;
import com.amazon.alexa.utils.validation.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TrackableAudioCapturer extends SimpleAudioCapturer {
    private final RecordingTracker capturingListener;

    public TrackableAudioCapturer(RecordingTracker recordingTracker, @Nullable MetricsListener metricsListener) {
        super(metricsListener);
        Preconditions.notNull(recordingTracker, "listener is null");
        this.capturingListener = recordingTracker;
    }

    @Override // com.amazon.alexa.audiocapturer.SimpleAudioCapturer
    public void onRelease() {
        super.onRelease();
        this.capturingListener.onCapturingFinished();
    }

    @Override // com.amazon.alexa.audiocapturer.SimpleAudioCapturer, com.amazon.alexa.audiocapturer.AudioCapturer
    public boolean startCapturing(AlexaAudioSink alexaAudioSink) {
        this.capturingListener.onCapturingStarted();
        return super.startCapturing(alexaAudioSink);
    }
}
