package com.amazon.alexa.client.alexaservice.vad.selfbargein;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class SelfBargeInConfig {
    public static final SelfBargeInConfig DEFAULT = new SelfBargeInConfig();
    private final int recentCaptionBufferSize = 3;
    private final double wordSimilarityThreshold = 0.8d;
    private final double emissionThreshold = 0.5d;
    private final long timeoutMs = 3000;
    private final String voiceEnrollmentSubstring = "say: ";
    private final long dridIdleSealMs = 1500;
    private final int minimumTranscriptWordCount = 1;

    public long getDridIdleSealMs() {
        return 1500L;
    }

    public double getEmissionThreshold() {
        return 0.5d;
    }

    public int getMinimumTranscriptWordCount() {
        return 1;
    }

    public int getRecentCaptionBufferSize() {
        return 3;
    }

    public long getTimeoutMs() {
        return 3000L;
    }

    public String getVoiceEnrollmentSubstring() {
        return "say: ";
    }

    public double getWordSimilarityThreshold() {
        return 0.8d;
    }
}
