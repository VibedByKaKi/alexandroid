package com.amazon.alexa.client.alexaservice.vad.detector;

import com.amazon.alexa.api.AlexaAudioSink;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VoiceActivityDetectionData {
    private final AlexaAudioSink audioSink;
    private final float confidence;
    private final long detectionTimestamp;

    public VoiceActivityDetectionData(AlexaAudioSink alexaAudioSink, long j, float f) {
        this.audioSink = alexaAudioSink;
        this.detectionTimestamp = j;
        this.confidence = f;
    }

    public AlexaAudioSink getAudioSink() {
        return this.audioSink;
    }

    public float getConfidence() {
        return this.confidence;
    }

    public long getDetectionTimestamp() {
        return this.detectionTimestamp;
    }
}
