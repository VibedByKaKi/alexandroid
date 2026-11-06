package com.amazon.alexa.client.alexaservice.vad.audio;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class AudioCaptureFormat {
    private final int frameSize;
    private final int sampleRate;

    public AudioCaptureFormat(int i, int i2) {
        this.sampleRate = i;
        this.frameSize = i2;
    }

    public int getFrameSize() {
        return this.frameSize;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }
}
