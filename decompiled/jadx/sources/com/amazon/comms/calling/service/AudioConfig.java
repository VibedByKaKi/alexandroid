package com.amazon.comms.calling.service;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class AudioConfig {
    private int defaultOrOverridenAudioCaptureSampleRateHz;
    private int defaultOrOverridenAudioRenderSampleRateHz;
    private final FastRenderPath fastRenderPath;
    private final boolean isAudioCaptureSampleRateOverriden;
    private final boolean isAudioRenderSampleRateOverriden;
    private int renderTrackBufferSizeBytes;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FastRenderPath {
        NONE,
        AUDIOTRACK,
        OPENSLES
    }

    public AudioConfig(boolean z, int i, boolean z2, int i2, FastRenderPath fastRenderPath, int i3) {
        this.isAudioCaptureSampleRateOverriden = z;
        this.defaultOrOverridenAudioCaptureSampleRateHz = i;
        this.isAudioRenderSampleRateOverriden = z2;
        this.defaultOrOverridenAudioRenderSampleRateHz = i2;
        this.fastRenderPath = fastRenderPath;
        this.renderTrackBufferSizeBytes = i3;
    }

    public int getDefaultOrOverridenAudioCaptureSampleRateHz() {
        return this.defaultOrOverridenAudioCaptureSampleRateHz;
    }

    public int getDefaultOrOverridenAudioRenderSampleRateHz() {
        return this.defaultOrOverridenAudioRenderSampleRateHz;
    }

    public FastRenderPath getFastRenderPath() {
        return this.fastRenderPath;
    }

    public int getRenderTrackBufferSizeBytes() {
        return this.renderTrackBufferSizeBytes;
    }

    public boolean isAudioCaptureSampleRateOverriden() {
        return this.isAudioCaptureSampleRateOverriden;
    }

    public boolean isAudioRenderSampleRateOverriden() {
        return this.isAudioRenderSampleRateOverriden;
    }

    public String toString() {
        return "AudioConfig(isAudioCaptureSampleRateOverriden=" + isAudioCaptureSampleRateOverriden() + ", defaultOrOverridenAudioCaptureSampleRateHz=" + getDefaultOrOverridenAudioCaptureSampleRateHz() + ", isAudioRenderSampleRateOverriden=" + isAudioRenderSampleRateOverriden() + ", defaultOrOverridenAudioRenderSampleRateHz=" + getDefaultOrOverridenAudioRenderSampleRateHz() + ", fastRenderPath=" + getFastRenderPath() + ", renderTrackBufferSizeBytes=" + getRenderTrackBufferSizeBytes() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
